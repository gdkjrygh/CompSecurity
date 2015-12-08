// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeb extends adN
{

    private final aeF a;

    public aeb(adW adw, adZ adz, adU adu, aeF aef)
    {
        super(adw, adz, null, adu);
        if (adw.c != 6)
        {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (aef == null)
        {
            throw new NullPointerException("catches == null");
        } else
        {
            a = aef;
            return;
        }
    }

    public static String a(aeF aef)
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append("catch");
        int j = aef.a();
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(" ");
            stringbuffer.append(aef.a(i).ag_());
        }

        return stringbuffer.toString();
    }

    public final void a(adN.b b1)
    {
        b1.a(this);
    }

    public final String b()
    {
        return a(a);
    }

    public final aeF c()
    {
        return a;
    }
}
