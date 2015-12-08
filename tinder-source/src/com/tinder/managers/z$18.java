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

final class a
    implements com.android.volley.
{

    final y a;
    final z b;

    public final void a(Object obj)
    {
        obj = (JSONArray)obj;
        ((JSONArray) (obj)).toString();
        ArrayList arraylist;
        User user;
        try
        {
            arraylist = new ArrayList(6);
            user = b.b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).toString();
            Crashlytics.a(((Exception) (obj)).toString());
            return;
        }
        if (user == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        ManagerApp.h().d();
        UserParse.a(((JSONArray) (obj)), arraylist, user.getId());
        b.a(arraylist);
        return;
    }

    rashlytics(z z1, y y)
    {
        b = z1;
        a = y;
        super();
    }
}
