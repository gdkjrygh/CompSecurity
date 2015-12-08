// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class lang.String extends String
{

    private char c;
    private char d;

    public final boolean a(char c1)
    {
        return c <= c1 && c1 <= d;
    }

    >(String s, char c1, char c2)
    {
        c = c1;
        d = c2;
        super(s);
    }
}
