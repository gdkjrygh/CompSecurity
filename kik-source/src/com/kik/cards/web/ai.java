// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class ai
    implements DownloadListener
{

    final CardsWebViewFragment a;

    ai(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        s1 = a.getActivity();
        if (s1 != null)
        {
            s2 = new Intent("android.intent.action.VIEW");
            s2.setData(Uri.parse(s));
            s1.startActivity(s2);
        }
    }
}
