// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.gms.internal.it;

public final class j
{

    public static String a(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            return context.getString(0x104000a);

        case 1: // '\001'
            return context.getString(com.google.android.gms.a.c.common_google_play_services_install_button);

        case 3: // '\003'
            return context.getString(com.google.android.gms.a.c.common_google_play_services_enable_button);

        case 2: // '\002'
        case 42: // '*'
            return context.getString(com.google.android.gms.a.c.common_google_play_services_update_button);
        }
    }

    public static String a(Context context, int i, String s)
    {
        context = context.getResources();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   1: 104
    //                   2: 262
    //                   3: 230
    //                   5: 318
    //                   7: 310
    //                   9: 294
    //                   16: 326
    //                   17: 342
    //                   18: 246
    //                   42: 278;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_unknown_issue);
_L2:
        if (context == null) goto _L13; else goto _L12
_L12:
        if ((context.getConfiguration().screenLayout & 0xf) > 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (it.a() && i != 0) goto _L15; else goto _L14
_L14:
        Configuration configuration = context.getConfiguration();
        if (it.b())
        {
            if ((configuration.screenLayout & 0xf) <= 3 && configuration.smallestScreenWidthDp >= 600)
            {
                i = 1;
            } else
            {
                i = 0;
            }
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L13; else goto _L15
_L15:
        i = 1;
_L16:
        if (i != 0)
        {
            return context.getString(com.google.android.gms.a.c.common_google_play_services_install_text_tablet, new Object[] {
                s
            });
        } else
        {
            return context.getString(com.google.android.gms.a.c.common_google_play_services_install_text_phone, new Object[] {
                s
            });
        }
_L13:
        i = 0;
          goto _L16
_L4:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_enable_text, new Object[] {
            s
        });
_L10:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_updating_text, new Object[] {
            s
        });
_L3:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_update_text, new Object[] {
            s
        });
_L11:
        return context.getString(com.google.android.gms.a.c.common_android_wear_update_text, new Object[] {
            s
        });
_L7:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_unsupported_text, new Object[] {
            s
        });
_L6:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_network_error_text);
_L5:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_invalid_account_text);
_L8:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_api_unavailable_text, new Object[] {
            s
        });
_L9:
        return context.getString(com.google.android.gms.a.c.common_google_play_services_sign_in_failed_text);
    }
}
