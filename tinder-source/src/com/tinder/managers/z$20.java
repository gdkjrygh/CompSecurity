// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.crashlytics.android.Crashlytics;
import com.tinder.e.y;
import com.tinder.f.ak;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import java.util.ArrayList;
import org.json.JSONArray;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp

public final class a
    implements com.android.volley.
{

    final y a;
    final z b;

    public final void a(Object obj)
    {
        obj = (JSONArray)obj;
        ((JSONArray) (obj)).toString();
        try
        {
            ArrayList arraylist = new ArrayList();
            User user = b.b();
            ManagerApp.h().d();
            UserParse.a(((JSONArray) (obj)), arraylist, user.getId());
            b.a(arraylist);
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String.valueOf(obj);
        }
        Crashlytics.a(((Exception) (obj)).toString());
        a.b();
    }

    public rashlytics(z z1, y y1)
    {
        b = z1;
        a = y1;
        super();
    }
}
