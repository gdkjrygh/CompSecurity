// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.m.f;
import kik.android.b.s;

// Referenced classes of package com.kik.cards.web:
//            f, CardsWebViewFragment, bf, bd, 
//            WebViewBrowserMetadataPlugin, h, aq

final class g
    implements android.content.DialogInterface.OnClickListener
{

    final com.kik.cards.web.f a;

    g(com.kik.cards.web.f f1)
    {
        a = f1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            a.a.c.b("Browser Reload Tapped").a("URL", CardsWebViewFragment.d(a.a)).a("Domain", bf.i(CardsWebViewFragment.d(a.a))).a("Is Loaded", CardsWebViewFragment.b(a.a).b()).b();
            CardsWebViewFragment.l(a.a);
        } else
        {
            if (i == 1)
            {
                a.a.c.b("Browser Share Tapped").a("URL", CardsWebViewFragment.d(a.a)).a("Domain", bf.i(CardsWebViewFragment.d(a.a))).b();
                CardsWebViewFragment.e(a.a).a().a(new h(this));
                return;
            }
            if (i == 2)
            {
                a.a.c.b("Open In Browser Tapped").a("URL", CardsWebViewFragment.d(a.a)).a("Domain", bf.i(CardsWebViewFragment.d(a.a))).b();
                dialoginterface = new Intent("android.intent.action.VIEW");
                dialoginterface.setData(Uri.parse(CardsWebViewFragment.b(a.a).getUrl()));
                com.kik.cards.web.CardsWebViewFragment.a(a.a).startActivity(dialoginterface);
                return;
            }
            if (i == 3)
            {
                a.a.c.b("Copy Link URL Tapped").a("URL", CardsWebViewFragment.d(a.a)).a("Domain", bf.i(CardsWebViewFragment.d(a.a))).b();
                dialoginterface = a.a.g();
                if (dialoginterface != null)
                {
                    f.a(a.a.t(), "", dialoginterface);
                    Toast.makeText(a.a.getActivity(), 0x7f09014c, 0).show();
                    return;
                } else
                {
                    Toast.makeText(a.a.getActivity(), 0x7f090266, 0).show();
                    return;
                }
            }
            if (i == 4 && CardsWebViewFragment.b(a.a) != null && a.a.t != null)
            {
                a.a.t.f(CardsWebViewFragment.b(a.a).getUrl());
                CardsWebViewFragment.b(a.a).loadUrl("javascript:window.localStorage.clear()");
                CardsWebViewFragment.l(a.a);
                return;
            }
        }
    }
}
