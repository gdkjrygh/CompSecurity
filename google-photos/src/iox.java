// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;

public final class iox
{

    public static final String a = iuq.getName();
    public static final String b = esl.getName();
    public static final String c = imw.getName();
    public static final String d = iul.getName();
    public static final String e = iou.getName();
    public static final String f = ioz.getName();
    public static final String g = mvi.getName();
    public static final String h = nab.getName();
    private static iow i;

    public static void a(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(esl, new esl[] {
            new ioy(context)
        });
    }

    public static void a(olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(iuq, new ipa());
    }

    public static void b(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(iou, new iou(context));
    }

    public static void b(olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(imw, new imw(new Handler()));
    }

    public static void c(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(ioz, new ioz(context));
    }

    public static void c(olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(iul, new iul());
    }

    public static void d(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(nab, new nab[] {
            new iqv(context)
        });
    }

    public static void d(olm olm1)
    {
        if (i == null)
        {
            i = new iow();
        }
        olm1.a(mvi, new mvi[] {
            new ium()
        });
    }

}
