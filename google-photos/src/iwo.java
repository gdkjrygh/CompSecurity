// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iwo
    implements Runnable
{

    private Object a;
    private iwn b;

    iwo(iwn iwn1, Object obj)
    {
        b = iwn1;
        a = obj;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
