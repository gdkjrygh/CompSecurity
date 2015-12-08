// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.b.a.a;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package b.a:
//            fg, hl, ff, fj, 
//            i, cz, d, e

public final class ia
{

    private static String c = null;
    private final String a = "a_start_time";
    private final String b = "a_end_time";

    public ia()
    {
    }

    public static void a(Context context)
    {
        SharedPreferences sharedpreferences;
        long l;
        long l2;
        long l4;
        sharedpreferences = context.getSharedPreferences("umeng_general_config", 0);
        if (sharedpreferences == null)
        {
            return;
        }
        l = sharedpreferences.getLong("a_start_time", 0L);
        l2 = sharedpreferences.getLong("a_end_time", 0L);
        l4 = System.currentTimeMillis();
        if (l == 0L || l4 - l >= a.l) goto _L2; else goto _L1
_L1:
        fg.b("MobclickAgent", "onResume called before onPause");
_L6:
        boolean flag = false;
_L4:
        Object obj;
        hl hl1;
        String s;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_572;
        }
        hl1 = b.a.hl.a(context);
        obj = ff.c(context);
        s = com.b.a.a.a(context);
        l = System.currentTimeMillis();
        if (s == null)
        {
            throw new RuntimeException("Appkey is null or empty, Please check AndroidManifest.xml");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (l4 - l2 <= a.l)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        Object obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(l).append(s).append(((String) (obj)));
        s = b.a.fj.a(((StringBuilder) (obj1)).toString());
        c = s;
        obj1 = context.getSharedPreferences("umeng_general_config", 0);
        String s1 = ((SharedPreferences) (obj1)).getString("session_id", null);
        if (s1 == null)
        {
            context = null;
        } else
        {
            long l5 = ((SharedPreferences) (obj1)).getLong("session_start_time", 0L);
            long l6 = ((SharedPreferences) (obj1)).getLong("session_end_time", 0L);
            long l1 = 0L;
            if (l6 != 0L)
            {
                long l3 = l6 - l5;
                l1 = l3;
                if (Math.abs(l3) > 0x5265c00L)
                {
                    l1 = 0L;
                }
            }
            i j = new i();
            j.a(s1);
            j.a(l5);
            j.b(l6);
            j.c(l1);
            double ad[] = com.b.a.a.b();
            if (ad != null)
            {
                cz cz1 = new cz(ad[0], ad[1], System.currentTimeMillis());
                if (j.k())
                {
                    j.a(cz1);
                } else
                {
                    j.b(Arrays.asList(new cz[] {
                        cz1
                    }));
                }
            }
            context = b.a.d.a(context);
            if (context != null)
            {
                j.a(context);
            }
            context = b.a.e.a(((SharedPreferences) (obj1)));
            if (context != null && context.size() > 0)
            {
                j.a(context);
            }
            context = ((SharedPreferences) (obj1)).edit();
            context.remove("session_start_time");
            context.remove("session_end_time");
            context.remove("a_start_time");
            context.remove("a_end_time");
            context.putString("activities", "");
            context.commit();
            context = j;
        }
        obj = sharedpreferences.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("session_id", s);
        ((android.content.SharedPreferences.Editor) (obj)).putLong("session_start_time", System.currentTimeMillis());
        ((android.content.SharedPreferences.Editor) (obj)).putLong("session_end_time", 0L);
        ((android.content.SharedPreferences.Editor) (obj)).putLong("a_start_time", System.currentTimeMillis());
        ((android.content.SharedPreferences.Editor) (obj)).putLong("a_end_time", 0L);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        if (context != null)
        {
            hl1.a(context);
        } else
        {
            hl1.a(null);
        }
        b.a.fg.a("MobclickAgent", (new StringBuilder("Start new session: ")).append(s).toString());
        return;
        context = sharedpreferences.getString("session_id", null);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putLong("a_start_time", System.currentTimeMillis());
        editor.putLong("a_end_time", 0L);
        editor.commit();
        b.a.fg.a("MobclickAgent", (new StringBuilder("Extend current session: ")).append(context).toString());
        return;
    }

    public static void b(Context context)
    {
        context = context.getSharedPreferences("umeng_general_config", 0);
        if (context == null)
        {
            return;
        }
        if (context.getLong("a_start_time", 0L) == 0L && a.h)
        {
            fg.b("MobclickAgent", "onPause called before onResume");
            return;
        } else
        {
            long l = System.currentTimeMillis();
            context = context.edit();
            context.putLong("a_start_time", 0L);
            context.putLong("a_end_time", l);
            context.putLong("session_end_time", l);
            context.commit();
            return;
        }
    }

    public static String c(Context context)
    {
        if (c == null)
        {
            c = context.getSharedPreferences("umeng_general_config", 0).getString("session_id", null);
        }
        return c;
    }

}
