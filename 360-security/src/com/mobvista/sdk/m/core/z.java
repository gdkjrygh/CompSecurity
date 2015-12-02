// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.mobvista.sdk.m.a.d.a.h;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAdWall, WallIconCallback

final class z
    implements h
{

    final WallIconCallback a;
    final MobvistaAdWall b;

    z(MobvistaAdWall mobvistaadwall, WallIconCallback walliconcallback)
    {
        b = mobvistaadwall;
        a = walliconcallback;
        super();
    }

    public final void a(Bitmap bitmap, String s)
    {
        if (a != null && MobvistaAdWall.d(b) != null)
        {
            a.loaded(new BitmapDrawable(MobvistaAdWall.d(b).getResources(), bitmap));
        }
    }
}
