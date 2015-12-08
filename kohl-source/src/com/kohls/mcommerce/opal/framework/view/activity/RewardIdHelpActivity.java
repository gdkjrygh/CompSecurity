// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.os.Bundle;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class RewardIdHelpActivity extends BaseActivityWithoutSlider
{

    public RewardIdHelpActivity()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f0300f4;
    }

    protected void initializeViews(Bundle bundle)
    {
    }

    protected void updateActionBarViews()
    {
        String s = getResources().getString(0x7f08048b);
        getActionBarHelper().showActionBarWithDetail(s);
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
