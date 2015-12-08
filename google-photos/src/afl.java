// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class afl
{

    public int a;
    public jk b;
    public jk c;
    public jk d;
    public final List e = new ArrayList();
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    public afl()
    {
        a = -1;
        b = new jk();
        c = new jk();
        d = new jk();
        f = 0;
        g = 0;
        h = 0;
        i = false;
        j = false;
        k = false;
        l = false;
    }

    final void a(afn afn1)
    {
        b.remove(afn1);
        c.remove(afn1);
        if (d == null) goto _L2; else goto _L1
_L1:
        jk jk1;
        int i1;
        jk1 = d;
        i1 = jk1.size() - 1;
_L7:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (afn1 != jk1.c(i1)) goto _L5; else goto _L4
_L4:
        jk1.d(i1);
_L2:
        e.remove(afn1.a);
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

    public final boolean a()
    {
        return a != -1;
    }

    public final int b()
    {
        if (j)
        {
            return g - h;
        } else
        {
            return f;
        }
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
}
