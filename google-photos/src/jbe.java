// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jbe
{

    public static final String a = ngs.getName();
    private static jbd b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new jbd();
        }
        olm1.a(ngs, new ngs[] {
            new jbc(context)
        });
    }

}
