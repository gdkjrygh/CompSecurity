// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;


public final class CleanTrashType extends Enum
{

    public static final CleanTrashType APK;
    public static final CleanTrashType BIGFILE;
    public static final CleanTrashType CACHE;
    public static final CleanTrashType PROCESS;
    public static final CleanTrashType SYSTEM;
    public static final CleanTrashType UNINSTALLED;
    private static final CleanTrashType a[];

    private CleanTrashType(String s, int i)
    {
        super(s, i);
    }

    public static CleanTrashType valueOf(String s)
    {
        return (CleanTrashType)Enum.valueOf(com/qihoo/security/enginehelper/clean/CleanTrashType, s);
    }

    public static CleanTrashType[] values()
    {
        return (CleanTrashType[])a.clone();
    }

    static 
    {
        PROCESS = new CleanTrashType("PROCESS", 0);
        CACHE = new CleanTrashType("CACHE", 1);
        UNINSTALLED = new CleanTrashType("UNINSTALLED", 2);
        APK = new CleanTrashType("APK", 3);
        BIGFILE = new CleanTrashType("BIGFILE", 4);
        SYSTEM = new CleanTrashType("SYSTEM", 5);
        a = (new CleanTrashType[] {
            PROCESS, CACHE, UNINSTALLED, APK, BIGFILE, SYSTEM
        });
    }
}
