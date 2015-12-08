// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class akO
    implements akq
{
    static final class a
        implements akp.a
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

        public a(String s, akr akr)
        {
            a = s;
            b = akr;
        }
    }


    private Object a;
    private akp.a b;

    public akO(akp.a a1, Object obj)
    {
        b = a1;
        a = obj;
    }

    public final Object a()
    {
        return a;
    }

    public final String toString()
    {
        return b.toString();
    }
}
