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

class val.time
    implements Runnable
{

    final CordovaActivity this$0;
    final CordovaActivity val$that;
    final int val$time;

    public void run()
    {
        Display display = getWindowManager().getDefaultDisplay();
        LinearLayout linearlayout = new LinearLayout(val$that.getActivity());
        linearlayout.setMinimumHeight(display.getHeight());
        linearlayout.setMinimumWidth(display.getWidth());
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundColor(preferences.getInteger("backgroundColor", 0xff000000));
        linearlayout.setLayoutParams(new android.widget.tParams(-1, -1, 0.0F));
        linearlayout.setBackgroundResource(val$that.splashscreen);
        splashDialog = new Dialog(val$that, 0x1030010);
        if ((getWindow().getAttributes().flags & 0x400) == 1024)
        {
            splashDialog.getWindow().setFlags(1024, 1024);
        }
        splashDialog.setContentView(linearlayout);
        splashDialog.setCancelable(false);
        splashDialog.show();
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

    _cls1.this._cls1()
    {
        this$0 = final_cordovaactivity;
        val$that = cordovaactivity1;
        val$time = I.this;
        super();
    }
}
