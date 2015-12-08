// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.widget.ImageView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            ProductDetailsActivity

public class EditItemActivity extends ProductDetailsActivity
{

    public EditItemActivity()
    {
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    protected void onPause()
    {
        mShouldRemoveToast = false;
        super.onPause();
    }

    protected void onStop()
    {
        mShouldRemoveToast = false;
        super.onStop();
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarWithEditItem();
        getActionBarHelper().getAppImageView().setVisibility(8);
        getActionBarHelper().getTitleTextView().setVisibility(0);
    }
}
