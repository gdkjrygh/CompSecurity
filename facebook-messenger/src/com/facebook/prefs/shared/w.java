// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.Context;
import com.facebook.d.d.a;
import com.google.common.a.es;

// Referenced classes of package com.facebook.prefs.shared:
//            y

public class w extends a
{

    private static final es a = es.d();
    private final y b;

    public w(Context context, com.facebook.common.executors.a a1, com.facebook.d.b.a a2, y y)
    {
        super(context, a1, a2, es.a(y), "non_cached_preferences_db", a);
        b = y;
    }

}
