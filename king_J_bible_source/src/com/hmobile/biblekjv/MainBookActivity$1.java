// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class this._cls0 extends Handler
{

    final MainBookActivity this$0;

    public void handleMessage(Message message)
    {
        if (navigationfade_global)
        {
            message = AnimationUtils.loadAnimation(MainBookActivity.this, 0x7f040004);
            message.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final MainBookActivity._cls1 this$1;

                public void onAnimationEnd(Animation animation)
                {
                    MainBookActivity.access$0(this$0).setVisibility(8);
                    thread = null;
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$1 = MainBookActivity._cls1.this;
                super();
            }
            });
            MainBookActivity.access$0(MainBookActivity.this).startAnimation(message);
        }
    }


    _cls1.this._cls1()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
