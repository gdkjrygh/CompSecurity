// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.Context;
import android.widget.LinearLayout;

// Referenced classes of package org.apache.cordova:
//            CordovaActivity, LOG, CordovaWebView

public class LinearLayoutSoftKeyboardDetect extends LinearLayout
{

    private static final String TAG = "SoftKeyboardDetect";
    private CordovaActivity app;
    private int oldHeight;
    private int oldWidth;
    private int screenHeight;
    private int screenWidth;

    public LinearLayoutSoftKeyboardDetect(Context context, int i, int j)
    {
        super(context);
        oldHeight = 0;
        oldWidth = 0;
        screenWidth = 0;
        screenHeight = 0;
        app = null;
        screenWidth = i;
        screenHeight = j;
        app = (CordovaActivity)context;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        LOG.v("SoftKeyboardDetect", "We are in our onMeasure method");
        j = android.view.View.MeasureSpec.getSize(j);
        i = android.view.View.MeasureSpec.getSize(i);
        LOG.v("SoftKeyboardDetect", "Old Height = %d", new Object[] {
            Integer.valueOf(oldHeight)
        });
        LOG.v("SoftKeyboardDetect", "Height = %d", new Object[] {
            Integer.valueOf(j)
        });
        LOG.v("SoftKeyboardDetect", "Old Width = %d", new Object[] {
            Integer.valueOf(oldWidth)
        });
        LOG.v("SoftKeyboardDetect", "Width = %d", new Object[] {
            Integer.valueOf(i)
        });
        if (oldHeight != 0 && oldHeight != j) goto _L2; else goto _L1
_L1:
        LOG.d("SoftKeyboardDetect", "Ignore this event");
_L4:
        oldHeight = j;
        oldWidth = i;
        return;
_L2:
        if (screenHeight == i)
        {
            int k = screenHeight;
            screenHeight = screenWidth;
            screenWidth = k;
            LOG.v("SoftKeyboardDetect", "Orientation Change");
        } else
        if (j > oldHeight)
        {
            if (app != null)
            {
                app.appView.sendJavascript("cordova.fireDocumentEvent('hidekeyboard');");
            }
        } else
        if (j < oldHeight && app != null)
        {
            app.appView.sendJavascript("cordova.fireDocumentEvent('showkeyboard');");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
