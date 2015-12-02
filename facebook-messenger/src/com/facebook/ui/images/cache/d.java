// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;

import android.net.Uri;
import com.facebook.ui.media.cache.l;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.ui.images.cache:
//            e, g

public class d extends l
{

    public static final e a = com.facebook.ui.images.cache.e.newBuilder().a(true).d();
    public static final e b = com.facebook.ui.images.cache.e.newBuilder().a(64, 64).d();
    public static final e c = com.facebook.ui.images.cache.e.newBuilder().a(false).d();
    private final Uri d;
    private final String e;
    private final e f;
    private volatile String g;

    public d(Uri uri, e e1)
    {
        this(uri, e1, null);
    }

    public d(Uri uri, e e1, String s)
    {
        Preconditions.checkNotNull(uri);
        Preconditions.checkNotNull(e1);
        d = uri;
        f = e1;
        e = s;
    }

    public e a()
    {
        return f;
    }

    public String b()
    {
        if (g == null)
        {
            g = (new StringBuilder()).append(d).append("____").append(e).toString();
        }
        return g;
    }

    public boolean equals(Object obj)
    {
        if ((obj instanceof d) && obj != null)
        {
            obj = (d)obj;
            boolean flag;
            if (e == null && ((d) (obj)).e == null || e != null && obj != null && e.equals(((d) (obj)).e))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return d.equals(((d) (obj)).d) && flag && f.equals(((d) (obj)).f);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        int j = d.hashCode();
        int k = f.hashCode();
        int i;
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.hashCode();
        }
        return i + (j * 31 + k) * 31;
    }

}
