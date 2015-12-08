// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jgp
{

    public static final String a = jgq.getName();
    private static jgo b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new jgo();
        }
        olm1.a(jgq, new jgq(context));
    }

}
