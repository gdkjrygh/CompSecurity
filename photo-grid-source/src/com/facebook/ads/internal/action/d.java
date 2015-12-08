// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.action;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.facebook.ads.internal.action:
//            a

public class d extends a
{

    private static final String a = com/facebook/ads/internal/action/d.getSimpleName();
    private final Context b;
    private final Uri c;

    public d(Context context, Uri uri)
    {
        b = context;
        c = uri;
    }

    public com.facebook.ads.internal.util.b.a a()
    {
        return com.facebook.ads.internal.util.b.a.b;
    }

    public void b()
    {
        a(b, c);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(c.getQueryParameter("link")));
        intent.addFlags(0x10000000);
        try
        {
            b.startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to open market url: ")).append(c.toString());
        }
    }

}
