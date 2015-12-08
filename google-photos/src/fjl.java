// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fjl
{

    public static final String a = hqf.getName();
    private static fjk b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new fjk();
        }
        olm1.a(hqf, new hqf[] {
            new hqi(context, (muz)olm1.a(muz), new fjj(context))
        });
    }

}
