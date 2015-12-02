// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.n;

import android.content.Context;
import android.content.IntentFilter;
import com.facebook.c.k;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.facebook.common.n:
//            d

public class b extends k
{

    private static int b;
    private static int c;
    private static int d;
    private final Context a;
    private final DecimalFormat e = new DecimalFormat();

    public b(Context context)
    {
        super("android.intent.action.LOCALE_CHANGED", new d(null));
        a = context;
        a.registerReceiver(this, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        d();
    }

    static void a()
    {
        d();
    }

    private static void d()
    {
        if (!e())
        {
            b = 1000;
            c = 3;
            d = 9;
            return;
        } else
        {
            b = 10000;
            c = 4;
            d = 8;
            return;
        }
    }

    private static boolean e()
    {
        return Arrays.asList(new String[] {
            "zh", "ja", "ko"
        }).contains(Locale.getDefault().getLanguage());
    }
}
