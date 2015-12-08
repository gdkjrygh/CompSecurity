// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MusicPlayActivity

class this._cls0
    implements android.view.tener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        MainActivity.access$0(MainActivity.this, AnimationUtils.loadAnimation(MainActivity.this, 0x7f040008));
        MainActivity.access$1(MainActivity.this).startAnimation(MainActivity.access$2(MainActivity.this));
        MainActivity.access$2(MainActivity.this).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MainActivity._cls1 this$1;

            public void onAnimationEnd(Animation animation)
            {
                animation = new Intent(this$0, com/arist/MusicPlayer/MusicPlayActivity);
                startActivity(animation);
                overridePendingTransition(0x7f040006, 0x7f040003);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$1 = MainActivity._cls1.this;
                super();
            }
        });
    }


    _cls1.this._cls1()
    {
        this$0 = MainActivity.this;
        super();
    }
}
