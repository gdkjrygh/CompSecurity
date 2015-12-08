// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.b.a;
import java.util.Map;

// Referenced classes of package kik.android.chat.activity:
//            KikApiLandingActivity

final class z extends a
{

    final KikApiLandingActivity a;

    z(KikApiLandingActivity kikapilandingactivity, String s)
    {
        a = kikapilandingactivity;
        super(s);
    }

    public final void a(Map map, Map map1)
    {
        map = (String)map.get("parameters");
        int i = map.indexOf("?");
        if (i < 0)
        {
            KikApiLandingActivity.b(a, "Invalid Request");
            return;
        }
        map = kik.a.f.e.a.a(map.substring(0, i), map1, map);
        if (map == null)
        {
            KikApiLandingActivity.b(a, "Invalid Request");
            return;
        } else
        {
            kik.android.chat.activity.KikApiLandingActivity.a(a, map);
            return;
        }
    }
}
