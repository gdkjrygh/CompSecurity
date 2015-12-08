// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            me, lq

public class lp
{

    private final String Dd;
    private final me Dh;
    private final String IM;
    private lq aeA;
    private final Context mContext;

    private lp(Context context, String s, String s1, me me)
    {
        mContext = context;
        Dd = s;
        Dh = me;
        aeA = null;
        IM = s1;
    }

    public static lp a(Context context, String s, String s1, me me)
    {
        return new lp(context, s, s1, me);
    }
}
