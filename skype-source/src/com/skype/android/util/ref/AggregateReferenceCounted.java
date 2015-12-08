// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.ref;


// Referenced classes of package com.skype.android.util.ref:
//            ReferenceCounted

public class AggregateReferenceCounted
    implements ReferenceCounted
{

    private final ReferenceCounted a[];

    public transient AggregateReferenceCounted(ReferenceCounted areferencecounted[])
    {
        a = areferencecounted;
    }

    public void acquireOnce()
    {
        ReferenceCounted areferencecounted[] = a;
        int j = areferencecounted.length;
        for (int i = 0; i < j; i++)
        {
            areferencecounted[i].acquireOnce();
        }

    }

    public void releaseFully()
    {
        ReferenceCounted areferencecounted[] = a;
        int j = areferencecounted.length;
        for (int i = 0; i < j; i++)
        {
            areferencecounted[i].releaseFully();
        }

    }

    public void releaseOnce()
    {
        ReferenceCounted areferencecounted[] = a;
        int j = areferencecounted.length;
        for (int i = 0; i < j; i++)
        {
            areferencecounted[i].releaseOnce();
        }

    }
}
