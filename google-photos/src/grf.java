// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class grf
{

    int a;
    ekp b;
    ekp c;

    grf()
    {
        a = -1;
    }

    final gre a()
    {
        boolean flag;
        if (b != null || a >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Invalid media or index");
        return new gre(this);
    }
}
