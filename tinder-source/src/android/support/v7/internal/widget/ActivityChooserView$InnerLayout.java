// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, TintTypedArray

public static class setBackgroundDrawable extends LinearLayoutCompat
{

    private static final int TINT_ATTRS[] = {
        0x10100d4
    };


    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS);
        setBackgroundDrawable(context.getDrawable(0));
        context.recycle();
    }
}
