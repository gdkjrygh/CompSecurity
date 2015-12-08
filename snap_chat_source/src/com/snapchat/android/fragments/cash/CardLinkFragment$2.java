// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import com.snapchat.android.ui.cash.CardCvvEditText;
import com.snapchat.android.ui.cash.CardExpiryEditText;
import com.snapchat.android.ui.cash.CardNumberEditText;
import com.snapchat.android.ui.cash.ZipEditText;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

final class a
    implements android.view.r
{

    private CardLinkFragment a;

    public final void onClick(View view)
    {
        int i = 0;
        CardLinkFragment.h(a);
        CardLinkFragment.i(a).setText("");
        CardLinkFragment.i(a).setClickable(false);
        CardLinkFragment.j(a).setVisibility(0);
        view = CardLinkFragment.k(a);
        String s = CardLinkFragment.b(a).a();
        CardExpiryEditText cardexpiryedittext = CardLinkFragment.d(a);
        StringBuilder stringbuilder = new StringBuilder();
        for (; i < cardexpiryedittext.getText().length(); i++)
        {
            char c = cardexpiryedittext.getText().charAt(i);
            if (Character.isDigit(c))
            {
                stringbuilder.append(c);
            }
        }

        view.a(s, stringbuilder.toString(), CardLinkFragment.e(a).b(), CardLinkFragment.g(a).getText().toString().trim(), a);
    }

    (CardLinkFragment cardlinkfragment)
    {
        a = cardlinkfragment;
        super();
    }
}
