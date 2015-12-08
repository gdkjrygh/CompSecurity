// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.userdata;

import com.kik.cards.util.UserDataParcelable;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.userdata:
//            UserDataPlugin

final class b extends r
{

    final UserDataPlugin a;

    b(UserDataPlugin userdataplugin)
    {
        a = userdataplugin;
        super();
    }

    private void a(UserDataParcelable userdataparcelable)
    {
        Object obj = new JSONObject();
        if (userdataparcelable != null) goto _L2; else goto _L1
_L1:
        userdataparcelable = ((UserDataParcelable) (JSONObject.NULL));
_L3:
        ((JSONObject) (obj)).put("userData", userdataparcelable);
        userdataparcelable = ((UserDataParcelable) (obj));
        break MISSING_BLOCK_LABEL_26;
_L2:
        userdataparcelable = UserDataParcelable.a(userdataparcelable);
          goto _L3
        obj;
        userdataparcelable = null;
_L4:
        UserDataPlugin.c().b((new StringBuilder("Error firing back event: ")).append(obj).toString());
        for (obj = com.kik.cards.web.userdata.UserDataPlugin.a(a).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a(new j(userdataparcelable))) { }
        com.kik.cards.web.userdata.UserDataPlugin.a(a).clear();
        UserDataPlugin.d();
        return;
        JSONException jsonexception;
        jsonexception;
        userdataparcelable = ((UserDataParcelable) (obj));
        obj = jsonexception;
          goto _L4
    }

    public final volatile void a(Object obj)
    {
        a((UserDataParcelable)obj);
    }

    public final void b()
    {
        a(((UserDataParcelable) (null)));
    }

    public final void b(Throwable throwable)
    {
        new JSONObject();
        for (throwable = com.kik.cards.web.userdata.UserDataPlugin.a(a).iterator(); throwable.hasNext(); ((a)throwable.next()).a(new j(500))) { }
        com.kik.cards.web.userdata.UserDataPlugin.a(a).clear();
        UserDataPlugin.d();
    }
}
