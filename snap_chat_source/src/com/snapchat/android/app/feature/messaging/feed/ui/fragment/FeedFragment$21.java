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
    implements 
{

    final FeedFragment a;

    public final void a(View view)
    {
        ((EditText)FeedFragment.g(a).a()).addTextChangedListener(new TextWatcher() {

            private FeedFragment._cls21 a;

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

            
            {
                a = FeedFragment._cls21.this;
                super();
            }
        });
    }

    _cls1.a(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
