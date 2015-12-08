// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.graphics.Rect;
import android.support.v4.view.am;
import android.support.v4.view.r;
import android.support.v4.view.x;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//            ScrimInsetsFrameLayout

final class a
    implements r
{

    final ScrimInsetsFrameLayout a;

    public final am a(View view, am am1)
    {
        if (ScrimInsetsFrameLayout.a(a) == null)
        {
            ScrimInsetsFrameLayout.a(a, new Rect());
        }
        ScrimInsetsFrameLayout.a(a).set(am1.a(), am1.b(), am1.c(), am1.d());
        view = a;
        boolean flag;
        if (ScrimInsetsFrameLayout.a(a).isEmpty() || ScrimInsetsFrameLayout.b(a) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setWillNotDraw(flag);
        x.d(a);
        return am1.f();
    }

    (ScrimInsetsFrameLayout scriminsetsframelayout)
    {
        a = scriminsetsframelayout;
        super();
    }
}
