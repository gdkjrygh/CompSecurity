// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.View;
import com.skype.android.app.contacts.ContactItem;

// Referenced classes of package com.skype.android.app.search:
//            ContactSearchResultAdapter

public class this._cls0 extends this._cls0
{

    final ContactSearchResultAdapter this$0;

    protected int getItemId(Object obj)
    {
        return ((ContactItem)obj).getContactObjectId();
    }

    protected volatile com.skype.android.app.data.r onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected onCreateViewHolder onCreateViewHolder(View view)
    {
        return new onCreateViewHolder(ContactSearchResultAdapter.this, view);
    }

    public (int i)
    {
        this$0 = ContactSearchResultAdapter.this;
        super(ContactSearchResultAdapter.this, i);
    }
}
