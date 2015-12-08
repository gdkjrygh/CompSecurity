// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cuj
    implements nfp
{

    public volatile long a;
    public volatile long b;
    public volatile cvh c;

    cuj()
    {
    }

    public final void a(nfn nfn1)
    {
        nfn1.a("Playback loop at %d us. Last seek was to %d us.", new Object[] {
            Long.valueOf(b), Long.valueOf(a)
        });
        if (c != null)
        {
            c.a(nfn1);
        }
    }
}
