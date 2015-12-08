// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ami
    implements Runnable
{

    private amh a;

    ami(amh amh1)
    {
        a = amh1;
        super();
    }

    public final void run()
    {
        amh.a(a).a(a);
    }
}
