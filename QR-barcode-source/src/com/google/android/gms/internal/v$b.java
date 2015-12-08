// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            v, gs, fk, gv, 
//            gt, gj

public static class md
    implements md
{

    private final  mc;
    private final gv md;

    public void e(String s)
    {
        gs.S("An auto-clicking creative is blocked");
        android.net.Builder builder = new android.net.Builder();
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

    public ( , gv gv1)
    {
        mc = ;
        md = gv1;
    }
}
