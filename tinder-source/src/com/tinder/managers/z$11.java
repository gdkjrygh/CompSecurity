// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.ab;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            z

final class a
    implements com.android.volley.
{

    final ab a;
    final z b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("my profile: ")).append(obj);
        try
        {
            obj = b.a(true, ((JSONObject) (obj)));
            a.onProfileLoaded(((Loaded) (obj)).);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b((new StringBuilder("Error getting my profile: ")).append(obj).toString());
        }
        a.onProfileLoadFailed();
    }

    (z z1, ab ab1)
    {
        b = z1;
        a = ab1;
        super();
    }
}
