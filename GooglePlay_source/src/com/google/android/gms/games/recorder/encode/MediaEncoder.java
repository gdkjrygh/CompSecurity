// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;


public interface MediaEncoder
{
    public static interface EndOfStreamCallback
    {

        public abstract void onEndOfStream(MediaEncoder mediaencoder);
    }

    public static interface ErrorCallback
    {

        public abstract void onError$1d13998f(int i);
    }


    public abstract boolean release();

    public abstract void setErrorCallback(ErrorCallback errorcallback);

    public abstract boolean signalEndOfStream(EndOfStreamCallback endofstreamcallback);

    public abstract boolean start();

    public abstract boolean stop();
}
