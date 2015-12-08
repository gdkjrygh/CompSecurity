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
    private static final String aek;
    private static final String ael;
    private final Context kO;

    public e(Context context)
    {
        super(ID, new String[] {
            ael
        });
        kO = context;
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(ael);
        if (obj == null)
        {
            return dh.nd();
        }
        obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        map = (com.google.android.gms.internal.d.a)map.get(aek);
        if (map != null)
        {
            map = dh.j(map);
        } else
        {
            map = null;
        }
        map = ay.d(kO, ((String) (obj)), map);
        if (map != null)
        {
            return dh.r(map);
        } else
        {
            return dh.nd();
        }
    }

    static 
    {
        ID = a.W.toString();
        aek = b.bH.toString();
        ael = b.bK.toString();
    }
}
