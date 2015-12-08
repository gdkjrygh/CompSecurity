// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.graphics.Color;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            g, i

class f
{

    private static final int a = Color.argb(186, 28, 28, 28);

    static int a()
    {
        return a;
    }

    public static void a(Activity activity, i i)
    {
        activity.runOnUiThread(new g(activity, i));
    }

}
