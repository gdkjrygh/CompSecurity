// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import com.facebook.Session;

public final class apa extends AsyncTask
{

    private final String a;
    private final Context b;
    private Session c;

    public apa(Session session, String s, Context context)
    {
        c = session;
        super();
        a = s;
        b = context.getApplicationContext();
    }

    private transient Void a()
    {
        try
        {
            aph.a(b, a, true);
        }
        catch (Exception exception)
        {
            arp.a("Facebook-publish", exception);
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        synchronized (c)
        {
            Session.f(c);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
