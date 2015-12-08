// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.browser;

import android.net.Uri;
import ctz;

public final class MediaBrowserItem
{

    public final String a;
    public final ActionType b;
    public final String c;
    public final String d;
    public final Uri e;

    public MediaBrowserItem(String s, String s1, String s2, Uri uri, ActionType actiontype)
    {
        a = (String)ctz.a(s);
        b = actiontype;
        c = s1;
        d = s2;
        e = uri;
    }
}
