// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.f;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageGuideFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            w, v, t, l

public final class ac extends SeekBar
    implements android.widget.SeekBar.OnSeekBarChangeListener, w
{

    private final String a = com/roidapp/imagelib/retouch/v.getSimpleName();
    private final GPUImageView b;
    private GPUImageFilter c;
    private final TextView d;
    private int e;
    private t f;
    private final String g;
    private final View h;
    private final View i;

    public ac(String s, Context context, GPUImageView gpuimageview, TextView textview, GPUImageGuideFilter gpuimageguidefilter, View view, View view1)
    {
        super(context);
        i = view1;
        h = view;
        g = s;
        b = gpuimageview;
        d = textview;
        c = gpuimageguidefilter;
        setMax(100);
        s = context.getResources();
        setProgressDrawable(s.getDrawable(f.l));
        setThumb(s.getDrawable(f.n));
        setOnSeekBarChangeListener(this);
        int j = (int)getResources().getDimension(e.i);
        setPadding(j, 0, j, 0);
    }

    public final void a(int j)
    {
        e = j;
        setProgress(e);
    }

    public final void a(t t1)
    {
        f = t1;
    }

    public final void b(int j)
    {
        a(j);
        float f1 = (float)j / 100F;
        ((GPUImageGuideFilter)c).setAlpha(f1);
    }

    public final boolean b()
    {
        return false;
    }

    public final boolean c()
    {
        return false;
    }

    public final void d()
    {
    }

    public final void e()
    {
    }

    public final int f()
    {
        return 0;
    }

    public final void onProgressChanged(SeekBar seekbar, int j, boolean flag)
    {
        if (f != null)
        {
            f.b(j);
        }
        com.roidapp.imagelib.retouch.l.f().b(j);
        d.setText(String.valueOf(j));
        e = j;
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        d.setText(String.valueOf(getProgress()));
        d.setVisibility(0);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (h != null)
        {
            h.setSelected(false);
        }
        if (i != null)
        {
            i.setVisibility(8);
        }
        d.setVisibility(8);
        float f1 = (float)e / 100F;
        ((GPUImageGuideFilter)c).setAlpha(f1);
        b.requestRender();
    }
}
