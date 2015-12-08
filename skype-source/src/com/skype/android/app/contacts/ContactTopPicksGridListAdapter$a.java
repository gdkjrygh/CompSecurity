// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import com.skype.Contact;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.widget.GridListAdapterViewBuilder;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactTopPicksGridListAdapter, ContactItem

final class t> extends com.skype.android.widget.r
{

    final ContactTopPicksGridListAdapter this$0;

    protected final void onSetData(ContactItem contactitem)
    {
        ContactTopPicksGridListAdapter.access$100(ContactTopPicksGridListAdapter.this).a(this, (Contact)ContactTopPicksGridListAdapter.access$000(ContactTopPicksGridListAdapter.this).a(contactitem.getContactObjectId(), com/skype/Contact));
    }

    protected final volatile void onSetData(Object obj)
    {
        onSetData((ContactItem)obj);
    }

    public (View view)
    {
        this$0 = ContactTopPicksGridListAdapter.this;
        super(view);
    }
}
