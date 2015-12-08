// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.webkit.WebSettings;

class kxf extends kxh
{

    kxf()
    {
    }

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
}
