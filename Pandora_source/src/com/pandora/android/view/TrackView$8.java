// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import p.ad.b;
import p.al.f;
import p.an.k;

// Referenced classes of package com.pandora.android.view:
//            TrackView

class a
    implements f
{

    final TrackView a;

    public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
    {
        return a(exception, (String)obj, k, flag);
    }

    public boolean a(Exception exception, String s, k k, boolean flag)
    {
        com.pandora.android.view.TrackView.b(a, true);
        return false;
    }

    public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
    {
        return a((b)obj, (String)obj1, k, flag, flag1);
    }

    public boolean a(b b1, String s, k k, boolean flag, boolean flag1)
    {
        com.pandora.android.view.TrackView.b(a, false);
        return false;
    }

    (TrackView trackview)
    {
        a = trackview;
        super();
    }
}
