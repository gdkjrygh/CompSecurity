// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class blr extends bsr
{

    private blq a;

    blr(blq blq1, String s)
    {
        a = blq1;
        super(s);
    }

    public final mtf a(String s)
    {
        s = blq.a(a);
        pye pye = a.c.c.p;
        String s1 = a.c.b.p;
        String s2 = a.c.b.X;
        return new cao(((cap) (s)).a, pye, s1, s2);
    }

    public final boolean a(String s, mue mue1)
    {
        if (mue1.c())
        {
            Log.w(blq.b(), "Failed to save cloud storyboard offline");
        }
        return true;
    }
}
