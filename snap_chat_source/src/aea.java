// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aea extends adL
{

    private final aeF f;

    public aea(adW adw, adZ adz, adU adu, aeF aef, aec aec1)
    {
        super(adw, adz, null, adu, aec1);
        if (adw.c != 6)
        {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (aef == null)
        {
            throw new NullPointerException("catches == null");
        } else
        {
            f = aef;
            return;
        }
    }

    public final void a(adN.b b1)
    {
        b1.a(this);
    }

    public final String b()
    {
        aec aec1 = super.a;
        String s = aec1.ag_();
        if (aec1 instanceof aey)
        {
            s = ((aey)aec1).f();
        }
        return (new StringBuilder()).append(s).append(" ").append(aeb.a(f)).toString();
    }

    public final aeF c()
    {
        return f;
    }
}
