// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.content.Context;
import android.os.Bundle;
import com.appboy.b;
import com.appboy.d;

public class f
{

    private static final String a;

    public f()
    {
    }

    public static void a(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle == null) goto _L2; else goto _L1
_L1:
        android.support.v4.app.NotificationCompat.WearableExtender wearableextender;
        int i;
        wearableextender = new android.support.v4.app.NotificationCompat.WearableExtender();
        if (bundle.containsKey("ab_wi"))
        {
            wearableextender.setHintHideIcon(Boolean.valueOf(Boolean.parseBoolean(bundle.getString("ab_wi"))).booleanValue());
        }
        if (bundle.containsKey("ab_wb"))
        {
            android.graphics.Bitmap bitmap = b.a(bundle.getString("ab_wb"));
            if (bitmap != null)
            {
                wearableextender.setBackground(bitmap);
            }
        }
        i = 0;
_L8:
        String s;
        String s1;
        s = (new StringBuilder("ab_we_t")).append(i).toString();
        s1 = (new StringBuilder("ab_we_c")).append(i).toString();
        boolean flag;
        if (bundle.containsKey(s) && bundle.containsKey(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        s = bundle.getString((new StringBuilder("ab_we_t")).append(i).toString());
        s1 = bundle.getString((new StringBuilder("ab_we_c")).append(i).toString());
        if (s1 != null && s != null) goto _L6; else goto _L5
_L5:
        String.format("The title or content of extra page %s was null. Adding no further extra pages.", new Object[] {
            Integer.valueOf(i)
        });
_L4:
        builder.extend(wearableextender);
_L2:
        return;
_L6:
        android.support.v4.app.NotificationCompat.BigTextStyle bigtextstyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
        bigtextstyle.bigText(s1);
        wearableextender.addPage((new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(s).setStyle(bigtextstyle).build());
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/e/f.getName()
        });
    }
}
