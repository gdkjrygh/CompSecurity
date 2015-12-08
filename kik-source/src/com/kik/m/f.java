// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public final class f
{

    public static void a(Context context, String s, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ((ClipboardManager)context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(s, s1));
            return;
        } else
        {
            ((android.text.ClipboardManager)context.getSystemService("clipboard")).setText(s1);
            return;
        }
    }
}
