// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bzr
    implements dfa
{

    private String a;
    private String b;

    bzr(bzo bzo, String s, String s1)
    {
        a = s;
        b = s1;
        super();
    }

    public final boolean a(Object obj)
    {
        obj = (cvl)obj;
        return !a.equals(((cvl) (obj)).a) && b.equals(((cvl) (obj)).c);
    }
}
