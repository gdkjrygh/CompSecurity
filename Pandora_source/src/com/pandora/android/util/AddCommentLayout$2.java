// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.pandora.android.util:
//            AddCommentLayout

class a
    implements TextWatcher
{

    final AddCommentLayout a;

    public void afterTextChanged(Editable editable)
    {
        editable = AddCommentLayout.b(a);
        int i;
        if (AddCommentLayout.a(a).getText().toString().trim().length() > 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        editable.setVisibility(i);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (AddCommentLayout addcommentlayout)
    {
        a = addcommentlayout;
        super();
    }
}
