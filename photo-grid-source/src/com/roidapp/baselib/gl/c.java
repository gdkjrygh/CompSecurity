// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.gl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.roidapp.baselib.c.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.roidapp.baselib.gl:
//            GPUTestView

public final class c
{

    private static c a;
    private static final List e = Arrays.asList(new String[] {
        "GT-S5301", "GT-I9082", "GT-S7392", "GT-S6810", "GT-S6812", "GT-S5310", "GT-S5312", "GT-I9105", "GT-B5330", "GT-S5303", 
        "GT-I9060", "GT-S7270", "GT-S7272", "GT-I9150", "GT-I9152", "GT-S7580", "S5"
    });
    private static final List f = Arrays.asList(new String[0]);
    private static final List g = Arrays.asList(new String[0]);
    private String b;
    private boolean c;
    private List d;

    private c()
    {
        b = "";
        c = true;
    }

    public static c a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    public static void a(Handler handler, Context context, ViewGroup viewgroup)
    {
        if (viewgroup != null)
        {
            context = new GPUTestView(context);
            context.setId(16);
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
            context.setVisibility(0);
            viewgroup.addView(context);
            context.a(handler);
        }
    }

    public static boolean a(Context context)
    {
        boolean flag = false;
        if (TextUtils.isEmpty(context.getSharedPreferences("GPUINFO", 0).getString("GPU_MODEL", "")))
        {
            flag = true;
        }
        return flag;
    }

    private static boolean a(String s)
    {
        String s1 = Build.MODEL;
        String s2 = Build.DEVICE;
        return s1.startsWith(s) || s2.startsWith(s);
    }

    public static boolean b(Context context)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8 && !android.os.Build.VERSION.RELEASE.startsWith("2.1"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && n.b(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!n.a(f, context = Build.MODEL))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context)
    {
        if (n.a())
        {
            String s = Build.MODEL;
            boolean flag;
            if (n.a(g, s))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag && b(context))
            {
                return true;
            }
        }
        return false;
    }

    public final void a(Context context, String s)
    {
        b = s;
        context.getSharedPreferences("GPUINFO", 0).edit().putString("GPU_MODEL", s).apply();
    }

    public final void a(List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            d = new ArrayList(list);
            return;
        }
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final boolean b()
    {
        return c;
    }

    public final boolean c()
    {
label0:
        {
            List list;
            String s;
label1:
            {
                if (TextUtils.isEmpty(b) || !b.equalsIgnoreCase("VideoCore IV HW") && !b.contains("VideoCore IV") && !b.equalsIgnoreCase("N/A"))
                {
                    break label0;
                }
                s = Build.MODEL;
                List list1 = d;
                if (list1 != null)
                {
                    list = list1;
                    if (list1.size() != 0)
                    {
                        break label1;
                    }
                }
                list = e;
            }
            if (n.a(list, s))
            {
                return false;
            }
            return !n.a(list, Build.DEVICE);
        }
        return a("GT-S5360") || a("GT-S5363") || a("GT-S5367") || a("GT-S6102") || a("GT-B5512") || a("GT-S5830") || a("GT-S6802") || a("GT-S7272") || a("LG-P509") || a("GT-S5300");
    }

    public final boolean c(Context context)
    {
label0:
        {
            String s;
label1:
            {
                context = context.getSharedPreferences("GPUINFO", 0).getString("GPU_MODEL", "");
                if (!context.equalsIgnoreCase("VideoCore IV HW") && !context.contains("VideoCore IV"))
                {
                    break label0;
                }
                s = Build.MODEL;
                List list = d;
                if (list != null)
                {
                    context = list;
                    if (list.size() != 0)
                    {
                        break label1;
                    }
                }
                context = e;
            }
            if (n.a(context, s))
            {
                return true;
            }
            return n.a(context, Build.DEVICE);
        }
        return true;
    }

    public final String d(Context context)
    {
        if (TextUtils.isEmpty(b))
        {
            b = context.getSharedPreferences("GPUINFO", 0).getString("GPU_MODEL", "");
        }
        return b;
    }

    public final boolean e(Context context)
    {
        return b(context) && !c() && android.os.Build.VERSION.SDK_INT >= 11;
    }

}
