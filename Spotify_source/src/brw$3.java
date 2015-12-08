// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends brw
{

    private char b;

    public final brw a(brw brw1)
    {
        if (brw1.a(b))
        {
            return brw1;
        } else
        {
            return super.a(brw1);
        }
    }

    public final boolean a(char c)
    {
        return c == b;
    }

    (char c)
    {
        b = c;
        super();
    }
}
