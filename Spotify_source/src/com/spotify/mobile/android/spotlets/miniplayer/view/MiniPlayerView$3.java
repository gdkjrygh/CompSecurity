// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.miniplayer.view;

import android.util.Property;
import android.widget.ProgressBar;

// Referenced classes of package com.spotify.mobile.android.spotlets.miniplayer.view:
//            MiniPlayerView

final class  extends Property
{

    public final Object get(Object obj)
    {
        return Integer.valueOf(((ProgressBar)obj).getProgress());
    }

    public final void set(Object obj, Object obj1)
    {
        ((ProgressBar)obj).setProgress(((Integer)obj1).intValue());
    }

    (Class class1, String s)
    {
        super(class1, s);
    }
}
