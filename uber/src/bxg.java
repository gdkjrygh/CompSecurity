// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class bxg
{

    private static final bxf a;

    public static String a(bxh bxh1)
    {
        return a.a(bxh1);
    }

    public static void a(Intent intent)
    {
        a.a(intent.getStringExtra("io.card.payment.languageOrLocale"));
    }

    static 
    {
        a = new bxf(bxh, bxx.a);
    }
}
