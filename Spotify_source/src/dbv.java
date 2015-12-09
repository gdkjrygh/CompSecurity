// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dbv
    implements Cloneable
{

    private String a;
    private String b;
    private String c;

    public dbv()
    {
        a = null;
        b = null;
        c = null;
    }

    protected Object clone()
    {
        dbv dbv1 = new dbv();
        dbv1.a = a;
        dbv1.b = b;
        dbv1.c = c;
        return dbv1;
    }
}
