// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.common.b;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.umeng.analytics:
//            b, Gender, h, e, 
//            UmengOnlineConfigureListener

public class MobclickAgent
{

    private static final com.umeng.analytics.b a = new com.umeng.analytics.b();
    private static int b[];

    public MobclickAgent()
    {
    }

    static com.umeng.analytics.b a()
    {
        return a;
    }

    static int[] b()
    {
        int ai[] = b;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[Gender.values().length];
        try
        {
            ai[Gender.Female.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[Gender.Male.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[Gender.Unknown.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        b = ai;
        return ai;
    }

    public static void flush(Context context)
    {
        a.d(context);
    }

    public static String getConfigParams(Context context, String s)
    {
        return com.umeng.analytics.h.b(context).getString(s, "");
    }

    public static void onError(Context context)
    {
        a.b(context);
    }

    public static void onError(Context context, String s)
    {
        if (s == null || s.length() == 0)
        {
            Log.b("MobclickAgent", "unexpected empty appkey in onError");
            return;
        } else
        {
            a.b = s;
            onError(context);
            return;
        }
    }

    public static void onEvent(Context context, String s)
    {
        a.a(context, s, null, -1L, 1);
    }

    public static void onEvent(Context context, String s, int i)
    {
        a.a(context, s, null, -1L, i);
    }

    public static void onEvent(Context context, String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            Log.a("MobclickAgent", "label is null or empty");
            return;
        } else
        {
            a.a(context, s, s1, -1L, 1);
            return;
        }
    }

    public static void onEvent(Context context, String s, String s1, int i)
    {
        if (TextUtils.isEmpty(s1))
        {
            Log.a("MobclickAgent", "label is null or empty");
            return;
        } else
        {
            a.a(context, s, s1, -1L, i);
            return;
        }
    }

    public static void onEvent(Context context, String s, Map map)
    {
        a.a(context, s, map, -1L);
    }

    public static void onEventBegin(Context context, String s)
    {
        a.b(context, s);
    }

    public static void onEventBegin(Context context, String s, String s1)
    {
        a.a(context, s, s1);
    }

    public static void onEventDuration(Context context, String s, long l)
    {
        if (l <= 0L)
        {
            Log.a("MobclickAgent", "duration is not valid in onEventDuration");
            return;
        } else
        {
            a.a(context, s, null, l, 1);
            return;
        }
    }

    public static void onEventDuration(Context context, String s, String s1, long l)
    {
        if (TextUtils.isEmpty(s1))
        {
            Log.a("MobclickAgent", "label is null or empty");
            return;
        }
        if (l <= 0L)
        {
            Log.a("MobclickAgent", "duration is not valid in onEventDuration");
            return;
        } else
        {
            a.a(context, s, s1, l, 1);
            return;
        }
    }

    public static void onEventDuration(Context context, String s, Map map, long l)
    {
        if (l <= 0L)
        {
            Log.a("MobclickAgent", "duration is not valid in onEventDuration");
            return;
        } else
        {
            a.a(context, s, map, l);
            return;
        }
    }

    public static void onEventEnd(Context context, String s)
    {
        a.c(context, s);
    }

    public static void onEventEnd(Context context, String s, String s1)
    {
        a.b(context, s, s1);
    }

    public static void onKVEventBegin(Context context, String s, Map map, String s1)
    {
        a.a(context, s, map, s1);
    }

    public static void onKVEventEnd(Context context, String s, String s1)
    {
        a.c(context, s, s1);
    }

    public static void onPause(Context context)
    {
        a.a(context);
    }

    public static void onResume(Context context)
    {
        a.c(context);
    }

    public static void onResume(Context context, String s, String s1)
    {
        if (s == null || s.length() == 0)
        {
            Log.b("MobclickAgent", "unexpected empty appkey in onResume");
            return;
        } else
        {
            a.b = s;
            a.a = s1;
            a.c(context);
            return;
        }
    }

    public static void openActivityDurationTrack(boolean flag)
    {
        e.h = flag;
    }

    public static void reportError(Context context, String s)
    {
        a.a(context, s);
    }

    public static void setAutoLocation(boolean flag)
    {
        e.g = flag;
    }

    public static void setDebugMode(boolean flag)
    {
        Log.LOG = flag;
    }

    public static void setDefaultReportPolicy(Context context, int i)
    {
        Log.e("MobclickAgent", "\u6B64\u65B9\u6CD5\u4E0D\u518D\u4F7F\u7528\uFF0C\u8BF7\u4F7F\u7528\u5728\u7EBF\u53C2\u6570\u914D\u7F6E\uFF0C\u53D1\u9001\u7B56\u7565");
    }

    public static void setEnableEventBuffer(boolean flag)
    {
        e.k = flag;
    }

    public static void setOnlineConfigureListener(UmengOnlineConfigureListener umengonlineconfigurelistener)
    {
        a.c = umengonlineconfigurelistener;
    }

    public static void setOpenGLContext(GL10 gl10)
    {
        if (gl10 != null)
        {
            gl10 = com.umeng.common.b.a(gl10);
            if (gl10.length == 2)
            {
                a.d = gl10[0];
                a.e = gl10[1];
            }
        }
    }

    public static void setSessionContinueMillis(long l)
    {
        e.d = l;
    }

    public static void updateOnlineConfig(Context context)
    {
        a.e(context);
    }

    public static void updateOnlineConfig(Context context, String s, String s1)
    {
        if (s == null || s.length() == 0)
        {
            Log.b("MobclickAgent", "unexpected empty appkey in onResume");
            return;
        } else
        {
            a.b = s;
            a.a = s1;
            a.e(context);
            return;
        }
    }

    public void setAge(Context context, int i)
    {
        context = h.a(context);
        if (i < 0 || i > 200)
        {
            Log.a("MobclickAgent", "not a valid age!");
            return;
        } else
        {
            context.edit().putInt("age", i).commit();
            return;
        }
    }

    public void setGender(Context context, Gender gender)
    {
        int i;
        boolean flag;
        flag = false;
        context = h.a(context);
        i = ((flag) ? 1 : 0);
        b()[gender.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 68
    //                   2 73
    //                   3 47;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        i = ((flag) ? 1 : 0);
_L6:
        context.edit().putInt("gender", i).commit();
        return;
_L2:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setUserID(Context context, String s, String s1)
    {
        context = h.a(context);
        if (TextUtils.isEmpty(s))
        {
            Log.a("MobclickAgent", "userID is null or empty");
            return;
        }
        context.edit().putString("user_id", s).commit();
        if (TextUtils.isEmpty(s1))
        {
            Log.a("MobclickAgent", "id source is null or empty");
            return;
        } else
        {
            context.edit().putString("id_source", s1).commit();
            return;
        }
    }

}
