// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class dzn extends AsyncTask
{

    private dzn()
    {
    }

    public dzn(byte byte0)
    {
        this();
    }

    private static transient Void a(String as[])
    {
        Object obj = as[0];
        as = new gro();
        obj = (new grr()).a(String.format("https://accounts.google.com/o/oauth2/revoke?token=%s", new Object[] {
            dzq.a(((String) (obj)))
        })).b();
        try
        {
            as.a(((grq) (obj))).a().a();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Logger.b("Failed to invalidate token", new Object[0]);
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }
}
