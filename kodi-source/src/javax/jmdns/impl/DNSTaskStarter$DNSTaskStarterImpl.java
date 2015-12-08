// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.jmdns.impl.tasks.RecordReaper;
import javax.jmdns.impl.tasks.Responder;
import javax.jmdns.impl.tasks.resolver.ServiceInfoResolver;
import javax.jmdns.impl.tasks.resolver.ServiceResolver;
import javax.jmdns.impl.tasks.state.Announcer;
import javax.jmdns.impl.tasks.state.Canceler;
import javax.jmdns.impl.tasks.state.Prober;
import javax.jmdns.impl.tasks.state.Renewer;

// Referenced classes of package javax.jmdns.impl:
//            DNSTaskStarter, JmDNSImpl, DNSIncoming, ServiceInfoImpl

public static final class _jmDNSImpl
    implements DNSTaskStarter
{
    public static class StarterTimer extends Timer
    {

        private volatile boolean _cancelled;

        public void cancel()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            _cancelled = true;
            super.cancel();
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void schedule(TimerTask timertask, long l)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            super.schedule(timertask, l);
            if (true) goto _L1; else goto _L3
_L3:
            timertask;
            throw timertask;
        }

        public void schedule(TimerTask timertask, long l, long l1)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            super.schedule(timertask, l, l1);
            if (true) goto _L1; else goto _L3
_L3:
            timertask;
            throw timertask;
        }

        public void schedule(TimerTask timertask, Date date)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            super.schedule(timertask, date);
            if (true) goto _L1; else goto _L3
_L3:
            timertask;
            throw timertask;
        }

        public void schedule(TimerTask timertask, Date date, long l)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            super.schedule(timertask, date, l);
            if (true) goto _L1; else goto _L3
_L3:
            timertask;
            throw timertask;
        }

        public void scheduleAtFixedRate(TimerTask timertask, long l, long l1)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            super.scheduleAtFixedRate(timertask, l, l1);
            if (true) goto _L1; else goto _L3
_L3:
            timertask;
            throw timertask;
        }

        public void scheduleAtFixedRate(TimerTask timertask, Date date, long l)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = _cancelled;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            super.scheduleAtFixedRate(timertask, date, l);
            if (true) goto _L1; else goto _L3
_L3:
            timertask;
            throw timertask;
        }

        public StarterTimer()
        {
            _cancelled = false;
        }

        public StarterTimer(String s, boolean flag)
        {
            super(s, flag);
            _cancelled = false;
        }
    }


    private final JmDNSImpl _jmDNSImpl;
    private final Timer _stateTimer;
    private final Timer _timer;

    public void cancelStateTimer()
    {
        _stateTimer.cancel();
    }

    public void cancelTimer()
    {
        _timer.cancel();
    }

    public void purgeStateTimer()
    {
        _stateTimer.purge();
    }

    public void purgeTimer()
    {
        _timer.purge();
    }

    public void startAnnouncer()
    {
        (new Announcer(_jmDNSImpl)).start(_stateTimer);
    }

    public void startCanceler()
    {
        (new Canceler(_jmDNSImpl)).start(_stateTimer);
    }

    public void startProber()
    {
        (new Prober(_jmDNSImpl)).start(_stateTimer);
    }

    public void startReaper()
    {
        (new RecordReaper(_jmDNSImpl)).start(_timer);
    }

    public void startRenewer()
    {
        (new Renewer(_jmDNSImpl)).start(_stateTimer);
    }

    public void startResponder(DNSIncoming dnsincoming, int i)
    {
        (new Responder(_jmDNSImpl, dnsincoming, i)).start(_timer);
    }

    public void startServiceInfoResolver(ServiceInfoImpl serviceinfoimpl)
    {
        (new ServiceInfoResolver(_jmDNSImpl, serviceinfoimpl)).start(_timer);
    }

    public void startServiceResolver(String s)
    {
        (new ServiceResolver(_jmDNSImpl, s)).start(_timer);
    }

    public StarterTimer._cancelled(JmDNSImpl jmdnsimpl)
    {
        _jmDNSImpl = jmdnsimpl;
        _timer = new StarterTimer((new StringBuilder()).append("JmDNS(").append(_jmDNSImpl.getName()).append(").Timer").toString(), true);
        _stateTimer = new StarterTimer((new StringBuilder()).append("JmDNS(").append(_jmDNSImpl.getName()).append(").State.Timer").toString(), false);
    }
}
