// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class lxe
{

    public static final String a = lwu.getName();
    public static final String b = lww.getName();
    private static lxd c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new lxd();
        }
        olm1.a(lww, new lxc(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new lxd();
        }
        olm1.a(lwu, new lxb());
    }

}
