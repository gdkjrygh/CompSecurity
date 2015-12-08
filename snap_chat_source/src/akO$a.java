// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class b
    implements ang.Object
{

    private String a;
    private akr b;

    public final String toString()
    {
        akT akt = akT.e;
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(akT.a(a));
        stringbuffer.append("(");
        stringbuffer.append(((akR)b).b(akt));
        stringbuffer.append(")");
        return stringbuffer.toString();
    }

    public (String s, akr akr)
    {
        a = s;
        b = akr;
    }
}
