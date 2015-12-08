// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import me.lyft.android.common.Strings;

public class Telephony
{

    private final Context context;

    public Telephony(Context context1)
    {
        context = context1;
    }

    public void callPhone(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return;
        }
        String s1 = s;
        if (s.startsWith("1"))
        {
            s1 = (new StringBuilder()).append("+").append(s).toString();
        }
        s = new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder()).append("tel:").append(s1).toString()));
        s.addFlags(0x10000000);
        context.startActivity(s);
    }
}
