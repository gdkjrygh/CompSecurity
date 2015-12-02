// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.common.e.h;
import com.facebook.common.executors.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.prefs.shared:
//            j, DefaultSharedPreferences, h

public final class q extends d
{

    public q()
    {
    }

    public j a()
    {
        return new j((Context)a(android/content/Context), (ContentResolver)a(android/content/ContentResolver), (a)a(com/facebook/common/executors/a), (SharedPreferences)a(android/content/SharedPreferences, com/facebook/prefs/shared/DefaultSharedPreferences), (com.facebook.prefs.shared.h)a(com/facebook/prefs/shared/h), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj instanceof q;
    }
}
