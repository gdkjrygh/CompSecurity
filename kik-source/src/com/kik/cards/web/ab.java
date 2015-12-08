// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import org.c.b;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment, bd

final class ab
    implements Runnable
{

    final CardsWebViewFragment a;

    ab(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void run()
    {
        Uri uri;
        a.u();
        if (com.kik.cards.web.CardsWebViewFragment.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        uri = Uri.parse(com.kik.cards.web.CardsWebViewFragment.b(a).getUrl());
        a.startActivity(new Intent("android.intent.action.VIEW", uri));
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        CardsWebViewFragment.z().b("No activity found to handle fullscreen");
        return;
    }
}
