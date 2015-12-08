// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import adg;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import yj;

public class setBackgroundDrawable extends adg
{

    private static final int a[] = {
        0x10100d4
    };


    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = yj.a(context, attributeset, a);
        setBackgroundDrawable(context.a(0));
        ((yj) (context)).a.recycle();
    }
}
