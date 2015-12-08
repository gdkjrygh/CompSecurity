// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, bh

class h extends aj
{

    private static final String ID;
    private final Context mContext;

    public h(Context context)
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
        try
        {
            map = dh.r(Integer.valueOf(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.A((new StringBuilder()).append("Package name ").append(mContext.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return dh.nd();
        }
        return map;
    }

    static 
    {
        ID = a.y.toString();
    }
}
