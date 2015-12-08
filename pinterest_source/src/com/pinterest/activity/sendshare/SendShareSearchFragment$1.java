// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.adapter.PeopleSearchAdapter;
import com.pinterest.activity.sendshare.util.SendShareUtils;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareSearchFragment, ContactsSearchFragment

class val.fragment
    implements android.widget.tener
{

    final SendShareSearchFragment this$0;
    final ContactsSearchFragment val$fragment;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SendShareSearchFragment.access$000(SendShareSearchFragment.this);
        Device.hideSoftKeyboard(_messageTv);
        adapterview = ((AdapterView) (val$fragment.getListViewAdapter().getItem(i)));
        if (adapterview instanceof TypeAheadItem)
        {
            adapterview = (TypeAheadItem)adapterview;
            SendShareUtils.getInstance().sendToTypeAheadItem(adapterview, SendShareSearchFragment.access$100(SendShareSearchFragment.this), _messageTv.getText().toString());
            SendShareSearchFragment.access$200(SendShareSearchFragment.this);
            if (!TextUtils.isEmpty(_messageTv.getText()))
            {
                Pinalytics.a(ElementType.SEARCH_CONTACT_INPUT, ComponentType.SEND_SHARE_SEARCH_CONTACT);
            }
            Pinalytics.a(ElementType.SEARCH_CONTACT_LIST_ITEM, ComponentType.SEND_SHARE_SEARCH_CONTACT, String.valueOf(i));
        }
    }

    ()
    {
        this$0 = final_sendsharesearchfragment;
        val$fragment = ContactsSearchFragment.this;
        super();
    }
}
