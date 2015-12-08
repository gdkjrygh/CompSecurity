// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kbh extends kbf
{

    private char b;

    kbh(char c)
    {
        b = c;
        super();
    }

    public final kbf a(kbf kbf1)
    {
        if (kbf1.a(b))
        {
            return kbf1;
        } else
        {
            return super.a(kbf1);
        }
    }

    public final boolean a(char c)
    {
        return c == b;
    }
}
