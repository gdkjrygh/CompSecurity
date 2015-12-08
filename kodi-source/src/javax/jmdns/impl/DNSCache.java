// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSEntry

public class DNSCache extends AbstractMap
{
    protected static class _CacheEntry
        implements java.util.Map.Entry
    {

        private String _key;
        private List _value;

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
            if (_key != null)
            {
                return _key;
            } else
            {
                return "";
            }
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public List getValue()
        {
            return _value;
        }

        public int hashCode()
        {
            if (_key == null)
            {
                return 0;
            } else
            {
                return _key.hashCode();
            }
        }

        public volatile Object setValue(Object obj)
        {
            return setValue((List)obj);
        }

        public List setValue(List list)
        {
            List list1 = _value;
            _value = list;
            return list1;
        }

        public String toString()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = new StringBuffer(200);
            ((StringBuffer) (obj)).append("\n\t\tname '");
            ((StringBuffer) (obj)).append(_key);
            ((StringBuffer) (obj)).append("' ");
            if (_value != null && !_value.isEmpty())
            {
                DNSEntry dnsentry;
                for (Iterator iterator = _value.iterator(); iterator.hasNext(); ((StringBuffer) (obj)).append(dnsentry.toString()))
                {
                    dnsentry = (DNSEntry)iterator.next();
                    ((StringBuffer) (obj)).append("\n\t\t\t");
                }

                break MISSING_BLOCK_LABEL_115;
            }
            break MISSING_BLOCK_LABEL_108;
            obj;
            throw obj;
            ((StringBuffer) (obj)).append(" no entries");
            obj = ((StringBuffer) (obj)).toString();
            this;
            JVM INSTR monitorexit ;
            return ((String) (obj));
        }

        protected _CacheEntry(String s, List list)
        {
            if (s != null)
            {
                s = s.trim().toLowerCase();
            } else
            {
                s = null;
            }
            _key = s;
            _value = list;
        }
    }

    static final class _EmptyCache extends DNSCache
    {

        public boolean containsKey(Object obj)
        {
            return false;
        }

        public boolean containsValue(Object obj)
        {
            return false;
        }

        public Set entrySet()
        {
            return Collections.emptySet();
        }

        public boolean equals(Object obj)
        {
            return (obj instanceof Map) && ((Map)obj).size() == 0;
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            return null;
        }

        public int hashCode()
        {
            return 0;
        }

        public boolean isEmpty()
        {
            return true;
        }

        public Set keySet()
        {
            return Collections.emptySet();
        }

        public volatile Object put(Object obj, Object obj1)
        {
            return put((String)obj, (List)obj1);
        }

        public List put(String s, List list)
        {
            return null;
        }

        public int size()
        {
            return 0;
        }

        public Collection values()
        {
            return Collections.emptySet();
        }

        _EmptyCache()
        {
        }
    }


    public static final DNSCache EmptyCache = new _EmptyCache();
    private transient Set _entrySet;

    public DNSCache()
    {
        this(1024);
    }

    public DNSCache(int i)
    {
        _entrySet = null;
        _entrySet = new HashSet(i);
    }

    public DNSCache(DNSCache dnscache)
    {
        int i;
        if (dnscache != null)
        {
            i = dnscache.size();
        } else
        {
            i = 1024;
        }
        this(i);
        if (dnscache != null)
        {
            putAll(dnscache);
        }
    }

    private Collection _getDNSEntryList(String s)
    {
        if (s != null)
        {
            s = s.toLowerCase();
        } else
        {
            s = null;
        }
        return (Collection)get(s);
    }

    public boolean addDNSEntry(DNSEntry dnsentry)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        if (dnsentry == null) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry = getEntry(dnsentry.getKey());
        if (entry == null) goto _L4; else goto _L3
_L3:
        ArrayList arraylist = new ArrayList((Collection)entry.getValue());
_L7:
        arraylist.add(dnsentry);
        if (entry == null) goto _L6; else goto _L5
_L5:
        entry.setValue(arraylist);
_L8:
        flag = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        arraylist = new ArrayList();
          goto _L7
_L6:
        entrySet().add(new _CacheEntry(dnsentry.getKey(), arraylist));
          goto _L8
        dnsentry;
        throw dnsentry;
          goto _L7
    }

    public Collection allValues()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList();
        iterator = values().iterator();
