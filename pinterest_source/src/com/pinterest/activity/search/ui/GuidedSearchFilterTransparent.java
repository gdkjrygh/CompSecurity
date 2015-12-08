// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchSpecificFilter

public class GuidedSearchFilterTransparent extends GuidedSearchSpecificFilter
{

    public GuidedSearchFilterTransparent(Context context)
    {
        this(context, null);
    }

    public GuidedSearchFilterTransparent(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void init()
    {
        super.init();
        setBackgroundResource(0x7f0e00b0);
    }
}
