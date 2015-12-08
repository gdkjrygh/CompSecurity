// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class de
{
    static class a
        implements Logger
    {

        private static int ci(int i)
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
            bh.b("", exception);
        }

        public void error(String s)
        {
            bh.w(s);
        }

        public int getLogLevel()
        {
            return ci(bh.getLogLevel());
        }

        public void info(String s)
        {
            bh.x(s);
        }

        public void setLogLevel(int i)
        {
            bh.z("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void verbose(String s)
        {
            bh.y(s);
        }

        public void warn(String s)
        {
            bh.z(s);
        }

        a()
        {
        }
    }


    private GoogleAnalytics aaB;
    private Context mContext;
    private Tracker sB;

    de(Context context)
    {
        mContext = context;
    }

    private void bV(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (aaB == null)
        {
            aaB = GoogleAnalytics.getInstance(mContext);
            aaB.setLogger(new a());
            sB = aaB.newTracker(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public Tracker bU(String s)
    {
        bV(s);
        return sB;
    }
}
