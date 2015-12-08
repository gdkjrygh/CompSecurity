// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.activity.findfriend.adapter.FindFriendsListAdapter;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsContactFragment

class this._cls0
    implements TextWatcher
{

    final FindFriendsContactFragment this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        FindFriendsContactFragment.access$100(FindFriendsContactFragment.this).onSearchQueryChanged(charsequence.toString());
    }

    r()
    {
        this$0 = FindFriendsContactFragment.this;
        super();
    }
}
