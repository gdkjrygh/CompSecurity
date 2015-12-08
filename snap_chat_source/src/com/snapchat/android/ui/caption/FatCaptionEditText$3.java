// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Mf;
import Mo;
import android.text.Editable;
import android.text.TextWatcher;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCaptionEditText, CaptionEditText

final class a
    implements TextWatcher
{

    private FatCaptionEditText a;

    public final void afterTextChanged(Editable editable)
    {
        if (!a.g && !FatCaptionEditText.b(a))
        {
            a.B = false;
            if (FatCaptionEditText.a(editable))
            {
                a.b(true);
                return;
            }
            if (a.i && !((CaptionEditText) (a)).j)
            {
                Mf.a().a(new Mo(-1));
                return;
            }
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (FatCaptionEditText fatcaptionedittext)
    {
        a = fatcaptionedittext;
        super();
    }
}
