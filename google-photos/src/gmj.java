// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

public final class gmj extends View
{

    public gmj(Context context)
    {
        super(context);
    }

    public final boolean hasOverlappingRendering()
    {
        return false;
    }

    protected final void onMeasure(int i, int j)
    {
        i = resolveSize(0, i);
        setMeasuredDimension(i, resolveSize(i, j));
    }
}
