// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;

// Referenced classes of package javax.jmdns.impl:
//            ServiceInfoImpl, JmDNSImpl

private static final class _info extends tation
{

    private final ServiceInfoImpl _info;

    public void setDns(JmDNSImpl jmdnsimpl)
    {
        super.setDns(jmdnsimpl);
    }

    protected void setTask(DNSTask dnstask)
    {
        super.setTask(dnstask);
        if (_task != null || !_info.needTextAnnouncing())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        lock();
        if (_task == null && _info.needTextAnnouncing())
        {
            if (_state.isAnnounced())
            {
                setState(DNSState.ANNOUNCING_1);
                if (getDns() != null)
                {
                    getDns().startAnnouncer();
                }
            }
            _info.setNeedTextAnnouncing(false);
        }
        unlock();
        return;
        dnstask;
        unlock();
        throw dnstask;
    }

    public tation(ServiceInfoImpl serviceinfoimpl)
    {
        _info = serviceinfoimpl;
    }
}
