// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

class LayoutState
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    LayoutState()
    {
        e = 0;
        f = 0;
    }

    View a(RecyclerView.Recycler recycler)
    {
        recycler = recycler.b(b);
        b = b + c;
        return recycler;
    }

    boolean a(RecyclerView.State state)
    {
        return b >= 0 && b < state.e();
    }

    public String toString()
    {
        return (new StringBuilder()).append("LayoutState{mAvailable=").append(a).append(", mCurrentPosition=").append(b).append(", mItemDirection=").append(c).append(", mLayoutDirection=").append(d).append(", mStartLine=").append(e).append(", mEndLine=").append(f).append('}').toString();
    }
}
