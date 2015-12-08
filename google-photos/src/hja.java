// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hja
    implements nug
{

    private boolean a;
    private hiy b;

    hja(hiy hiy1)
    {
        b = hiy1;
        super();
    }

    public final void b_(Object obj)
    {
        if (((enu)obj).b == hiy.b(b).a)
        {
            a = true;
            hiy.b(b, true);
        } else
        if (a)
        {
            a = false;
            hiy.b(b, false);
            return;
        }
    }
}
