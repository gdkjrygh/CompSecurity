// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.net.Uri;

// Referenced classes of package com.kik.cache:
//            y, z

public final class av extends y
{

    private av(String s, String s1, com.android.volley.r.b b, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(s, s1, b, i, j, config, a1);
    }

    public static av a(String s, int i, int j)
    {
        Uri uri;
        if (s != null)
        {
            if ((uri = Uri.parse(s)) != null && uri.getHost() != null)
            {
                return new av(s, s, z.e, i, j, a, z.d);
            }
        }
        return null;
    }
}
