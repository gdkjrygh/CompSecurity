// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;

public final class agc extends agb
{

    public long d;

    public agc(Context context, String s, afS afs)
    {
        super(context, s, afs);
    }

    protected final transient Long a()
    {
        long l;
        try
        {
            l = a(new URL(b()), 6).getContentLength();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return Long.valueOf(0L);
        }
        return Long.valueOf(l);
    }

    protected final void a(Long long1)
    {
        d = long1.longValue();
        if (d > 0L)
        {
            b.a(this);
            return;
        } else
        {
            b.a(Boolean.valueOf(false));
            return;
        }
    }

    protected final transient void a(Integer ainteger[])
    {
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        a((Long)obj);
    }

    protected final volatile void onProgressUpdate(Object aobj[])
    {
    }
}
