// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.i.v1.main;

import com.qihoo360.i.IModule;

// Referenced classes of package com.qihoo360.i.v1.main:
//            IIpcPref

public interface IIpcPrefManager
    extends IModule
{

    public abstract IIpcPref getDefaultSharedPreferences();

    public abstract IIpcPref getSharedPreferences(String s);
}
