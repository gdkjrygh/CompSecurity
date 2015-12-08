// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.b.a;
import java.util.Map;

// Referenced classes of package kik.android.chat.activity:
//            KikApiLandingActivity

final class x extends a
{

    final KikApiLandingActivity a;

    x(KikApiLandingActivity kikapilandingactivity, String s)
    {
        a = kikapilandingactivity;
        super(s);
    }

    public final void a(Map map, Map map1)
    {
        if ((String)map.get("tag") == null)
        {
            kik.android.chat.activity.KikApiLandingActivity.a(a);
            return;
        } else
        {
            KikApiLandingActivity.b(a);
            return;
        }
    }
}
