// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.content.Intent;
import android.os.AsyncTask;
import java.security.InvalidParameterException;

// Referenced classes of package p.cp:
//            b

public static class b
{

    private Intent a;
    private AsyncTask b;

    public boolean a()
    {
        return a != null;
    }

    public boolean b()
    {
        return b != null;
    }

    public Intent c()
    {
        return a;
    }

    public AsyncTask d()
    {
        return b;
    }

    public .String(Intent intent)
    {
        if (intent == null)
        {
            throw new InvalidParameterException("UriMatchAction: intent must not be null");
        } else
        {
            a = intent;
            return;
        }
    }

    public .String(AsyncTask asynctask)
    {
        if (asynctask == null)
        {
            throw new InvalidParameterException("UriMatchAction: asyncTask must not be null");
        } else
        {
            b = asynctask;
            return;
        }
    }
}
