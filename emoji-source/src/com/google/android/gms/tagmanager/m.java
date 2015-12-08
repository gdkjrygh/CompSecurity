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

    public static String lk()
    {
        return ID;
    }

    public static String ll()
    {
        return VALUE;
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        return (com.google.android.gms.internal.d.a)map.get(VALUE);
    }

    static 
    {
        ID = a.A.toString();
        VALUE = b.ew.toString();
    }
}
