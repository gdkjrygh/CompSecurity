// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class IG
{

    public long mEnd;
    private long mStart;

    public IG()
    {
    }

    public IG(long l, long l1)
    {
        a(l, l1);
    }

    public final void a(long l, long l1)
    {
        mStart = l;
        mEnd = l1;
    }

    public final boolean a()
    {
        return mStart > 0L;
    }

    public final boolean a(IG ig)
    {
        if (mStart != ig.mStart) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (mStart >= ig.mStart)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mEnd > ig.mStart) goto _L1; else goto _L3
_L3:
        return false;
        if (ig.mEnd > mStart) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final String toString()
    {
        return (new StringBuilder("[start: ")).append(mStart).append(", end: ").append(mEnd).append(", duration: ").append(mEnd - mStart).append("]").toString();
    }
}
