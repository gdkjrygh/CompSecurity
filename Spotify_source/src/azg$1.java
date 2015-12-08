// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private int a;
    private int b;
    private float c;
    private azg d;

    public final void run()
    {
        d.f.a(a, b, c);
    }

    (azg azg1, int i, int j, float f)
    {
        d = azg1;
        a = i;
        b = j;
        c = f;
        super();
    }
}
