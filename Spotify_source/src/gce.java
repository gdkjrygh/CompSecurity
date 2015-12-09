// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import com.spotify.music.internal.provider.SpotifyProvider;
import java.io.IOException;

public final class gce extends AsyncTask
{

    public static final String a;
    public static final String b;
    private Activity c;

    public gce(Activity activity)
    {
        c = activity;
    }

    private transient Long[] a()
    {
        Long along[];
        Object obj = new dvw(c.getApplicationContext());
        along = new Long[2];
        String s;
        try
        {
            s = ((dvw) (obj)).c();
        }
        catch (IOException ioexception)
        {
            cancel(false);
            return along;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        along[0] = Long.valueOf((new gfq(s)).b());
_L1:
        obj = ((dvw) (obj)).b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        along[1] = Long.valueOf((new gfq(((String) (obj)))).b());
        return along;
        along[0] = Long.valueOf(0x7fffffffffffffffL);
          goto _L1
        along[1] = Long.valueOf(0x7fffffffffffffffL);
        return along;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Long[])obj;
        de de1 = de.a(c);
        if (obj[0].longValue() < 0x200000L)
        {
            de1.a(new Intent(a));
        }
        if (obj[1].longValue() < 0x3200000L)
        {
            de1.a(new Intent(b));
        }
    }

    static 
    {
        a = (new StringBuilder()).append(SpotifyProvider.a).append(".broadcast.settings_low.error").toString();
        b = (new StringBuilder()).append(SpotifyProvider.a).append(".broadcast.cache_low.error").toString();
    }
}
