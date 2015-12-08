// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class glv
{

    public static final String a = glr.getName();
    private static glu b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new glu();
        }
        olm1.a(glr, new glr(context, olm.c(context, glt)));
    }

}
