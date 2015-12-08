// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bx, dg

class am extends bx
{

    private static final String ID;

    public am()
    {
        super(ID);
    }

    protected boolean a(dg dg1, dg dg2, Map map)
    {
        return dg1.a(dg2) > 0;
    }

    static 
    {
        ID = a.an.toString();
    }
}
