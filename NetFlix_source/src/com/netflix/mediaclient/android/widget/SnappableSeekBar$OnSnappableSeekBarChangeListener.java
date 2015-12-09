// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.widget.SeekBar;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            SnappableSeekBar

public static interface 
{

    public abstract void onProgressChanged(SeekBar seekbar, int i, boolean flag);

    public abstract void onStartTrackingTouch(SeekBar seekbar);

    public abstract void onStopTrackingTouch(SeekBar seekbar, boolean flag);
}
