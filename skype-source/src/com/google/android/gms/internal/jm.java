// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jm extends jc
{

    public String a;
    public boolean b;

    public jm()
    {
    }

    public final void a(jc jc1)
    {
        jc1 = (jm)jc1;
        if (!TextUtils.isEmpty(a))
        {
            jc1.a = a;
        }
        if (b)
        {
            jc1.b = b;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", a);
        hashmap.put("fatal", Boolean.valueOf(b));
        return a(hashmap);
    }
}
