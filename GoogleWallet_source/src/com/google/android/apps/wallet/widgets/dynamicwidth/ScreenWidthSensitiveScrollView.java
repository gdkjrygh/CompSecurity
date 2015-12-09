// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.dynamicwidth;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.wallet.widgets.scrollview.ObservableScrollView;

// Referenced classes of package com.google.android.apps.wallet.widgets.dynamicwidth:
//            SpaceAdder

public class ScreenWidthSensitiveScrollView extends ObservableScrollView
{

    public ScreenWidthSensitiveScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        SpaceAdder.padIfNecessary(this);
    }
}
