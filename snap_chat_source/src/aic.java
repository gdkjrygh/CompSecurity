// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class aic
    implements ain
{

    private final ain a;

    public aic(ain ain1)
    {
        if (ain1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = ain1;
            return;
        }
    }

    public void a_(ahX ahx, long l)
    {
        a.a_(ahx, l);
    }

    public final aip aa_()
    {
        return a.aa_();
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
