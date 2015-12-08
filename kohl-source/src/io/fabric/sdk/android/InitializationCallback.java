// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;


public interface InitializationCallback
{
    public static class Empty
        implements InitializationCallback
    {

        public void failure(Exception exception)
        {
        }

        public void success(Object obj)
        {
        }

        private Empty()
        {
        }

    }


    public static final InitializationCallback EMPTY = new Empty();

    public abstract void failure(Exception exception);

    public abstract void success(Object obj);

}
