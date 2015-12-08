// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.widget.SeekBar;

// Referenced classes of package android.support.v7.app:
//            MediaRouteControllerDialog

class this._cls0
    implements android.widget.er
{

    private final Runnable mStopTrackingTouch = new Runnable() {

        final MediaRouteControllerDialog._cls1 this$1;

        public void run()
        {
            if (MediaRouteControllerDialog.access$100(this$0))
            {
                MediaRouteControllerDialog.access$102(this$0, false);
                MediaRouteControllerDialog.access$200(this$0);
            }
        }

            
            {
                this$1 = MediaRouteControllerDialog._cls1.this;
                super();
            }
    };
    final MediaRouteControllerDialog this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            MediaRouteControllerDialog.access$400(MediaRouteControllerDialog.this).SetVolume(i);
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        if (MediaRouteControllerDialog.access$100(MediaRouteControllerDialog.this))
        {
            MediaRouteControllerDialog.access$300(MediaRouteControllerDialog.this).removeCallbacks(mStopTrackingTouch);
            return;
        } else
        {
            MediaRouteControllerDialog.access$102(MediaRouteControllerDialog.this, true);
            return;
        }
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        MediaRouteControllerDialog.access$300(MediaRouteControllerDialog.this).postDelayed(mStopTrackingTouch, 250L);
    }

    _cls1.this._cls1()
    {
        this$0 = MediaRouteControllerDialog.this;
        super();
    }
}
