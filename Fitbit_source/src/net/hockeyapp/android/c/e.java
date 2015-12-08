// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.c;

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;
import net.hockeyapp.android.b.a;

// Referenced classes of package net.hockeyapp.android.c:
//            d

public class e extends d
{

    private long h;

    public e(Context context, String s, a a1)
    {
        super(context, s, a1);
    }

    protected transient Long a(Void avoid[])
    {
        long l;
        try
        {
            l = a(new URL(b()), 6).getContentLength();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return Long.valueOf(0L);
        }
        return Long.valueOf(l);
    }

    protected void a(Long long1)
    {
        h = long1.longValue();
        if (h > 0L)
        {
            c.a(this);
            return;
        } else
        {
            c.a(this, Boolean.valueOf(false));
            return;
        }
    }

    protected transient void a(Integer ainteger[])
    {
    }

    public long c()
    {
        return h;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Long)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }
}
