// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            of, ot

public final class nw extends of
{

    public static final nw a = new nw(false);
    public static final nw b = new nw(true);

    private nw(boolean flag)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        super(j);
    }

    public static nw a(boolean flag)
    {
        if (flag)
        {
            return b;
        } else
        {
            return a;
        }
    }

    private boolean i()
    {
        return super.h != 0;
    }

    public final ot b()
    {
        return ot.a;
    }

    public final String e()
    {
        return "boolean";
    }

    public final String h_()
    {
        if (i())
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public final String toString()
    {
        if (i())
        {
            return "boolean{true}";
        } else
        {
            return "boolean{false}";
        }
    }

}
