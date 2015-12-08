// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.content.Context;
import b.a.fg;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.b.a:
//            n

public final class b
{

    private static final n a = new n();

    public static void a(Context context)
    {
        a.b(context);
    }

    public static void a(Context context, String s, Map map)
    {
        if (map == null)
        {
            fg.b("MobclickAgent", "input map is null");
            return;
        } else
        {
            a.a(context, s, new HashMap(map));
            return;
        }
    }

    public static void b(Context context)
    {
        if (context == null)
        {
            fg.b("MobclickAgent", "unexpected null context in onResume");
            return;
        } else
        {
            a.a(context);
            return;
        }
    }

}
