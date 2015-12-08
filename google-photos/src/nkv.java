// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.util.Log;

public class nkv extends ContentObserver
{

    public boolean a;
    public Context b;

    public nkv(Context context)
    {
        super(null);
        b = context;
    }

    public void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public void onChange(boolean flag, Uri uri)
    {
        if (uri != null && uri.getQueryParameter("blocking") != null)
        {
            if (Log.isLoggable("MediaObserver", 3))
            {
                uri = String.valueOf(uri);
                (new StringBuilder(String.valueOf(uri).length() + 14)).append("ignoring uri: ").append(uri);
            }
            return;
        } else
        {
            ((nks)olm.a(b, nks)).a(false);
            return;
        }
    }
}
