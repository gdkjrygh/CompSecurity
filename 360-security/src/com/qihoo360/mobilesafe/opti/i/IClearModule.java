// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i;

import com.qihoo360.i.IModule;

public interface IClearModule
    extends IModule
{

    public abstract Object getInterface(Class class1);

    public abstract String getSDKVersionName();

    public abstract void setOption(String s, String s1);
}
