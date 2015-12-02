// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class bzn
{

    private static final String a = bzn.getSimpleName();
    private bzw b;
    private Object c;
    private bzt d;

    public bzn()
    {
    }

    private void b(bzt bzt1)
    {
        bzt1.a(c);
        boolean flag;
        if (!(c instanceof bwb) && !(c instanceof bwf))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = null;
        if (flag)
        {
            d = null;
        }
    }

    final void a()
    {
        if (c == null)
        {
            c = "success";
        }
        if (d != null)
        {
            b(d);
        }
    }

    public final void a(bzt bzt1)
    {
        if (c != null)
        {
            b(bzt1);
            return;
        }
        if (b != null)
        {
            bzt1.a(b);
            b = null;
            d = null;
            return;
        } else
        {
            d = bzt1;
            return;
        }
    }

    public final void a(bzw bzw)
    {
        if (d != null)
        {
            d.a(bzw);
            return;
        } else
        {
            b = bzw;
            return;
        }
    }

    final void a(Object obj)
    {
        c = obj;
    }

    public final void b()
    {
        d = null;
    }

}
