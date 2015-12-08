// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Intent;
import android.net.Uri;

public class NavigationUtil
{

    public NavigationUtil()
    {
    }

    public static Intent routeTo(Uri uri)
    {
        return new Intent("android.intent.action.VIEW", uri);
    }
}
