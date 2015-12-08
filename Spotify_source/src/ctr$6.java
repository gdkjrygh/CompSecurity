// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.String extends ctr
{

    public final boolean a(char c)
    {
        return Character.isLetterOrDigit(c);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    (String s)
    {
        super(s);
    }
}
