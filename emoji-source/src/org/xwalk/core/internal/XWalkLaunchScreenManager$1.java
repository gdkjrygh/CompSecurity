// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.Window;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkLaunchScreenManager

class val.imageBorderList
    implements Runnable
{

    final XWalkLaunchScreenManager this$0;
    final String val$imageBorderList;

    public void run()
    {
        int i = XWalkLaunchScreenManager.access$000(XWalkLaunchScreenManager.this).getResources().getIdentifier("launchscreen_bg", "drawable", XWalkLaunchScreenManager.access$000(XWalkLaunchScreenManager.this).getPackageName());
        Object obj;
        if (i != 0)
        {
            if ((obj = XWalkLaunchScreenManager.access$000(XWalkLaunchScreenManager.this).getResources().getDrawable(i)) != null)
            {
                XWalkLaunchScreenManager.access$102(XWalkLaunchScreenManager.this, new Dialog(XWalkLaunchScreenManager.access$200(XWalkLaunchScreenManager.this), 0x10300f0));
                int j = XWalkLaunchScreenManager.access$000(XWalkLaunchScreenManager.this).getWindow().getDecorView().getSystemUiVisibility();
                android.view.nManager nmanager = XWalkLaunchScreenManager.access$000(XWalkLaunchScreenManager.this).getWindow().getAttributes();
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).getWindow().getDecorView().setSystemUiVisibility(j);
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).getWindow().setAttributes(nmanager);
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

                    final XWalkLaunchScreenManager._cls1 this$1;

                    public boolean onKey(DialogInterface dialoginterface, int k, KeyEvent keyevent)
                    {
                        if (k == 4)
                        {
                            XWalkLaunchScreenManager.access$300(this$0);
                            XWalkLaunchScreenManager.access$000(this$0).onBackPressed();
                        }
                        return true;
                    }

            
            {
                this$1 = XWalkLaunchScreenManager._cls1.this;
                super();
            }
                });
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).setOnShowListener(XWalkLaunchScreenManager.this);
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).setOnDismissListener(XWalkLaunchScreenManager.this);
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                obj = XWalkLaunchScreenManager.access$400(XWalkLaunchScreenManager.this, val$imageBorderList);
                if (obj != null)
                {
                    XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).setContentView(((View) (obj)));
                }
                XWalkLaunchScreenManager.access$100(XWalkLaunchScreenManager.this).show();
                XWalkLaunchScreenManager.access$502(XWalkLaunchScreenManager.this, new OrientationEventListener(XWalkLaunchScreenManager.access$000(XWalkLaunchScreenManager.this), 3) {

                    final XWalkLaunchScreenManager._cls1 this$1;

                    public void onOrientationChanged(int k)
                    {
                        if (XWalkLaunchScreenManager.access$100(this$0) != null && XWalkLaunchScreenManager.access$100(this$0).isShowing() && getScreenOrientation() != XWalkLaunchScreenManager.access$600(this$0))
                        {
                            android.widget.RelativeLayout relativelayout = XWalkLaunchScreenManager.access$400(this$0, imageBorderList);
                            if (relativelayout != null)
                            {
                                XWalkLaunchScreenManager.access$100(this$0).setContentView(relativelayout);
                                return;
                            }
                        }
                    }

            
            {
                this$1 = XWalkLaunchScreenManager._cls1.this;
                super(context, i);
            }
                });
                XWalkLaunchScreenManager.access$500(XWalkLaunchScreenManager.this).enable();
                if (XWalkLaunchScreenManager.access$700(XWalkLaunchScreenManager.this) == adyWhenType.CUSTOM)
                {
                    XWalkLaunchScreenManager.access$800(XWalkLaunchScreenManager.this);
                    return;
                }
            }
        }
    }

    _cls2.this._cls1()
    {
        this$0 = final_xwalklaunchscreenmanager;
        val$imageBorderList = String.this;
        super();
    }
}
