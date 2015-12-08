// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.Intent;
import android.view.View;
import com.kohls.mcommerce.opal.wallet.fragment.DisplayActivityList;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FilterActivity

class this._cls0
    implements android.view.ner
{

    final FilterActivity this$0;

    public void onClick(View view)
    {
        view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/DisplayActivityList);
        view.putExtra("filter", "home_filter");
        view.putExtra("view", FilterActivity.access$000(FilterActivity.this));
        view.putExtra("type", FilterActivity.access$100(FilterActivity.this));
        startActivity(view);
        finish();
    }

    tivityList()
    {
        this$0 = FilterActivity.this;
        super();
    }
}
