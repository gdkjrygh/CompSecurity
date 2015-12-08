// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bt

class bs extends bt
{

    private static final String a;

    public bs()
    {
        super(a);
    }

    protected boolean zza(String s, String s1, Map map)
    {
        return s.startsWith(s1);
    }

    static 
    {
        a = zza.zzau.toString();
    }
}
