// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ce

final class cd extends ce
{

    private static final String a;

    public cd()
    {
        super(a);
    }

    protected final boolean a(String s, String s1, Map map)
    {
        return s.startsWith(s1);
    }

    static 
    {
        a = e.aa.toString();
    }
}
