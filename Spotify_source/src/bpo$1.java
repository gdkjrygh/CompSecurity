// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private bpm a;
    private int b;

    public final void run()
    {
        if (bpm.d(a) != null)
        {
            bpm.d(a).a(b);
        }
    }

    (bpm bpm1, int i)
    {
        a = bpm1;
        b = i;
        super();
    }
}
