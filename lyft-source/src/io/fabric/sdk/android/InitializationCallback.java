// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;


public interface InitializationCallback
{

    public static final InitializationCallback d = new Empty();

    public abstract void a(Exception exception);

    public abstract void a(Object obj);


    private class Empty
        implements InitializationCallback
    {

        public void a(Exception exception)
        {
        }

        public void a(Object obj)
        {
        }

        private Empty()
        {
        }

    }

}
