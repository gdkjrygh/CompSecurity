// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdb, zzbf

static class 
    implements Logger
{

    private static int zzhj(int i)
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

    public void error(String s)
    {
        zzbf.zzZ(s);
    }

    public int getLogLevel()
    {
        return zzhj(zzbf.getLogLevel());
    }

    public void info(String s)
    {
        zzbf.zzaa(s);
    }

    public void setLogLevel(int i)
    {
        zzbf.zzac("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    public void verbose(String s)
    {
        zzbf.zzab(s);
    }

    public void warn(String s)
    {
        zzbf.zzac(s);
    }

    ()
    {
    }
}
