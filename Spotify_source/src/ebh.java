// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;

public final class ebh
{

    public com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType a;
    public String b;
    public String c;
    public Uri d;
    private final String e;

    public ebh(Uri uri)
    {
        this(String.valueOf(ctz.a(uri)));
    }

    private ebh(String s)
    {
        a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.c;
        d = Uri.EMPTY;
        e = (String)ctz.a(s);
    }

    public final MediaBrowserItem a()
    {
        return new MediaBrowserItem(e, b, c, d, a);
    }
}
