// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di, bh

class g extends aj
{

    private static final String ID;
    private final Context mContext;

    public g(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        try
        {
            map = mContext.getPackageManager();
            map = di.u(map.getApplicationLabel(map.getApplicationInfo(mContext.getPackageName(), 0)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.b("App name is not found.", map);
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
        ID = a.x.toString();
    }
}
