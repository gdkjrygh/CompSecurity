// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.widget.SeekBar;

public class SeekBarBindingAdapter
{
    public static interface OnProgressChanged
    {

        public abstract void onProgressChanged(SeekBar seekbar, int i, boolean flag);
    }

    public static interface OnStartTrackingTouch
    {

        public abstract void onStartTrackingTouch(SeekBar seekbar);
    }

    public static interface OnStopTrackingTouch
    {

        public abstract void onStopTrackingTouch(SeekBar seekbar);
    }


    public SeekBarBindingAdapter()
    {
    }

    public static void setListener(SeekBar seekbar, OnProgressChanged onprogresschanged)
    {
        setListener(seekbar, null, null, onprogresschanged);
    }

    public static void setListener(SeekBar seekbar, OnStartTrackingTouch onstarttrackingtouch)
    {
        setListener(seekbar, onstarttrackingtouch, null, null);
    }

    public static void setListener(SeekBar seekbar, OnStartTrackingTouch onstarttrackingtouch, OnProgressChanged onprogresschanged)
    {
        setListener(seekbar, onstarttrackingtouch, null, onprogresschanged);
    }

    public static void setListener(SeekBar seekbar, OnStartTrackingTouch onstarttrackingtouch, OnStopTrackingTouch onstoptrackingtouch)
    {
        setListener(seekbar, onstarttrackingtouch, onstoptrackingtouch, null);
    }

    public static void setListener(SeekBar seekbar, OnStartTrackingTouch onstarttrackingtouch, OnStopTrackingTouch onstoptrackingtouch, OnProgressChanged onprogresschanged)
    {
        if (onstarttrackingtouch == null && onstoptrackingtouch == null && onprogresschanged == null)
        {
            seekbar.setOnSeekBarChangeListener(null);
            return;
        } else
        {
            seekbar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener(onprogresschanged, onstarttrackingtouch, onstoptrackingtouch) {

                final OnProgressChanged val$progressChanged;
                final OnStartTrackingTouch val$start;
                final OnStopTrackingTouch val$stop;

                public void onProgressChanged(SeekBar seekbar1, int i, boolean flag)
                {
                    if (progressChanged != null)
                    {
                        progressChanged.onProgressChanged(seekbar1, i, flag);
                    }
                }

                public void onStartTrackingTouch(SeekBar seekbar1)
                {
                    if (start != null)
                    {
                        start.onStartTrackingTouch(seekbar1);
                    }
                }

                public void onStopTrackingTouch(SeekBar seekbar1)
                {
                    if (stop != null)
                    {
                        stop.onStopTrackingTouch(seekbar1);
                    }
                }

            
            {
                progressChanged = onprogresschanged;
                start = onstarttrackingtouch;
                stop = onstoptrackingtouch;
                super();
            }
            });
            return;
        }
    }

    public static void setListener(SeekBar seekbar, OnStopTrackingTouch onstoptrackingtouch)
    {
        setListener(seekbar, null, onstoptrackingtouch, null);
    }

    public static void setListener(SeekBar seekbar, OnStopTrackingTouch onstoptrackingtouch, OnProgressChanged onprogresschanged)
    {
        setListener(seekbar, null, onstoptrackingtouch, onprogresschanged);
    }
}
