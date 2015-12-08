// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.SlideMenuController;

public class ProfileToolBarView extends LinearLayout
{

    public static final int ANIMATION_DURATION = 200;
    public static final float MAX_ALPHA = 0.9F;
    public static final float MIN_ALPHA = 0F;
    AppFlow appFlow;
    ImageView profileCloseImageView;
    TextView profileEditImageView;
    ImageView profileMenuImageView;
    View profileToolbarBackgroundView;
    SlideMenuController slideMenuController;

    public ProfileToolBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        setOrientation(1);
        attributeset.a(context).inflate(0x7f03010d, this, true);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        profileCloseImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileToolBarView this$0;

            public void onClick(View view)
            {
                appFlow.goBack();
            }

            
            {
                this$0 = ProfileToolBarView.this;
                super();
            }
        });
        profileMenuImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileToolBarView this$0;

            public void onClick(View view)
            {
                slideMenuController.toggle();
            }

            
            {
                this$0 = ProfileToolBarView.this;
                super();
            }
        });
        profileEditImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileToolBarView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new ProfileScreens.EditProfileScreen());
            }

            
            {
                this$0 = ProfileToolBarView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    public void setFade(boolean flag)
    {
        profileToolbarBackgroundView.clearAnimation();
        ViewPropertyAnimator viewpropertyanimator = profileToolbarBackgroundView.animate().setDuration(200L);
        float f;
        if (flag)
        {
            f = 0.9F;
        } else
        {
            f = 0.0F;
        }
        viewpropertyanimator.alpha(f).start();
    }

    public void showProfileToolbar()
    {
        profileCloseImageView.setVisibility(8);
        profileEditImageView.setVisibility(0);
        profileMenuImageView.setVisibility(0);
    }

    public void showRideToolbar(boolean flag)
    {
        int i = 0;
        profileCloseImageView.setVisibility(0);
        TextView textview = profileEditImageView;
        if (!flag)
        {
            i = 8;
        }
        textview.setVisibility(i);
        profileMenuImageView.setVisibility(8);
    }
}
