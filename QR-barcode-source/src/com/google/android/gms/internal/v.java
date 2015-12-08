// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            gb, gs, fk, gv, 
//            gt, gj

public class v
{
    public static interface a
    {

        public abstract void e(String s);
    }

    public static class b
        implements a
    {

        private final fz.a mc;
        private final gv md;

        public void e(String s)
        {
            gs.S("An auto-clicking creative is blocked");
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(s))
            {
                builder.appendQueryParameter("navigationURL", s);
            }
            if (mc != null && mc.vw != null && !TextUtils.isEmpty(mc.vw.tN))
            {
                builder.appendQueryParameter("debugDialog", mc.vw.tN);
            }
            gj.c(md.getContext(), md.dx().wD, builder.toString());
        }

        public b(fz.a a1, gv gv1)
        {
            mc = a1;
            md = gv1;
        }
    }


    private a lZ;
    private boolean ma;
    private boolean mb;

    public v()
    {
        boolean flag1 = false;
        super();
        Bundle bundle = gb.bD();
        boolean flag = flag1;
        if (bundle != null)
        {
            flag = flag1;
            if (bundle.getBoolean("gads:block_autoclicks", false))
            {
                flag = true;
            }
        }
        mb = flag;
    }

    public v(boolean flag)
    {
        mb = flag;
    }

    public void a(a a1)
    {
        lZ = a1;
    }

    public void ar()
    {
        ma = true;
    }

    public boolean av()
    {
        return !mb || ma;
    }

    public void d(String s)
    {
        gs.S("Action was blocked because no click was detected.");
        if (lZ != null)
        {
            lZ.e(s);
        }
    }
}
