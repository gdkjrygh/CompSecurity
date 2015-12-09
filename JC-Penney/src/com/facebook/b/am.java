// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.facebook.b:
//            al

final class am
    implements Runnable
{

    final String a;
    final Context b;
    final String c;

    am(String s, Context context, String s1)
    {
        a = s;
        b = context;
        c = s1;
        super();
    }

    public void run()
    {
        JSONObject jsonobject = al.e(a);
        if (jsonobject != null)
        {
            al.a(a, jsonobject);
            b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(c, jsonobject.toString()).apply();
        }
        al.a().set(false);
    }
}
