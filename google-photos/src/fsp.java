// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.View;
import org.lucasr.twowayview.TwoWayLayoutManager;

public final class fsp
    implements fss
{

    private final ntz a = new ntz(this);
    private final RecyclerView b;

    public fsp(RecyclerView recyclerview)
    {
        b = recyclerview;
    }

    public final int a(float f)
    {
        int i = (int)(c() * f);
        Object obj = b.e;
        if (obj instanceof adi)
        {
            ((adi)obj).a(i, 0);
            return i;
        }
        if (obj instanceof TwoWayLayoutManager)
        {
            ((TwoWayLayoutManager)obj).scrollToPositionWithOffset(i, 0);
            return i;
        } else
        {
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 35)).append("Cannot scroll using layout manager ").append(((String) (obj))).toString());
        }
    }

    public final nud a()
    {
        return a;
    }

    public final boolean b()
    {
        return b.d.a() >= 100;
    }

    public final float c()
    {
        return (float)b.d.a();
    }

    public final float d()
    {
        Object obj = b.e;
        afn afn2;
        int i;
        if (obj instanceof adi)
        {
            i = ((adi)obj).c();
        } else
        if (obj instanceof TwoWayLayoutManager)
        {
            i = ((TwoWayLayoutManager)obj).getFirstVisiblePosition();
        } else
        {
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 43)).append("Cannot measure offset using layout manager ").append(((String) (obj))).toString());
        }
        do
        {
            afn2 = b.b(i);
            if (afn2 == null || afn2.a.getBottom() >= b.getPaddingTop())
            {
                break;
            }
            i++;
        } while (true);
        float f;
        int j;
        int k;
        if (afn2 == null)
        {
            f = 0.0F;
        } else
        {
            f = (float)(-(afn2.a.getTop() - b.getPaddingTop())) / (float)afn2.a.getHeight();
        }
        k = 1;
        j = i + 1;
        for (afn afn1 = b.b(j); afn2 != null && afn1 != null && afn1.a.getTop() == afn2.a.getTop(); afn1 = b.b(j))
        {
            k++;
            j++;
        }

        return (float)i + f * (float)k;
    }

    public final void e()
    {
    }
}
