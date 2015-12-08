// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aou
    implements anO
{

    private final anO a;

    aou(anO ano)
    {
        a = ano;
    }

    public final anO.a a(anO.b b1)
    {
        try
        {
            b1 = a.a(b1);
        }
        // Misplaced declaration of an exception variable
        catch (anO.b b1)
        {
            anK.a(b1);
            return null;
        }
        return b1;
    }

    public final void a(int i)
    {
        try
        {
            a.a(i);
            return;
        }
        catch (Exception exception)
        {
            anK.a(exception);
        }
    }

    public final void a(anO.b b1, anO.a a1)
    {
        try
        {
            a.a(b1, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (anO.b b1)
        {
            anK.a(b1);
        }
    }

    public final void b(anO.b b1)
    {
        try
        {
            a.b(b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (anO.b b1)
        {
            anK.a(b1);
        }
    }
}
