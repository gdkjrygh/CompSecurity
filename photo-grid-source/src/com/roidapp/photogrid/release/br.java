// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, PhotoView, ra, bs

public final class br extends Fragment
{

    private int a;
    private ra b;
    private PhotoGridActivity c;

    public br()
    {
    }

    static ra a(br br1)
    {
        return br1.b;
    }

    static PhotoGridActivity b(br br1)
    {
        return br1.c;
    }

    static int c(br br1)
    {
        return br1.a;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c = (PhotoGridActivity)activity;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = getResources().getInteger(0x7f0a0000);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300a5, viewgroup, false);
        if (c != null)
        {
            b = (ra)c.O().e().get(0);
            if (b != null)
            {
                viewgroup = (SeekBar)layoutinflater.findViewById(0x7f0d0281);
                viewgroup.setProgress((int)((b.ad - (float)a) * 5F));
                viewgroup.setOnSeekBarChangeListener(new bs(this));
            }
        }
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        b = null;
    }
}
