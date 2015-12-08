// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;

final class nfk
    implements Runnable
{

    private String a;
    private nfj b;

    nfk(nfj nfj1, String s)
    {
        b = nfj1;
        a = s;
        super();
    }

    public final void run()
    {
        try
        {
            nfj.a(b);
            nfj.b(b).println(nfj.a(b, a));
            nfj.b(b).flush();
            nfj.c(b);
            return;
        }
        catch (IOException ioexception)
        {
            Log.e(nfj.a(), "unable to write to file log", ioexception);
        }
    }
}
