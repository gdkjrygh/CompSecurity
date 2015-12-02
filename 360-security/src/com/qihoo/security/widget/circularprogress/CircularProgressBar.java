// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.circularprogress;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CircularProgressBar extends ProgressBar
{

    public CircularProgressBar(Context context)
    {
        this(context, null);
    }

    public CircularProgressBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircularProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            setIndeterminateDrawable((new CircularProgressDrawable.a(context)).a());
            return;
        }
        Resources resources = context.getResources();
        attributeset = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.CircularProgressBar, i, 0);
        i = attributeset.getColor(1, resources.getColor(0x7f080048));
        float f = attributeset.getDimension(3, resources.getDimension(0x7f090015));
        float f1 = attributeset.getFloat(6, Float.parseFloat(resources.getString(0x7f0c006c)));
        float f2 = attributeset.getFloat(7, Float.parseFloat(resources.getString(0x7f0c006d)));
        int j = attributeset.getResourceId(2, 0);
        int k = attributeset.getInteger(4, resources.getInteger(0x7f0a0002));
        int l = attributeset.getInteger(5, resources.getInteger(0x7f0a0003));
        attributeset.recycle();
        attributeset = null;
        if (j != 0)
        {
            attributeset = resources.getIntArray(j);
        }
        context = (new CircularProgressDrawable.a(context)).a(f1).b(f2).c(f).b(k).c(l);
        if (attributeset != null && attributeset.length > 0)
        {
            context.a(attributeset);
        } else
        {
            context.a(i);
        }
        setIndeterminateDrawable(context.a());
    }
}
