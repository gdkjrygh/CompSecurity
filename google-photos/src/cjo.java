// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class cjo
{

    public final cjg a;
    public final List b;
    public final ciu c;
    public final cnn d;

    public cjo(cjg cjg1, List list, ciu ciu1, cnn cnn1)
    {
        a = (cjg)b.a(cjg1, "sequencePollable", null);
        b = (List)b.a(list, "resamplers", null);
        c = (ciu)b.a(ciu1, "seeker", null);
        d = (cnn)b.a(cnn1, "clipSequence", null);
    }
}
