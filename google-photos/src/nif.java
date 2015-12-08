// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class nif extends oio
{

    private nig ad;

    public nif()
    {
    }

    public static void a(Context context, ay ay, pnh pnh1, boolean flag)
    {
        Object obj = pnh1.a.a[0].a.a;
        String s = ((String) (obj));
        if (pnh1.a.c != null)
        {
            s = String.valueOf(pnh1.a.c);
            s = (new StringBuilder(String.valueOf(s).length() + 14 + String.valueOf(obj).length())).append("<b>").append(s).append("</b><p></p>").append(((String) (obj))).toString();
        }
        obj = new Bundle();
        ((Bundle) (obj)).putString("title", pnh1.a.b);
        ((Bundle) (obj)).putString("message", s);
        ((Bundle) (obj)).putString("positive", pnh1.a.a[1].b.b);
        ((Bundle) (obj)).putString("negative", context.getString(p.by));
        ((Bundle) (obj)).putBoolean("non_google_account", flag);
        ((Bundle) (obj)).putBoolean("shown_page_tos", b.a(pnh1.c, false));
        context = new nif();
        context.f(((Bundle) (obj)));
        context.a(ay, "accept_tos");
    }

    public static boolean a(pnh pnh1)
    {
        return pnh1 != null && pnh1.a != null && pnh1.a.a != null && pnh1.a.a.length == 2 && pnh1.a.a[0].a != null && pnh1.a.a[1].b != null && pnh1.a.a[1].b.a == 2;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (nig)ag.a(nig);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        ad.a();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        switch (j)
        {
        default:
            return;

        case -1: 
            ad.a(super.q.getBoolean("non_google_account"), super.q.getBoolean("shown_page_tos"));
            return;

        case -2: 
            ad.a();
            return;
        }
    }

    public final Context r()
    {
        return new ContextThemeWrapper(O_(), p.bD);
    }
}
