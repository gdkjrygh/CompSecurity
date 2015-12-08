// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.appboy.d;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.appboy.e:
//            e

public class c
{

    private static final String a;

    public c()
    {
    }

    public static RemoteViews a(Context context, Bundle bundle, int i)
    {
        String s;
        String s1;
        String s2;
        String s3;
        int j;
        int k;
        int l;
        int i1;
        int j1;
label0:
        {
            if (bundle != null)
            {
                s2 = bundle.getString("t");
                s3 = bundle.getString("a");
                bundle = context.getResources();
                s = com.appboy.f.c.a(context);
                j = bundle.getIdentifier("com_appboy_notification", "layout", s);
                k = bundle.getIdentifier("com_appboy_notification_title", "id", s);
                l = bundle.getIdentifier("com_appboy_notification_content", "id", s);
                i1 = bundle.getIdentifier("com_appboy_notification_icon", "id", s);
                j1 = bundle.getIdentifier("com_appboy_notification_time", "id", s);
                int k1 = bundle.getIdentifier("com_appboy_notification_time_twenty_four_hour_format", "string", s);
                int l1 = bundle.getIdentifier("com_appboy_notification_time_twelve_hour_format", "string", s);
                s = e.a(bundle, k1, "HH:mm");
                s1 = e.a(bundle, l1, "h:mm a");
                if (j != 0 && k != 0 && l != 0 && i1 != 0 && j1 != 0)
                {
                    break label0;
                }
                String.format("Couldn't find all resource IDs for custom notification view, extended view will not be used for push notifications. Received %d for layout, %d for title, %d for content, %d for icon, and %d for time.", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j1)
                });
            }
            return null;
        }
        try
        {
            bundle = new RemoteViews(com.appboy.f.c.a(context), j);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            String.format("Failed to initialized remote views with package %s", new Object[] {
                com.appboy.f.c.a(context)
            });
            try
            {
                bundle = new RemoteViews(context.getPackageName(), j);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                String.format("Failed to initialized remote views with package %s", new Object[] {
                    context.getPackageName()
                });
                return null;
            }
        }
        bundle.setTextViewText(k, s2);
        bundle.setTextViewText(l, s3);
        bundle.setImageViewResource(i1, i);
        if (DateFormat.is24HourFormat(context))
        {
            context = s;
        } else
        {
            context = s1;
        }
        bundle.setTextViewText(j1, (new SimpleDateFormat(context)).format(new Date()));
        return bundle;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/e/c.getName()
        });
    }
}
