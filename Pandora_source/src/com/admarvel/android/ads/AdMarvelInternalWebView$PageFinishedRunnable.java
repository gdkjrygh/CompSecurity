// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, FullScreenControls, AdMarvelActivity

private static class adMarvelInternalWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference contextReference;

    public void run()
    {
        if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
        Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
          goto _L3
_L26:
        if (AdMarvelInternalWebView.access$2(((AdMarvelInternalWebView) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (contextReference == null) goto _L5; else goto _L4
_L4:
        Object obj1 = (Context)contextReference.get();
_L21:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2;
        if (!(obj1 instanceof Activity))
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Activity)obj1;
        LinearLayout linearlayout;
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = (ViewGroup)((Activity) (obj2)).getWindow().findViewById(0x1020002);
            linearlayout = (LinearLayout)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log((new StringBuilder("Exception")).append(((Exception) (obj)).getMessage()).toString());
            return;
        }
        if (linearlayout == null) goto _L7; else goto _L6
_L6:
        if (!AdMarvelInternalWebView.access$3(((AdMarvelInternalWebView) (obj)))) goto _L9; else goto _L8
_L8:
        if (AdMarvelInternalWebView.access$4(((AdMarvelInternalWebView) (obj)))) goto _L11; else goto _L10
_L10:
        linearlayout.setVisibility(8);
_L7:
        if (!AdMarvelInternalWebView.access$5(((AdMarvelInternalWebView) (obj))).get())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((AdMarvelInternalWebView) (obj)).getParent() == null || !(((AdMarvelInternalWebView) (obj)).getParent() instanceof RelativeLayout))
        {
            break MISSING_BLOCK_LABEL_416;
        }
        obj1 = (FullScreenControls)((RelativeLayout)((AdMarvelInternalWebView) (obj)).getParent()).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("CONTROLS").toString());
_L24:
        if (!AdMarvelInternalWebView.access$6(((AdMarvelInternalWebView) (obj))).compareAndSet(false, true)) goto _L13; else goto _L12
_L12:
        if (obj2 == null) goto _L15; else goto _L14
_L14:
        if (!(obj2 instanceof AdMarvelActivity)) goto _L15; else goto _L16
_L16:
        obj2 = (AdMarvelActivity)obj2;
        if (obj2 == null) goto _L15; else goto _L17
_L17:
        if (((AdMarvelActivity) (obj2)).progressDialogReference == null) goto _L19; else goto _L18
_L18:
        obj2 = (contextReference)((AdMarvelActivity) (obj2)).progressDialogReference.get();
_L23:
        if (obj2 == null) goto _L15; else goto _L20
_L20:
        ((contextReference) (obj2)).ss();
_L15:
        ((AdMarvelInternalWebView) (obj)).clearHistory();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        ((FullScreenControls) (obj1)).setVisibility(0);
        ((AdMarvelInternalWebView) (obj)).setVisibility(0);
_L13:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (AdMarvelInternalWebView.access$6(((AdMarvelInternalWebView) (obj))).get())
        {
            ((FullScreenControls) (obj1)).updateButtonStates();
            ((FullScreenControls) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("PROGRESS_BAR").toString()).setVisibility(8);
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        obj1 = null;
          goto _L21
_L11:
        linearlayout.setVisibility(0);
        obj1 = (Button)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE_IMAGE").toString());
        if (obj1 == null) goto _L7; else goto _L22
_L22:
        ((Button) (obj1)).setVisibility(4);
          goto _L7
_L9:
        linearlayout.setVisibility(0);
          goto _L7
_L19:
        obj2 = null;
          goto _L23
        obj1 = null;
          goto _L24
_L3:
        if (obj != null) goto _L26; else goto _L25
_L25:
        return;
_L2:
        obj = null;
          goto _L3
        if (true) goto _L26; else goto _L27
_L27:
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, Context context)
    {
        contextReference = new WeakReference(context);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }
}
