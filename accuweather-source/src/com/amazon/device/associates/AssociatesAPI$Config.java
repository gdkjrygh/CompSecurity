// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            AssociatesAPI, an

public static class b
{

    private final String a;
    private final Context b;
    private Set c;

    String a()
    {
        return a;
    }

    Context b()
    {
        return b;
    }

    Set c()
    {
        return c;
    }

    public void setPrefetchProducts(Set set)
    {
        an.a(set, "productIds");
        c = set;
    }

    public (String s, Context context)
    {
        c = null;
        an.a(s, "appKey");
        an.a(context, "appContext");
        a = s;
        b = context;
    }
}
