// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ain
    implements Runnable
{

    private String a;
    private aif b;

    ain(aif aif1, String s)
    {
        b = aif1;
        a = s;
        super();
    }

    public final void run()
    {
        b.d(a);
    }
}
