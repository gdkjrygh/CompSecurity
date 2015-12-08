// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.reduce.ImageReduceFilter;

public final class ale
    implements ajq
{

    private ImageReduceFilter a;

    public ale(ImageReduceFilter imagereducefilter)
    {
        a = imagereducefilter;
        super();
    }

    public final void a(ajo ajo, ahs ahs1)
    {
        int i = ((Integer)ahs1.d().m()).intValue();
        if (i != ImageReduceFilter.b(a))
        {
            ImageReduceFilter.b(a, i);
            ImageReduceFilter.a(a, true);
        }
    }
}
