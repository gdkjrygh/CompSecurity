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
import java.util.Stack;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageGuideFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            w, t, l

public class v extends SeekBar
    implements android.widget.SeekBar.OnSeekBarChangeListener, w
{

    private final String a = com/roidapp/imagelib/retouch/v.getSimpleName();
    private final GPUImageView b;
    private final TextView c;
    private final Stack d = new Stack();
    private final Stack e = new Stack();
    private GPUImageFilter f;
    private t g;
    private int h;
    private final String i;
    private final View j;
    private final View k;

    public v(String s, Context context, GPUImageView gpuimageview, TextView textview, GPUImageGuideFilter gpuimageguidefilter, View view, View view1)
    {
        super(context);
        k = view1;
        j = view;
        i = s;
        b = gpuimageview;
        c = textview;
        f = gpuimageguidefilter;
        setMax(100);
        s = context.getResources();
        setProgressDrawable(s.getDrawable(f.l));
        setThumb(s.getDrawable(f.n));
        setOnSeekBarChangeListener(this);
        int i1 = (int)getResources().getDimension(e.i);
        setPadding(i1, 0, i1, 0);
    }

    private void c(int i1)
    {
        ((GPUImageGuideFilter)f).setEps(((float)i1 * 0.004F) / 100F);
        b.requestRender();
    }

    public final void a(int i1)
    {
        h = i1;
        setProgress(h);
    }

    public final void a(t t1)
    {
        g = t1;
    }

    public final void b(int i1)
    {
        a(i1);
        ((GPUImageGuideFilter)f).setEps(((float)i1 * 0.004F) / 100F);
    }

    public final boolean b()
    {
        return !d.isEmpty();
    }

    public final boolean c()
    {
        return !e.isEmpty();
    }

    public final void d()
    {
        e.push(d.pop());
        int i1;
        if (d.isEmpty())
        {
            i1 = 0;
        } else
        {
            i1 = ((Integer)d.peek()).intValue();
        }
        c(i1);
        setProgress(i1);
    }

    public final void e()
    {
        int i1 = ((Integer)e.pop()).intValue();
        d.push(Integer.valueOf(i1));
        c(i1);
        setProgress(i1);
    }

    public final int f()
    {
        return 0;
    }

    public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
    {
        if (g != null)
        {
            g.a(i1);
        }
        com.roidapp.imagelib.retouch.l.f().a(i1);
        c.setText(String.valueOf(i1));
        h = i1;
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        c.setText(String.valueOf(getProgress()));
        c.setVisibility(0);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (j != null)
        {
            j.setSelected(false);
        }
        if (k != null)
        {
            k.setVisibility(8);
        }
        com.roidapp.imagelib.retouch.l.f().a(false);
        d.push(Integer.valueOf(seekbar.getProgress()));
        c.setVisibility(8);
        e.clear();
        c(h);
    }
}
