// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper

public class AppRelContainer extends RelativeLayout
{

    private static String TAG = "AppRelContainer";
    private boolean animating;

    public AppRelContainer(Context context)
    {
        super(context);
        animating = false;
        setBackgroundResource(0x7f02000f);
    }

    public AppRelContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        animating = false;
        setBackgroundResource(0x7f02000f);
    }

    public AppRelContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        animating = false;
        setBackgroundResource(0x7f02000f);
    }

    public boolean isAnimating()
    {
        return animating;
    }

    public boolean isEnabled()
    {
        return super.isEnabled() && !animating;
    }

    protected void onAnimationEnd()
    {
        byte byte0;
        int i;
        byte0 = 0;
        super.onAnimationEnd();
        Log.d(TAG, "Animation End!");
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(getLayoutParams());
        i = (int)((float)AppHelper.getLastMovement() * AppHelper.getDensity());
        layoutparams.setMargins(i, 0, -i, 0);
        setLayoutParams(layoutparams);
        this;
        JVM INSTR monitorenter ;
        Log.d(TAG, "Notifying All!");
        notifyAll();
        setTag(null);
        Object obj;
        String s;
        Object obj1;
        String s1;
        boolean flag;
        if (AppHelper.getLastMovement() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        AppHelper.setSignOut(flag);
        animating = false;
        obj = AppHelper.findAppViewById(0x7f080023);
        if (i == 0)
        {
            byte0 = 4;
        }
        ((View) (obj)).setVisibility(byte0);
        s1 = getResources().getString(0x7f090128);
        obj1 = getResources().getString(0x7f090129);
        s = ((String) (obj1));
        obj = s1;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            obj = (new StringBuilder()).append(s1).append(" ").append(getResources().getString(0x7f09012e)).toString();
            s = (new StringBuilder()).append(((String) (obj1))).append(" ").append(getResources().getString(0x7f09012e)).toString();
        }
        obj1 = findViewById(0x7f080020);
        if (i != 0)
        {
            obj = s;
        }
        ((View) (obj1)).setContentDescription(((CharSequence) (obj)));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        postDelayed(new Runnable() {

            final AppRelContainer this$0;

            public void run()
            {
                AppHelper.hideKeyboard();
            }

            
            {
                this$0 = AppRelContainer.this;
                super();
            }
        }, 250L);
        postDelayed(new Runnable() {

            final AppRelContainer this$0;

            public void run()
            {
                AppHelper.findAppViewById(0x7f0800b0).requestFocus();
            }

            
            {
                this$0 = AppRelContainer.this;
                super();
            }
        }, 3000L);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void startAnimation(Animation animation)
    {
        animating = true;
        super.startAnimation(animation);
    }

}
