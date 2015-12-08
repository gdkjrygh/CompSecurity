// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class bxv extends bsr
{

    private bxr a;

    bxv(bxr bxr1, String s)
    {
        a = bxr1;
        super(s);
    }

    public final mtf a(String s)
    {
        bxr.e(a);
        cyt cyt = bxr.f(a).c(bxr.b(a));
        bxr.a(a, new bxn(s, cyt));
        return bxr.g(a);
    }

    public final boolean a(String s, mue mue1)
    {
        c.a(bxr.g(a), "generateStoryboardTask", null);
        if (mue1.c() || bxr.g(a).a == null)
        {
            Log.e(bxr.b(), "GenerateStoryboardTask failed", mue1.c);
            return false;
        } else
        {
            bxr.a(a, bxr.g(a).a);
            return true;
        }
    }
}
