// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;

final class lst extends lqd
{

    private static final String b;
    private final Context c;

    public lst(Context context)
    {
        super(b, new String[0]);
        c = context;
    }

    public final ksp a(Map map)
    {
        map = new DisplayMetrics();
        ((WindowManager)c.getSystemService("window")).getDefaultDisplay().getMetrics(map);
        int i = ((DisplayMetrics) (map)).widthPixels;
        int j = ((DisplayMetrics) (map)).heightPixels;
        return ltw.a((new StringBuilder()).append(i).append("x").append(j).toString());
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.p.toString();
    }
}
