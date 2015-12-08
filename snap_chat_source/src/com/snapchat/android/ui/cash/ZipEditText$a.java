// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import sp;

// Referenced classes of package com.snapchat.android.ui.cash:
//            ZipEditText

final class <init>
    implements TextWatcher
{

    private CharSequence a;
    private ZipEditText b;

    public final void afterTextChanged(Editable editable)
    {
        editable = new StringBuilder(editable);
        if (TextUtils.equals(a, editable)) goto _L2; else goto _L1
_L1:
        if (editable.length() != 5) goto _L4; else goto _L3
_L3:
        ZipEditText.a(b, true);
        if (ZipEditText.a(b) != null)
        {
            ZipEditText.a(b).b();
        }
_L6:
        a = editable;
_L2:
        return;
_L4:
        ZipEditText.a(b, false);
        if (ZipEditText.a(b) != null)
        {
            ZipEditText.a(b).a();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    private (ZipEditText zipedittext)
    {
        b = zipedittext;
        super();
        a = null;
    }

    a(ZipEditText zipedittext, byte byte0)
    {
        this(zipedittext);
    }
}
