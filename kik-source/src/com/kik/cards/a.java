// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;

import android.app.Activity;
import com.kik.cards.web.usermedia.b;
import com.kik.g.r;
import kik.android.chat.fragment.ProgressDialogFragment;

// Referenced classes of package com.kik.cards:
//            b, c, KikCardsWebViewFragment

final class a extends r
{

    final Activity a;
    final b b;
    final String c;
    final ProgressDialogFragment d;
    final KikCardsWebViewFragment e;

    a(KikCardsWebViewFragment kikcardswebviewfragment, Activity activity, b b1, String s, ProgressDialogFragment progressdialogfragment)
    {
        e = kikcardswebviewfragment;
        a = activity;
        b = b1;
        c = s;
        d = progressdialogfragment;
        super();
    }

    public final void a(Object obj)
    {
        a.runOnUiThread(new com.kik.cards.b(this));
    }

    public final void a(Throwable throwable)
    {
        a.runOnUiThread(new c(this));
    }
}
