// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh

class cu extends aj
{

    private static final String ID;

    public cu()
    {
        super(ID, new String[0]);
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        return dh.r(Integer.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    static 
    {
        ID = a.S.toString();
    }
}
