// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf

class zzdb
{
    static class zza
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

        zza()
        {
        }
    }


    private Context mContext;
    private Tracker zzBL;
    private GoogleAnalytics zzBN;

    zzdb(Context context)
    {
        mContext = context;
    }

    private void zzdm(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzBN == null)
        {
            zzBN = GoogleAnalytics.getInstance(mContext);
            zzBN.setLogger(new zza());
            zzBL = zzBN.newTracker(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public Tracker zzdl(String s)
    {
        zzdm(s);
        return zzBL;
    }
}
