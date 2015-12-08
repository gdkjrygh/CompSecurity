// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.now.NowAuthService;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class dzl extends AsyncTask
{

    private dzk a;

    private dzl(dzk dzk1)
    {
        a = dzk1;
        super();
    }

    public dzl(dzk dzk1, byte byte0)
    {
        this(dzk1);
    }

    private transient dzf a()
    {
        dzi dzi1 = new dzi(NowAuthService.a(a.c, dzo.b().a()));
        return dzi1;
        Object obj;
        obj;
_L2:
        Logger.b(((Throwable) (obj)), "Failed to get auth code from Google Now auth service", new Object[0]);
        return new dzg();
        obj;
        Logger.b(((Throwable) (obj)), "HaveTokenAlreadyException, revoking current token", new Object[0]);
        return new dzh(((com.google.android.now.NowAuthService.HaveTokenAlreadyException) (obj)).a());
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (dzf)obj;
        if (((dzf) (obj)).b())
        {
            Logger.b("Failed to get auth code from NowAuthService", new Object[0]);
            a.a.f();
            return;
        }
        if (((dzf) (obj)).a())
        {
            a.a.b(((dzf) (obj)).c());
            return;
        } else
        {
            a.a.a(((dzf) (obj)).c());
            return;
        }
    }
}
