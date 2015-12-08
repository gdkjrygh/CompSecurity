// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            Leanplum

final class t extends VariablesChangedCallback
{

    private final String a;

    t(String s)
    {
        a = s;
        super();
    }

    public final void variablesChanged()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("messageId", a);
        Leanplum.a("Cancel", 0.0D, null, null, hashmap);
    }
}
