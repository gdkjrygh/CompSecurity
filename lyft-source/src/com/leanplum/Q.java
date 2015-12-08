// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            aU, T, R, S

final class Q extends VariablesChangedCallback
{

    private final String a;
    private final VariablesChangedCallback b;

    Q(String s, VariablesChangedCallback variableschangedcallback)
    {
        a = s;
        b = variableschangedcallback;
        super();
    }

    public final void variablesChanged()
    {
        Map map = aU.l();
        if (a == null || map != null && map.containsKey(a))
        {
            b.variablesChanged();
            return;
        } else
        {
            Object obj = new HashMap();
            ((Map) (obj)).put("includeDefaults", "false");
            ((Map) (obj)).put("includeMessageId", a);
            obj = T.b("getVars", ((Map) (obj)));
            ((T) (obj)).a(new R(this, b));
            ((T) (obj)).a(new S(this, b));
            ((T) (obj)).h();
            return;
        }
    }
}
