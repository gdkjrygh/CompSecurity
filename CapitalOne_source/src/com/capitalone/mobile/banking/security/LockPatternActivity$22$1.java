// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.EnterpriseMobileBanking.AppHelper;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            LockPatternActivity

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        AppHelper.hideKeyboard();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/capitalone/mobile/banking/security/LockPatternActivity$22

/* anonymous class */
    class LockPatternActivity._cls22
        implements android.view.animation.Animation.AnimationListener
    {

        final LockPatternActivity this$0;

        public void onAnimationEnd(Animation animation)
        {
            animation = new android.widget.RelativeLayout.LayoutParams(relContainer.getLayoutParams());
            int i = (int)((float)AppHelper.getLastMovement() * AppHelper.getDensity());
            Object obj = MenuContainer;
            Object obj1;
            String s;
            byte byte0;
            if (i == 0)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            ((View) (obj)).setVisibility(byte0);
            animation.setMargins(i, 0, -i, 0);
            relContainer.setLayoutParams(animation);
            relContainer.setTag(null);
            s = getResources().getString(0x7f090128);
            obj1 = getResources().getString(0x7f090129);
            obj = obj1;
            animation = s;
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                animation = (new StringBuilder()).append(s).append(" ").append(getResources().getString(0x7f09012e)).toString();
                obj = (new StringBuilder()).append(((String) (obj1))).append(" ").append(getResources().getString(0x7f09012e)).toString();
            }
            obj1 = findViewById(0x7f080020);
            if (i != 0)
            {
                animation = ((Animation) (obj));
            }
            ((View) (obj1)).setContentDescription(animation);
            if (i != 0)
            {
                relContainer.postDelayed(new LockPatternActivity._cls22._cls1(), 250L);
            }
            relContainer.postDelayed(new LockPatternActivity._cls22._cls2(), 300L);
            animation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F);
            animation.setDuration(1L);
            relContainer.startAnimation(animation);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }

        // Unreferenced inner class com/capitalone/mobile/banking/security/LockPatternActivity$22$2

/* anonymous class */
        class LockPatternActivity._cls22._cls2
            implements Runnable
        {

            final LockPatternActivity._cls22 this$1;

            public void run()
            {
                LockPatternActivity.access$700(this$0).requestFocus();
            }

                    
                    {
                        this$1 = LockPatternActivity._cls22.this;
                        super();
                    }
        }

    }

}
