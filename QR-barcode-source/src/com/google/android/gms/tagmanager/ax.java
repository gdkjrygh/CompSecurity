// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di, ay

class ax extends aj
{

    private static final String ID;
    private static final String anT;
    private final Context lB;

    public ax(Context context)
    {
        super(ID, new String[0]);
        lB = context;
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        if ((com.google.android.gms.internal.d.a)map.get(anT) != null)
        {
            map = di.j((com.google.android.gms.internal.d.a)map.get(anT));
        } else
        {
            map = null;
        }
        map = ay.e(lB, map);
        if (map != null)
        {
            return di.u(map);
        } else
        {
            return di.pK();
        }
    }

    public boolean nN()
    {
        return true;
    }

    static 
    {
        ID = a.ad.toString();
        anT = b.bW.toString();
    }
}
