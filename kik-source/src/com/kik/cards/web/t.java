// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class t
    implements android.view.View.OnClickListener
{

    final CardsWebViewFragment a;

    t(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(CardsWebViewFragment.s(a).b())));
    }
}
