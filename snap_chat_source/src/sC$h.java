// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public static final class lang.Long extends Long
{

    public final Long a(long l)
    {
        ((SB)a).a(Long.valueOf(l));
        return this;
    }

    public final Long.valueOf a(AT at)
    {
        Object obj = IY.a(at.ai());
        ((SB)a).a(((String) (obj)));
        ((SB)a).b(Boolean.valueOf(at.D()));
        ((SB)a).c(Boolean.valueOf(at.y()));
        obj = (SB)a;
        long l;
        if (at.as())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        ((SB) (obj)).b(Long.valueOf(l));
        return this;
    }

    public >(String s, List list, Long long1, Su su)
    {
        super(s, list, SNAP_STATE, long1, su);
    }
}
