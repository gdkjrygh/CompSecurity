// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.a;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            al

public abstract class ai extends al
    implements a
{

    ai(int i, String s)
    {
        super(i, s);
    }

    public final JSONObject c()
    {
        com.nuance.dragon.toolkit.d.a.a a1 = new com.nuance.dragon.toolkit.d.a.a();
        a1.a("key", b);
        a1.a("type", Integer.valueOf(c));
        return a1;
    }
}
