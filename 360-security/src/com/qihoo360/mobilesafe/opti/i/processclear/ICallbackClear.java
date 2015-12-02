// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.processclear;


public interface ICallbackClear
{

    public abstract void onFinished(int i);

    public abstract void onProgress(int i, int j, String s, int k);

    public abstract void onStart();
}
