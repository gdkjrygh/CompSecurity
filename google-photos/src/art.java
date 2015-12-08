// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;

public final class art
{

    public float a;
    public float b;
    private final Context c;
    private ActivityManager d;
    private aru e;
    private float f;
    private float g;
    private int h;

    public art(Context context)
    {
        a = 2.0F;
        b = 4F;
        f = 0.4F;
        g = 0.33F;
        h = 0x400000;
        c = context;
        d = (ActivityManager)context.getSystemService("activity");
        e = new aru(context.getResources().getDisplayMetrics());
    }

    public final ars a()
    {
        return new ars(c, d, e, a, b, h, f, g);
    }
}
