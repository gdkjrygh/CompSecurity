// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class iwp
    implements Runnable
{

    private iwm a;

    iwp(iwm iwm)
    {
        a = iwm;
        super();
    }

    protected abstract void a();

    public final void run()
    {
        try
        {
            a();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
