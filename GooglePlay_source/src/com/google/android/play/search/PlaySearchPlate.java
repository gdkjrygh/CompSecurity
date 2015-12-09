// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchNavigationButton, PlaySearchPlateTextContainer, PlaySearchActionButton

public class PlaySearchPlate extends FrameLayout
{

    PlaySearchActionButton mActionButton;
    PlaySearchNavigationButton mNavButton;
    PlaySearchPlateTextContainer mSearchPlateTextContainer;

    public PlaySearchPlate(Context context)
    {
        this(context, null);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mNavButton = (PlaySearchNavigationButton)findViewById(0x7f0d0337);
        mSearchPlateTextContainer = (PlaySearchPlateTextContainer)findViewById(0x7f0d0201);
        mActionButton = (PlaySearchActionButton)findViewById(0x7f0d033b);
    }
}
