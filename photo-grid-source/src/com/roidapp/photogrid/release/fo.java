// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, PhotoView, ra, fp, 
//            fq

public final class fo extends Fragment
{

    private PhotoGridActivity a;
    private SharedPreferences b;

    public fo()
    {
    }

    static SharedPreferences a(fo fo1)
    {
        return fo1.b;
    }

    public final void a(int i)
    {
        ao ao;
        if (i >= 0 && i <= 255)
        {
            if ((ao = a.O().g()) != null && (ao instanceof ra))
            {
                ((ra)ao).d(i);
                a.O().invalidate();
                return;
            }
        }
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        b = activity.getSharedPreferences(activity.getPackageName(), 0);
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bc, null);
        layoutinflater.setOnClickListener(new fp(this));
        layoutinflater.findViewById(0x7f0d02f9);
        viewgroup = (SeekBar)layoutinflater.findViewById(0x7f0d02fb);
        bundle = a.O().g();
        int i;
        if (bundle != null && (bundle instanceof ra))
        {
            i = ((ra)bundle).q();
        } else
        {
            i = 255;
        }
        viewgroup.setProgress(i);
        viewgroup.setKeyProgressIncrement(1);
        viewgroup.setMax(255);
        viewgroup.setTag("alpha");
        viewgroup.setOnSeekBarChangeListener(new fq(this));
        return layoutinflater;
    }
}
