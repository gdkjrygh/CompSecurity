// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


// Referenced classes of package kik.a.d:
//            o

public final class d extends o
{

    private String b;

    public d(byte abyte0[])
    {
        super(abyte0);
    }

    public final Object a()
    {
        return b;
    }

    public final void a(String s)
    {
        if (s != null)
        {
            b = s;
            a = null;
        }
    }

    public final String b()
    {
        return (String)b;
    }
}
