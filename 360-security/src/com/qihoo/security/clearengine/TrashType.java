// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine;


public final class TrashType extends Enum
{

    public static final TrashType ALL_TRASH_TYPES[];
    public static final TrashType CATE_ADPLUGIN;
    public static final TrashType CATE_APK;
    public static final TrashType CATE_APP_SYSTEM_CACHE;
    public static final TrashType CATE_BIGFILE;
    public static final TrashType CATE_CACHE;
    public static final TrashType CATE_MEMORY;
    public static final TrashType CATE_SYSTEM;
    public static final TrashType CATE_UNDEFINED_TYPE;
    public static final TrashType CATE_UNINSTALLED;
    private static final TrashType b[];
    private int a;

    private TrashType(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static TrashType getTrashType(int i)
    {
        switch (i)
        {
        default:
            return CATE_UNDEFINED_TYPE;

        case 321: 
            return CATE_CACHE;

        case 33: // '!'
            return CATE_UNINSTALLED;

        case 323: 
            return CATE_ADPLUGIN;

        case 35: // '#'
            return CATE_BIGFILE;

        case 34: // '"'
            return CATE_APK;

        case 37: // '%'
            return CATE_MEMORY;

        case 322: 
        case 361: 
        case 362: 
        case 363: 
        case 364: 
        case 365: 
        case 366: 
        case 367: 
        case 368: 
            return CATE_SYSTEM;
        }
    }

    public static TrashType valueOf(String s)
    {
        return (TrashType)Enum.valueOf(com/qihoo/security/clearengine/TrashType, s);
    }

    public static TrashType[] values()
    {
        TrashType atrashtype[] = b;
        int i = atrashtype.length;
        TrashType atrashtype1[] = new TrashType[i];
        System.arraycopy(atrashtype, 0, atrashtype1, 0, i);
        return atrashtype1;
    }

    public int toEnv()
    {
        return a;
    }

    static 
    {
        CATE_UNDEFINED_TYPE = new TrashType("CATE_UNDEFINED_TYPE", 0, -1);
        CATE_CACHE = new TrashType("CATE_CACHE", 1, 32);
        CATE_APP_SYSTEM_CACHE = new TrashType("CATE_APP_SYSTEM_CACHE", 2, 322);
        CATE_ADPLUGIN = new TrashType("CATE_ADPLUGIN", 3, 323);
        CATE_UNINSTALLED = new TrashType("CATE_UNINSTALLED", 4, 33);
        CATE_APK = new TrashType("CATE_APK", 5, 34);
        CATE_BIGFILE = new TrashType("CATE_BIGFILE", 6, 35);
        CATE_SYSTEM = new TrashType("CATE_SYSTEM", 7, 36);
        CATE_MEMORY = new TrashType("CATE_MEMORY", 8, 37);
        b = (new TrashType[] {
            CATE_UNDEFINED_TYPE, CATE_CACHE, CATE_APP_SYSTEM_CACHE, CATE_ADPLUGIN, CATE_UNINSTALLED, CATE_APK, CATE_BIGFILE, CATE_SYSTEM, CATE_MEMORY
        });
        ALL_TRASH_TYPES = (new TrashType[] {
            CATE_CACHE, CATE_ADPLUGIN, CATE_UNINSTALLED, CATE_APK, CATE_BIGFILE, CATE_SYSTEM
        });
    }
}
