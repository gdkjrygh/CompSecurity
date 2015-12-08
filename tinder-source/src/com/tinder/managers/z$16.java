// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.util.Pair;
import com.tinder.e.g;
import com.tinder.f.ak;
import com.tinder.model.ConnectionsGroup;
import com.tinder.parse.UserParse;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp

final class a
    implements com.android.volley.
{

    final g a;
    final z b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        obj = ManagerApp.h().d().a(((JSONObject) (obj)), false);
        a.a((ConnectionsGroup)((Pair) (obj)).second, 0);
    }

    onsGroup(z z1, g g1)
    {
        b = z1;
        a = g1;
        super();
    }
}
