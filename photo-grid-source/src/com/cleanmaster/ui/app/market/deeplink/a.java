// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cleanmaster.ui.app.market.Ad;

public class a
{

    public static boolean a(Context context, Ad ad)
    {
        String s = ad.getPkg();
        ad = ad.getDeepLink();
        if (context == null || TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return a(context, s, ((String) (ad)));
        }
    }

    static boolean a(Context context, String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            com.cleanmaster.common.a.d(context, s);
            return true;
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(s1));
        if (!(context instanceof Activity))
        {
            s.setFlags(0x10000000);
        }
        return com.cleanmaster.common.a.a(context, s);
    }
}
