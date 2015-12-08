// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.PriorityQueue;

public final class Jl extends PriorityQueue
{

    public Jl()
    {
    }

    public final boolean offer(Object obj)
    {
        if (contains(obj))
        {
            return false;
        } else
        {
            return super.offer(obj);
        }
    }
}
