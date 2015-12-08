// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Jo;
import Oi;
import android.view.View;
import android.widget.AdapterView;
import com.snapchat.android.Timber;
import com.snapchat.android.fragments.MiniProfileFragment;
import com.snapchat.android.model.Friend;
import com.squareup.otto.Bus;
import xA;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatWithFragment

final class a
    implements android.widget.ongClickListener
{

    private ChatWithFragment a;

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Friend)ChatWithFragment.b(a).getItem(i);
        Timber.c("ChatWithFragment", (new StringBuilder("onItemLongClick - friend ")).append(adapterview).toString(), new Object[0]);
        if (adapterview == null)
        {
            return false;
        } else
        {
            adapterview = MiniProfileFragment.a(adapterview.g(), 1);
            ChatWithFragment.c(a).a(new Oi(adapterview, false));
            Jo.a(a.getActivity(), ChatWithFragment.d(a));
            return true;
        }
    }

    (ChatWithFragment chatwithfragment)
    {
        a = chatwithfragment;
        super();
    }
}
