// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.mobvista.sdk.m.a.d.a.h;
import com.mobvista.sdk.m.core.util.a;

// Referenced classes of package com.mobvista.sdk.m.core:
//            x, MobvistaAdWall, WallIconCallback

final class y
    implements h
{

    final String a;
    final x b;

    y(x x1, String s)
    {
        b = x1;
        a = s;
        super();
    }

    public final void a(Bitmap bitmap, String s)
    {
        if (b.b != null && MobvistaAdWall.d(b.d) != null)
        {
            b.b.loaded(new BitmapDrawable(MobvistaAdWall.d(b.d).getResources(), bitmap));
        }
        bitmap = com.mobvista.sdk.m.core.util.a.b(a);
        s = b.c.edit();
        s.putString("AD_WALL_ICON_URL", a);
        s.putString("AD_WALL_ICON_FILE", bitmap);
        s.commit();
    }
}
