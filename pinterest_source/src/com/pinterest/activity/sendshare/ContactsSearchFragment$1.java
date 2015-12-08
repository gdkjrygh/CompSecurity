// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.activity.sendapin.adapter.PeopleSearchAdapter;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.sendshare:
//            ContactsSearchFragment

class this._cls0
    implements TextWatcher
{

    final ContactsSearchFragment this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        charsequence = StringUtils.trimToEmpty(charsequence.toString());
        ContactsSearchFragment.access$000(ContactsSearchFragment.this).onSearchQueryChanged(charsequence);
    }

    r()
    {
        this$0 = ContactsSearchFragment.this;
        super();
    }
}