_L2:
        List list;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_59;
            }
            list = (List)iterator.next();
        } while (list == null);
        ((List) (obj)).addAll(list);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((Collection) (obj));
    }

    protected Object clone()
        throws CloneNotSupportedException
    {
        return new DNSCache(this);
    }

    public Set entrySet()
    {
        if (_entrySet == null)
        {
            _entrySet = new HashSet();
        }
        return _entrySet;
    }

    public DNSEntry getDNSEntry(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        Object obj1 = _getDNSEntryList(s);
        s = obj;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((Collection) (obj1)).iterator();
_L4:
        s = obj;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (DNSEntry)((Iterator) (obj1)).next();
        if (!s.getRecordType().equals(dnsrecordtype)) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (DNSRecordClass.CLASS_ANY == dnsrecordclass)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = s.getRecordClass().equals(dnsrecordclass);
        if (!flag) goto _L4; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public DNSEntry getDNSEntry(DNSEntry dnsentry)
    {
        this;
        JVM INSTR monitorenter ;
        DNSEntry dnsentry1;
        Object obj;
        obj = null;
        dnsentry1 = obj;
        if (dnsentry == null) goto _L2; else goto _L1
_L1:
        Object obj1 = _getDNSEntryList(dnsentry.getKey());
        dnsentry1 = obj;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = ((Collection) (obj1)).iterator();
_L4:
        dnsentry1 = obj;
        boolean flag;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        dnsentry1 = (DNSEntry)((Iterator) (obj1)).next();
        flag = dnsentry1.isSameEntry(dnsentry);
        if (!flag) goto _L4; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return dnsentry1;
        dnsentry;
        throw dnsentry;
    }

    public Collection getDNSEntryList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = _getDNSEntryList(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        s = new ArrayList(s);
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = Collections.emptyList();
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public Collection getDNSEntryList(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass)
    {
        this;
        JVM INSTR monitorenter ;
        s = _getDNSEntryList(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s = new ArrayList(s);
        Iterator iterator = s.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DNSEntry dnsentry = (DNSEntry)iterator.next();
            if (!dnsentry.getRecordType().equals(dnsrecordtype) || DNSRecordClass.CLASS_ANY != dnsrecordclass && !dnsentry.getRecordClass().equals(dnsrecordclass))
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_97;
        s;
        throw s;
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
        s = Collections.emptyList();
          goto _L1
    }

    protected java.util.Map.Entry getEntry(String s)
    {
label0:
        {
            Iterator iterator;
            java.util.Map.Entry entry;
            if (s != null)
            {
                s = s.trim().toLowerCase();
            } else
            {
                s = null;
            }
            iterator = entrySet().iterator();
label1:
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    entry = (java.util.Map.Entry)iterator.next();
                    if (s == null)
                    {
                        continue label1;
                    }
                } while (!s.equals(entry.getKey()));
                return entry;
            } while (entry.getKey() != null);
            return entry;
        }
        return null;
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, (List)obj1);
    }

    public List put(String s, List list)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        java.util.Map.Entry entry = getEntry(s);
        if (entry == null) goto _L2; else goto _L1
_L1:
        s = (List)entry.setValue(list);
_L3:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        entrySet().add(new _CacheEntry(s, list));
        s = obj;
          goto _L3
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean removeDNSEntry(DNSEntry dnsentry)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (dnsentry == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        java.util.Map.Entry entry = getEntry(dnsentry.getKey());
        flag = flag1;
        if (entry == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag1 = ((List)entry.getValue()).remove(dnsentry);
        flag = flag1;
        if (!((List)entry.getValue()).isEmpty())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        entrySet().remove(entry);
        flag = flag1;
        this;
        JVM INSTR monitorexit ;
        return flag;
        dnsentry;
        throw dnsentry;
    }

    public boolean replaceDNSEntry(DNSEntry dnsentry, DNSEntry dnsentry1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (dnsentry == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (dnsentry1 == null) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (!dnsentry.getKey().equals(dnsentry1.getKey())) goto _L2; else goto _L4
_L4:
        java.util.Map.Entry entry = getEntry(dnsentry.getKey());
        if (entry == null) goto _L6; else goto _L5
_L5:
        ArrayList arraylist = new ArrayList((Collection)entry.getValue());
_L9:
        arraylist.remove(dnsentry1);
        arraylist.add(dnsentry);
        if (entry == null) goto _L8; else goto _L7
_L7:
        entry.setValue(arraylist);
_L10:
        flag = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L6:
        arraylist = new ArrayList();
          goto _L9
_L8:
        entrySet().add(new _CacheEntry(dnsentry.getKey(), arraylist));
          goto _L10
        dnsentry;
        throw dnsentry;
          goto _L9
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuffer(2000);
        ((StringBuffer) (obj)).append("\t---- cache ----");
        java.util.Map.Entry entry;
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext(); ((StringBuffer) (obj)).append(entry.toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            ((StringBuffer) (obj)).append("\n\t\t");
        }

        break MISSING_BLOCK_LABEL_73;
        obj;
        throw obj;
        obj = ((StringBuffer) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
    }

}
