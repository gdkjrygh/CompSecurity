// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscription;

// Referenced classes of package rx.observables:
//            AbstractOnSubscribe

private static final class <init> extends AtomicBoolean
    implements Subscription
{

    private static final long serialVersionUID = 0x6eefff08576a4bccL;
    private final  state;

    public boolean isUnsubscribed()
    {
        return get();
    }

    public void unsubscribe()
    {
        if (compareAndSet(false, true))
        {
            state.();
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
