// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.android.volley:
//            b

public static final class mptyMap
{

    public byte a[];
    public String b;
    public long c;
    public long d;
    public long e;
    public Map f;

    public final boolean a()
    {
        return d < System.currentTimeMillis();
    }

    public final boolean b()
    {
        return e < System.currentTimeMillis();
    }

    public ()
    {
        f = Collections.emptyMap();
    }
}
