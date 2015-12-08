// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class as extends ah
{

    public String a;
    public boolean b;

    public as()
    {
    }

    public final void a(ah ah1)
    {
        ah1 = (as)ah1;
        if (!TextUtils.isEmpty(a))
        {
            ah1.a = a;
        }
        if (b)
        {
            ah1.b = b;
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
