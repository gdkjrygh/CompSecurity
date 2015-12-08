// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.b.a;
import java.util.Map;

// Referenced classes of package kik.android.chat.activity:
//            KikApiLandingActivity, k

final class w extends a
{

    final KikApiLandingActivity a;

    w(KikApiLandingActivity kikapilandingactivity, String s)
    {
        a = kikapilandingactivity;
        super(s);
    }

    public final void a(Map map, Map map1)
    {
        map1 = (String)map.get("username");
        if (map1 == null)
        {
            kik.android.chat.activity.KikApiLandingActivity.a(a);
            return;
        }
        map = map1;
        if (map1.endsWith("/"))
        {
            map = map1.substring(0, map1.length() - 1);
        }
        if ("me".equalsIgnoreCase(map))
        {
            kik.android.chat.activity.k.a(new kik.android.chat.fragment.KikPreferenceLaunchpad.a(), a).f();
            return;
        } else
        {
            kik.android.chat.activity.KikApiLandingActivity.a(a, map);
            return;
        }
    }
}
