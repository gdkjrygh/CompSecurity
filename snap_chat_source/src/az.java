// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class az
    implements Cloneable
{

    public static final Object a = new Object();
    public boolean b;
    public long c[];
    public Object d[];
    public int e;

    public az()
    {
        this((byte)0);
    }

    private az(byte byte0)
    {
        byte0 = aw.b(10);
        c = new long[byte0];
        d = new Object[byte0];
        e = 0;
    }

    private az a()
    {
        Object obj;
        try
        {
            obj = (az)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.c = (long[])c.clone();
            obj.d = (Object[])((Object []) (d)).clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((az) (obj));
        }
        return ((az) (obj));
    }

    public final Object clone()
    {
        return a();
    }

    public final String toString()
    {
        if (e <= 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(e * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < e) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(c[i]);
            stringbuilder.append('=');
            Object obj = d[i];
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
