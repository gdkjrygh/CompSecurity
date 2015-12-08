// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ck, by

public class bw
{

    private final Context a;
    private final String b;
    private final ck c;
    private final String d;
    private by e;

    private bw(Context context, String s, String s1, ck ck)
    {
        a = context;
        b = s;
        c = ck;
        e = null;
        d = s1;
    }

    public static bw a(Context context, String s, String s1, ck ck)
    {
        return new bw(context, s, s1, ck);
    }
}
