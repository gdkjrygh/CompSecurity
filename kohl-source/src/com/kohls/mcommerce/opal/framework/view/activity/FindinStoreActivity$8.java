// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.location.Address;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FindinStoreActivity

class this._cls0
    implements android.widget.kListener
{

    final FindinStoreActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mSuggContainer != null)
        {
            mSuggContainer.setVisibility(8);
        }
        if (FindinStoreActivity.access$100(FindinStoreActivity.this) != null && FindinStoreActivity.access$100(FindinStoreActivity.this).size() > i)
        {
            onSuggestClick((Address)FindinStoreActivity.access$100(FindinStoreActivity.this).get(i));
        }
    }

    ()
    {
        this$0 = FindinStoreActivity.this;
        super();
    }
}
