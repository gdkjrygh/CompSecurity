// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            by, dh

class bd extends by
{

    private static final String ID;

    public bd()
    {
        super(ID);
    }

    protected boolean a(dh dh1, dh dh2, Map map)
    {
        return dh1.a(dh2) <= 0;
    }

    static 
    {
        ID = a.av.toString();
    }
}
