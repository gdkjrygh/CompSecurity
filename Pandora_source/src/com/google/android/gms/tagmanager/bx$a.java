// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bx, zzbg

static class 
    implements Logger
{

    private static int a(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            return 3;

        case 5: // '\005'
            return 2;

        case 3: // '\003'
        case 4: // '\004'
            return 1;

        case 2: // '\002'
            return 0;
        }
    }

    public void error(Exception exception)
    {
        zzbg.zzb("", exception);
    }

    public void error(String s)
    {
        zzbg.zzak(s);
    }

    public int getLogLevel()
    {
        return a(zzbg.getLogLevel());
    }

    public void info(String s)
    {
        zzbg.zzal(s);
    }

    public void setLogLevel(int i)
    {
        zzbg.zzan("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    public void verbose(String s)
    {
        zzbg.zzam(s);
    }

    public void warn(String s)
    {
        zzbg.zzan(s);
    }

    ()
    {
    }
}
