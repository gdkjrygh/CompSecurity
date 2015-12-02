// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;


// Referenced classes of package com.qihoo.security.enginehelper.clean:
//            a, CleanTrashType, CleanScanType

static class nScanType
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[CleanTrashType.values().length];
        try
        {
            b[CleanTrashType.APK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[CleanTrashType.BIGFILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[CleanTrashType.CACHE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[CleanTrashType.PROCESS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[CleanTrashType.SYSTEM.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[CleanTrashType.UNINSTALLED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[CleanScanType.values().length];
        try
        {
            a[CleanScanType.FULL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[CleanScanType.NOTIFICATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CleanScanType.PREPOSE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
