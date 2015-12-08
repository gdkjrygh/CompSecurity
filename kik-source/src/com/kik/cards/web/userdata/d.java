// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.userdata;

import com.kik.cards.util.UserDataParcelable;
import com.kik.cards.web.plugin.a;
import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import org.c.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.userdata:
//            UserDataPlugin

final class d extends r
{

    final a a;
    final UserDataPlugin b;

    d(UserDataPlugin userdataplugin, a a1)
    {
        b = userdataplugin;
        a = a1;
        super();
    }

    private void d()
    {
        JSONObject jsonobject = new JSONObject();
        com.kik.cards.web.userdata.UserDataPlugin.b(a, jsonobject);
    }

    public final void a(Object obj)
    {
        Object obj2 = (List)obj;
        obj = new JSONObject();
        Object obj1;
        obj1 = new JSONArray();
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((JSONArray) (obj1)).put(UserDataParcelable.a((UserDataParcelable)((Iterator) (obj2)).next()))) { }
          goto _L1
        obj1;
_L5:
        UserDataPlugin.c().b((new StringBuilder("Error firing back event: ")).append(obj1).toString());
_L3:
        com.kik.cards.web.userdata.UserDataPlugin.a(a, ((JSONObject) (obj)));
        return;
_L1:
        ((JSONObject) (obj)).put("userDataList", obj1);
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void b()
    {
        d();
    }

    public final void b(Throwable throwable)
    {
        d();
    }
}
