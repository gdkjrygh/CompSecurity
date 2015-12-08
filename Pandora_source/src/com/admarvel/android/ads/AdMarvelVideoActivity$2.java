// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity, VideoInterstitialControls

class this._cls0
    implements Runnable
{

    final AdMarvelVideoActivity this$0;

    public void run()
    {
        VideoInterstitialControls videointerstitialcontrols;
        if (AdMarvelVideoActivity.access$6(AdMarvelVideoActivity.this) == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        videointerstitialcontrols = (VideoInterstitialControls)AdMarvelVideoActivity.access$6(AdMarvelVideoActivity.this).get();
        if (videointerstitialcontrols == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        if (!(videointerstitialcontrols instanceof LinearLayout))
        {
            break MISSING_BLOCK_LABEL_243;
        }
        if (videointerstitialcontrols == null) goto _L2; else goto _L1
_L1:
        if (!AdMarvelVideoActivity.access$7(AdMarvelVideoActivity.this)) goto _L2; else goto _L3
_L3:
        int i = 0;
_L5:
        if (i < videointerstitialcontrols.getChildCount()) goto _L4; else goto _L2
_L2:
        AdMarvelVideoActivity.access$9(AdMarvelVideoActivity.this, false);
        if (AdMarvelVideoActivity.access$10(AdMarvelVideoActivity.this) != null)
        {
            AdMarvelVideoActivity.access$10(AdMarvelVideoActivity.this).stop();
            AdMarvelVideoActivity.access$11(AdMarvelVideoActivity.this, false);
            AdMarvelVideoActivity.access$12(AdMarvelVideoActivity.this).setVisibility(8);
            return;
        }
        break MISSING_BLOCK_LABEL_243;
_L4:
        Object obj;
        if (!(videointerstitialcontrols.getChildAt(i) instanceof s.ToolbarButtonLayout))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj = (s.ToolbarButtonLayout)videointerstitialcontrols.getChildAt(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        if (((s.ToolbarButtonLayout) (obj)).eventType.equalsIgnoreCase("done"))
        {
            ((s.ToolbarButtonLayout) (obj)).setClickable(true);
            ((s.ToolbarButtonLayout) (obj)).setEnabled(true);
            if (((s.ToolbarButtonLayout) (obj)).getChildAt(0) instanceof ImageView)
            {
                if (AdMarvelVideoActivity.access$8(AdMarvelVideoActivity.this) != null && AdMarvelVideoActivity.access$8(AdMarvelVideoActivity.this).isEnabled())
                {
                    AdMarvelVideoActivity.access$8(AdMarvelVideoActivity.this).stop();
                }
                obj = (ImageView)((s.ToolbarButtonLayout) (obj)).getChildAt(0);
                if (((ImageView) (obj)).getDrawable() != null)
                {
                    ((ImageView) (obj)).getDrawable().setAlpha(255);
                    ((ImageView) (obj)).invalidate();
                }
            }
        }
        i++;
          goto _L5
        Exception exception;
        exception;
        Logging.log(Log.getStackTraceString(exception));
    }

    s.ToolbarButtonLayout()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
