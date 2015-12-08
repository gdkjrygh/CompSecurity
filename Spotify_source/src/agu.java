// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class agu extends agw
    implements ahw
{

    public agu(String s)
    {
        super(s);
        b.b("InternalRawImage(%s)", new Object[] {
            s
        });
    }

    public void a(byte abyte0[])
    {
        b.b("setImage(%s)", new Object[] {
            abyte0
        });
        d.a(c, abyte0);
    }
}
