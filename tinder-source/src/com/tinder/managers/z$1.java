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
//            z, ManagerApp

final class b
    implements com.android.volley.
{

    final String a;
    final ab b;
    final z c;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("LOADED EVENT_MENU_PROFILE FOR UID: ")).append(a);
        (new StringBuilder("user response: ")).append(((JSONObject) (obj)).toString());
        try
        {
            obj = ManagerApp.h().d().a(((JSONObject) (obj)).getJSONObject("results"));
            b.onProfileLoaded(((com.tinder.model.User) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b(((Exception) (obj)).getMessage());
        }
        b.onProfileLoadFailed();
    }

    se(z z1, String s, ab ab1)
    {
        c = z1;
        a = s;
        b = ab1;
        super();
    }
}
