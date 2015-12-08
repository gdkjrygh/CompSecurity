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
//            DroidGap

class val.time
    implements Runnable
{

    final DroidGap this$0;
    final DroidGap val$that;
    final int val$time;

    public void run()
    {
        Display display = getWindowManager().getDefaultDisplay();
        LinearLayout linearlayout = new LinearLayout(val$that.getActivity());
        linearlayout.setMinimumHeight(display.getHeight());
        linearlayout.setMinimumWidth(display.getWidth());
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundColor(val$that.getIntegerProperty("backgroundColor", 0xff000000));
        linearlayout.setLayoutParams(new android.widget.t.LayoutParams(-1, -1, 0.0F));
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

            final DroidGap._cls5 this$1;

            public void run()
            {
                removeSplashScreen();
            }

            
            {
                this$1 = DroidGap._cls5.this;
                super();
            }
        }, val$time);
    }

    _cls1.this._cls1()
    {
        this$0 = final_droidgap;
        val$that = droidgap1;
        val$time = I.this;
        super();
    }
}
