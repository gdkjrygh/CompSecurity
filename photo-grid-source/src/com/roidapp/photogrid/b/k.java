// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import android.app.Application;
import android.content.SharedPreferences;
import com.roidapp.baselib.c.aj;

// Referenced classes of package com.roidapp.photogrid.b:
//            e

public final class k
{

    private static k b;
    private SharedPreferences a;

    private k()
    {
        a = null;
        com.roidapp.photogrid.b.e.a();
        a = aj.a().getSharedPreferences("infoc_preference", 0);
    }

    private int a(String s, int l)
    {
        com.roidapp.photogrid.b.e.a();
        return a.getInt(s, l);
    }

    public static k a()
    {
        com/roidapp/photogrid/b/k;
        JVM INSTR monitorenter ;
        k k1;
        if (b == null)
        {
            b = new k();
        }
        k1 = b;
        com/roidapp/photogrid/b/k;
        JVM INSTR monitorexit ;
        return k1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(String s, float f1)
    {
        com.roidapp.photogrid.b.e.a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putFloat(s, f1);
        editor.apply();
    }

    private float b(String s)
    {
        com.roidapp.photogrid.b.e.a();
        return a.getFloat(s, 0.0F);
    }

    private void b(String s, int l)
    {
        com.roidapp.photogrid.b.e.a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putInt(s, l);
        editor.apply();
    }

    public final String a(String s, String s1)
    {
        com.roidapp.photogrid.b.e.a();
        return a.getString(s, s1);
    }

    public final void a(float f1)
    {
        a("PG_LAST_OUTER_BORDER", f1);
    }

    public final void a(int l)
    {
        b("pg_last_grid_mode", l);
    }

    public final void a(long l, String s)
    {
        b("InfocReportAvailable", (new StringBuilder()).append(Long.toString(l)).append("-").append(s).toString());
    }

    public final boolean a(String s)
    {
        com.roidapp.photogrid.b.e.a();
        return a.getBoolean(s, true);
    }

    public final int b()
    {
        return a("pg_last_grid_mode", 1);
    }

    public final void b(float f1)
    {
        a("pg_last_corner_radious", f1);
    }

    public final void b(int l)
    {
        b("pg_last_grid_bg_color", l);
    }

    public final void b(String s, String s1)
    {
        com.roidapp.photogrid.b.e.a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString(s, s1);
        editor.apply();
    }

    public final int c()
    {
        return a("pg_last_grid_bg_color", -20);
    }

    public final void c(int l)
    {
        b("pg_last_grid_bg_patten0", l);
    }

    public final int d()
    {
        return a("pg_last_grid_bg_patten0", 4);
    }

    public final void d(int l)
    {
        b("pg_last_grid_bg_patten1", l);
    }

    public final int e()
    {
        return a("pg_last_grid_bg_patten1", 4);
    }

    public final void e(int l)
    {
        b("pg_last_shape_index", l);
    }

    public final float f()
    {
        return b("PG_LAST_OUTER_BORDER");
    }

    public final void f(int l)
    {
        b("pg_last_filter_image_code", l);
    }

    public final float g()
    {
        return b("pg_last_corner_radious");
    }

    public final void g(int l)
    {
        b("pg_last_crop_image_code", l);
    }

    public final int h()
    {
        return a("pg_last_shape_index", 0);
    }

    public final int i()
    {
        return a("pg_last_filter_image_code", 0);
    }

    public final int j()
    {
        return a("pg_last_crop_image_code", 0);
    }
}
