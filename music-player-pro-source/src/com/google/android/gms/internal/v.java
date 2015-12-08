// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            ga, gr, fj, gu, 
//            gs, gi

public class v
{
    public static interface a
    {

        public abstract void e(String s);
    }

    public static class b
        implements a
    {

        private final fy.a mn;
        private final gu mo;

        public void e(String s)
        {
            gr.S("An auto-clicking creative is blocked");
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(s))
            {
                builder.appendQueryParameter("navigationURL", s);
            }
            if (mn != null && mn.vK != null && !TextUtils.isEmpty(mn.vK.ub))
            {
                builder.appendQueryParameter("debugDialog", mn.vK.ub);
            }
            gi.c(mo.getContext(), mo.dG().wS, builder.toString());
        }

        public b(fy.a a1, gu gu1)
        {
            mn = a1;
            mo = gu1;
        }
    }


    private a mk;
    private boolean ml;
    private boolean mm;

    public v()
    {
        boolean flag1 = false;
        super();
        Bundle bundle = ga.bN();
        boolean flag = flag1;
        if (bundle != null)
        {
            flag = flag1;
            if (bundle.getBoolean("gads:block_autoclicks", false))
            {
                flag = true;
            }
        }
        mm = flag;
    }

    public v(boolean flag)
    {
        mm = flag;
    }

    public void a(a a1)
    {
        mk = a1;
    }

    public void av()
    {
        ml = true;
    }

    public boolean az()
    {
        return !mm || ml;
    }

    public void d(String s)
    {
        gr.S("Action was blocked because no click was detected.");
        if (mk != null)
        {
            mk.e(s);
        }
    }
}
