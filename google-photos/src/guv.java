// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class guv
{

    public static final String a = gur.getName();
    public static final String b = mvi.getName();
    private static guu c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new guu();
        }
        olm1.a(gur, new gur(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new guu();
        }
        olm1.a(mvi, new mvi[] {
            new gut()
        });
    }

}
