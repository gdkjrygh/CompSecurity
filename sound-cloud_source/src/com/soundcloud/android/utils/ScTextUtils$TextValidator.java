// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.utils:
//            ScTextUtils

public static abstract class textView
    implements TextWatcher
{

    private final TextView textView;

    public final void afterTextChanged(Editable editable)
    {
        validate(textView, textView.getText().toString());
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public abstract void validate(TextView textview, String s);

    public (TextView textview)
    {
        textView = textview;
    }
}
