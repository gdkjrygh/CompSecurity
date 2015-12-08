// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapter, ContactItem

final class this._cls0 extends Filter
{

    final ContactAdapter this$0;

    protected final android.widget.lts performFiltering(CharSequence charsequence)
    {
        android.widget.lts lts = new android.widget.lts();
        ArrayList arraylist = new ArrayList();
        if (!TextUtils.isEmpty(charsequence))
        {
            Iterator iterator = ContactAdapter.access$000(ContactAdapter.this).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ContactItem contactitem = (ContactItem)iterator.next();
                if (contactitem.getDisplayName().toLowerCase().contains(charsequence.toString().toLowerCase()))
                {
                    arraylist.add(contactitem);
                }
            } while (true);
        } else
        {
            arraylist.addAll(ContactAdapter.access$000(ContactAdapter.this));
        }
        lts.values = arraylist;
        return lts;
    }

    protected final void publishResults(CharSequence charsequence, android.widget.lts lts)
    {
        ContactAdapter.access$102(ContactAdapter.this, (ArrayList)lts.values);
        applyFilter(ContactAdapter.access$200(ContactAdapter.this));
    }

    ()
    {
        this$0 = ContactAdapter.this;
        super();
    }
}
