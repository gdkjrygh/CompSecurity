// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;

// Referenced classes of package com.pandora.android.view:
//            TrackView

class a
    implements android.view.Listener
{

    final TrackView a;

    public void onClick(View view)
    {
        TrackView.c(a).a("rateDown");
        TrackView.d(a).setEnabled(false);
        ae.b(TrackView.e(a));
    }

    tton(TrackView trackview)
    {
        a = trackview;
        super();
    }
}
