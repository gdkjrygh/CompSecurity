// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import NT;
import Oi;
import android.text.style.ClickableSpan;
import android.view.View;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            ReplayDialogFragment, InAppPurchaseTermsFragment

final class a extends ClickableSpan
{

    private ReplayDialogFragment a;

    public final void onClick(View view)
    {
        a.dismiss();
        ReplayDialogFragment.b(a).a(new NT(false));
        ReplayDialogFragment.b(a).a(new Oi(new InAppPurchaseTermsFragment()));
    }

    ent(ReplayDialogFragment replaydialogfragment)
    {
        a = replaydialogfragment;
        super();
    }
}
