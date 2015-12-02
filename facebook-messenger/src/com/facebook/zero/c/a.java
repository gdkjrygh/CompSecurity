// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.c;

import android.content.Context;
import android.preference.Preference;
import com.facebook.inject.t;
import com.facebook.o;

// Referenced classes of package com.facebook.zero.c:
//            b

public class a extends Preference
{

    private final com.facebook.zero.d.a a;

    public a(Context context)
    {
        super(context);
        a = (com.facebook.zero.d.a)t.a(context).a(com/facebook/zero/d/a);
        setOnPreferenceClickListener(new b(this));
        setTitle(o.preference_zero_rating_clear_preferences);
    }

    private void a()
    {
        a.b();
    }

    static void a(a a1)
    {
        a1.a();
    }
}
