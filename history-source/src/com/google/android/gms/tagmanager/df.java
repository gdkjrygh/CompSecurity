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

class df
{
    static class a
        implements Logger
    {

        private static int fP(int i)
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
            bh.T(s);
        }

        public int getLogLevel()
        {
            return fP(bh.getLogLevel());
        }

        public void info(String s)
        {
            bh.U(s);
        }

        public void setLogLevel(int i)
        {
            bh.W("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void verbose(String s)
        {
            bh.V(s);
        }

        public void warn(String s)
        {
            bh.W(s);
        }

        a()
        {
        }
    }


    private Context mContext;
    private Tracker yO;
    private GoogleAnalytics yQ;

    df(Context context)
    {
        mContext = context;
    }

    private void cX(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (yQ == null)
        {
            yQ = GoogleAnalytics.getInstance(mContext);
            yQ.setLogger(new a());
            yO = yQ.newTracker(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public Tracker cW(String s)
    {
        cX(s);
        return yO;
    }
}
