// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import android.app.Activity;
import android.content.Intent;
import com.facebook.base.activity.AppInitializationNotRequired;
import com.facebook.base.activity.a;
import com.facebook.c.s;

// Referenced classes of package com.facebook.base.a:
//            d

public class h extends a
{

    private final d a;
    private final Class b;
    private final s c;

    public h(d d1, s s1, Class class1)
    {
        a = d1;
        b = class1;
        c = s1;
    }

    public void f(Activity activity)
    {
        while (a.c() || com.facebook.common.annotations.a.a().b(activity.getClass(), com/facebook/base/activity/AppInitializationNotRequired)) 
        {
            return;
        }
        Intent intent = activity.getIntent();
        Intent intent1 = new Intent(activity, b);
        intent1.putExtra("return_intent", intent);
        c.a(intent1, activity);
        activity.finish();
    }
}
