// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class haf
    implements enh
{

    private hae a;

    haf(hae hae1)
    {
        a = hae1;
        super();
    }

    public final float a(int i)
    {
        if (!hae.a(a).c.b(i))
        {
            return -2F;
        }
        Object obj = hae.a(a).f(i);
        if (obj instanceof frj)
        {
            obj = (gaf)((frj)obj).b.b(gaf);
            if (obj == null || ((gaf) (obj)).k() <= 0 || ((gaf) (obj)).l() <= 0)
            {
                return 1.0F;
            } else
            {
                return (float)((gaf) (obj)).k() / (float)((gaf) (obj)).l();
            }
        } else
        {
            return -1F;
        }
    }
}
