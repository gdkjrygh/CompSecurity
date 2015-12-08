// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class WebBrowser
{

    public WebBrowser()
    {
    }

    public static void open(Context context, String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.addFlags(0x10000000);
        context.startActivity(s);
    }
}
