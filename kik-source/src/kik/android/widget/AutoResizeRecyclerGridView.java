// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

// Referenced classes of package kik.android.widget:
//            b

public class AutoResizeRecyclerGridView extends RecyclerView
{

    android.support.v7.widget.GridLayoutManager.b h;
    private int i;
    private int j;
    private GridLayoutManager k;

    public AutoResizeRecyclerGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new b(this);
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, new int[] {
                0x1010117, 0x7f010001
            });
            i = context.getDimensionPixelSize(0, -1);
            j = context.getInt(1, 0);
            context.recycle();
        }
        k = new GridLayoutManager();
        a(k);
    }

    static int a(AutoResizeRecyclerGridView autoresizerecyclergridview)
    {
        return autoresizerecyclergridview.j;
    }

    protected void onMeasure(int l, int i1)
    {
        super.onMeasure(l, i1);
        if (i > 0)
        {
            l = Math.max(1, getMeasuredWidth() / i);
            k.a(l);
            k.a(h);
        }
    }
}
