// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.b.a;
import java.util.Map;

// Referenced classes of package kik.android.chat.activity:
//            KikApiLandingActivity, k

final class u extends a
{

    final KikApiLandingActivity a;

    u(KikApiLandingActivity kikapilandingactivity, String s)
    {
        a = kikapilandingactivity;
        super(s);
    }

    public final void a(Map map, Map map1)
    {
        map = (String)map.get("username");
        if (map == null)
        {
            kik.android.chat.activity.KikApiLandingActivity.a(a);
            return;
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
