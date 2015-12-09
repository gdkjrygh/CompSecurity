// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class hcm
    implements hcw
{

    private final hcw a;

    public hcm(hcw hcw1)
    {
        if (hcw1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = hcw1;
            return;
        }
    }

    public final hcx T_()
    {
        return a.T_();
    }

    public long a(hch hch, long l)
    {
        return a.a(hch, l);
    }

    public void close()
    {
        a.close();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(a.toString()).append(")").toString();
    }
}
