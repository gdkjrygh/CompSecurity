// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.reduce.ImageReduceFilter;

public final class ald
    implements ajq
{

    private ImageReduceFilter a;

    public ald(ImageReduceFilter imagereducefilter)
    {
        a = imagereducefilter;
        super();
    }

    public final void a(ajo ajo, ahs ahs1)
    {
        int i = ((Integer)ahs1.d().m()).intValue();
        if (i != ImageReduceFilter.a(a))
        {
            ImageReduceFilter.a(a, i);
            ImageReduceFilter.a(a, true);
        }
    }
}
