// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.view.View;
import com.pandora.radio.data.aa;

// Referenced classes of package com.pandora.android.view:
//            TrackView, SlidingDrawer

public class ExplicitWarningTrackView extends TrackView
{

    public ExplicitWarningTrackView(Context context)
    {
        super(context);
    }

    public static ExplicitWarningTrackView a(Context context, aa aa)
    {
        if (aa == null)
        {
            throw new IllegalArgumentException("Arguments must be non-null!");
        } else
        {
            context = new ExplicitWarningTrackView(context);
            context.a(aa, null, null);
            return context;
        }
    }

    public void a(aa aa, String s, String s1)
    {
        super.a(aa, s, s1);
        if (a != null)
        {
            a.f();
        }
        aa = findViewById(0x7f1002df);
        if (aa != null)
        {
            aa.setVisibility(8);
        }
        setTag("viewExcludedFromHistory");
    }
}
