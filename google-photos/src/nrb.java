// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class nrb
{

    Integer a;
    Integer b;
    Boolean c;
    Boolean d;
    Boolean e;

    public nrb()
    {
    }

    public nra a()
    {
        String s2 = "";
        if (a == null)
        {
            s2 = String.valueOf("").concat(" iconResourceId");
        }
        String s = s2;
        if (b == null)
        {
            s = String.valueOf(s2).concat(" appNameResourceId");
        }
        s2 = s;
        if (c == null)
        {
            s2 = String.valueOf(s).concat(" ringtoneEnabled");
        }
        s = s2;
        if (d == null)
        {
            s = String.valueOf(s2).concat(" vibrate");
        }
        s2 = s;
        if (e == null)
        {
            s2 = String.valueOf(s).concat(" pushEnabled");
        }
        if (!s2.isEmpty())
        {
            String s1 = String.valueOf(s2);
            if (s1.length() != 0)
            {
                s1 = "Missing required properties:".concat(s1);
            } else
            {
                s1 = new String("Missing required properties:");
            }
            throw new IllegalStateException(s1);
        } else
        {
            return new nqy(a, b, null, null, c.booleanValue(), d.booleanValue(), null, e.booleanValue());
        }
    }

    public nrb a(Integer integer)
    {
        a = integer;
        return this;
    }

    public nrb a(boolean flag)
    {
        c = Boolean.valueOf(true);
        return this;
    }

    public nrb b(Integer integer)
    {
        b = integer;
        return this;
    }

    public nrb b(boolean flag)
    {
        e = Boolean.valueOf(true);
        return this;
    }

    public nrb c(boolean flag)
    {
        d = Boolean.valueOf(true);
        return this;
    }
}
