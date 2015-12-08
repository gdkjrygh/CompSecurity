// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class alv
{

    public int a;

    public alv()
    {
        a = 0;
    }

    public alv(int i)
    {
        a = 0;
        c(i);
        c(i);
        a = i;
    }

    private void c(int i)
    {
        int j = ~a() & i;
        if (j == 0)
        {
            b(i);
            return;
        } else
        {
            String s = String.valueOf(Integer.toHexString(j));
            throw new alo((new StringBuilder(String.valueOf(s).length() + 33)).append("The option bit(s) 0x").append(s).append(" are invalid!").toString(), 103);
        }
    }

    protected abstract int a();

    public final void a(int i, boolean flag)
    {
        if (flag)
        {
            i = a | i;
        } else
        {
            i = a & ~i;
        }
        a = i;
    }

    protected final boolean a(int i)
    {
        return (a & i) != 0;
    }

    protected void b(int i)
    {
    }

    public boolean equals(Object obj)
    {
        return a == ((alv)obj).a;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        String s = String.valueOf(Integer.toHexString(a));
        if (s.length() != 0)
        {
            return "0x".concat(s);
        } else
        {
            return new String("0x");
        }
    }
}
