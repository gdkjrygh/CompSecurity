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
//            aj, di, bh

class h extends aj
{

    private static final String ID;
    private final Context mContext;

    public h(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        try
        {
            map = di.u(Integer.valueOf(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.T((new StringBuilder()).append("Package name ").append(mContext.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return di.rb();
        }
        return map;
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.y.toString();
    }
}
