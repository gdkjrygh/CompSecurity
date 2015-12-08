// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.crashlytics.android.Crashlytics;
import com.tinder.e.y;
import com.tinder.f.ak;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import java.util.ArrayList;
import org.json.JSONArray;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp

final class e
    implements com.android.volley.
{

    final boolean a = true;
    final y b;
    final int c;
    final ProfilePhoto d;
    final int e;
    final z f;

    public final void a(Object obj)
    {
        obj = (JSONArray)obj;
        ((JSONArray) (obj)).toString();
        ArrayList arraylist = new ArrayList(6);
        User user = f.b();
        ManagerApp.h().d();
        UserParse.a(((JSONArray) (obj)), arraylist, user.getId());
        f.a(arraylist);
        if (a)
        {
            b.a(c, d);
            return;
        }
        try
        {
            b.a(e, c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).toString();
        }
        Crashlytics.a(((Exception) (obj)).toString());
        if (a)
        {
            b.a(c, d);
            return;
        } else
        {
            b.b(e, c);
            return;
        }
    }

    Photo(z z1, y y1, int i, ProfilePhoto profilephoto, int j)
    {
        f = z1;
        b = y1;
        c = i;
        d = profilephoto;
        e = j;
        super();
    }
}
