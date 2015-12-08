// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class ags extends agr
{

    ags()
    {
    }

    public final void a(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
        if (flag && view.getTag(b.ck) == null)
        {
            float f4 = mk.s(view);
            int k = recyclerview.getChildCount();
            float f2 = 0.0F;
            for (int j = 0; j < k; j++)
            {
                View view1 = recyclerview.getChildAt(j);
                if (view1 == view)
                {
                    continue;
                }
                float f3 = mk.s(view1);
                if (f3 > f2)
                {
                    f2 = f3;
                }
            }

            mk.d(view, 1.0F + f2);
            view.setTag(b.ck, Float.valueOf(f4));
        }
        super.a(canvas, recyclerview, view, f, f1, i, flag);
    }

    public final void a(View view)
    {
        Object obj = view.getTag(b.ck);
        if (obj != null && (obj instanceof Float))
        {
            mk.d(view, ((Float)obj).floatValue());
        }
        view.setTag(b.ck, null);
        super.a(view);
    }
}
