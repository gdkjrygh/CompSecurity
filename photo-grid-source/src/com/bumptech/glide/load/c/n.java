// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.c:
//            o, m

public final class n
{

    private static final String a = System.getProperty("http.agent");
    private static final Map b;
    private boolean c;
    private boolean d;
    private Map e;
    private boolean f;

    public n()
    {
        c = true;
        d = true;
        e = b;
        f = e.containsKey(a);
    }

    public final m a()
    {
        c = true;
        return new m(e);
    }

    static 
    {
        HashMap hashmap = new HashMap(2);
        if (!TextUtils.isEmpty(a))
        {
            hashmap.put("User-Agent", Collections.singletonList(new o(a)));
        }
        hashmap.put("Accept-Encoding", Collections.singletonList(new o("identity")));
        b = Collections.unmodifiableMap(hashmap);
    }
}
