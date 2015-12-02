// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.plugins;


public interface IUpdate
{
    public static interface UpdateCallback
    {

        public abstract void onFinished(int i);
    }


    public abstract void doUpdate(UpdateCallback updatecallback);
}
