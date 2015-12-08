// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class PlayStore
{

    public PlayStore()
    {
    }

    public static void openGooglePlay(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(context.getString(0x7f070184)));
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }
}
