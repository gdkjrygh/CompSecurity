// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import com.pandora.android.coachmark.e;

// Referenced classes of package com.pandora.android.view:
//            TrackView

class a
    implements Runnable
{

    final TrackView a;

    public void run()
    {
        TrackView.g(a).a();
        TrackView.a(a, null);
        TrackView.h(a);
    }

    (TrackView trackview)
    {
        a = trackview;
        super();
    }
}
