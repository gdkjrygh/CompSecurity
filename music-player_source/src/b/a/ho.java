// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public final class ho
{

    private final String a = "umeng_event_snapshot";
    private boolean b;
    private SharedPreferences c;
    private Map d;

    public ho(Context context)
    {
        b = false;
        d = new HashMap();
        c = context.getSharedPreferences("umeng_event_snapshot", 0);
    }

    public final void a(boolean flag)
    {
        b = flag;
    }
}
