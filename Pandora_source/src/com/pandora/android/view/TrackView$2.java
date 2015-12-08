// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.pandora.android.artist.FeaturedTrackLayout;

// Referenced classes of package com.pandora.android.view:
//            TrackView

class a
    implements android.view.rver.OnPreDrawListener
{

    final boolean a;
    final TrackView b;

    public boolean onPreDraw()
    {
        TrackView.a(b).getViewTreeObserver().removeOnPreDrawListener(this);
        TrackView.l(b).a(TrackView.a(b), a);
        return false;
    }

    ackLayout(TrackView trackview, boolean flag)
    {
        b = trackview;
        a = flag;
        super();
    }
}
