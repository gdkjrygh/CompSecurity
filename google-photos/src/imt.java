// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class imt extends irq
{

    public static final oni a = new oni("debug.stories.wireframe");
    private final boolean k;
    private final isx l;

    public final isx a()
    {
        if (k)
        {
            return l;
        } else
        {
            return super.a();
        }
    }

    public final pfp a(int i)
    {
        if (k)
        {
            return super.a(i);
        }
        if (i % 2 == 0)
        {
            return e.h[f].c[i / 2];
        }
        pfp pfp1;
        pfp1 = e.h[f].c[(i - 1) / 2];
        pfp1 = (pfp)pfp.a(new pfp(), pfp.a(pfp1));
        pfp1.a = 2;
        pfp1.c = new pfo();
        pfp1.c.a = 0;
        pfp1.b.c = Float.valueOf(0.0F);
        return pfp1;
        qlv qlv2;
        qlv2;
_L2:
        Log.e("DebugStoryLayoutAdapter", "Unable to deserialize LayoutElement.  This should not happen because the object was previously serialized as a byte array.");
        return pfp1;
        qlv qlv1;
        qlv1;
        qlv1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int getCount()
    {
        int j = super.getCount();
        int i;
        if (k)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        return i * j;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (k)
        {
            view = a(i);
            isq isq1 = new isq(super.c, view);
            isb isb = a(view, null);
            isq1.setTag(s.bz, isb);
            isq1.addView(a(view, null, viewgroup));
            return isq1;
        } else
        {
            return super.getView(i, view, viewgroup);
        }
    }

}
