// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.view.OrientationEventListener;

// Referenced classes of package org.apache.cordova:
//            CordovaActivity

class val.time
    implements Runnable
{

    final CordovaActivity this$0;
    final CordovaActivity val$that;
    final int val$time;

    public void run()
    {
        splashLayout = getSplashLayout();
        splashDialog = new Dialog(val$that, 0x1030010);
        if (getBooleanProperty("FullScreen", false))
        {
            CordovaActivity.access$000(CordovaActivity.this, splashDialog.getWindow());
        }
        splashDialog.setContentView(splashLayout);
        splashDialog.setCancelable(false);
        splashDialog.show();
        mCurrentOrientation = getScreenOrientation();
        splashOrientationListener = new OrientationEventListener(val$that, 3) {

            final CordovaActivity._cls5 this$1;

            public void onOrientationChanged(int i)
            {
                if (splashDialog != null && splashDialog.isShowing())
                {
                    if ((i = getScreenOrientation()) != mCurrentOrientation)
                    {
                        splashLayout = getSplashLayout();
                        splashDialog.setContentView(splashLayout);
                        mCurrentOrientation = i;
                        return;
                    }
                }
            }

            
            {
                this$1 = CordovaActivity._cls5.this;
                super(context, i);
            }
        };
        splashOrientationListener.enable();
        (new Handler()).postDelayed(new Runnable() {

            final CordovaActivity._cls5 this$1;

            public void run()
            {
                removeSplashScreen();
            }

            
            {
                this$1 = CordovaActivity._cls5.this;
                super();
            }
        }, val$time);
    }

    _cls2.this._cls1()
    {
        this$0 = final_cordovaactivity;
        val$that = cordovaactivity1;
        val$time = I.this;
        super();
    }
}
