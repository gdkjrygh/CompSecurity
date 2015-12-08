// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.widget.SeekBar;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            DraggableSeekBar

final class a
    implements android.widget.angeListener
{

    private DraggableSeekBar a;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            DraggableSeekBar.a(a);
        }
        if (DraggableSeekBar.b(a) != null)
        {
            DraggableSeekBar.b(a).onProgressChanged(seekbar, i, flag);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        if (DraggableSeekBar.b(a) != null)
        {
            DraggableSeekBar.b(a).onStartTrackingTouch(seekbar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (DraggableSeekBar.b(a) != null)
        {
            DraggableSeekBar.b(a).onStopTrackingTouch(seekbar);
        }
    }

    (DraggableSeekBar draggableseekbar)
    {
        a = draggableseekbar;
        super();
    }
}
