// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.webview.action;

import android.content.UriMatcher;
import android.net.Uri;
import java.util.EnumSet;
import java.util.Iterator;

public final class WebActionType extends Enum
{

    public static final WebActionType a;
    public static final WebActionType b;
    public static final WebActionType c;
    public static final WebActionType d;
    public static final WebActionType e;
    private static UriMatcher f;
    private static final WebActionType g[] = values();
    private static final WebActionType h[];
    private String mPattern;

    private WebActionType(String s, int i, String s1)
    {
        super(s, i);
        mPattern = s1;
    }

    public static WebActionType a(Uri uri)
    {
        int i = f.match(uri);
        if (i == -1)
        {
            return e;
        } else
        {
            return g[i];
        }
    }

    public static WebActionType valueOf(String s)
    {
        return (WebActionType)Enum.valueOf(com/spotify/mobile/android/util/webview/action/WebActionType, s);
    }

    public static WebActionType[] values()
    {
        return (WebActionType[])h.clone();
    }

    static 
    {
        a = new WebActionType("CLOSE", 0, "close");
        b = new WebActionType("NPS", 1, "nps");
        c = new WebActionType("PLAYER", 2, "player");
        d = new WebActionType("SHARE", 3, "share");
        e = new WebActionType("NO_MATCH", 4, "");
        h = (new WebActionType[] {
            a, b, c, d, e
        });
        f = new UriMatcher(-1);
        WebActionType webactiontype;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/util/webview/action/WebActionType).iterator(); iterator.hasNext(); f.addURI("*", webactiontype.mPattern, webactiontype.ordinal()))
        {
            webactiontype = (WebActionType)iterator.next();
        }

    }
}
