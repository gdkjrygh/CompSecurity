// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;


final class limit extends limit
{

    private static final long serialVersionUID = 0xae25160e83344772L;
    final int limit;

    void truncate()
    {
        if (size > limit)
        {
            removeFirst();
        }
    }

    public (int i)
    {
        limit = i;
    }
}
