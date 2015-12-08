// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package com.soundcloud.android.image:
//            PlaceholderGenerator

public class CircularPlaceholderGenerator extends PlaceholderGenerator
{

    CircularPlaceholderGenerator(Resources resources)
    {
        super(resources);
    }

    public GradientDrawable generateDrawable(String s)
    {
        s = super.generateDrawable(s);
        s.setShape(1);
        return s;
    }

    protected Drawable getLoadingDrawable()
    {
        return resources.getDrawable(0x7f020098);
    }
}
