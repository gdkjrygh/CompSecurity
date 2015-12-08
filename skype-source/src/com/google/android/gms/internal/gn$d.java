// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

// Referenced classes of package com.google.android.gms.internal:
//            gn

static class  extends 
{

    public final String a(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }

    public final boolean a(Context context, WebSettings websettings)
    {
        super.a(context, websettings);
        websettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    ()
    {
    }
}
