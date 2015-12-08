// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import HZ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements android.view.ener
{

    private String a;
    private FeedFragment b;

    public final void onClick(View view)
    {
        view = b.getActivity();
        String s = a;
        try
        {
            view.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return;
        }
        catch (Exception exception)
        {
            HZ.a(view);
        }
    }

    Q(FeedFragment feedfragment, String s)
    {
        b = feedfragment;
        a = s;
        super();
    }
}
