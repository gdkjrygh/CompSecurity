// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abm
{

    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public abm()
    {
        a = -1;
        b = 0;
        c = 0;
        d = 0;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
    }

    public final boolean a()
    {
        return f;
    }

    public final int b()
    {
        if (f)
        {
            return c - d;
        } else
        {
            return b;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("State{mTargetPosition=")).append(a).append(", mData=").append(null).append(", mItemCount=").append(b).append(", mPreviousLayoutItemCount=").append(c).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(d).append(", mStructureChanged=").append(e).append(", mInPreLayout=").append(f).append(", mRunSimpleAnimations=").append(g).append(", mRunPredictiveAnimations=").append(h).append('}').toString();
    }
}
