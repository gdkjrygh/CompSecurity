// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ijoysoft.appwall:
//            x, v, b, GiftActivity, 
//            o

public final class a
{

    public static int a = 0;
    public static boolean b = true;
    public static boolean c;
    static ArrayList d;

    public static void a(Context context)
    {
        x.a(context);
        SharedPreferences sharedpreferences = context.getSharedPreferences("first_time", 0);
        if (sharedpreferences.getBoolean("first", true))
        {
            sharedpreferences.edit().putBoolean("first", false).commit();
            c = true;
            b = true;
            a(context, x.a(), x.c());
        }
        c = false;
    }

    private static void a(Context context, String s, String s1)
    {
        context = new v(new b(context));
        context.execute(new String[] {
            (new StringBuilder(String.valueOf(s))).append(s1).toString()
        });
        context.getStatus();
    }

    public static void a(Context context, ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        int i;
        new GiftActivity();
        GiftActivity.a(arraylist);
        d = arraylist;
        arraylist1 = new ArrayList();
        i = 0;
_L8:
        if (i < arraylist.size()) goto _L4; else goto _L3
_L3:
        a = d(context);
        Intent intent = new Intent();
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("Setting2", 0).edit();
        editor.putString("num", (new StringBuilder(String.valueOf(arraylist.size()))).toString());
        editor.commit();
        intent.setAction("popularize.newnum");
        intent.putExtra("newnum", (new StringBuilder(String.valueOf(arraylist.size()))).toString());
        context.sendBroadcast(intent);
        context = context.getSharedPreferences("title", 0).edit();
        context.putInt("title_num", arraylist1.size());
        context.commit();
_L6:
        return;
_L4:
        if (!a(context, ((o)arraylist.get(i)).b()))
        {
            arraylist1.add((o)arraylist.get(i));
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!b) goto _L6; else goto _L5
_L5:
        a(context, x.b(), x.d());
        b = false;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static boolean a(Context context, String s)
    {
        List list = context.getPackageManager().getInstalledPackages(0);
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            int i = 0;
            do
            {
                if (i >= list.size())
                {
                    return arraylist.contains(s);
                }
                arraylist.add(((PackageInfo)list.get(i)).packageName);
                i++;
            } while (true);
        }
        if (a(context, "com.skype.android.verizon"))
        {
            (new Intent()).setComponent(new ComponentName("com.skype.android.verizon", "com.skype.android.verizon.SkypeActivity"));
        }
        return true;
    }

    public static void b(Context context)
    {
        context.startActivity(new Intent(context, com/ijoysoft/appwall/GiftActivity));
    }

    public static boolean c(Context context)
    {
        context = context.getSharedPreferences("first_time", 0);
        if (context.getBoolean("first", true))
        {
            context.edit().putBoolean("first", false).commit();
            return true;
        } else
        {
            return false;
        }
    }

    public static int d(Context context)
    {
        return context.getSharedPreferences("title", 0).getInt("title_num", 0);
    }

}
