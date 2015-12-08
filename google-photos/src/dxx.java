// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dxx
{

    public static final String a = dur.getName();
    public static final String b = duq.getName();
    public static final String c = dxo.getName();
    public static final String d = dxy.getName();
    private static dxv e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new dxv();
        }
        dxv dxv1 = e;
        dxo dxo1 = (dxo)olm1.a(dxo);
        duv duv1 = (duv)olm1.a(duv);
        olm1.a(dur, new dur[] {
            new duy(context, "locationreporting-card", "com.google.android.apps.photos.assistant.ulr", "com.google.android.apps.photos.assistant.ulr", dxv.a.intValue(), dux.a, new dxw(dxv1, dxo1, duv1), dul.d)
        });
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new dxv();
        }
        olm1.a(duq, dxv.a());
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new dxv();
        }
        olm1.a(dxo, dxv.a(context));
    }

    public static void b(olm olm1)
    {
        if (e == null)
        {
            e = new dxv();
        }
        olm1.a(dxy, dxv.b());
    }

}
