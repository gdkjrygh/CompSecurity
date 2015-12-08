// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookActivity

class this._cls0
    implements android.view.r
{

    final FacebookActivity this$0;

    public void onClick(View view)
    {
        if (!UtilityMethods.isNetworkConnected(FacebookActivity.this))
        {
            FacebookActivity.access$100(FacebookActivity.this);
            return;
        }
        if (view == FacebookActivity.access$200(FacebookActivity.this))
        {
            if (FacebookActivity.access$300(FacebookActivity.this))
            {
                FacebookActivity.access$400(FacebookActivity.this).setDisplayedChild(4);
                FacebookActivity.access$502(FacebookActivity.this, FacebookActivity.access$600(FacebookActivity.this));
            } else
            {
                Toast.makeText(FacebookActivity.this, getResources().getString(0x7f080116), 0).show();
            }
            FacebookActivity.access$700(FacebookActivity.this);
            return;
        }
        if (view == FacebookActivity.access$800(FacebookActivity.this))
        {
            finish();
            return;
        }
        if (view == FacebookActivity.access$900(FacebookActivity.this))
        {
            FacebookActivity.access$400(FacebookActivity.this).setDisplayedChild(4);
            FacebookActivity.access$1000(FacebookActivity.this);
            return;
        }
        if (view == FacebookActivity.access$1100(FacebookActivity.this))
        {
            FacebookActivity.access$1200(FacebookActivity.this);
            return;
        }
        if (view == FacebookActivity.access$1300(FacebookActivity.this))
        {
            FacebookActivity.access$1400(FacebookActivity.this);
            return;
        } else
        {
            Logger.debug(FacebookActivity.access$1500(), "View not found to handle click.");
            return;
        }
    }

    I()
    {
        this$0 = FacebookActivity.this;
        super();
    }
}
