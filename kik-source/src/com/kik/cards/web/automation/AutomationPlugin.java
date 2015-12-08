// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.automation;

import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.automation:
//            a

public class AutomationPlugin extends d
{

    private final a a;

    public AutomationPlugin(a a1)
    {
        super("Automation");
        a = a1;
    }

    public final String c()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a.a();
        }
    }

    public final void f_()
    {
        super.f_();
        a.b();
    }

    public j inspect(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("result", "");
        a.b(jsonobject);
        return new j();
    }
}
