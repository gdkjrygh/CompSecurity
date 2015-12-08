// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

static final class b
    implements TextWatcher
{

    private TextView a;
    private ImageView b;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (a.getVisibility() == 0)
        {
            a.setText("");
            a.setVisibility(4);
            b.setVisibility(8);
        }
    }

    (TextView textview, ImageView imageview)
    {
        a = textview;
        b = imageview;
    }
}
