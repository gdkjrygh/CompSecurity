// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mobvista.sdk.m.a.a.c.d;

// Referenced classes of package com.mobvista.sdk.m.core:
//            y, WallIconCallback, MobvistaAdWall

final class x
    implements d
{

    final String a;
    final WallIconCallback b;
    final SharedPreferences c;
    final MobvistaAdWall d;

    x(MobvistaAdWall mobvistaadwall, String s, WallIconCallback walliconcallback, SharedPreferences sharedpreferences)
    {
        d = mobvistaadwall;
        a = s;
        b = walliconcallback;
        c = sharedpreferences;
        super();
    }

    public final void OnLoadCanceled(int i)
    {
    }

    public final void OnLoadError(int i, String s)
    {
    }

    public final void OnLoadFinish(int i, Object obj)
    {
        if (obj != null)
        {
            obj = obj.toString();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && (TextUtils.isEmpty(a) || !a.equals(obj)))
            {
                com.mobvista.sdk.m.a.d.a.d.a().a(((String) (obj)), new y(this, ((String) (obj))));
            }
        }
    }

    public final void OnLoadStart(int i)
    {
    }
}
