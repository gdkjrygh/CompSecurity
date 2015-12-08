// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.g;
import com.tinder.model.CommonConnection;
import com.tinder.model.ConnectionsGroup;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            f

static final class c
    implements com.android.volley.
{

    final ConnectionsGroup a;
    final List b;
    final g c;

    public final void a(Object obj)
    {
        JSONObject jsonobject = (JSONObject)obj;
        ConnectionsGroup connectionsgroup;
        ConnectionsGroup connectionsgroup1;
        ArrayList arraylist;
        Iterator iterator;
        connectionsgroup = a;
        obj = b;
        connectionsgroup1 = a;
        arraylist = new ArrayList(((List) (obj)).size());
        iterator = ((List) (obj)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        int i;
        s = (String)iterator.next();
        i = ((CommonConnection)connectionsgroup1.getUnbuiltConnections().get(s)).degree;
        obj = jsonobject.optJSONObject(s);
        if (obj == null) goto _L4; else goto _L3
_L3:
        String s1;
        try
        {
            s1 = ((JSONObject) (obj)).optString("name", null);
            obj = ((JSONObject) (obj)).optJSONObject("picture");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Failed to fill in and load common connections", ((Throwable) (obj)));
            c.c(1);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        obj = ((JSONObject) (obj)).optJSONObject("data");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        obj = ((JSONObject) (obj)).optString("url", null);
_L5:
        arraylist.add(new CommonConnection(s, i, s1, ((String) (obj)), ((String) (obj)), ((String) (obj))));
          goto _L4
_L2:
        connectionsgroup.fillIn(arraylist);
        a.setIgnoreUnresolvableIds(true);
        c.a(a, 1);
        return;
        obj = null;
          goto _L5
    }

    ionsGroup(ConnectionsGroup connectionsgroup, List list, g g1)
    {
        a = connectionsgroup;
        b = list;
        c = g1;
        super();
    }
}
