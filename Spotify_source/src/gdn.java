// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gdn extends gcd
{

    private final fog a;

    public gdn(fog fog1)
    {
        a = fog1;
    }

    public final void a()
    {
        String s = a.toString().replace('\n', ';');
        akk.d().a.a("fragment-stack", s.substring(Math.max(s.length() - 512, 0)));
    }
}
