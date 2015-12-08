// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            pj, og

public final class nz
{

    private final pj FU;
    private final String Fl;
    private final String Sw;
    private og auH;
    private final Context mContext;

    private nz(Context context, String s, String s1, pj pj)
    {
        mContext = context;
        Fl = s;
        FU = pj;
        auH = null;
        Sw = s1;
    }

    public static nz a(Context context, String s, String s1, pj pj)
    {
        return new nz(context, s, s1, pj);
    }
}
