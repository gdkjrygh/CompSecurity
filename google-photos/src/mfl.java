// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class mfl
{

    public static final String a = mfg.getName();
    private static mfk b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new mfk();
        }
        olm1.a(mfg, new mfi(context));
    }

}
