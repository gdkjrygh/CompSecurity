// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iwn extends iwp
{

    final iwm a;
    private iwj b;
    private Object c;

    iwn(iwm iwm1, iwj iwj1, Object obj)
    {
        a = iwm1;
        b = iwj1;
        c = obj;
        super(iwm1);
    }

    public final void a()
    {
        long l = noy.a();
        Object obj = b.a(c);
        if (a.a.a())
        {
            noy.a("data", c);
            noy.a("duration", l);
        }
        b.a(new iwo(this, obj));
    }
}
