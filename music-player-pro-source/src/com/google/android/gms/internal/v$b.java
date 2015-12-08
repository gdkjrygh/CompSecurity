// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            v, gr, fj, gu, 
//            gs, gi

public static class mo
    implements mo
{

    private final  mn;
    private final gu mo;

    public void e(String s)
    {
        gr.S("An auto-clicking creative is blocked");
        android.net.Builder builder = new android.net.Builder();
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

    public ( , gu gu1)
    {
        mn = ;
        mo = gu1;
    }
}
