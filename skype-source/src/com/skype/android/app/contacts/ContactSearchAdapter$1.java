// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSearchAdapter, ContactSearchLoader

final class this._cls0 extends Filter
{

    final ContactSearchAdapter this$0;

    protected final android.widget.SearchAdapter._cls1 performFiltering(CharSequence charsequence)
    {
        android.widget.SearchAdapter searchadapter = new android.widget.nit>();
        if (TextUtils.isEmpty(charsequence))
        {
            return searchadapter;
        } else
        {
            charsequence = (new ContactSearchLoader(ContactSearchAdapter.access$000(ContactSearchAdapter.this), ContactSearchAdapter.access$100(ContactSearchAdapter.this), ContactSearchAdapter.access$200(ContactSearchAdapter.this), charsequence.toString(), ContactSearchAdapter.access$300(ContactSearchAdapter.this))).call();
            searchadapter.lues = charsequence;
            searchadapter.unt = charsequence.size();
            return searchadapter;
        }
    }

    protected final void publishResults(CharSequence charsequence, android.widget.SearchAdapter._cls1 _pcls1)
    {
        if (_pcls1.unt > 0)
        {
            charsequence = (ArrayList)_pcls1.lues;
            update(charsequence);
        }
    }

    ()
    {
        this$0 = ContactSearchAdapter.this;
        super();
    }
}
