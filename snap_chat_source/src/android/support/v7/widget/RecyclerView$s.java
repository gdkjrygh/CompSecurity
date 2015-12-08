// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import av;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class l
{

    int a;
    av b;
    av c;
    av d;
    final List e = new ArrayList();
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;

    public final int a()
    {
        if (j)
        {
            return g - h;
        } else
        {
            return f;
        }
    }

    final void a(f f1)
    {
        b.remove(f1);
        c.remove(f1);
        if (d == null) goto _L2; else goto _L1
_L1:
        av av1;
        int i1;
        av1 = d;
        i1 = av1.size() - 1;
_L7:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (f1 != av1.c(i1)) goto _L5; else goto _L4
_L4:
        av1.d(i1);
_L2:
        e.remove(f1.a);
        return;
_L5:
        i1--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final void a(View view)
    {
        e.remove(view);
    }

    final void b(View view)
    {
        if (!e.contains(view))
        {
            e.add(view);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("State{mTargetPosition=")).append(a).append(", mPreLayoutHolderMap=").append(b).append(", mPostLayoutHolderMap=").append(c).append(", mData=").append(null).append(", mItemCount=").append(f).append(", mPreviousLayoutItemCount=").append(g).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(h).append(", mStructureChanged=").append(i).append(", mInPreLayout=").append(j).append(", mRunSimpleAnimations=").append(k).append(", mRunPredictiveAnimations=").append(l).append('}').toString();
    }

    public ()
    {
        a = -1;
        b = new av();
        c = new av();
        d = new av();
        f = 0;
        g = 0;
        h = 0;
        i = false;
        j = false;
        k = false;
        l = false;
    }
}
