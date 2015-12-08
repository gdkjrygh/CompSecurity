// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.Context;
import android.content.SharedPreferences;

public final class k
{

    private Context a;

    public k(Context context)
    {
        a = context;
    }

    public final int a()
    {
        return a.getSharedPreferences("music", 0).getInt("preference_last_effect_id", 5);
    }

    public final void a(float f)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("music", 0).edit();
        editor.putFloat("virtual_progress", f);
        editor.commit();
    }

    public final void a(int i)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("music", 0).edit();
        editor.putInt("preference_last_effect_id", i);
        editor.commit();
    }

    public final void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("music", 0).edit();
        editor.putBoolean("effect_enabled", flag);
        editor.commit();
    }

    public final void b(float f)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("music", 0).edit();
        editor.putFloat("bass_progress", f);
        editor.commit();
    }

    public final void b(int i)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("music", 0).edit();
        editor.putInt("reverb_spinner", i);
        editor.commit();
    }

    public final boolean b()
    {
        return a.getSharedPreferences("music", 0).getBoolean("effect_enabled", true);
    }

    public final int c()
    {
        return a.getSharedPreferences("music", 0).getInt("reverb_spinner", 0);
    }

    public final float d()
    {
        return a.getSharedPreferences("music", 0).getFloat("virtual_progress", 0.0F);
    }

    public final float e()
    {
        return a.getSharedPreferences("music", 0).getFloat("bass_progress", 0.0F);
    }
}
