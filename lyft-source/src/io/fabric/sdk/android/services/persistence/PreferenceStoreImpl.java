// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Kit;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//            PreferenceStore

public class PreferenceStoreImpl
    implements PreferenceStore
{

    private final SharedPreferences a;
    private final String b;
    private final Context c;

    public PreferenceStoreImpl(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            c = context;
            b = s;
            a = c.getSharedPreferences(b, 0);
            return;
        }
    }

    public PreferenceStoreImpl(Kit kit)
    {
        this(kit.C(), kit.getClass().getName());
    }

    public SharedPreferences a()
    {
        return a;
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
        return a.edit();
    }
}
