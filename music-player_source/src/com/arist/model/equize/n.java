// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.media.audiofx.Visualizer;
import android.util.Log;
import java.util.Arrays;

// Referenced classes of package com.arist.model.equize:
//            o

public final class n
    implements android.media.audiofx.Visualizer.OnDataCaptureListener
{

    private int a;
    private Visualizer b;
    private o c;
    private boolean d;

    public n(int i)
    {
        d = false;
        a = i;
        Log.i("VisualizerHandler", Arrays.toString(Visualizer.getCaptureSizeRange()));
        try
        {
            b = new Visualizer(a);
            b.setEnabled(false);
            b.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
            b.setDataCaptureListener(this, Visualizer.getMaxCaptureRate() / 2, false, true);
            b.setEnabled(true);
            return;
        }
        catch (Exception exception)
        {
            b = null;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(o o1)
    {
        c = o1;
    }

    public final void a(boolean flag)
    {
        d = flag;
        if (!a() && c != null)
        {
            c.a(null);
        }
    }

    public final boolean a()
    {
        return d && b != null;
    }

    public final void b()
    {
        if (a())
        {
            b.setEnabled(false);
            b.release();
            b = null;
        }
    }

    public final void onFftDataCapture(Visualizer visualizer, byte abyte0[], int i)
    {
        if (c != null)
        {
            c.a(abyte0);
        }
    }

    public final void onWaveFormDataCapture(Visualizer visualizer, byte abyte0[], int i)
    {
    }
}
