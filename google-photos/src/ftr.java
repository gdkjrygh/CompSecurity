// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ftr
{

    public static final String a = ftd.getName();
    private static ftq b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new ftq();
        }
        olm1.a(ftd, new ftd[] {
            new fsr(context)
        });
    }

}
