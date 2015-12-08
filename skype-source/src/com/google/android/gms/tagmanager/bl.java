// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

final class bl extends o
{

    private static final String a;
    private final Context b;

    public bl(Context context)
    {
        super(a, new String[0]);
        b = context;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        map = new DisplayMetrics();
        ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getMetrics(map);
        int i = ((DisplayMetrics) (map)).widthPixels;
        int j = ((DisplayMetrics) (map)).heightPixels;
        return cl.a((new StringBuilder()).append(i).append("x").append(j).toString());
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.y.toString();
    }
}
