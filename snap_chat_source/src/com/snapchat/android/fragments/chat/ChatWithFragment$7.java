// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Filter;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import xA;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatWithFragment

final class a
    implements TextWatcher
{

    private ChatWithFragment a;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        ChatWithFragment.b(a).getFilter().filter(charsequence.toString());
        if (TextUtils.isEmpty(charsequence))
        {
            ChatWithFragment.f(a).setFastScrollAlwaysVisible(true);
            ChatWithFragment.f(a).setFastScrollEnabled(true);
            ChatWithFragment.g(a).setVisibility(4);
            return;
        } else
        {
            ChatWithFragment.f(a).setFastScrollAlwaysVisible(false);
            ChatWithFragment.f(a).setFastScrollEnabled(false);
            ChatWithFragment.g(a).setVisibility(0);
            return;
        }
    }

    stHeadersListView(ChatWithFragment chatwithfragment)
    {
        a = chatwithfragment;
        super();
    }
}
