// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class mkd
{

    private static final ThreadLocal a = new mke();

    public mkd()
    {
    }

    public static mkd a()
    {
        return (mkd)a.get();
    }

    public abstract void a(mkf mkf);

    public abstract void b(mkf mkf);

}
