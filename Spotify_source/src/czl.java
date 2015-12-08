// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class czl
    implements Runnable
{

    volatile boolean a;
    final czj b;

    public czl(czj czj1)
    {
        b = czj1;
        super();
        a = true;
    }

    public final void run()
    {
        if (!a)
        {
            android.os.Message message = czj.a(b).obtainMessage(1);
            czj.a(b).sendMessage(message);
        }
        czj.a(b).postDelayed(this, 30000L);
    }
}
