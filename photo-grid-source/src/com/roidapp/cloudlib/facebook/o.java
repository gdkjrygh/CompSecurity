// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            t, FbFriendListActivity

final class o
    implements TextWatcher
{

    final t a;
    final FbFriendListActivity b;

    o(FbFriendListActivity fbfriendlistactivity, t t1)
    {
        b = fbfriendlistactivity;
        a = t1;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        a.a(editable.toString());
        if (editable.toString().length() == 0)
        {
            FbFriendListActivity.a(b).setVisibility(4);
            return;
        } else
        {
            FbFriendListActivity.a(b).setVisibility(0);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
