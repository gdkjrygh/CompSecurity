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

class this._cls1
    implements Runnable
{

    final veSplashScreen this$1;

    public void run()
    {
        removeSplashScreen();
    }

    l.time()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/CordovaActivity$5

/* anonymous class */
    class CordovaActivity._cls5
        implements Runnable
    {

        final CordovaActivity this$0;
        final CordovaActivity val$that;
        final int val$time;

        public void run()
        {
            splashLayout = getSplashLayout();
            splashDialog = new Dialog(that, 0x1030010);
            if (getBooleanProperty("FullScreen", false))
            {
                CordovaActivity.access$000(CordovaActivity.this, splashDialog.getWindow());
            }
            splashDialog.setContentView(splashLayout);
            splashDialog.setCancelable(false);
            splashDialog.show();
            mCurrentOrientation = getScreenOrientation();
            splashOrientationListener = new CordovaActivity._cls5._cls1(that, 3);
            splashOrientationListener.enable();
            (new Handler()).postDelayed(new CordovaActivity._cls5._cls2(), time);
        }

            
            {
                this$0 = final_cordovaactivity;
                that = cordovaactivity1;
                time = I.this;
                super();
            }

        // Unreferenced inner class org/apache/cordova/CordovaActivity$5$1

/* anonymous class */
        class CordovaActivity._cls5._cls1 extends OrientationEventListener
        {

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
        }

    }

}
