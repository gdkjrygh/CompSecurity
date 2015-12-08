// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.crashlytics.android.internal:
//            cl

public class ai
{

    private final String a;
    private final Context b;

    public ai(cl cl1)
    {
        if (cl1.w() == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Sdk.start() first");
        } else
        {
            b = cl1.w();
            a = cl1.getClass().getName();
            return;
        }
    }

    public SharedPreferences a()
    {
        return b.getSharedPreferences(a, 0);
    }

    public boolean a(android.content.SharedPreferences.Editor editor)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            editor.apply();
            return true;
        } else
        {
            return editor.commit();
        }
    }

    public android.content.SharedPreferences.Editor b()
    {
        return a().edit();
    }
}
