// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class dch
    implements Runnable
{

    private dcg a;

    dch(dcg dcg1)
    {
        a = dcg1;
        super();
    }

    public final void run()
    {
        dcg.a(a).clear();
        dcg.a(a, 0);
        dcg.a(a, null);
    }
}
