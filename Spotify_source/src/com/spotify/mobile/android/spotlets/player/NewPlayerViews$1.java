// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.util.Property;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;

// Referenced classes of package com.spotify.mobile.android.spotlets.player:
//            NewPlayerViews

final class a extends Property
{

    private NewPlayerViews a;

    public final Object get(Object obj)
    {
        return Integer.valueOf(((CancellableSeekBar)obj).getProgress());
    }

    public final void set(Object obj, Object obj1)
    {
        obj = (CancellableSeekBar)obj;
        obj1 = (Integer)obj1;
        NewPlayerViews.a(a, ((Integer) (obj1)).intValue() / 1000);
        ((CancellableSeekBar) (obj)).setProgress(((Integer) (obj1)).intValue());
    }

    A(NewPlayerViews newplayerviews, Class class1, String s)
    {
        a = newplayerviews;
        super(class1, s);
    }
}
