// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            PeoplePickerListWrapper

class this._cls0
    implements TextWatcher
{

    final PeoplePickerListWrapper this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        charsequence = StringUtils.trimToEmpty(charsequence.toString());
        PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).onSearchQueryChanged(charsequence);
    }

    ()
    {
        this$0 = PeoplePickerListWrapper.this;
        super();
    }
}
