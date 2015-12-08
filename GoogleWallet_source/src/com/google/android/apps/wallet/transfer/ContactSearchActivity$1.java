// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.database.Cursor;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.p2p.people.ContactListAdapter;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ContactSearchActivity

final class this._cls0
    implements android.widget.istener
{

    final ContactSearchActivity this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        analyticsUtil.sendListItemTap("ChooseContact", new AnalyticsCustomDimension[0]);
        adapterview = (Cursor)adapterview.getAdapter().getItem(i);
        adapterview = ContactSearchActivity.access$000(ContactSearchActivity.this).getContact(adapterview);
        ContactSearchActivity.access$100(ContactSearchActivity.this, view, adapterview, 200);
    }

    n()
    {
        this$0 = ContactSearchActivity.this;
        super();
    }
}
