// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import me.lyft.android.logging.L;
import rx.Subscriber;

public class SecureSubscriber extends Subscriber
{

    public SecureSubscriber()
    {
    }

    public final void onCompleted()
    {
        try
        {
            onSafeCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "onSafeCompleted", new Object[0]);
        }
    }

    public final void onError(Throwable throwable)
    {
        try
        {
            L.w(throwable, "onError", new Object[0]);
            onSafeError(throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            L.e(throwable, "onSafeError", new Object[0]);
        }
    }

    public final void onNext(Object obj)
    {
        try
        {
            onSafeNext(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.e(((Throwable) (obj)), "onSafeNext", new Object[0]);
        }
    }

    public void onSafeCompleted()
    {
    }

    public void onSafeError(Throwable throwable)
    {
    }

    public void onSafeNext(Object obj)
    {
    }
}
