// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj

class m extends aj
{

    private static final String ID;
    private static final String VALUE;

    public m()
    {
        super(ID, new String[] {
            VALUE
        });
    }

    public static String ph()
    {
        return ID;
    }

    public static String pi()
    {
        return VALUE;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        return (com.google.android.gms.internal.d.a)map.get(VALUE);
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.A.toString();
        VALUE = b.ff.toString();
    }
}
