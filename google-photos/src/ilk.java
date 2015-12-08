// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ilk
{

    public static final String a = ilg.getName();
    private static ilj b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new ilj();
        }
        olm1.a(ilg, new ilg[] {
            new ilg(context, "enable_silent_feedback_android", false)
        });
    }

}
