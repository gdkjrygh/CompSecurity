// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.c;

import android.net.Uri;

// Referenced classes of package com.facebook.http.c:
//            i

public class j
    implements i
{

    private final String a;
    private final boolean b;

    public j(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public android.net.Uri.Builder a()
    {
        if (b)
        {
            return Uri.parse((new StringBuilder()).append("https://api.").append(a).toString()).buildUpon();
        } else
        {
            return Uri.parse((new StringBuilder()).append("http://api.").append(a).toString()).buildUpon();
        }
    }

    public android.net.Uri.Builder b()
    {
        if (b)
        {
            return Uri.parse((new StringBuilder()).append("https://graph.").append(a).toString()).buildUpon();
        } else
        {
            return Uri.parse((new StringBuilder()).append("http://graph.").append(a).toString()).buildUpon();
        }
    }

    public android.net.Uri.Builder c()
    {
        if (b)
        {
            return Uri.parse((new StringBuilder()).append("https://graph-video.").append(a).toString()).buildUpon();
        } else
        {
            return Uri.parse((new StringBuilder()).append("http://graph-video.").append(a).toString()).buildUpon();
        }
    }

    public android.net.Uri.Builder d()
    {
        return Uri.parse((new StringBuilder()).append("https://secure.").append(a).toString()).buildUpon();
    }

    public String e()
    {
        return null;
    }

    public String f()
    {
        return null;
    }
}
