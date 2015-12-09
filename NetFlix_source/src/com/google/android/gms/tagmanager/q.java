// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dc

class q extends dc
{

    private static final String ID;

    public q()
    {
        super(ID);
    }

    protected boolean a(String s, String s1, Map map)
    {
        return s.contains(s1);
    }

    static 
    {
        ID = a.aj.toString();
    }
}
