// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;

// Referenced classes of package javax.jmdns.impl:
//            DNSStatefulObject, JmDNSImpl

public static class _state extends ReentrantLock
    implements DNSStatefulObject
{

    private static Logger logger = Logger.getLogger(javax/jmdns/impl/DNSStatefulObject$DefaultImplementation.getName());
    private final hore _announcing = new hore("Announce");
    private final hore _canceling = new hore("Cancel");
    private volatile JmDNSImpl _dns;
    protected volatile DNSState _state;
    protected volatile DNSTask _task;

    private boolean willCancel()
    {
        return _state.isCanceled() || _state.isCanceling();
    }

    private boolean willClose()
    {
        return _state.isClosed() || _state.isClosing();
    }

    public boolean advanceState(DNSTask dnstask)
    {
        if (_task != dnstask) goto _L2; else goto _L1
_L1:
        lock();
        if (_task != dnstask) goto _L4; else goto _L3
_L3:
        setState(_state.advance());
_L6:
        unlock();
_L2:
        return true;
_L4:
        logger.warning((new StringBuilder()).append("Trying to advance state whhen not the owner. owner: ").append(_task).append(" perpetrator: ").append(dnstask).toString());
        if (true) goto _L6; else goto _L5
_L5:
        dnstask;
        unlock();
        throw dnstask;
    }

    public void associateWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        if (_task != null || _state != dnsstate)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        lock();
        if (_task == null && _state == dnsstate)
        {
            setTask(dnstask);
        }
        unlock();
        return;
        dnstask;
        unlock();
        throw dnstask;
    }

    public boolean cancelState()
    {
        boolean flag;
        flag = false;
        boolean flag1 = false;
        if (willCancel())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        lock();
        flag = flag1;
        if (willCancel())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        setState(DNSState.CANCELING_1);
        setTask(null);
        flag = true;
        unlock();
        return flag;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    public boolean closeState()
    {
        boolean flag;
        flag = false;
        boolean flag1 = false;
        if (willClose())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        lock();
        flag = flag1;
        if (willClose())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        setState(DNSState.CLOSING);
        setTask(null);
        flag = true;
        unlock();
        return flag;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    public JmDNSImpl getDns()
    {
        return _dns;
    }

    public boolean isAnnounced()
    {
        return _state.isAnnounced();
    }

    public boolean isAnnouncing()
    {
        return _state.isAnnouncing();
    }

    public boolean isAssociatedWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        lock();
        if (_task != dnstask) goto _L2; else goto _L1
_L1:
        dnstask = _state;
        if (dnstask != dnsstate) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        dnstask;
        unlock();
        throw dnstask;
    }

    public boolean isCanceled()
    {
        return _state.isCanceled();
    }

    public boolean isCanceling()
    {
        return _state.isCanceling();
    }

    public boolean isClosed()
    {
        return _state.isClosed();
    }

    public boolean isClosing()
    {
        return _state.isClosing();
    }

    public boolean isProbing()
    {
        return _state.isProbing();
    }

    public boolean recoverState()
    {
        lock();
        setState(DNSState.PROBING_1);
        setTask(null);
        unlock();
        return false;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    public void removeAssociationWithTask(DNSTask dnstask)
    {
        if (_task != dnstask)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        lock();
        if (_task == dnstask)
        {
            setTask(null);
        }
        unlock();
        return;
        dnstask;
        unlock();
        throw dnstask;
    }

    public boolean revertState()
    {
        if (willCancel())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        lock();
        if (!willCancel())
        {
            setState(_state.revert());
            setTask(null);
        }
        unlock();
        return true;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    protected void setDns(JmDNSImpl jmdnsimpl)
    {
        _dns = jmdnsimpl;
    }

    protected void setState(DNSState dnsstate)
    {
        lock();
        _state = dnsstate;
        if (isAnnounced())
        {
            _announcing.signalEvent();
        }
        if (isCanceled())
        {
            _canceling.signalEvent();
            _announcing.signalEvent();
        }
        unlock();
        return;
        dnsstate;
        unlock();
        throw dnsstate;
    }

    protected void setTask(DNSTask dnstask)
    {
        _task = dnstask;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (_dns != null)
        {
            s = (new StringBuilder()).append("DNS: ").append(_dns.getName()).toString();
        } else
        {
            s = "NO DNS";
        }
        return stringbuilder.append(s).append(" state: ").append(_state).append(" task: ").append(_task).toString();
    }

    public boolean waitForAnnounced(long l)
    {
        if (!isAnnounced() && !willCancel())
        {
            _announcing.waitForEvent(l);
        }
        if (!isAnnounced())
        {
            if (willCancel() || willClose())
            {
                logger.fine((new StringBuilder()).append("Wait for announced cancelled: ").append(this).toString());
            } else
            {
                logger.warning((new StringBuilder()).append("Wait for announced timed out: ").append(this).toString());
            }
        }
        return isAnnounced();
    }

    public boolean waitForCanceled(long l)
    {
        if (!isCanceled())
        {
            _canceling.waitForEvent(l);
        }
        if (!isCanceled() && !willClose())
        {
            logger.warning((new StringBuilder()).append("Wait for canceled timed out: ").append(this).toString());
        }
        return isCanceled();
    }


    public hore()
    {
        _dns = null;
        _task = null;
        _state = DNSState.PROBING_1;
    }
}
