// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;
import com.google.common.a.hy;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class ay
{

    private final ConcurrentMap a;

    public ay()
    {
        a = (new hy()).b(600L, TimeUnit.SECONDS).b(100).n();
    }

    public Uri a(Uri uri)
    {
        return (Uri)a.get(uri);
    }

    public Uri a(Uri uri, Uri uri1)
    {
        return (Uri)a.put(uri, uri1);
    }
}
