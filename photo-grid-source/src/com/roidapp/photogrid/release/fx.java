// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            fr

final class fx
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final fr b;

    fx(fr fr1, ViewGroup viewgroup)
    {
        b = fr1;
        a = viewgroup;
        super();
    }

    public final void onClick(View view)
    {
        if (fr.a(b) != null)
        {
            a.findViewById(fr.a(b).intValue()).findViewById(0x7f0d0493).setVisibility(8);
        }
        fr.d(b).setProgress(100);
        fr.e(b).setProgress(0);
        fr.c(b).edit().putFloat("free_text_shadow_space", 0.0F).putFloat("free_text_shadow_radius", 1E-04F).apply();
        b.c();
    }
}
