// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jwk
    implements Runnable
{

    private jwh a;
    private int b;

    jwk(jwj jwj, jwh jwh1, int i)
    {
        a = jwh1;
        b = i;
        super();
    }

    public final void run()
    {
        if (jwh.c(a) != null)
        {
            jwh.c(a).a(b);
        }
    }
}
