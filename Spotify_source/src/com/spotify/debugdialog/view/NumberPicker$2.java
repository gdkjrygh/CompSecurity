// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.debugdialog.view;

import android.widget.SeekBar;

// Referenced classes of package com.spotify.debugdialog.view:
//            NumberPicker

final class a
    implements android.widget.arChangeListener
{

    private NumberPicker a;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        a.a();
        if (flag)
        {
            NumberPicker.a(a);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    er(NumberPicker numberpicker)
    {
        a = numberpicker;
        super();
    }
}
