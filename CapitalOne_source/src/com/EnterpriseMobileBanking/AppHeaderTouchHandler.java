// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, AppRelContainer

public class AppHeaderTouchHandler
    implements android.view.View.OnTouchListener
{

    private static final String TAG = "AppHeaderTouchHandler";
    private static final int threshold = (int)(10F * AppHelper.getDensity());
    private int maxWidth;
    private View navigationButton;
    private boolean opening;
    private android.widget.RelativeLayout.LayoutParams params;
    private AppRelContainer relContainer;
    private float xDown;

    public AppHeaderTouchHandler(int i, View view)
    {
        xDown = -2.147484E+09F;
        opening = false;
        maxWidth = 0x7fffffff;
        relContainer = null;
        params = null;
        navigationButton = null;
        maxWidth = i;
        navigationButton = view;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        if ("menu".equals(navigationButton.getTag()) && navigationButton.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (view instanceof AppRelContainer) goto _L2; else goto _L1
_L1:
        Log.e("AppHeaderTouchHandler", "Touch event only works on an AppRelContainer -- please try again");
        flag1 = false;
_L4:
        return flag1;
_L2:
        flag1 = flag;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (relContainer == null)
        {
            relContainer = (AppRelContainer)view;
            params = (android.widget.RelativeLayout.LayoutParams)relContainer.getLayoutParams();
        }
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            view = AppHelper.findAppViewById(relContainer.getContext(), 0x7f080023);
            view.setVisibility(0);
            if (view != null)
            {
                view.setVisibility(0);
            }
            flag1 = flag;
            if (!relContainer.isAnimating())
            {
                xDown = motionevent.getX();
                if (relContainer.getLeft() == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                opening = flag1;
                return flag;
            }
            break;

        case 2: // '\002'
            flag1 = flag;
            if (xDown != -2.147484E+09F)
            {
                AppHelper.hideKeyboard();
                int l = (int)(motionevent.getX() - xDown);
                int k = params.leftMargin;
                int i = k;
                if (Math.abs(l) > threshold)
                {
                    i = k + l;
                }
                i = Math.min(Math.max(i, 0), maxWidth);
                params.leftMargin = i;
                params.rightMargin = -i;
                relContainer.requestLayout();
                return flag;
            }
            break;

        case 1: // '\001'
            Log.d("AppHeaderTouchHandler", "Action Up!");
            if (xDown != -2.147484E+09F)
            {
                final boolean lastState = AppHelper.findAppViewById(0x7f080020).isEnabled();
                AppHelper.setNavigationEnabled(false);
                xDown = -2.147484E+09F;
                int j = maxWidth / 4;
                if ((!opening || params.leftMargin < j) && (opening || params.leftMargin > j * 3))
                {
                    boolean flag2;
                    if (!opening)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    opening = flag2;
                }
                motionevent = new AnimationSet(true);
                if (opening)
                {
                    view = new TranslateAnimation(0.0F, maxWidth - params.leftMargin, 0.0F, 0.0F);
                } else
                {
                    view = new TranslateAnimation(0.0F, -params.leftMargin, 0.0F, 0.0F);
                }
                view.setDuration(500L);
                motionevent.addAnimation(view);
                if (opening)
                {
                    AppHelper.setLastMovement((int)((float)maxWidth / AppHelper.getDensity()));
                } else
                {
                    AppHelper.setLastMovement(0);
                }
                relContainer.postDelayed(new Runnable() {

                    final AppHeaderTouchHandler this$0;
                    final boolean val$lastState;

                    public void run()
                    {
                        AppHelper.setNavigationEnabled(lastState);
                    }

            
            {
                this$0 = AppHeaderTouchHandler.this;
                lastState = flag;
                super();
            }
                }, 750L);
                relContainer.startAnimation(motionevent);
            }
            opening = false;
            xDown = -2.147484E+09F;
            relContainer = null;
            params = null;
            return flag;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
