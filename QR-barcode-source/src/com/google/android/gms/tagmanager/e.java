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
    private static final String anT;
    private static final String anU;
    private final Context lB;

    public e(Context context)
    {
        super(ID, new String[] {
            anU
        });
        lB = context;
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(anU);
        if (obj == null)
        {
            return di.pK();
        }
        obj = di.j(((com.google.android.gms.internal.d.a) (obj)));
        map = (com.google.android.gms.internal.d.a)map.get(anT);
        if (map != null)
        {
            map = di.j(map);
        } else
        {
            map = null;
        }
        map = ay.f(lB, ((String) (obj)), map);
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
        ID = a.Y.toString();
        anT = b.bW.toString();
        anU = b.bZ.toString();
    }
}
