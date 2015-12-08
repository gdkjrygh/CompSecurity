// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, ay

class e extends aj
{

    private static final String ID;
    private static final String WA;
    private static final String WB;
    private final Context kI;

    public e(Context context)
    {
        super(ID, new String[] {
            WB
        });
        kI = context;
    }

    public boolean jX()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(WB);
        if (obj == null)
        {
            return dh.lT();
        }
        obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        map = (com.google.android.gms.internal.d.a)map.get(WA);
        if (map != null)
        {
            map = dh.j(map);
        } else
        {
            map = null;
        }
        map = ay.e(kI, ((String) (obj)), map);
        if (map != null)
        {
            return dh.r(map);
        } else
        {
            return dh.lT();
        }
    }

    static 
    {
        ID = a.W.toString();
        WA = b.bH.toString();
        WB = b.bK.toString();
    }
}
