// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactTopPicksGridListAdapter, ContactItem

final class it> extends com.skype.android.widget.er
{

    final ContactTopPicksGridListAdapter this$0;

    protected final int getItemId(ContactItem contactitem)
    {
        return contactitem.getContactObjectId();
    }

    protected final volatile int getItemId(Object obj)
    {
        return getItemId((ContactItem)obj);
    }

    protected final volatile com.skype.android.app.data.r._cls1 onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected final com.skype.android.widget.r onCreateViewHolder(View view)
    {
        return new <init>(ContactTopPicksGridListAdapter.this, view);
    }

    ()
    {
        this$0 = ContactTopPicksGridListAdapter.this;
        super();
    }
}
