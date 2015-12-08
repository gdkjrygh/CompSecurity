// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends cxn
{

    private String b;

    public final String a()
    {
        return b;
    }

    public final void a(String s)
    {
        throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
    }

    (cxn cxn1, String s)
    {
        b = s;
        super(cxn1.a, (byte)0);
    }
}
