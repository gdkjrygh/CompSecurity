// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

// Referenced classes of package com.google.android.gms.internal:
//            eq

public final class er
{

    public static void a(Context context, WebSettings websettings)
    {
        eq.a(context, websettings);
        websettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public static String getDefaultUserAgent(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }
}
