// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import android.content.Context;
import android.net.Uri;
import p.r.c;

// Referenced classes of package p.x:
//            j, a, d

public abstract class o
    implements j
{

    private final Context a;
    private final j b;

    public o(Context context, j j1)
    {
        a = context;
        b = j1;
    }

    private static boolean a(String s)
    {
        return "file".equals(s) || "content".equals(s) || "android.resource".equals(s);
    }

    protected abstract c a(Context context, Uri uri);

    protected abstract c a(Context context, String s);

    public final c a(Uri uri, int i, int k)
    {
        Object obj;
        String s;
        s = uri.getScheme();
        obj = null;
        if (!a(s)) goto _L2; else goto _L1
_L1:
        if (!p.x.a.a(uri)) goto _L4; else goto _L3
_L3:
        c c;
        uri = p.x.a.b(uri);
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
        return b.a(new d(uri.toString()), i, k);
    }

    public volatile c a(Object obj, int i, int k)
    {
        return a((Uri)obj, i, k);
    }
}
