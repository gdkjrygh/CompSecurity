// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.a.c;

// Referenced classes of package com.bumptech.glide.load.c:
//            s, a, e

public abstract class x
    implements s
{

    private final Context a;
    private final s b;

    public x(Context context, s s1)
    {
        a = context;
        b = s1;
    }

    protected abstract c a(Context context, Uri uri);

    protected abstract c a(Context context, String s1);

    public final c a(Object obj, int i, int j)
    {
        Object obj1;
        Uri uri;
        String s1;
        uri = (Uri)obj;
        s1 = uri.getScheme();
        obj1 = null;
        boolean flag;
        if ("file".equals(s1) || "content".equals(s1) || "android.resource".equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!com.bumptech.glide.load.c.a.a(uri)) goto _L4; else goto _L3
_L3:
        obj = com.bumptech.glide.load.c.a.b(uri);
        obj = a(a, ((String) (obj)));
_L6:
        return ((c) (obj));
_L4:
        return a(a, uri);
_L2:
        obj = obj1;
        if (b == null) goto _L6; else goto _L5
_L5:
        if ("http".equals(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (!"https".equals(s1)) goto _L6; else goto _L7
_L7:
        return b.a(new e(uri.toString()), i, j);
    }
}
