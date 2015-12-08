// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.google.android.play.layout:
//            PlayCardViewBase

public class PlayCardViewMedium extends PlayCardViewBase
{

    public PlayCardViewMedium(Context context)
    {
        this(context, null);
    }

    public PlayCardViewMedium(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        measureThumbnailSpanningHeight(j);
        super.onMeasure(i, j);
    }
}
