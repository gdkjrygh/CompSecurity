// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.internal.operators.BackpressureUtils;

// Referenced classes of package rx.observables:
//            AbstractOnSubscribe

private static final class <init>
    implements Producer
{

    final state state;

    protected boolean doNext()
    {
        if (!state.())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        int i = state.se();
        ess._mth600(state).next(state);
        if (!state.ify())
        {
            throw new IllegalStateException((new StringBuilder()).append("No event produced or stop called @ Phase: ").append(i).append(" -> ").append(state.se()).append(", Calls: ").append(state.ls()).toString());
        }
        break MISSING_BLOCK_LABEL_127;
        Object obj;
        obj;
        state.minate();
        ess._mth500(state).onError(((Throwable) (obj)));
        state.e();
        return false;
        if (!state.ept() && !state.pRequested())
        {
            break MISSING_BLOCK_LABEL_163;
        }
        state.minate();
        state.e();
        return false;
        ess._mth708(state);
        state.e();
        return true;
        obj;
        state.e();
        throw obj;
    }

    public void request(long l)
    {
        if (l > 0L && BackpressureUtils.getAndAddRequest(ess._mth400(state), l) == 0L)
        {
            if (l == 0x7fffffffffffffffL)
            {
                while (!ess._mth500(state).isUnsubscribed() && doNext()) ;
            } else
            if (!ess._mth500(state).isUnsubscribed())
            {
                while (doNext() && ess._mth400(state).decrementAndGet() > 0L && !ess._mth500(state).isUnsubscribed()) ;
                return;
            }
        }
    }

    private ( )
    {
        state = ;
    }

    state(state state1, state state2)
    {
        this(state1);
    }
}
