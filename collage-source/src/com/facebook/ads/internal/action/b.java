// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.action;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.facebook.ads.internal.action:
//            c, d, a

public class b
{

    public static a a(Context context, Uri uri)
    {
        String s;
        String s1;
        s = uri.getAuthority();
        s1 = uri.getQueryParameter("video_url");
        if (!"store".equals(s)) goto _L2; else goto _L1
_L1:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return new c(context, uri);
_L2:
        if ("open_link".equals(s))
        {
            return new d(context, uri);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
