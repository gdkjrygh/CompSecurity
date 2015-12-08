// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.managers;

import android.net.Uri;
import java.util.Map;
import me.lyft.android.common.UriParser;

public class params
{

    final String action;
    final Map params;
    final Uri uri;

    public String getAction()
    {
        return action;
    }

    public String getParam(String s)
    {
        return (String)params.get(s);
    }

    public Uri getUri()
    {
        return uri;
    }

    public (Uri uri1)
    {
        uri = uri1;
        action = uri1.getHost();
        params = UriParser.parseParams(uri1.toString());
    }
}
