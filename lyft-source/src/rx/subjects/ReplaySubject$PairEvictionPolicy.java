// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;


final class second
    implements second
{

    final  first;
    final  second;

    public void evict(second second1)
    {
        first.t(second1);
        second.t(second1);
    }

    public void evictFinal(t t)
    {
        first.tFinal(t);
        second.tFinal(t);
    }

    public boolean test(Object obj, long l)
    {
        return first.(obj, l) || second.(obj, l);
    }

    public ( ,  1)
    {
        first = ;
        second = 1;
    }
}
