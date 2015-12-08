// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class nit> extends eG
{

    private eG a;

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return ((java.util.ntry)a.next()).getValue();
    }

    >(eG eg)
    {
        a = eg;
        super();
    }
}
