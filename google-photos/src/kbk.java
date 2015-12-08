// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kbk extends kbf
{

    private char b;
    private char c;

    kbk(char c1, char c2)
    {
        b = c1;
        c = c2;
        super();
    }

    public final boolean a(char c1)
    {
        return b <= c1 && c1 <= c;
    }
}
