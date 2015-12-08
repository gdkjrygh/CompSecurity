// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dpm
{

    public static final String a = evf.getName();
    public static final String b = dpj.getName();
    private static dpl c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new dpl();
        }
        olm1.a(dpj, new dpj(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new dpl();
        }
        olm1.a(evf, new evf[] {
            (dpj)olm1.a(dpj)
        });
    }

}
