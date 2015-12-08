// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.Timber;
import com.snapchat.android.model.Friend;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatWithFragment, ChatFragment

final class a
    implements android.widget.lickListener
{

    private ChatWithFragment a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((terView)view.getTag()).etTag;
        Timber.c("ChatWithFragment", (new StringBuilder("onItemClick - friend ")).append(adapterview).toString(), new Object[0]);
        ChatFragment.a(adapterview.g());
        ((LandingPageActivity)a.getActivity()).a(0, false);
        a.getActivity().onBackPressed();
    }

    (ChatWithFragment chatwithfragment)
    {
        a = chatwithfragment;
        super();
    }
}
