// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.view.View;
import com.kik.android.a;
import java.util.ArrayList;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment, bf, g

final class f
    implements android.view.View.OnClickListener
{

    final CardsWebViewFragment a;

    f(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.c.b("Browser Options Button Tapped").a("URL", CardsWebViewFragment.d(a)).a("Domain", bf.i(CardsWebViewFragment.d(a))).b();
        view = new kik.android.chat.fragment.KikDialogFragment.a(a.getResources());
        view.a(CardsWebViewFragment.d(a));
        ArrayList arraylist = new ArrayList();
        arraylist.add(a.getString(0x7f09005a));
        arraylist.add(a.getString(0x7f090244));
        arraylist.add(a.getString(0x7f09019d));
        arraylist.add(a.getString(0x7f09009e));
        if (a.h())
        {
            arraylist.add(a.getString(0x7f090065));
        }
        view.a((CharSequence[])arraylist.toArray(new CharSequence[0]), new g(this));
        a.a(view.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "dialog");
    }
}
