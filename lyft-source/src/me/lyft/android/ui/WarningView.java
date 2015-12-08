// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

public class WarningView extends TextView
{

    IDevice device;
    protected BroadcastReceiver deviceStateChanged;
    IUserSession userSession;
    TextView warningBanner;

    public WarningView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        deviceStateChanged = new BroadcastReceiver() {

            final WarningView this$0;

            public void onReceive(Context context1, Intent intent)
            {
                updateWarningBanner();
            }

            
            {
                this$0 = WarningView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentfilter.addAction("android.location.PROVIDERS_CHANGED");
            getContext().registerReceiver(deviceStateChanged, intentfilter);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        try
        {
            getContext().unregisterReceiver(deviceStateChanged);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
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

    protected void updateWarningBanner()
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = true;
        if (!device.isGPSEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (device.getNetworkConnected())
        {
            flag1 = false;
        }
        if (!"driver".equals(userSession.getUser().getMode())) goto _L2; else goto _L1
_L1:
        if (!flag1) goto _L4; else goto _L3
_L3:
        obj = getResources().getString(0x7f070389);
_L13:
        if (obj != null || warningBanner.getVisibility() != 0) goto _L6; else goto _L5
_L5:
        if (device.getSDKVersion() <= 10) goto _L8; else goto _L7
_L7:
        obj = ObjectAnimator.ofFloat(warningBanner, "alpha", new float[] {
            1.0F, 0.0F
        });
        ((ValueAnimator) (obj)).addListener(new android.animation.Animator.AnimatorListener() {

            final WarningView this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                warningBanner.setVisibility(8);
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = WarningView.this;
                super();
            }
        });
        ((ValueAnimator) (obj)).setDuration(700L);
        ((ValueAnimator) (obj)).start();
_L10:
        return;
_L2:
        if (flag1)
        {
            obj = getResources().getString(0x7f07038a);
            continue; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            obj = getResources().getString(0x7f070388);
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L8:
        warningBanner.setVisibility(8);
        return;
_L6:
        if (obj == null) goto _L10; else goto _L9
_L9:
        warningBanner.setText(((CharSequence) (obj)));
        if (warningBanner.getVisibility() == 0) goto _L10; else goto _L11
_L11:
        warningBanner.setVisibility(0);
        warningBanner.setAlpha(0.0F);
        obj = ObjectAnimator.ofFloat(warningBanner, "alpha", new float[] {
            0.0F, 1.0F
        });
        ((ValueAnimator) (obj)).setDuration(700L);
        ((ValueAnimator) (obj)).start();
        return;
_L4:
        obj = null;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
