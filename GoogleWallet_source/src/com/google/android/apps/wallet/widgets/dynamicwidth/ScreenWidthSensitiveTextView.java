// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.dynamicwidth;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.wallet.widgets.dynamicwidth:
//            SpaceAdder

public class ScreenWidthSensitiveTextView extends TextView
{

    public ScreenWidthSensitiveTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        SpaceAdder.addMarginIfNecessary(this);
    }
}
