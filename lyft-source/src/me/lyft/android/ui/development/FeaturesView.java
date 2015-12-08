// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.IFeatureFlagsManager;

// Referenced classes of package me.lyft.android.ui.development:
//            BooleanSwitcherView

public class FeaturesView extends RelativeLayout
{

    IFeatureFlagsManager featureFlagsManager;
    LinearLayout featuresContainerLayout;

    public FeaturesView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Object obj;
        for (Iterator iterator = featureFlagsManager.getFlags().iterator(); iterator.hasNext(); featuresContainerLayout.addView(((android.view.View) (obj))))
        {
            obj = (FeatureFlag)iterator.next();
            obj = new BooleanSwitcherView(getContext(), ((FeatureFlag) (obj)));
        }

    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void onResetFeaturesClicked()
    {
        featureFlagsManager.resetAllOverrides();
        int j = featuresContainerLayout.getChildCount();
        for (int i = 0; i < j; i++)
        {
            if (featuresContainerLayout.getChildAt(i) instanceof BooleanSwitcherView)
            {
                ((BooleanSwitcherView)featuresContainerLayout.getChildAt(i)).updateToggleState();
            }
        }

    }
}
