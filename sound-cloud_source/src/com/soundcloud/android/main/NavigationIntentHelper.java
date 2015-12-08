// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.net.Uri;
import com.soundcloud.android.deeplinks.DeepLink;

final class NavigationIntentHelper
{

    NavigationIntentHelper()
    {
    }

    public static boolean resolvesToNavigationItem(Uri uri)
    {
        return shouldGoToStream(uri) || shoudGoToExplore(uri) || shouldGoToSearch(uri);
    }

    public static boolean shoudGoToExplore(Uri uri)
    {
        return DeepLink.fromUri(uri).equals(DeepLink.EXPLORE);
    }

    public static boolean shouldGoToSearch(Uri uri)
    {
        return DeepLink.fromUri(uri).equals(DeepLink.SEARCH);
    }

    public static boolean shouldGoToStream(Uri uri)
    {
        uri = DeepLink.fromUri(uri);
        return uri.equals(DeepLink.HOME) || uri.equals(DeepLink.STREAM);
    }
}
