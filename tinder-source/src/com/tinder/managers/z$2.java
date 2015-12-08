// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.text.TextUtils;
import com.tinder.enums.Gender;
import com.tinder.f.ak;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.tinder.managers:
//            z, ad, ae, ManagerApp, 
//            aa

final class c
    implements com.tinder.utils.._cls2
{

    final ad a;
    final ae b;
    final User c;
    final z d;

    public final Object a()
    {
        SparksEvent sparksevent;
        boolean flag;
        flag = false;
        sparksevent = new SparksEvent("User");
        if (!a.i || !a.b()) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
_L4:
        Object obj = new ArrayList(1);
        HashMap hashmap = new HashMap(3);
        hashmap.put("new_match", Boolean.valueOf(ae.g()));
        hashmap.put("new_message", Boolean.valueOf(ae.h()));
        hashmap.put("super_like", Boolean.valueOf(ae.b()));
        ((ArrayList) (obj)).add(hashmap);
        sparksevent.put("name", c.getName());
        sparksevent.put("age", c.getAge());
        sparksevent.put("gender", Integer.valueOf(c.getGender().getBackendId()));
        sparksevent.put("bio", c.getBio());
        sparksevent.put("targetGender", Integer.valueOf(byte0));
        sparksevent.put("minTargetAge", Integer.valueOf(a.f));
        sparksevent.put("maxTargetAge", Integer.valueOf(a.g));
        sparksevent.put("radius", Float.valueOf(a.a()));
        sparksevent.put("pushOptions", obj);
        sparksevent.put("discoveryOn", Boolean.valueOf(a.k));
        sparksevent.put("createTs", ae.f());
        ManagerApp.h().n();
        obj = aa.a();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            sparksevent.put("tinderPlusSku", obj);
        }
        return sparksevent;
_L2:
        byte0 = flag;
        if (!a.i)
        {
            byte0 = flag;
            if (a.b())
            {
                byte0 = 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    gerApp(z z1, ad ad1, ae ae1, User user)
    {
        d = z1;
        a = ad1;
        b = ae1;
        c = user;
        super();
    }
}
