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

class e extends aj
{

    private static final String ID;
    private static final String aqd;
    private static final String aqe;
    private final Context lM;

    public e(Context context)
    {
        super(ID, new String[] {
            aqe
        });
        lM = context;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(aqe);
        if (obj == null)
        {
            return di.rb();
        }
        obj = di.j(((com.google.android.gms.internal.d.a) (obj)));
        map = (com.google.android.gms.internal.d.a)map.get(aqd);
        if (map != null)
        {
            map = di.j(map);
        } else
        {
            map = null;
        }
        map = ay.f(lM, ((String) (obj)), map);
        if (map != null)
        {
            return di.u(map);
        } else
        {
            return di.rb();
        }
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.Y.toString();
        aqd = b.bW.toString();
        aqe = b.bZ.toString();
    }
}
