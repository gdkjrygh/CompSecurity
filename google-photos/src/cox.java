// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cox
    implements cpd
{

    cox()
    {
    }

    public final Object a(cwc cwc1)
    {
        if (cwc1.v != null)
        {
            cwd cwd1 = cwc1.v;
            cwc1 = new cxf(cwc1.a);
            cwc1.b = cwd1.a;
            cwc1.c = cwd1.b;
            return cwc1;
        } else
        {
            return null;
        }
    }

    public final void a(Object obj, cwc cwc1)
    {
        obj = (cxf)obj;
        cwd cwd1 = new cwd();
        cwd1.a = ((cxf) (obj)).b;
        cwd1.b = ((cxf) (obj)).c;
        cwc1.v = cwd1;
    }
}
