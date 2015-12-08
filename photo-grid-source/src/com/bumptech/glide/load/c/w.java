// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.a.c;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.c:
//            s

public class w
    implements s
{

    private final s a;

    public w(s s1)
    {
        a = s1;
    }

    private static Uri a(String s1)
    {
        return Uri.fromFile(new File(s1));
    }

    public final c a(Object obj, int i, int j)
    {
        String s1;
        s1 = (String)obj;
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        if (!s1.startsWith("/")) goto _L2; else goto _L1
_L1:
        obj = a(s1);
_L4:
        return a.a(obj, i, j);
_L2:
        Uri uri = Uri.parse(s1);
        obj = uri;
        if (uri.getScheme() == null)
        {
            obj = a(s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
