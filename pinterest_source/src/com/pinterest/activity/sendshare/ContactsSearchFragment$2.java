// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.view.View;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.sendshare:
//            ContactsSearchFragment

class this._cls0
    implements android.view.r
{

    final ContactsSearchFragment this$0;

    public void onFocusChange(View view, boolean flag)
    {
        Events.post(new archEditTextFocusEvent(ContactsSearchFragment.this, flag));
    }

    archEditTextFocusEvent()
    {
        this$0 = ContactsSearchFragment.this;
        super();
    }
}
