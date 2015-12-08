// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.controls.Toggle;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.IFeatureFlagsManager;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

public class BooleanSwitcherView extends LinearLayout
{

    IFeatureFlagsManager featureFlagsManager;
    TextView featureNameTextView;
    Toggle featureToggle;
    private final FeatureFlag flag;
    View removeButton;

    public BooleanSwitcherView(Context context, FeatureFlag featureflag)
    {
        super(context);
        flag = featureflag;
        Scoop.a(this).b(this);
        LayoutInflater.from(context).inflate(0x7f03000c, this, true);
        ButterKnife.a(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        updateToggleState();
        featureNameTextView.setText(flag.name);
        Binder.attach(this).bind(featureToggle.observeChange(), new Action1() {

            final BooleanSwitcherView this$0;

            public void call(Boolean boolean1)
            {
                featureFlagsManager.overrideFlag(flag, boolean1.booleanValue());
                updateToggleState();
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = BooleanSwitcherView.this;
                super();
            }
        });
        removeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BooleanSwitcherView this$0;

            public void onClick(View view)
            {
                featureFlagsManager.resetFlag(flag);
                updateToggleState();
            }

            
            {
                this$0 = BooleanSwitcherView.this;
                super();
            }
        });
    }

    public void updateToggleState()
    {
        if (flag.hasOverride())
        {
            removeButton.setVisibility(0);
        } else
        {
            removeButton.setVisibility(8);
        }
        featureToggle.setChecked(flag.isEnabled(), false);
    }

}
