// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.TimeZone;

public final class ntk
{

    private final Context a;

    public ntk(Context context)
    {
        a = context;
    }

    public final oyh a()
    {
        oyh oyh1 = new oyh();
        int i = a.getResources().getDisplayMetrics().densityDpi;
        if (i >= 480)
        {
            i = 9;
        } else
        if (i >= 320)
        {
            i = 5;
        } else
        if (i >= 240)
        {
            i = 4;
        } else
        {
            i = 3;
        }
        oyh1.a = i;
        oyh1.b = a.getResources().getConfiguration().locale.toString();
        oyh1.c = TimeZone.getDefault().getID();
        return oyh1;
    }
}
