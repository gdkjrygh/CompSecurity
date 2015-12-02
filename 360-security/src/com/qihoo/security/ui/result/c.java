// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.content.Context;
import com.qihoo.b.a.e;

public class c
{

    public static String a(Context context)
    {
        String s = null;
        if (e.a(context, "com.android.browser"))
        {
            s = "com.android.browser";
        } else
        {
            if (e.a(context, "com.google.android.browser"))
            {
                return "com.google.android.browser";
            }
            if (e.a(context, "com.android.chrome"))
            {
                return "com.android.chrome";
            }
            if (e.a(context, "com.opera.browser"))
            {
                return "com.opera.browser";
            }
            if (e.a(context, "com.UCMobile.intl"))
            {
                return "com.UCMobile.intl";
            }
            if (e.a(context, "com.baidu.browser.inter"))
            {
                return "com.baidu.browser.inter";
            }
            if (e.a(context, "com.jiubang.browser"))
            {
                return "com.jiubang.browser";
            }
            if (e.a(context, "com.ksmobile.cb"))
            {
                return "com.ksmobile.cb";
            }
            if (e.a(context, "com.opera.mini.android"))
            {
                return "com.opera.mini.android";
            }
            if (e.a(context, "com.mx.browser"))
            {
                return "com.mx.browser";
            }
            if (e.a(context, "com.uc.browser.en"))
            {
                return "com.uc.browser.en";
            }
            if (e.a(context, "com.yandex.browser"))
            {
                return "com.yandex.browser";
            }
            if (e.a(context, "mobi.mgeek.TunnyBrowser"))
            {
                return "mobi.mgeek.TunnyBrowser";
            }
            if (e.a(context, "org.mozilla.irefox"))
            {
                return "org.mozilla.irefox";
            }
        }
        return s;
    }
}
