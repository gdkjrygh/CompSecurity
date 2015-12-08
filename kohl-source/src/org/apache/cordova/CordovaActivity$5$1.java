// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Dialog;
import android.os.Handler;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

// Referenced classes of package org.apache.cordova:
//            CordovaActivity, CordovaPreferences

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
            Display display = getWindowManager().getDefaultDisplay();
            LinearLayout linearlayout = new LinearLayout(that.getActivity());
            linearlayout.setMinimumHeight(display.getHeight());
            linearlayout.setMinimumWidth(display.getWidth());
            linearlayout.setOrientation(1);
            linearlayout.setBackgroundColor(preferences.getInteger("backgroundColor", 0xff000000));
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F));
            linearlayout.setBackgroundResource(that.splashscreen);
            splashDialog = new Dialog(that, 0x1030010);
            if ((getWindow().getAttributes().flags & 0x400) == 1024)
            {
                splashDialog.getWindow().setFlags(1024, 1024);
            }
            splashDialog.setContentView(linearlayout);
            splashDialog.setCancelable(false);
            splashDialog.show();
            (new Handler()).postDelayed(new CordovaActivity._cls5._cls1(), time);
        }

            
            {
                this$0 = final_cordovaactivity;
                that = cordovaactivity1;
                time = I.this;
                super();
            }
    }

}
