// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            BasePasswordValidationFragment

final class a
    implements TextWatcher
{

    private BasePasswordValidationFragment a;

    public final void afterTextChanged(Editable editable)
    {
        editable = a;
        if (!TextUtils.isEmpty(((BasePasswordValidationFragment) (editable)).a.getText()))
        {
            ((BasePasswordValidationFragment) (editable)).b.setText(0x7f080216);
            ((BasePasswordValidationFragment) (editable)).b.setClickable(true);
            ((BasePasswordValidationFragment) (editable)).b.setVisibility(0);
        } else
        {
            ((BasePasswordValidationFragment) (editable)).b.setVisibility(8);
        }
        a.a(null);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (BasePasswordValidationFragment basepasswordvalidationfragment)
    {
        a = basepasswordvalidationfragment;
        super();
    }
}
