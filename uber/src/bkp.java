// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bkp
    implements bkr
{

    private final bmj a;
    private final boolean b;
    private final Class c;
    private final bkl d;
    private final bkc e;

    private bkp(Object obj, bmj bmj1, boolean flag)
    {
        bkl bkl1;
        boolean flag1;
        if (obj instanceof bkl)
        {
            bkl1 = (bkl)obj;
        } else
        {
            bkl1 = null;
        }
        d = bkl1;
        if (obj instanceof bkc)
        {
            obj = (bkc)obj;
        } else
        {
            obj = null;
        }
        e = ((bkc) (obj));
        if (d != null || e != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bkx.a(flag1);
        a = bmj1;
        b = flag;
        c = null;
    }

    bkp(Object obj, bmj bmj1, boolean flag, byte byte0)
    {
        this(obj, bmj1, flag);
    }

    public final bkq create(bjw bjw, bmj bmj1)
    {
        boolean flag;
        if (a != null)
        {
            if (a.equals(bmj1) || b && a.getType() == bmj1.getRawType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = c.isAssignableFrom(bmj1.getRawType());
        }
        if (flag)
        {
            return new bko(d, e, bjw, bmj1, this, (byte)0);
        } else
        {
            return null;
        }
    }
}
