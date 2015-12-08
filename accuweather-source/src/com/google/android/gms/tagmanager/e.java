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
    private static final String aeh;
    private static final String aei;
    private final Context kM;

    public e(Context context)
    {
        super(ID, new String[] {
            aei
        });
        kM = context;
    }

    public boolean lc()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(aei);
        if (obj == null)
        {
            return dh.mY();
        }
        obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        map = (com.google.android.gms.internal.d.a)map.get(aeh);
        if (map != null)
        {
            map = dh.j(map);
        } else
        {
            map = null;
        }
        map = ay.d(kM, ((String) (obj)), map);
        if (map != null)
        {
            return dh.r(map);
        } else
        {
            return dh.mY();
        }
    }

    static 
    {
        ID = a.W.toString();
        aeh = b.bH.toString();
        aei = b.bK.toString();
    }
}
