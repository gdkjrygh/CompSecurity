// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gqt
{

    public static final String a = gql.getName();
    private static gqs b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new gqs();
        }
        olm1.a(gql, new gql(context));
    }

}
