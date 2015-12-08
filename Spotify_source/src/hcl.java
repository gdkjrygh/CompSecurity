// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class hcl
    implements hcv
{

    private final hcv a;

    public hcl(hcv hcv1)
    {
        if (hcv1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = hcv1;
            return;
        }
    }

    public final hcx T_()
    {
        return a.T_();
    }

    public void a_(hch hch, long l)
    {
        a.a_(hch, l);
    }

    public void close()
    {
        a.close();
    }

    public void flush()
    {
        a.flush();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(a.toString()).append(")").toString();
    }
}
