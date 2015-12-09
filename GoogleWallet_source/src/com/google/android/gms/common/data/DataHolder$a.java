// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.kn;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String Ub[];
    private final ArrayList Uk;
    private final String Ul;
    private final HashMap Um;
    private boolean Un;
    private String Uo;

    private (String as[], String s)
    {
        Ub = (String[])kn.k(as);
        Uk = new ArrayList();
        Ul = s;
        Um = new HashMap();
        Un = false;
        Uo = null;
    }

    Uo(String as[], String s, Uo uo)
    {
        this(as, s);
    }
}
