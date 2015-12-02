// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.orca.camera.aa;

// Referenced classes of package com.facebook.orca.camera.a:
//            c, b, e

public abstract class a
    implements c
{

    private static final Class i = com/facebook/orca/camera/a/a;
    protected ContentResolver a;
    protected Uri b;
    protected long c;
    protected String d;
    protected long e;
    protected final int f;
    protected String g;
    protected b h;
    private final long j;
    private String k;
    private final String l;
    private int m;
    private int n;

    protected a(b b1, ContentResolver contentresolver, long l1, int i1, Uri uri, String s, 
            long l2, String s1, long l3, String s2, String s3)
    {
        m = -1;
        n = -1;
        h = b1;
        a = contentresolver;
        c = l1;
        f = i1;
        b = uri;
        d = s;
        e = l2;
        g = s1;
        j = l3;
        k = s2;
        l = s3;
    }

    public Bitmap a(int i1, int j1)
    {
        return a(i1, j1, true, false);
    }

    public Bitmap a(int i1, int j1, boolean flag, boolean flag1)
    {
        Object obj = h.a(c);
        if (obj == null)
        {
            obj = null;
        } else
        {
            Bitmap bitmap = aa.a(i1, j1, ((Uri) (obj)), a, flag1);
            obj = bitmap;
            if (bitmap != null)
            {
                obj = bitmap;
                if (flag)
                {
                    return aa.a(bitmap, c());
                }
            }
        }
        return ((Bitmap) (obj));
    }

    public String a()
    {
        return d;
    }

    public long b()
    {
        return j;
    }

    public int c()
    {
        return 0;
    }

    public String d()
    {
        return k;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof e))
        {
            return false;
        } else
        {
            return b.equals(((e)obj).b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return b.toString();
    }

}
