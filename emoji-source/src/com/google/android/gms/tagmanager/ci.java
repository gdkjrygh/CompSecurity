// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh

class ci extends aj
{

    private static final String ID;
    private final Context mContext;

    public ci(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        map = new DisplayMetrics();
        ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getMetrics(map);
        int i = ((DisplayMetrics) (map)).widthPixels;
        int j = ((DisplayMetrics) (map)).heightPixels;
        return dh.r((new StringBuilder()).append(i).append("x").append(j).toString());
    }

    static 
    {
        ID = a.Q.toString();
    }
}
