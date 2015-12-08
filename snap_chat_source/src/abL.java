// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class abL
{

    int b;
    final abN c;
    final adZ d;
    public final adU e;

    public abL(abN abn, adZ adz, adU adu)
    {
        if (abn == null)
        {
            throw new NullPointerException("opcode == null");
        }
        if (adz == null)
        {
            throw new NullPointerException("position == null");
        }
        if (adu == null)
        {
            throw new NullPointerException("registers == null");
        } else
        {
            b = -1;
            c = abn;
            d = adz;
            e = adu;
            return;
        }
    }

    public static acc a(adZ adz, adS ads, adS ads1)
    {
        boolean flag = true;
        abN abn;
        int i;
        boolean flag1;
        if (ads.e() != 1)
        {
            flag = false;
        }
        flag1 = ads.b().f();
        i = ads.a;
        if ((ads1.a | i) < 16)
        {
            if (flag1)
            {
                abn = abO.i;
            } else
            if (flag)
            {
                abn = abO.c;
            } else
            {
                abn = abO.f;
            }
        } else
        if (i < 256)
        {
            if (flag1)
            {
                abn = abO.j;
            } else
            if (flag)
            {
                abn = abO.d;
            } else
            {
                abn = abO.g;
            }
        } else
        if (flag1)
        {
            abn = abO.k;
        } else
        if (flag)
        {
            abn = abO.e;
        } else
        {
            abn = abO.h;
        }
        return new acc(abn, adz, adU.a(ads, ads1));
    }

    public abstract abL a(abN abn);

    public abstract abL a(adU adu);

    protected abstract String a();

    public abstract void a(aeG aeg);

    public abstract abL c(int i);

    public final boolean c()
    {
        return b >= 0;
    }

    public final int d()
    {
        if (b < 0)
        {
            throw new RuntimeException("address not yet known");
        } else
        {
            return b;
        }
    }

    public final String e()
    {
        if (b != -1)
        {
            return String.format("%04x", new Object[] {
                Integer.valueOf(b)
            });
        } else
        {
            return aeO.a(System.identityHashCode(this));
        }
    }

    public abstract int f();

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(e());
        stringbuffer.append(' ');
        stringbuffer.append(d);
        stringbuffer.append(": ");
        stringbuffer.append(adC.a(c.a));
        boolean flag = false;
        if (((aeN) (e)).K.length != 0)
        {
            stringbuffer.append(e.a(" ", ", ", null));
            flag = true;
        }
        String s = a();
        if (s != null)
        {
            if (flag)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(' ');
            stringbuffer.append(s);
        }
        return stringbuffer.toString();
    }
}
