// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jha
{

    public static final String a = jhh.getName();
    public static final String b = jhd.getName();
    private static jgz c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new jgz();
        }
        olm1.a(jhh, new jhi(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new jgz();
        }
        olm1.a(jhd, new jhe(context));
    }

}
