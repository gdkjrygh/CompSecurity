// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.a.c;

// Referenced classes of package com.bumptech.glide.load.b:
//            l, a, d

public abstract class q
    implements l
{

    private final Context a;
    private final l b;

    public q(Context context, l l1)
    {
        a = context;
        b = l1;
    }

    private static boolean a(String s)
    {
        return "file".equals(s) || "content".equals(s) || "android.resource".equals(s);
    }

    protected abstract c a(Context context, Uri uri);

    protected abstract c a(Context context, String s);

    public final c a(Uri uri, int i, int j)
    {
        Object obj;
        String s;
        s = uri.getScheme();
        obj = null;
        if (!a(s)) goto _L2; else goto _L1
_L1:
        if (!com.bumptech.glide.load.b.a.a(uri)) goto _L4; else goto _L3
_L3:
        c c;
        uri = com.bumptech.glide.load.b.a.b(uri);
        c = a(a, ((String) (uri)));
_L6:
        return c;
_L4:
        return a(a, uri);
_L2:
        c = obj;
        if (b == null) goto _L6; else goto _L5
_L5:
        if ("http".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        c = obj;
        if (!"https".equals(s)) goto _L6; else goto _L7
_L7:
        return b.a(new d(uri.toString()), i, j);
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((Uri)obj, i, j);
    }
}
