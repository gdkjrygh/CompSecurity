// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class ng.String extends ng
{

    final boolean a(ng ng, String s, fg fg1)
    {
        if (!fg1.b(ng) || !ff.a(ng, s, fg1) || ff.a(ng, s) || !ff.a(ng, fg1))
        {
            return false;
        } else
        {
            return ff.a(ng, s, fg1, new ff.a() {

                public final boolean a(fg fg2, fi.a a1, StringBuilder stringbuilder, String as[])
                {
                    return ff.a(a1, stringbuilder, as);
                }

            });
        }
    }

    ng.String(String s)
    {
        super(s, 3, (byte)0);
    }
}
