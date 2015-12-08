// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class egd
{

    public static final String a = ega.getName();
    public static final String b = hdq.getName();
    private static egc c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new egc();
        }
        olm1.a(ega, new ega(context, (mmv)olm1.a(mmv), (mhh)olm1.a(mhh), (eto)olm1.a(eto)));
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new egc();
        }
        olm1.a(hdq, new hdq[] {
            new egb(context)
        });
    }

}
