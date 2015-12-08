// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import PI;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Filter;
import qh;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements TextWatcher
{

    private a a;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.a.b.getFilter().filter(charsequence.toString().trim());
        if (TextUtils.isEmpty(charsequence))
        {
            FeedFragment.f(a.a).a(4);
            return;
        } else
        {
            FeedFragment.f(a.a).a(0);
            return;
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/app/feature/messaging/feed/ui/fragment/FeedFragment$21

/* anonymous class */
    final class FeedFragment._cls21
        implements PI.a
    {

        final FeedFragment a;

        public final void a(View view)
        {
            ((EditText)FeedFragment.g(a).a()).addTextChangedListener(new FeedFragment._cls21._cls1(this));
        }

            
            {
                a = feedfragment;
                super();
            }
    }

}
