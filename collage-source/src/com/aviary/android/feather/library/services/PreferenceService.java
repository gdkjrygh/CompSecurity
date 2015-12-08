// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.Context;
import android.content.SharedPreferences;
import com.aviary.android.feather.common.utils.g;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController

public class PreferenceService extends BaseContextService
{

    private SharedPreferences d;

    public PreferenceService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
        d = iaviarycontroller.a().getSharedPreferences("com.aviary.android.feather.library", 7);
    }

    public long a(String s, long l)
    {
        return d.getLong(s, l);
    }

    public void a(com.aviary.android.feather.library.filters.a.a a1)
    {
        b((new StringBuilder()).append("badge.tool.").append(a1.name()).toString(), System.currentTimeMillis());
    }

    public boolean a(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = d.edit();
        editor.putInt(s, i);
        return editor.commit();
    }

    public boolean a(String s, boolean flag)
    {
        Object obj;
        boolean flag1;
        try
        {
            obj = d().a();
            obj = g.a("com.aviary.android.feather.utils.SettingsUtils", "getInstance", new Class[] {
                android/content/Context
            }, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return flag;
        }
        flag1 = flag;
        if (obj != null)
        {
            try
            {
                s = (Boolean)g.a(obj, "getBoolean", new Class[] {
                    java/lang/String, Boolean.TYPE
                }, new Object[] {
                    s, Boolean.valueOf(flag)
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return flag;
            }
            flag1 = s.booleanValue();
        }
        return flag1;
    }

    public long b(com.aviary.android.feather.library.filters.a.a a1)
    {
        return a((new StringBuilder()).append("badge.tool.").append(a1.name()).toString(), 0L);
    }

    public void b()
    {
        d = null;
    }

    public boolean b(String s, long l)
    {
        android.content.SharedPreferences.Editor editor = d.edit();
        editor.putLong(s, l);
        return editor.commit();
    }
}
