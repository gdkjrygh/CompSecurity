// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import p.cw.c;

// Referenced classes of package com.pandora.android.widget:
//            d, b

public class Widget extends AppWidgetProvider
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        private int d;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/widget/Widget$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public int a()
        {
            return d;
        }

        static 
        {
            a = new a("SMALL", 0, 0x7f0400c0);
            b = new a("MEDIUM", 1, 0x7f0400c1);
            c = new a("LARGE", 2, 0x7f0400c2);
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            d = j;
        }
    }


    public Widget()
    {
    }

    private com.pandora.android.widget.b a()
    {
        return (com.pandora.android.widget.b)d.a();
    }

    private void a(Bundle bundle)
    {
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appwidgetmanager, int i, Bundle bundle)
    {
        a(bundle);
        int j = bundle.getInt("appWidgetMinHeight");
        context = b.a.b().j();
        if (j > 0)
        {
            if (j > 184)
            {
                context.a(com.pandora.android.widget.a.c.ordinal(), i);
            } else
            if (j > 110)
            {
                context.a(com.pandora.android.widget.a.b.ordinal(), i);
            } else
            {
                context.a(a.a.ordinal(), i);
            }
        }
        a().a(i);
    }

    public void onDeleted(Context context, int ai[])
    {
        context = b.a.b().j();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            context.d(ai[i]);
        }

        a().b(ai);
    }

    public void onDisabled(Context context)
    {
        a().a(false);
    }

    public void onEnabled(Context context)
    {
        a().a(true);
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        a().a(ai);
    }
}
