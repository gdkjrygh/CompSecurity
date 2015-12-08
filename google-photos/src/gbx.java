// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gbx
{

    public static final String a = hqf.getName();
    public static final String b = mvi.getName();
    private static gbw c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new gbw();
        }
        olm1.a(hqf, new hqf[] {
            new gbz(context)
        });
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new gbw();
        }
        olm1.a(mvi, new mvi[] {
            new gbv()
        });
    }

}
