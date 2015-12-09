// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.gson.BackgroundBundleInfo;
import com.cardinalblue.android.piccollage.model.gson.DownloadedBackground;
import com.cardinalblue.android.piccollage.model.gson.InstalledBackground;
import com.google.b.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class i
{

    protected BackgroundBundleInfo a;
    private final String b;
    private List c;

    private i(String s)
        throws IOException
    {
        c = new ArrayList();
        b = s;
        b();
    }

    public static i a(File file)
        throws IOException
    {
        return new i(com.cardinalblue.android.piccollage.lib.e.a.c.b(file.getAbsolutePath()));
    }

    private void b()
        throws IOException
    {
        Object obj = null;
        Object obj1 = com.cardinalblue.android.piccollage.lib.a.e.a(c()).d();
        obj = obj1;
        a = (BackgroundBundleInfo)(new f()).a(new InputStreamReader(((java.io.InputStream) (obj1)), "UTF-8"), com/cardinalblue/android/piccollage/model/gson/BackgroundBundleInfo);
        obj = obj1;
        c = new ArrayList();
        obj = obj1;
        Iterator iterator = a.backgrounds.iterator();
_L2:
        obj = obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        Object obj2 = (InstalledBackground)iterator.next();
        obj = obj1;
        String s = (new StringBuilder()).append(b).append("/").append(((InstalledBackground) (obj2)).url).toString();
        obj = obj1;
        obj2 = (new StringBuilder()).append(b).append("/").append(((InstalledBackground) (obj2)).thumbnailUrl).toString();
        obj = obj1;
        c.add(new DownloadedBackground(((String) (obj2)), s));
        if (true) goto _L2; else goto _L1
        obj1;
        k.a(((java.io.Closeable) (obj)));
        throw obj1;
_L1:
        k.a(((java.io.Closeable) (obj1)));
        return;
    }

    private String c()
    {
        return (new StringBuilder(b)).append("/").append("info.json").toString();
    }

    public List a()
    {
        return c;
    }
}
