// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Filter;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import yy;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            CustomStoryPrivacyFragment

final class a
    implements TextWatcher
{

    private StickyListHeadersListView a;
    private CustomStoryPrivacyFragment b;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        CustomStoryPrivacyFragment.e(b).getFilter().filter(charsequence.toString());
        if (charsequence.toString().equals("") || charsequence.toString() == null)
        {
            a.setFastScrollAlwaysVisible(true);
            a.setFastScrollEnabled(true);
            CustomStoryPrivacyFragment.f(b).setVisibility(4);
            return;
        } else
        {
            a.setFastScrollAlwaysVisible(false);
            a.setFastScrollEnabled(false);
            CustomStoryPrivacyFragment.f(b).setVisibility(0);
            return;
        }
    }

    iew(CustomStoryPrivacyFragment customstoryprivacyfragment, StickyListHeadersListView stickylistheaderslistview)
    {
        b = customstoryprivacyfragment;
        a = stickylistheaderslistview;
        super();
    }
}
