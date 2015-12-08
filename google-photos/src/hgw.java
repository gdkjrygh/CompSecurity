// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class hgw extends aev
{

    private final int a;

    public hgw(int i)
    {
        a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview)
    {
        rect.set(0, 0, 0, a);
    }
}
