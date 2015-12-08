// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;

// Referenced classes of package javax.jmdns.impl:
//            DNSStatefulObject, DNSTaskStarter, DNSCache, HostInfo, 
//            DNSEntry, DNSRecord, ServiceEventImpl, ServiceInfoImpl, 
//            SocketListener, DNSQuestion, DNSListener, DNSIncoming, 
//            DNSOutgoing

public class JmDNSImpl extends JmDNS
    implements DNSStatefulObject, DNSTaskStarter
{
    public static final class Operation extends Enum
    {

        private static final Operation $VALUES[];
        public static final Operation Add;
        public static final Operation Noop;
        public static final Operation RegisterServiceType;
        public static final Operation Remove;
        public static final Operation Update;

        public static Operation valueOf(String s)
        {
            return (Operation)Enum.valueOf(javax/jmdns/impl/JmDNSImpl$Operation, s);
        }

        public static Operation[] values()
        {
            return (Operation[])$VALUES.clone();
        }

        static 
        {
            Remove = new Operation("Remove", 0);
            Update = new Operation("Update", 1);
            Add = new Operation("Add", 2);
            RegisterServiceType = new Operation("RegisterServiceType", 3);
            Noop = new Operation("Noop", 4);
            $VALUES = (new Operation[] {
                Remove, Update, Add, RegisterServiceType, Noop
            });
        }

        private Operation(String s, int i)
        {
            super(s, i);
        }
    }

    private static class ServiceCollector
        implements ServiceListener
    {

        private final ConcurrentMap _events = new ConcurrentHashMap();
        private final ConcurrentMap _infos = new ConcurrentHashMap();
        private volatile boolean _needToWaitForInfos;
        private final String _type;

        public ServiceInfo[] list(long l)
        {
            if (!_infos.isEmpty() && _events.isEmpty() && !_needToWaitForInfos) goto _L2; else goto _L1
_L1:
            int i;
            long l1 = l / 200L;
            l = l1;
            if (l1 < 1L)
            {
                l = 1L;
            }
            i = 0;
_L6:
            if ((long)i >= l) goto _L2; else goto _L3
_L3:
            try
            {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedexception) { }
            if (!_events.isEmpty() || _infos.isEmpty() || _needToWaitForInfos) goto _L4; else goto _L2
_L2:
            _needToWaitForInfos = false;
            return (ServiceInfo[])_infos.values().toArray(new ServiceInfo[_infos.size()]);
_L4:
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void serviceAdded(ServiceEvent serviceevent)
        {
            this;
            JVM INSTR monitorenter ;
            Object obj = serviceevent.getInfo();
            if (obj == null) goto _L2; else goto _L1
_L1:
            if (!((ServiceInfo) (obj)).hasData()) goto _L2; else goto _L3
_L3:
            _infos.put(serviceevent.getName(), obj);
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            obj = ((ServiceInfo) (obj)).getSubtype();
_L5:
            obj = ((JmDNSImpl)serviceevent.getDNS()).resolveServiceInfo(serviceevent.getType(), serviceevent.getName(), ((String) (obj)), true);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            _infos.put(serviceevent.getName(), obj);
              goto _L4
            serviceevent;
            this;
            JVM INSTR monitorexit ;
            throw serviceevent;
            obj = "";
              goto _L5
            _events.put(serviceevent.getName(), serviceevent);
              goto _L4
        }

        public void serviceRemoved(ServiceEvent serviceevent)
        {
            this;
            JVM INSTR monitorenter ;
            _infos.remove(serviceevent.getName());
            _events.remove(serviceevent.getName());
            this;
            JVM INSTR monitorexit ;
            return;
            serviceevent;
            this;
            JVM INSTR monitorexit ;
            throw serviceevent;
        }

        public void serviceResolved(ServiceEvent serviceevent)
        {
            this;
            JVM INSTR monitorenter ;
            _infos.put(serviceevent.getName(), serviceevent.getInfo());
            _events.remove(serviceevent.getName());
            this;
            JVM INSTR monitorexit ;
            return;
            serviceevent;
            this;
            JVM INSTR monitorexit ;
            throw serviceevent;
        }

        public String toString()
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("\n\tType: ");
            stringbuffer.append(_type);
            if (_infos.isEmpty())
            {
                stringbuffer.append("\n\tNo services collected.");
            } else
            {
                stringbuffer.append("\n\tServices");
                Iterator iterator = _infos.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    stringbuffer.append("\n\t\tService: ");
                    stringbuffer.append(s);
                    stringbuffer.append(": ");
                    stringbuffer.append(_infos.get(s));
                }
            }
            if (_events.isEmpty())
            {
                stringbuffer.append("\n\tNo event queued.");
            } else
            {
                stringbuffer.append("\n\tEvents");
                Iterator iterator1 = _events.keySet().iterator();
                while (iterator1.hasNext()) 
                {
                    String s1 = (String)iterator1.next();
                    stringbuffer.append("\n\t\tEvent: ");
                    stringbuffer.append(s1);
                    stringbuffer.append(": ");
                    stringbuffer.append(_events.get(s1));
                }
            }
            return stringbuffer.toString();
        }

        public ServiceCollector(String s)
        {
            _type = s;
            _needToWaitForInfos = true;
        }
    }

    public static class ServiceTypeEntry extends AbstractMap
        implements Cloneable
    {

        private final Set _entrySet = new HashSet();
        private final String _type;

        public boolean add(String s)
        {
            if (s == null || contains(s))
            {
                return false;
            } else
            {
                _entrySet.add(new SubTypeEntry(s));
                return true;
            }
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public ServiceTypeEntry clone()
        {
            ServiceTypeEntry servicetypeentry = new ServiceTypeEntry(getType());
            for (Iterator iterator = entrySet().iterator(); iterator.hasNext(); servicetypeentry.add((String)((java.util.Map.Entry)iterator.next()).getValue())) { }
            return servicetypeentry;
        }

        public boolean contains(String s)
        {
            return s != null && containsKey(s.toLowerCase());
        }

        public Set entrySet()
        {
            return _entrySet;
        }

        public String getType()
        {
            return _type;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(200);
            if (isEmpty())
            {
                stringbuilder.append("empty");
            } else
            {
                for (Iterator iterator = values().iterator(); iterator.hasNext(); stringbuilder.append(", "))
                {
                    stringbuilder.append((String)iterator.next());
                }

                stringbuilder.setLength(stringbuilder.length() - 2);
            }
            return stringbuilder.toString();
        }

        public ServiceTypeEntry(String s)
        {
            _type = s;
        }
    }

    private static class ServiceTypeEntry.SubTypeEntry
        implements Serializable, Cloneable, java.util.Map.Entry
    {

        private final String _key;
        private final String _value;

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public ServiceTypeEntry.SubTypeEntry clone()
        {
            return this;
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            boolean flag;
            if (getKey().equals(((java.util.Map.Entry)obj).getKey()) && getValue().equals(((java.util.Map.Entry)obj).getValue()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public volatile Object getKey()
        {
            return getKey();
        }

        public String getKey()
        {
            return _key;
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public String getValue()
        {
            return _value;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (_key == null)
            {
                i = 0;
            } else
            {
                i = _key.hashCode();
            }
            if (_value != null)
            {
                j = _value.hashCode();
            }
            return i ^ j;
        }

        public volatile Object setValue(Object obj)
        {
            return setValue((String)obj);
        }

        public String setValue(String s)
        {
            throw new UnsupportedOperationException();
        }

        public String toString()
        {
            return (new StringBuilder()).append(_key).append("=").append(_value).toString();
        }

        public ServiceTypeEntry.SubTypeEntry(String s)
        {
            if (s == null)
            {
                s = "";
            }
            _value = s;
            _key = _value.toLowerCase();
        }
    }


    private static final Random _random = new Random();
    private static Logger logger = Logger.getLogger(javax/jmdns/impl/JmDNSImpl.getName());
    private final DNSCache _cache = new DNSCache(100);
    private volatile javax.jmdns.JmDNS.Delegate _delegate;
    private final ExecutorService _executor = Executors.newSingleThreadExecutor();
    private volatile InetAddress _group;
    private Thread _incomingListener;
    private final ReentrantLock _ioLock = new ReentrantLock();
    private long _lastThrottleIncrement;
    private final List _listeners = Collections.synchronizedList(new ArrayList());
    private HostInfo _localHost;
    private final String _name;
    private DNSIncoming _plannedAnswer;
    private final Object _recoverLock = new Object();
    private final ConcurrentMap _serviceCollectors = new ConcurrentHashMap();
    private final ConcurrentMap _serviceListeners = new ConcurrentHashMap();
    private final ConcurrentMap _serviceTypes = new ConcurrentHashMap(20);
    private final ConcurrentMap _services = new ConcurrentHashMap(20);
    protected Thread _shutdown;
    private volatile MulticastSocket _socket;
    private int _throttle;
    private final Set _typeListeners = Collections.synchronizedSet(new HashSet());

    public JmDNSImpl(InetAddress inetaddress, String s)
        throws IOException
    {
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer("JmDNS instance created");
        }
        _localHost = HostInfo.newHostInfo(inetaddress, this, s);
        if (s == null)
        {
            s = _localHost.getName();
        }
        _name = s;
        openMulticastSocket(getLocalHost());
        start(getServices().values());
        startReaper();
    }

    private void addServiceListener(String s, ServiceListener servicelistener, boolean flag)
    {
        Object obj;
        ListenerStatus.ServiceListenerStatus servicelistenerstatus;
        String s1;
        servicelistenerstatus = new ListenerStatus.ServiceListenerStatus(servicelistener, flag);
        s1 = s.toLowerCase();
        List list1 = (List)_serviceListeners.get(s1);
        obj = list1;
        if (list1 == null)
        {
            if (_serviceListeners.putIfAbsent(s1, new LinkedList()) == null && _serviceCollectors.putIfAbsent(s1, new ServiceCollector(s)) == null)
            {
                addServiceListener(s1, (ServiceListener)_serviceCollectors.get(s1), true);
            }
            obj = (List)_serviceListeners.get(s1);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorenter ;
        if (!((List) (obj)).contains(servicelistener))
        {
            ((List) (obj)).add(servicelistenerstatus);
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        servicelistener = new ArrayList();
        obj = getCache().allValues().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            DNSRecord dnsrecord = (DNSRecord)(DNSEntry)((Iterator) (obj)).next();
            if (dnsrecord.getRecordType() == DNSRecordType.TYPE_SRV && dnsrecord.getKey().endsWith(s1))
            {
                servicelistener.add(new ServiceEventImpl(this, dnsrecord.getType(), toUnqualifiedName(dnsrecord.getType(), dnsrecord.getName()), dnsrecord.getServiceInfo()));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_272;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        for (servicelistener = servicelistener.iterator(); servicelistener.hasNext(); servicelistenerstatus.serviceAdded((ServiceEvent)servicelistener.next())) { }
        startServiceResolver(s);
        return;
    }

    private void closeMulticastSocket()
    {
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer("closeMulticastSocket()");
        }
        if (_socket == null) goto _L2; else goto _L1
_L1:
        Exception exception;
        try
        {
            _socket.leaveGroup(_group);
        }
        catch (SocketException socketexception) { }
        _socket.close();
_L3:
        if (_incomingListener == null || !_incomingListener.isAlive())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        this;
        JVM INSTR monitorenter ;
        try
        {
            if (_incomingListener != null && _incomingListener.isAlive())
            {
                if (logger.isLoggable(Level.FINER))
                {
                    logger.finer("closeMulticastSocket(): waiting for jmDNS monitor");
                }
                wait(1000L);
            }
        }
        catch (InterruptedException interruptedexception) { }
        this;
        JVM INSTR monitorexit ;
          goto _L3
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            logger.log(Level.WARNING, "closeMulticastSocket() Close socket exception ", exception1);
        }
_L4:
        _socket = null;
_L2:
        return;
        _incomingListener = null;
          goto _L4
    }

    private void disposeServiceCollectors()
    {
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer("disposeServiceCollectors()");
        }
        Iterator iterator = _serviceCollectors.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            ServiceCollector servicecollector = (ServiceCollector)_serviceCollectors.get(s);
            if (servicecollector != null)
            {
                removeServiceListener(s, servicecollector);
                _serviceCollectors.remove(s, servicecollector);
            }
        } while (true);
    }

    public static Random getRandom()
    {
        return _random;
    }

    private boolean makeServiceNameUnique(ServiceInfoImpl serviceinfoimpl)
    {
        String s = serviceinfoimpl.getKey();
        long l = System.currentTimeMillis();
        boolean flag1;
        do
        {
            flag1 = false;
            Object obj = getCache().getDNSEntryList(serviceinfoimpl.getKey()).iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                DNSEntry dnsentry = (DNSEntry)((Iterator) (obj)).next();
                if (!DNSRecordType.TYPE_SRV.equals(dnsentry.getRecordType()) || dnsentry.isExpired(l))
                {
                    continue;
                }
                DNSRecord.Service service = (DNSRecord.Service)dnsentry;
                if (service.getPort() == serviceinfoimpl.getPort() && service.getServer().equals(_localHost.getName()))
                {
                    continue;
                }
                if (logger.isLoggable(Level.FINER))
                {
                    logger.finer((new StringBuilder()).append("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:").append(dnsentry).append(" s.server=").append(service.getServer()).append(" ").append(_localHost.getName()).append(" equals:").append(service.getServer().equals(_localHost.getName())).toString());
                }
                serviceinfoimpl.setName(incrementName(serviceinfoimpl.getName()));
                flag = true;
                break;
            } while (true);
            obj = (ServiceInfo)_services.get(serviceinfoimpl.getKey());
            flag1 = flag;
            if (obj != null)
            {
                flag1 = flag;
                if (obj != serviceinfoimpl)
                {
                    serviceinfoimpl.setName(incrementName(serviceinfoimpl.getName()));
                    flag1 = true;
                }
            }
        } while (flag1);
        return !s.equals(serviceinfoimpl.getKey());
    }

    private void openMulticastSocket(HostInfo hostinfo)
        throws IOException
    {
        if (_group == null)
        {
            if (hostinfo.getInetAddress() instanceof Inet6Address)
            {
                _group = InetAddress.getByName("FF02::FB");
            } else
            {
                _group = InetAddress.getByName("224.0.0.251");
            }
        }
        if (_socket != null)
        {
            closeMulticastSocket();
        }
        _socket = new MulticastSocket(DNSConstants.MDNS_PORT);
        if (hostinfo == null || hostinfo.getInterface() == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        _socket.setNetworkInterface(hostinfo.getInterface());
_L2:
        _socket.setTimeToLive(255);
        _socket.joinGroup(_group);
        return;
        hostinfo;
        if (logger.isLoggable(Level.FINE))
        {
            logger.fine((new StringBuilder()).append("openMulticastSocket() Set network interface exception: ").append(hostinfo.getMessage()).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void start(Collection collection)
    {
        if (_incomingListener == null)
        {
            _incomingListener = new SocketListener(this);
            _incomingListener.start();
        }
        startProber();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            ServiceInfo serviceinfo = (ServiceInfo)collection.next();
            try
            {
                registerService(new ServiceInfoImpl(serviceinfo));
            }
            catch (Exception exception)
            {
                logger.log(Level.WARNING, "start() Registration exception ", exception);
            }
        }

    }

    static String toUnqualifiedName(String s, String s1)
    {
        String s3 = s.toLowerCase();
        String s4 = s1.toLowerCase();
        String s2 = s1;
        if (s4.endsWith(s3))
        {
            s2 = s1;
            if (!s4.equals(s3))
            {
                s2 = s1.substring(0, s1.length() - s.length() - 1);
            }
        }
        return s2;
    }

    void __recover()
    {
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append(getName()).append("recover() Cleanning up").toString());
        }
        logger.warning("RECOVERING");
        purgeTimer();
        Object obj = new ArrayList(getServices().values());
        unregisterAllServices();
        disposeServiceCollectors();
        waitForCanceled(5000L);
        purgeStateTimer();
        closeMulticastSocket();
        getCache().clear();
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append(getName()).append("recover() All is clean").toString());
        }
        if (isCanceled())
        {
            for (Iterator iterator = ((Collection) (obj)).iterator(); iterator.hasNext(); ((ServiceInfoImpl)(ServiceInfo)iterator.next()).recoverState()) { }
            recoverState();
            try
            {
                openMulticastSocket(getLocalHost());
                start(((Collection) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append("recover() Start services exception ").toString(), ((Throwable) (obj)));
            }
            logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append("recover() We are back!").toString());
        } else
        {
            logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append("recover() Could not recover we are Down!").toString());
            if (getDelegate() != null)
            {
                getDelegate().cannotRecoverFromIOError(getDns(), ((Collection) (obj)));
                return;
            }
        }
    }

    public void addListener(DNSListener dnslistener, DNSQuestion dnsquestion)
    {
        long l = System.currentTimeMillis();
        _listeners.add(dnslistener);
        if (dnsquestion != null)
        {
            Iterator iterator = getCache().getDNSEntryList(dnsquestion.getName().toLowerCase()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                DNSEntry dnsentry = (DNSEntry)iterator.next();
                if (dnsquestion.answeredBy(dnsentry) && !dnsentry.isExpired(l))
                {
                    dnslistener.updateRecord(getCache(), l, dnsentry);
                }
            } while (true);
        }
    }

    public boolean advanceState(DNSTask dnstask)
    {
        return _localHost.advanceState(dnstask);
    }

    public void associateWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        _localHost.associateWithTask(dnstask, dnsstate);
    }

    public boolean cancelState()
    {
        return _localHost.cancelState();
    }

    public void cancelStateTimer()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).cancelStateTimer();
    }

    public void cancelTimer()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).cancelTimer();
    }

    public void cleanCache()
    {
        Iterator iterator;
        long l;
        l = System.currentTimeMillis();
        iterator = getCache().allValues().iterator();
_L2:
        DNSEntry dnsentry;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        dnsentry = (DNSEntry)iterator.next();
        Object obj = (DNSRecord)dnsentry;
        if (((DNSRecord) (obj)).isExpired(l))
        {
            updateRecord(l, ((DNSRecord) (obj)), Operation.Remove);
            getCache().removeDNSEntry(((DNSEntry) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (((DNSRecord) (obj)).isStale(l))
            {
                renewServiceCollector(((DNSRecord) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            logger.log(Level.SEVERE, (new StringBuilder()).append(getName()).append(".Error while reaping records: ").append(dnsentry).toString(), ((Throwable) (obj)));
            logger.severe(toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void close()
    {
        if (isClosing())
        {
            return;
        }
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append("Cancelling JmDNS: ").append(this).toString());
        }
        if (closeState())
        {
            logger.finer("Canceling the timer");
            cancelTimer();
            unregisterAllServices();
            disposeServiceCollectors();
            if (logger.isLoggable(Level.FINER))
            {
                logger.finer((new StringBuilder()).append("Wait for JmDNS cancel: ").append(this).toString());
            }
            waitForCanceled(5000L);
            logger.finer("Canceling the state timer");
            cancelStateTimer();
            _executor.shutdown();
            closeMulticastSocket();
            if (_shutdown != null)
            {
                Runtime.getRuntime().removeShutdownHook(_shutdown);
            }
            if (logger.isLoggable(Level.FINER))
            {
                logger.finer("JmDNS closed.");
            }
        }
        advanceState(null);
    }

    public boolean closeState()
    {
        return _localHost.closeState();
    }

    public DNSCache getCache()
    {
        return _cache;
    }

    public javax.jmdns.JmDNS.Delegate getDelegate()
    {
        return _delegate;
    }

    public JmDNSImpl getDns()
    {
        return this;
    }

    public InetAddress getGroup()
    {
        return _group;
    }

    public InetAddress getInterface()
        throws IOException
    {
        return _socket.getInterface();
    }

    public long getLastThrottleIncrement()
    {
        return _lastThrottleIncrement;
    }

    public HostInfo getLocalHost()
    {
        return _localHost;
    }

    public String getName()
    {
        return _name;
    }

    ServiceInfoImpl getServiceInfoFromCache(String s, String s1, String s2, boolean flag)
    {
        ServiceInfoImpl serviceinfoimpl = new ServiceInfoImpl(s, s1, s2, 0, 0, 0, flag, (byte[])null);
        s = getCache().getDNSEntry(new DNSRecord.Pointer(s, DNSRecordClass.CLASS_ANY, false, 0, serviceinfoimpl.getQualifiedName()));
        s1 = serviceinfoimpl;
        if (s instanceof DNSRecord)
        {
            Object obj = (ServiceInfoImpl)((DNSRecord)s).getServiceInfo(flag);
            s1 = serviceinfoimpl;
            if (obj != null)
            {
                Map map = ((ServiceInfoImpl) (obj)).getQualifiedNameMap();
                Object obj1 = null;
                String s3 = "";
                Object obj2 = getCache().getDNSEntry(serviceinfoimpl.getQualifiedName(), DNSRecordType.TYPE_SRV, DNSRecordClass.CLASS_ANY);
                s = ((String) (obj));
                s2 = s3;
                s1 = obj1;
                if (obj2 instanceof DNSRecord)
                {
                    obj2 = ((DNSRecord)obj2).getServiceInfo(flag);
                    s = ((String) (obj));
                    s2 = s3;
                    s1 = obj1;
                    if (obj2 != null)
                    {
                        s = new ServiceInfoImpl(map, ((ServiceInfo) (obj2)).getPort(), ((ServiceInfo) (obj2)).getWeight(), ((ServiceInfo) (obj2)).getPriority(), flag, (byte[])null);
                        s1 = ((ServiceInfo) (obj2)).getTextBytes();
                        s2 = ((ServiceInfo) (obj2)).getServer();
                    }
                }
                obj = getCache().getDNSEntry(s2, DNSRecordType.TYPE_A, DNSRecordClass.CLASS_ANY);
                if (obj instanceof DNSRecord)
                {
                    obj = ((DNSRecord)obj).getServiceInfo(flag);
                    if (obj != null)
                    {
                        java.net.Inet4Address ainet4address[] = ((ServiceInfo) (obj)).getInet4Addresses();
                        int k = ainet4address.length;
                        for (int i = 0; i < k; i++)
                        {
                            s.addAddress(ainet4address[i]);
                        }

                        s._setText(((ServiceInfo) (obj)).getTextBytes());
                    }
                }
                s2 = getCache().getDNSEntry(s2, DNSRecordType.TYPE_AAAA, DNSRecordClass.CLASS_ANY);
                if (s2 instanceof DNSRecord)
                {
                    s2 = ((DNSRecord)s2).getServiceInfo(flag);
                    if (s2 != null)
                    {
                        Inet6Address ainet6address[] = s2.getInet6Addresses();
                        int l = ainet6address.length;
                        for (int j = 0; j < l; j++)
                        {
                            s.addAddress(ainet6address[j]);
                        }

                        s._setText(s2.getTextBytes());
                    }
                }
                s2 = getCache().getDNSEntry(s.getQualifiedName(), DNSRecordType.TYPE_TXT, DNSRecordClass.CLASS_ANY);
                if (s2 instanceof DNSRecord)
                {
                    s2 = ((DNSRecord)s2).getServiceInfo(flag);
                    if (s2 != null)
                    {
                        s._setText(s2.getTextBytes());
                    }
                }
                if (s.getTextBytes().length == 0)
                {
                    s._setText(s1);
                }
                s1 = serviceinfoimpl;
                if (s.hasData())
                {
                    s1 = s;
                }
            }
        }
        return s1;
    }

    public Map getServiceTypes()
    {
        return _serviceTypes;
    }

    public Map getServices()
    {
        return _services;
    }

    public MulticastSocket getSocket()
    {
        return _socket;
    }

    public int getThrottle()
    {
        return _throttle;
    }

    void handleQuery(DNSIncoming dnsincoming, InetAddress inetaddress, int i)
        throws IOException
    {
        boolean flag;
        if (logger.isLoggable(Level.FINE))
        {
            logger.fine((new StringBuilder()).append(getName()).append(".handle query: ").append(dnsincoming).toString());
        }
        flag = false;
        long l = System.currentTimeMillis();
        for (inetaddress = dnsincoming.getAllAnswers().iterator(); inetaddress.hasNext();)
        {
            flag |= ((DNSRecord)inetaddress.next()).handleQuery(this, l + 120L);
        }

        ioLock();
        if (_plannedAnswer == null) goto _L2; else goto _L1
_L1:
        _plannedAnswer.append(dnsincoming);
_L4:
        ioUnlock();
        long l1 = System.currentTimeMillis();
        for (dnsincoming = dnsincoming.getAnswers().iterator(); dnsincoming.hasNext(); handleRecord((DNSRecord)dnsincoming.next(), l1)) { }
        break; /* Loop/switch isn't completed */
_L2:
        inetaddress = dnsincoming.clone();
        if (dnsincoming.isTruncated())
        {
            _plannedAnswer = inetaddress;
        }
        startResponder(inetaddress, i);
        if (true) goto _L4; else goto _L3
        dnsincoming;
        ioUnlock();
        throw dnsincoming;
_L3:
        if (flag)
        {
            startProber();
        }
        return;
    }

    void handleRecord(DNSRecord dnsrecord, long l)
    {
        Object obj;
        Object obj1;
        Operation operation;
        boolean flag;
        obj = dnsrecord;
        operation = Operation.Noop;
        flag = ((DNSRecord) (obj)).isExpired(l);
        if (logger.isLoggable(Level.FINE))
        {
            logger.fine((new StringBuilder()).append(getName()).append(" handle response: ").append(obj).toString());
        }
        dnsrecord = operation;
        obj1 = obj;
        if (((DNSRecord) (obj)).isServicesDiscoveryMetaQuery()) goto _L2; else goto _L1
_L1:
        dnsrecord = operation;
        obj1 = obj;
        if (((DNSRecord) (obj)).isDomainDiscoveryQuery()) goto _L2; else goto _L3
_L3:
        boolean flag1 = ((DNSRecord) (obj)).isUnique();
        obj1 = (DNSRecord)getCache().getDNSEntry(((DNSEntry) (obj)));
        if (logger.isLoggable(Level.FINE))
        {
            logger.fine((new StringBuilder()).append(getName()).append(" handle response cached record: ").append(obj1).toString());
        }
        if (flag1)
        {
            dnsrecord = getCache().getDNSEntryList(((DNSRecord) (obj)).getKey()).iterator();
            do
            {
                if (!dnsrecord.hasNext())
                {
                    break;
                }
                DNSEntry dnsentry = (DNSEntry)dnsrecord.next();
                if (((DNSRecord) (obj)).getRecordType().equals(dnsentry.getRecordType()) && ((DNSRecord) (obj)).getRecordClass().equals(dnsentry.getRecordClass()) && dnsentry != obj1)
                {
                    ((DNSRecord)dnsentry).setWillExpireSoon(l);
                }
            } while (true);
        }
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        if (flag)
        {
            if (((DNSRecord) (obj)).getTTL() == 0)
            {
                dnsrecord = Operation.Noop;
                ((DNSRecord) (obj1)).setWillExpireSoon(l);
                obj1 = obj;
            } else
            {
                dnsrecord = Operation.Remove;
                getCache().removeDNSEntry(((DNSEntry) (obj1)));
                obj1 = obj;
            }
        } else
        if (!((DNSRecord) (obj)).sameValue(((DNSRecord) (obj1))) || !((DNSRecord) (obj)).sameSubtype(((DNSEntry) (obj1))) && ((DNSRecord) (obj)).getSubtype().length() > 0)
        {
            if (((DNSRecord) (obj)).isSingleValued())
            {
                dnsrecord = Operation.Update;
                getCache().replaceDNSEntry(((DNSEntry) (obj)), ((DNSEntry) (obj1)));
                obj1 = obj;
            } else
            {
                dnsrecord = Operation.Add;
                getCache().addDNSEntry(((DNSEntry) (obj)));
                obj1 = obj;
            }
        } else
        {
            ((DNSRecord) (obj1)).resetTTL(((DNSRecord) (obj)));
            dnsrecord = operation;
        }
_L2:
        obj = dnsrecord;
        if (((DNSRecord) (obj1)).getRecordType() != DNSRecordType.TYPE_PTR) goto _L7; else goto _L6
_L6:
        if (!((DNSRecord) (obj1)).isServicesDiscoveryMetaQuery()) goto _L9; else goto _L8
_L8:
        if (!flag)
        {
            registerServiceType(((DNSRecord.Pointer)obj1).getAlias());
        }
_L11:
        return;
_L5:
        dnsrecord = operation;
        obj1 = obj;
        if (!flag)
        {
            dnsrecord = Operation.Add;
            getCache().addDNSEntry(((DNSEntry) (obj)));
            obj1 = obj;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        obj = dnsrecord;
        if (false | registerServiceType(((DNSRecord) (obj1)).getName()))
        {
            obj = dnsrecord;
            if (dnsrecord == Operation.Noop)
            {
                obj = Operation.RegisterServiceType;
            }
        }
_L7:
        if (obj == Operation.Noop) goto _L11; else goto _L10
_L10:
        updateRecord(l, ((DNSRecord) (obj1)), ((Operation) (obj)));
        return;
        if (true) goto _L2; else goto _L12
_L12:
    }

    void handleResponse(DNSIncoming dnsincoming)
        throws IOException
    {
        long l = System.currentTimeMillis();
        boolean flag1 = false;
        boolean flag = false;
        for (dnsincoming = dnsincoming.getAllAnswers().iterator(); dnsincoming.hasNext();)
        {
            DNSRecord dnsrecord = (DNSRecord)dnsincoming.next();
            handleRecord(dnsrecord, l);
            if (DNSRecordType.TYPE_A.equals(dnsrecord.getRecordType()) || DNSRecordType.TYPE_AAAA.equals(dnsrecord.getRecordType()))
            {
                flag1 |= dnsrecord.handleResponse(this);
            } else
            {
                flag |= dnsrecord.handleResponse(this);
            }
        }

        if (flag1 || flag)
        {
            startProber();
        }
    }

    void handleServiceResolved(final ServiceEvent localEvent)
    {
        Object obj;
        obj = (List)_serviceListeners.get(localEvent.getType().toLowerCase());
        if (obj == null || ((List) (obj)).isEmpty() || localEvent.getInfo() == null || !localEvent.getInfo().hasData())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj;
        JVM INSTR monitorenter ;
        final ListenerStatus.ServiceListenerStatus listener = new ArrayList(((Collection) (obj)));
        obj;
        JVM INSTR monitorexit ;
        for (obj = listener.iterator(); ((Iterator) (obj)).hasNext(); _executor.submit(new Runnable() {

        final JmDNSImpl this$0;
        final ListenerStatus.ServiceListenerStatus val$listener;
        final ServiceEvent val$localEvent;

        public void run()
        {
            listener.serviceResolved(localEvent);
        }

            
            {
                this$0 = JmDNSImpl.this;
                listener = servicelistenerstatus;
                localEvent = serviceevent;
                super();
            }
    }))
        {
            listener = (ListenerStatus.ServiceListenerStatus)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_117;
        localEvent;
        obj;
        JVM INSTR monitorexit ;
        throw localEvent;
    }

    String incrementName(String s)
    {
        String s1;
        int i;
        int j;
        try
        {
            i = s.lastIndexOf('(');
            j = s.lastIndexOf(')');
        }
        catch (NumberFormatException numberformatexception)
        {
            return (new StringBuilder()).append(s).append(" (2)").toString();
        }
        if (i < 0 || i >= j)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        return (new StringBuilder()).append(s.substring(0, i)).append("(").append(Integer.parseInt(s.substring(i + 1, j)) + 1).append(")").toString();
        s1 = (new StringBuilder()).append(s).append(" (2)").toString();
        return s1;
    }

    public void ioLock()
    {
        _ioLock.lock();
    }

    public void ioUnlock()
    {
        _ioLock.unlock();
    }

    public boolean isAnnounced()
    {
        return _localHost.isAnnounced();
    }

    public boolean isAssociatedWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        return _localHost.isAssociatedWithTask(dnstask, dnsstate);
    }

    public boolean isCanceled()
    {
        return _localHost.isCanceled();
    }

    public boolean isCanceling()
    {
        return _localHost.isCanceling();
    }

    public boolean isClosed()
    {
        return _localHost.isClosed();
    }

    public boolean isClosing()
    {
        return _localHost.isClosing();
    }

    public boolean isProbing()
    {
        return _localHost.isProbing();
    }

    public ServiceInfo[] list(String s, long l)
    {
        cleanCache();
        String s1 = s.toLowerCase();
        if (isCanceling() || isCanceled())
        {
            return new ServiceInfo[0];
        }
        ServiceCollector servicecollector1 = (ServiceCollector)_serviceCollectors.get(s1);
        ServiceCollector servicecollector = servicecollector1;
        if (servicecollector1 == null)
        {
            ServiceCollector servicecollector2;
            boolean flag;
            if (_serviceCollectors.putIfAbsent(s1, new ServiceCollector(s)) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            servicecollector2 = (ServiceCollector)_serviceCollectors.get(s1);
            servicecollector = servicecollector2;
            if (flag)
            {
                addServiceListener(s, servicecollector2, true);
                servicecollector = servicecollector2;
            }
        }
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append(getName()).append(".collector: ").append(servicecollector).toString());
        }
        if (servicecollector != null)
        {
            return servicecollector.list(l);
        } else
        {
            return new ServiceInfo[0];
        }
    }

    public void purgeStateTimer()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).purgeStateTimer();
    }

    public void purgeTimer()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).purgeTimer();
    }

    public void recover()
    {
        logger.finer((new StringBuilder()).append(getName()).append("recover()").toString());
        if (isClosing() || isClosed() || isCanceling() || isCanceled())
        {
            return;
        }
        synchronized (_recoverLock)
        {
            if (cancelState())
            {
                logger.finer((new StringBuilder()).append(getName()).append("recover() thread ").append(Thread.currentThread().getName()).toString());
                (new Thread((new StringBuilder()).append(getName()).append(".recover()").toString()) {

                    final JmDNSImpl this$0;

                    public void run()
                    {
                        __recover();
                    }

            
            {
                this$0 = JmDNSImpl.this;
                super(s);
            }
                }).start();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean recoverState()
    {
        return _localHost.recoverState();
    }

    public void registerService(ServiceInfo serviceinfo)
        throws IOException
    {
        if (isClosing() || isClosed())
        {
            throw new IllegalStateException("This DNS is closed.");
        }
        serviceinfo = (ServiceInfoImpl)serviceinfo;
        if (serviceinfo.getDns() != null)
        {
            if (serviceinfo.getDns() != this)
            {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (_services.get(serviceinfo.getKey()) != null)
            {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        serviceinfo.setDns(this);
        registerServiceType(serviceinfo.getTypeWithSubtype());
        serviceinfo.recoverState();
        serviceinfo.setServer(_localHost.getName());
        serviceinfo.addAddress(_localHost.getInet4Address());
        serviceinfo.addAddress(_localHost.getInet6Address());
        waitForAnnounced(6000L);
        makeServiceNameUnique(serviceinfo);
        for (; _services.putIfAbsent(serviceinfo.getKey(), serviceinfo) != null; makeServiceNameUnique(serviceinfo)) { }
        startProber();
        serviceinfo.waitForAnnounced(6000L);
        if (logger.isLoggable(Level.FINE))
        {
            logger.fine((new StringBuilder()).append("registerService() JmDNS registered service as ").append(serviceinfo).toString());
        }
    }

    public boolean registerServiceType(String s)
    {
        final ServiceEventImpl event;
        final ListenerStatus.ServiceTypeListenerStatus status;
        boolean flag;
        boolean flag1 = false;
        event = ServiceInfoImpl.decodeQualifiedNameMapForType(s);
        final ServiceEventImpl event = (String)event.get(javax.jmdns.ServiceInfo.Fields.Domain);
        String s1 = (String)event.get(javax.jmdns.ServiceInfo.Fields.Protocol);
        final ListenerStatus.ServiceTypeListenerStatus status = (String)event.get(javax.jmdns.ServiceInfo.Fields.Application);
        status = (String)event.get(javax.jmdns.ServiceInfo.Fields.Subtype);
        StringBuilder stringbuilder = new StringBuilder();
        if (status.length() > 0)
        {
            event = (new StringBuilder()).append("_").append(status).append(".").toString();
        } else
        {
            event = "";
        }
        stringbuilder = stringbuilder.append(event);
        if (s1.length() > 0)
        {
            event = (new StringBuilder()).append("_").append(s1).append(".").toString();
        } else
        {
            event = "";
        }
        event = stringbuilder.append(event).append(event).append(".").toString();
        s1 = event.toLowerCase();
        if (logger.isLoggable(Level.FINE))
        {
            Logger logger1 = logger;
            StringBuilder stringbuilder1 = (new StringBuilder()).append(getName()).append(".registering service type: ").append(s).append(" as: ").append(event);
            int i;
            int k;
            if (status.length() > 0)
            {
                s = (new StringBuilder()).append(" subtype: ").append(status).toString();
            } else
            {
                s = "";
            }
            logger1.fine(stringbuilder1.append(s).toString());
        }
        flag = flag1;
        if (!_serviceTypes.containsKey(s1))
        {
            flag = flag1;
            if (!status.toLowerCase().equals("dns-sd"))
            {
                flag = flag1;
                if (!event.toLowerCase().endsWith("in-addr.arpa"))
                {
                    flag = flag1;
                    if (!event.toLowerCase().endsWith("ip6.arpa"))
                    {
                        boolean flag2;
                        if (_serviceTypes.putIfAbsent(s1, new ServiceTypeEntry(event)) == null)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        flag = flag2;
                        if (flag2)
                        {
                            s = (ListenerStatus.ServiceTypeListenerStatus[])_typeListeners.toArray(new ListenerStatus.ServiceTypeListenerStatus[_typeListeners.size()]);
                            event = new ServiceEventImpl(this, event, "", null);
                            k = s.length;
                            i = 0;
                            do
                            {
                                flag = flag2;
                                if (i >= k)
                                {
                                    break;
                                }
                                status = s[i];
                                _executor.submit(new Runnable() {

                                    final JmDNSImpl this$0;
                                    final ServiceEvent val$event;
                                    final ListenerStatus.ServiceTypeListenerStatus val$status;

                                    public void run()
                                    {
                                        status.serviceTypeAdded(event);
                                    }

            
            {
                this$0 = JmDNSImpl.this;
                status = servicetypelistenerstatus;
                event = serviceevent;
                super();
            }
                                });
                                i++;
                            } while (true);
                        }
                    }
                }
            }
        }
        if (status.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        s = (ServiceTypeEntry)_serviceTypes.get(s1);
        if (s == null || s.contains(status))
        {
            break MISSING_BLOCK_LABEL_688;
        }
        s;
        JVM INSTR monitorenter ;
        if (s.contains(status)) goto _L2; else goto _L1
_L1:
        boolean flag3 = true;
        ListenerStatus.ServiceTypeListenerStatus aservicetypelistenerstatus[];
        int l;
        s.add(status);
        aservicetypelistenerstatus = (ListenerStatus.ServiceTypeListenerStatus[])_typeListeners.toArray(new ListenerStatus.ServiceTypeListenerStatus[_typeListeners.size()]);
        event = new ServiceEventImpl(this, (new StringBuilder()).append("_").append(status).append("._sub.").append(event).toString(), "", null);
        l = aservicetypelistenerstatus.length;
        int j = 0;
_L3:
        flag = flag3;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        status = aservicetypelistenerstatus[j];
        _executor.submit(new Runnable() {

            final JmDNSImpl this$0;
            final ServiceEvent val$event;
            final ListenerStatus.ServiceTypeListenerStatus val$status;

            public void run()
            {
                status.subTypeForServiceTypeAdded(event);
            }

            
            {
                this$0 = JmDNSImpl.this;
                status = servicetypelistenerstatus;
                event = serviceevent;
                super();
            }
        });
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        return flag;
    }

    public void removeAssociationWithTask(DNSTask dnstask)
    {
        _localHost.removeAssociationWithTask(dnstask);
    }

    public void removeListener(DNSListener dnslistener)
    {
        _listeners.remove(dnslistener);
    }

    public void removeServiceListener(String s, ServiceListener servicelistener)
    {
        String s1;
        s1 = s.toLowerCase();
        s = (List)_serviceListeners.get(s1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s;
        JVM INSTR monitorenter ;
        s.remove(new ListenerStatus.ServiceListenerStatus(servicelistener, false));
        if (s.isEmpty())
        {
            _serviceListeners.remove(s1, s);
        }
        s;
        JVM INSTR monitorexit ;
        return;
        servicelistener;
        s;
        JVM INSTR monitorexit ;
        throw servicelistener;
    }

    public void renewServiceCollector(DNSRecord dnsrecord)
    {
        dnsrecord = dnsrecord.getServiceInfo();
        if (_serviceCollectors.containsKey(dnsrecord.getType().toLowerCase()))
        {
            startServiceResolver(dnsrecord.getType());
        }
    }

    ServiceInfoImpl resolveServiceInfo(String s, String s1, String s2, boolean flag)
    {
        cleanCache();
        String s3 = s.toLowerCase();
        registerServiceType(s);
        if (_serviceCollectors.putIfAbsent(s3, new ServiceCollector(s)) == null)
        {
            addServiceListener(s3, (ServiceListener)_serviceCollectors.get(s3), true);
        }
        s = getServiceInfoFromCache(s, s1, s2, flag);
        startServiceInfoResolver(s);
        return s;
    }

    public void respondToQuery(DNSIncoming dnsincoming)
    {
        ioLock();
        if (_plannedAnswer == dnsincoming)
        {
            _plannedAnswer = null;
        }
        ioUnlock();
        return;
        dnsincoming;
        ioUnlock();
        throw dnsincoming;
    }

    public boolean revertState()
    {
        return _localHost.revertState();
    }

    public void send(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        if (!dnsoutgoing.isEmpty())
        {
            dnsoutgoing = dnsoutgoing.data();
            dnsoutgoing = new DatagramPacket(dnsoutgoing, dnsoutgoing.length, _group, DNSConstants.MDNS_PORT);
            MulticastSocket multicastsocket;
            if (logger.isLoggable(Level.FINEST))
            {
                try
                {
                    DNSIncoming dnsincoming = new DNSIncoming(dnsoutgoing);
                    if (logger.isLoggable(Level.FINEST))
                    {
                        logger.finest((new StringBuilder()).append("send(").append(getName()).append(") JmDNS out:").append(dnsincoming.print(true)).toString());
                    }
                }
                catch (IOException ioexception)
                {
                    logger.throwing(getClass().toString(), (new StringBuilder()).append("send(").append(getName()).append(") - JmDNS can not parse what it sends!!!").toString(), ioexception);
                }
            }
            multicastsocket = _socket;
            if (multicastsocket != null && !multicastsocket.isClosed())
            {
                multicastsocket.send(dnsoutgoing);
            }
        }
    }

    public void setLastThrottleIncrement(long l)
    {
        _lastThrottleIncrement = l;
    }

    public void setThrottle(int i)
    {
        _throttle = i;
    }

    public void startAnnouncer()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startAnnouncer();
    }

    public void startCanceler()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startCanceler();
    }

    public void startProber()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startProber();
    }

    public void startReaper()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startReaper();
    }

    public void startRenewer()
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startRenewer();
    }

    public void startResponder(DNSIncoming dnsincoming, int i)
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startResponder(dnsincoming, i);
    }

    public void startServiceInfoResolver(ServiceInfoImpl serviceinfoimpl)
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startServiceInfoResolver(serviceinfoimpl);
    }

    public void startServiceResolver(String s)
    {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startServiceResolver(s);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(2048);
        stringbuilder.append("\t---- Local Host -----");
        stringbuilder.append("\n\t");
        stringbuilder.append(_localHost);
        stringbuilder.append("\n\t---- Services -----");
        String s;
        for (Iterator iterator = _services.keySet().iterator(); iterator.hasNext(); stringbuilder.append(_services.get(s)))
        {
            s = (String)iterator.next();
            stringbuilder.append("\n\t\tService: ");
            stringbuilder.append(s);
            stringbuilder.append(": ");
        }

        stringbuilder.append("\n");
        stringbuilder.append("\t---- Types ----");
        Object obj;
        for (Iterator iterator3 = _serviceTypes.keySet().iterator(); iterator3.hasNext(); stringbuilder.append(obj))
        {
            obj = (String)iterator3.next();
            ServiceTypeEntry servicetypeentry = (ServiceTypeEntry)_serviceTypes.get(obj);
            stringbuilder.append("\n\t\tType: ");
            stringbuilder.append(servicetypeentry.getType());
            stringbuilder.append(": ");
            obj = servicetypeentry;
            if (servicetypeentry.isEmpty())
            {
                obj = "no subtypes";
            }
        }

        stringbuilder.append("\n");
        stringbuilder.append(_cache.toString());
        stringbuilder.append("\n");
        stringbuilder.append("\t---- Service Collectors ----");
        String s1;
        for (Iterator iterator1 = _serviceCollectors.keySet().iterator(); iterator1.hasNext(); stringbuilder.append(_serviceCollectors.get(s1)))
        {
            s1 = (String)iterator1.next();
            stringbuilder.append("\n\t\tService Collector: ");
            stringbuilder.append(s1);
            stringbuilder.append(": ");
        }

        stringbuilder.append("\n");
        stringbuilder.append("\t---- Service Listeners ----");
        String s2;
        for (Iterator iterator2 = _serviceListeners.keySet().iterator(); iterator2.hasNext(); stringbuilder.append(_serviceListeners.get(s2)))
        {
            s2 = (String)iterator2.next();
            stringbuilder.append("\n\t\tService Listener: ");
            stringbuilder.append(s2);
            stringbuilder.append(": ");
        }

        return stringbuilder.toString();
    }

    public void unregisterAllServices()
    {
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer("unregisterAllServices()");
        }
        Iterator iterator = _services.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = (ServiceInfoImpl)_services.get(obj);
            if (obj != null)
            {
                if (logger.isLoggable(Level.FINER))
                {
                    logger.finer((new StringBuilder()).append("Cancelling service info: ").append(obj).toString());
                }
                ((ServiceInfoImpl) (obj)).cancelState();
            }
        } while (true);
        startCanceler();
        iterator = _services.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)_services.get(s);
            if (serviceinfoimpl != null)
            {
                if (logger.isLoggable(Level.FINER))
                {
                    logger.finer((new StringBuilder()).append("Wait for service info cancel: ").append(serviceinfoimpl).toString());
                }
                serviceinfoimpl.waitForCanceled(5000L);
                _services.remove(s, serviceinfoimpl);
            }
        } while (true);
    }

    public void updateRecord(long l, final DNSRecord localEvent, Operation operation)
    {
        final Object listener = _listeners;
        listener;
        JVM INSTR monitorenter ;
        Object obj = new ArrayList(_listeners);
        listener;
        JVM INSTR monitorexit ;
        for (listener = ((List) (obj)).iterator(); ((Iterator) (listener)).hasNext(); ((DNSListener)((Iterator) (listener)).next()).updateRecord(getCache(), l, localEvent)) { }
          goto _L1
        localEvent;
_L12:
        listener;
        JVM INSTR monitorexit ;
        throw localEvent;
_L1:
        if (!DNSRecordType.TYPE_PTR.equals(localEvent.getRecordType())) goto _L3; else goto _L2
_L2:
label0:
        {
            listener = localEvent.getServiceEvent(this);
            if (((ServiceEvent) (listener)).getInfo() != null)
            {
                localEvent = ((DNSRecord) (listener));
                if (((ServiceEvent) (listener)).getInfo().hasData())
                {
                    break label0;
                }
            }
            obj = getServiceInfoFromCache(((ServiceEvent) (listener)).getType(), ((ServiceEvent) (listener)).getName(), "", false);
            localEvent = ((DNSRecord) (listener));
            if (((ServiceInfo) (obj)).hasData())
            {
                localEvent = new ServiceEventImpl(this, ((ServiceEvent) (listener)).getType(), ((ServiceEvent) (listener)).getName(), ((ServiceInfo) (obj)));
            }
        }
        obj = (List)_serviceListeners.get(localEvent.getType().toLowerCase());
        if (obj == null) goto _L5; else goto _L4
_L4:
        obj;
        JVM INSTR monitorenter ;
        listener = new ArrayList(((Collection) (obj)));
        obj;
        JVM INSTR monitorexit ;
_L10:
        if (logger.isLoggable(Level.FINEST))
        {
            logger.finest((new StringBuilder()).append(getName()).append(".updating record for event: ").append(localEvent).append(" list ").append(listener).append(" operation: ").append(operation).toString());
        }
        if (((List) (listener)).isEmpty()) goto _L3; else goto _L6
_L6:
        static class _cls7
        {

            static final int $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation[];

            static 
            {
                $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation = new int[Operation.values().length];
                try
                {
                    $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation[Operation.Add.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation[Operation.Remove.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7..SwitchMap.javax.jmdns.impl.JmDNSImpl.Operation[operation.ordinal()];
        JVM INSTR tableswitch 1 2: default 320
    //                   1 335
    //                   2 407;
           goto _L7 _L8 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_407;
_L3:
        return;
        localEvent;
        obj;
        JVM INSTR monitorexit ;
        throw localEvent;
_L5:
        listener = Collections.emptyList();
          goto _L10
_L8:
        operation = ((List) (listener)).iterator();
        while (operation.hasNext()) 
        {
            listener = (ListenerStatus.ServiceListenerStatus)operation.next();
            if (((ListenerStatus.ServiceListenerStatus) (listener)).isSynchronous())
            {
                ((ListenerStatus.ServiceListenerStatus) (listener)).serviceAdded(localEvent);
            } else
            {
                _executor.submit(new Runnable() {

                    final JmDNSImpl this$0;
                    final ListenerStatus.ServiceListenerStatus val$listener;
                    final ServiceEvent val$localEvent;

                    public void run()
                    {
                        listener.serviceAdded(localEvent);
                    }

            
            {
                this$0 = JmDNSImpl.this;
                listener = servicelistenerstatus;
                localEvent = serviceevent;
                super();
            }
                });
            }
        }
          goto _L3
        operation = ((List) (listener)).iterator();
        while (operation.hasNext()) 
        {
            listener = (ListenerStatus.ServiceListenerStatus)operation.next();
            if (((ListenerStatus.ServiceListenerStatus) (listener)).isSynchronous())
            {
                ((ListenerStatus.ServiceListenerStatus) (listener)).serviceRemoved(localEvent);
            } else
            {
                _executor.submit(new Runnable() {

                    final JmDNSImpl this$0;
                    final ListenerStatus.ServiceListenerStatus val$listener;
                    final ServiceEvent val$localEvent;

                    public void run()
                    {
                        listener.serviceRemoved(localEvent);
                    }

            
            {
                this$0 = JmDNSImpl.this;
                listener = servicelistenerstatus;
                localEvent = serviceevent;
                super();
            }
                });
            }
        }
          goto _L3
        localEvent;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public boolean waitForAnnounced(long l)
    {
        return _localHost.waitForAnnounced(l);
    }

    public boolean waitForCanceled(long l)
    {
        return _localHost.waitForCanceled(l);
    }

}
