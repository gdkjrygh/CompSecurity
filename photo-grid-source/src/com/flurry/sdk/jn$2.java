// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.LinkedHashMap;

// Referenced classes of package com.flurry.sdk:
//            jn

class Map extends LinkedHashMap
{

    final jn a;

    protected boolean removeEldestEntry(java.util.ntry ntry)
    {
        return size() > 10;
    }

    Map(jn jn)
    {
        a = jn;
        super();
    }
}
