// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            bh

final class a
    implements TextWatcher
{

    final bh a;

    public final void afterTextChanged(Editable editable)
    {
        editable.toString();
        if (bh.a(a))
        {
            bh.b(a).setEnabled(true);
            bh.b(a).setAlpha(1.0F);
            ad.b(bh.b(a));
            return;
        } else
        {
            bh.b(a).setEnabled(false);
            bh.b(a).setAlpha(0.8F);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (bh bh1)
    {
        a = bh1;
        super();
    }
}
