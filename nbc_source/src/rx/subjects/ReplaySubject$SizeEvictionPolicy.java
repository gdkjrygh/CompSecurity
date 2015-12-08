// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;


// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class maxSize
    implements maxSize
{

    final int maxSize;

    public void evict(maxSize maxsize)
    {
        for (; maxsize.maxSize() > maxSize; maxsize.t()) { }
    }

    public void evictFinal(t t)
    {
        for (; t.t() > maxSize + 1; t.t()) { }
    }

    public boolean test(Object obj, long l)
    {
        return false;
    }

    public (int i)
    {
        maxSize = i;
    }
}
