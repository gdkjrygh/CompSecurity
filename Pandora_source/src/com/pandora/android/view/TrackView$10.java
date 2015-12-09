// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            TrackView

class a
    implements android.view.istener
{

    final TrackView a;

    public void onClick(View view)
    {
        TrackView.j(a).removeCallbacks(TrackView.i(a));
        TrackView.i(a).run();
    }

    (TrackView trackview)
    {
        a = trackview;
        super();
    }
}
