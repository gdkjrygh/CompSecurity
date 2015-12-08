// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di

class f extends aj
{

    private static final String ID;
    private final Context mContext;

    public f(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        return di.u(mContext.getPackageName());
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.w.toString();
    }
}
