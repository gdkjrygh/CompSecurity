// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, bh

class g extends aj
{

    private static final String ID;
    private final Context mContext;

    public g(Context context)
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
            map = mContext.getPackageManager();
            map = dh.r(map.getApplicationLabel(map.getApplicationInfo(mContext.getPackageName(), 0)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.b("App name is not found.", map);
            return dh.nd();
        }
        return map;
    }

    static 
    {
        ID = a.x.toString();
    }
}
