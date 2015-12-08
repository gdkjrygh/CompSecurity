// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.SharedPreferences;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            fo

final class fq
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final fo a;

    fq(fo fo1)
    {
        a = fo1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        a.a(i);
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        android.content.SharedPreferences.Editor editor = fo.a(a).edit();
        editor.putInt("free_text_alpha", seekbar.getProgress());
        editor.apply();
    }
}
