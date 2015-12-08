// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dd

class dc extends dd
{

    private static final String ID;

    public dc()
    {
        super(ID);
    }

    protected boolean a(String s, String s1, Map map)
    {
        return s.startsWith(s1);
    }

    static 
    {
        ID = a.aq.toString();
    }
}
