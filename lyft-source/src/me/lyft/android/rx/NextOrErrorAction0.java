// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import me.lyft.android.logging.L;
import rx.Observer;
import rx.functions.Action0;

public abstract class NextOrErrorAction0
    implements Observer, Action0
{

    public NextOrErrorAction0()
    {
    }

    public abstract void call();

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        try
        {
            call();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            L.e(throwable, "onError", new Object[0]);
        }
    }

    public void onNext(Object obj)
    {
        try
        {
            call();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.e(((Throwable) (obj)), "onNext", new Object[0]);
        }
    }
}
