// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.ab;
import com.tinder.f.ak;
import com.tinder.parse.UserParse;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            e, ManagerApp

public final class a
    implements com.android.volley.
{

    final ab a;
    final e b;

    public final void a(Object obj)
    {
        obj = (String)obj;
        try
        {
            obj = ManagerApp.h().d().a(new JSONObject(((String) (obj))));
            b.b = ((com.tinder.model.User) (obj));
            e.f = false;
            e.a(b);
            a.onProfileLoaded(((com.tinder.model.User) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Failed to get deep linked user", ((Throwable) (obj)));
        }
    }

    public se(e e1, ab ab1)
    {
        b = e1;
        a = ab1;
        super();
    }
}
