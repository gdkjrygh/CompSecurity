// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.LinearLayout;

// Referenced classes of package com.fitbit.friends.ui:
//            ConversationActivity

class a
    implements TextWatcher
{

    final ConversationActivity a;

    public void afterTextChanged(Editable editable)
    {
        ConversationActivity.a(a);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        LinearLayout linearlayout = a.e;
        boolean flag;
        if (charsequence.toString().trim().length() > 0 && charsequence.length() <= 180)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linearlayout.setEnabled(flag);
    }

    (ConversationActivity conversationactivity)
    {
        a = conversationactivity;
        super();
    }
}
