// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            TrackView, SlidingDrawer

class a
    implements android.view.Listener
{

    final TrackView a;

    public void onClick(View view)
    {
        if (a.a != null)
        {
            a.a.b();
        }
    }

    r(TrackView trackview)
    {
        a = trackview;
        super();
    }
}
