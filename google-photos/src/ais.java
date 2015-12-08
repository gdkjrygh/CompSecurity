// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ais
    implements ain
{

    private String a;
    private String b;
    private Object c;

    public ais(String s, String s1, Object obj)
    {
        a = s;
        b = s1;
        c = obj;
    }

    public final void a(aio aio1)
    {
        if (c instanceof ait)
        {
            String s = ((ait)c).a;
            aio1.b.a(s, a, b);
            return;
        } else
        {
            aio1.b.a(c, a, b);
            return;
        }
    }
}
