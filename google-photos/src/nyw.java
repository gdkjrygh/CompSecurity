// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import org.chromium.net.UserAgent;

public final class nyw extends nyq
{

    private final nxq a;

    public nyw(Context context, String s, String s1, nxq nxq)
    {
        super(context, s, s1);
        a = nxq;
    }

    protected final String a(Context context)
    {
        context = new StringBuilder(UserAgent.a(context));
        context.append("; G+ SDK/");
        nxq nxq = a;
        context.append("1.0.0");
        context.append(';');
        return context.toString();
    }

    public final Map a(String s)
    {
        s = super.a(s);
        Object obj = a;
        obj = String.valueOf(Uri.encode("0"));
        obj = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 35)).append("http://").append(((String) (obj))).append(".apps.googleusercontent.com/").toString()).buildUpon();
        if (false)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("client_id", null);
        }
        if (false)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("api_key", null);
        }
        if (false)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("pkg", null);
        }
        s.put("X-Container-Url", ((android.net.Uri.Builder) (obj)).build().toString());
        return s;
    }

    public final boolean b(String s)
    {
        return false;
    }
}
