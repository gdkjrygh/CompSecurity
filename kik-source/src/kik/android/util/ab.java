// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.kik.cache.ad;
import kik.android.chat.KikApplication;

public abstract class ab
{

    protected static final int a = KikApplication.a(10);
    protected int b;
    protected Context c;
    protected ad d;

    public ab(Context context, ad ad)
    {
        c = context;
        d = ad;
        b = (int)context.getResources().getDimension(0x7f0d0004);
    }

    protected final int a()
    {
        return c.getResources().getDisplayMetrics().widthPixels / (b + a);
    }

    protected final int a(int i)
    {
        return (c.getResources().getDisplayMetrics().widthPixels - b * i) / (i + 1) / 2;
    }

}
