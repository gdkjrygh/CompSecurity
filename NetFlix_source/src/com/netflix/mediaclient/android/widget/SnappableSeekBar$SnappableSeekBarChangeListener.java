// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.widget.SeekBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.MathUtils;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            SnappableSeekBar

private class wrappedListener
    implements android.widget.leSeekBarChangeListener
{

    private com.netflix.mediaclient.util.eListener.this._cls0 progressSnapRegion;
    final SnappableSeekBar this$0;
    private final r wrappedListener;

    private com.netflix.mediaclient.util.eListener computeProgressSnapRegion()
    {
        int i = (int)((float)(AndroidUtils.dipToPixels(getContext(), 24) * getMax()) / (float)getWidth());
        int j = getProgress();
        com.netflix.mediaclient.util.eListener elistener = new com.netflix.mediaclient.util.eListener(j - i, j + i);
        if (Log.isLoggable("SnappableSeekBar", 2))
        {
            Log.v("SnappableSeekBar", (new StringBuilder()).append("snap region: ").append(elistener).append(", position: ").append(j).append(", max position: ").append(getMax()).toString());
        }
        return elistener;
    }

    private boolean isWithinInternalSnapRegion(int i)
    {
        return progressSnapRegion != null && progressSnapRegion.progressSnapRegion(i);
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        Log.v("SnappableSeekBar", (new StringBuilder()).append("onProgressChanged, progress: ").append(i).append(", fromUser: ").append(flag).toString());
        int j = i;
        if (flag)
        {
            j = i;
            if (isWithinInternalSnapRegion(i))
            {
                i = MathUtils.constrain(progressSnapRegion.progressSnapRegion(), 0, seekbar.getMax());
                seekbar.setProgress(i);
                j = i;
                if (Log.isLoggable("SnappableSeekBar", 2))
                {
                    Log.v("SnappableSeekBar", (new StringBuilder()).append("Progress is within snap region - snapping to: ").append(i).toString());
                    j = i;
                }
            }
        }
        wrappedListener.onProgressChanged(seekbar, j, flag);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        Log.v("SnappableSeekBar", "onStartTrackingTouch");
        wrappedListener.onStartTrackingTouch(seekbar);
        if (SnappableSeekBar.access$100(SnappableSeekBar.this))
        {
            seekbar = computeProgressSnapRegion();
        } else
        {
            seekbar = null;
        }
        progressSnapRegion = seekbar;
        SnappableSeekBar.access$200(SnappableSeekBar.this);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        Log.v("SnappableSeekBar", "onStopTrackingTouch");
        r r = wrappedListener;
        boolean flag;
        if (progressSnapRegion != null && progressSnapRegion.progressSnapRegion(getProgress()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r.onStopTrackingTouch(seekbar, flag);
        progressSnapRegion = null;
        SnappableSeekBar.access$300(SnappableSeekBar.this);
    }


    public r(r r)
    {
        this$0 = SnappableSeekBar.this;
        super();
        wrappedListener = r;
    }
}
