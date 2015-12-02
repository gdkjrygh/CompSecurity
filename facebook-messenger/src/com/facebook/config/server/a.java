// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import android.net.Uri;
import com.facebook.http.c.i;

public class a
    implements i
{

    public a()
    {
    }

    public android.net.Uri.Builder a()
    {
        return Uri.parse("https://b-api.facebook.com").buildUpon();
    }

    public android.net.Uri.Builder b()
    {
        return Uri.parse("https://b-graph.facebook.com").buildUpon();
    }

    public android.net.Uri.Builder c()
    {
        throw new UnsupportedOperationException("BootstrapHttpConfig should be used only for graph and api requests");
    }

    public android.net.Uri.Builder d()
    {
        throw new UnsupportedOperationException("BootstrapHttpConfig should be used only for graph and api requests");
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
