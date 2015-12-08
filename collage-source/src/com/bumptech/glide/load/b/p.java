// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.a.c;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.b:
//            l

public class p
    implements l
{

    private final l a;

    public p(l l1)
    {
        a = l1;
    }

    private static Uri a(String s)
    {
        return Uri.fromFile(new File(s));
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((String)obj, i, j);
    }

    public c a(String s, int i, int j)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        if (!s.startsWith("/")) goto _L2; else goto _L1
_L1:
        Uri uri = a(s);
_L4:
        return a.a(uri, i, j);
_L2:
        Uri uri1 = Uri.parse(s);
        uri = uri1;
        if (uri1.getScheme() == null)
        {
            uri = a(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
