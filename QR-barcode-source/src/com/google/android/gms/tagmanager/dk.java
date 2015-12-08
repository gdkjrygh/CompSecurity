// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di

class dk extends aj
{

    private static final String ID;
    private static final String apf;

    public dk()
    {
        super(ID, new String[] {
            apf
        });
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        return di.u(di.j((com.google.android.gms.internal.d.a)map.get(apf)).toUpperCase());
    }

    public boolean nN()
    {
        return true;
    }

    static 
    {
        ID = a.aj.toString();
        apf = b.bw.toString();
    }
}
