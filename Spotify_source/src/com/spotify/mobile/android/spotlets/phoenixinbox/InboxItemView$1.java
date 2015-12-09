// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import gms;

// Referenced classes of package com.spotify.mobile.android.spotlets.phoenixinbox:
//            InboxItemView

final class a
    implements android.view.ener
{

    private InboxItemView a;

    public final void onClick(View view)
    {
        if (!TextUtils.isEmpty(InboxItemView.a(a)))
        {
            a.getContext().startActivity(gms.a(a.getContext(), InboxItemView.a(a)).a(InboxItemView.b(a)).a);
        }
    }

    (InboxItemView inboxitemview)
    {
        a = inboxitemview;
        super();
    }
}
