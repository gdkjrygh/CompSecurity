// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.a.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.baidu.android.pushservice.a;
import com.baidu.android.pushservice.a.a.e;
import com.baidu.android.pushservice.a.a.g;

// Referenced classes of package com.baidu.android.pushservice.a.b:
//            f, e, d, i, 
//            g, h, b, a

public class c
{

    static f a(a a1, Context context, String s, String s1)
    {
        return b(a1, context, s, s1);
    }

    public static void a(int j, Context context, String s, String s1, String s2, String s3, PendingIntent pendingintent, Intent intent)
    {
        String s4;
label0:
        {
            if (!TextUtils.isEmpty(s1))
            {
                s4 = s1.trim();
                if (!TextUtils.isEmpty(s4))
                {
                    break label0;
                }
            }
            if (com.baidu.android.pushservice.a.b())
            {
                Log.e("AdvertiseNotificationManager", "showNotification the contentTitle is invalid, the notification will not pop Up");
            }
            return;
        }
        s1 = s4;
        if (s4.length() > 32)
        {
            s1 = s4.substring(0, 31);
        }
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String s5 = s.trim();
        if (!TextUtils.isEmpty(s5)) goto _L3; else goto _L2
_L2:
        s = " ";
_L5:
        if (!a(s2))
        {
            s2 = "null";
        }
        if (!a(s3))
        {
            s3 = "null";
        }
        a(com.baidu.android.pushservice.a.b.a.a(j), context, s, s1, s2, s3, pendingintent, intent);
        return;
_L3:
        s = s5;
        if (s5.length() > 64)
        {
            s = s5.substring(0, 63);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static transient void a(int j, Context context, String s, String s1, String s2, String s3, String s4, PendingIntent pendingintent, 
            Intent aintent[])
    {
        String s5;
label0:
        {
            if (!TextUtils.isEmpty(s1))
            {
                s5 = s1.trim();
                if (!TextUtils.isEmpty(s5))
                {
                    break label0;
                }
            }
            if (com.baidu.android.pushservice.a.b())
            {
                Log.e("AdvertiseNotificationManager", "showNotification the contentTitle is invalid, the notification will not pop Up");
            }
            return;
        }
        s1 = s5;
        if (s5.length() > 32)
        {
            s1 = s5.substring(0, 31);
        }
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String s6 = s.trim();
        if (!TextUtils.isEmpty(s6)) goto _L3; else goto _L2
_L2:
        s = " ";
_L5:
        if (!a(s4))
        {
            a(1, context, s, s1, s2, s3, pendingintent, aintent[0]);
            return;
        }
        break; /* Loop/switch isn't completed */
_L3:
        s = s6;
        if (s6.length() > 64)
        {
            s = s6.substring(0, 63);
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!a(s2))
        {
            s2 = "null";
        }
        if (!a(s3))
        {
            s3 = "null";
        }
        a(com.baidu.android.pushservice.a.b.a.a(j), context, s, s1, s2, s3, s4, pendingintent, aintent);
        return;
    }

    private static void a(a a1, Context context, String s, String s1, String s2, String s3, PendingIntent pendingintent, Intent intent)
    {
        a1 = b(a1, context, s1, s);
        s = intent.getStringExtra("msg_id");
        a1.a(intent);
        a1.a(pendingintent);
        com.baidu.android.pushservice.a.a.e.a().a(context, new com.baidu.android.pushservice.a.b.e(context, a1, s), new Uri[] {
            Uri.parse(s2), Uri.parse(s3)
        });
    }

    private static transient void a(a a1, Context context, String s, String s1, String s2, String s3, String s4, PendingIntent pendingintent, 
            Intent aintent[])
    {
        f f1 = null;
        if (a.d != a1) goto _L2; else goto _L1
_L1:
        f1 = b(a.d, context, s1, s);
_L4:
        a1 = aintent[0].getStringExtra("msg_id");
        int k = aintent.length;
        for (int j = 0; j < k; j++)
        {
            f1.a(aintent[j]);
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (com.baidu.android.pushservice.a.b.a.e == a1)
        {
            f1 = b(com.baidu.android.pushservice.a.b.a.e, context, s1, s);
        }
        if (true) goto _L4; else goto _L3
_L3:
        f1.a(pendingintent);
        com.baidu.android.pushservice.a.a.e.a().a(context, new d(f1, context, s1, s, a1), new Uri[] {
            Uri.parse(s2), Uri.parse(s3), Uri.parse(s4)
        });
        return;
    }

    private static void a(f f1, String s, String s1)
    {
        f1.a(System.currentTimeMillis());
        f1.a(s);
        f1.b(s1);
    }

    private static boolean a()
    {
        return Build.MANUFACTURER.contains("HUAWEI") && (Build.MODEL.contains("PE") || Build.MODEL.contains("H60"));
    }

    private static boolean a(String s)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s.trim()))
        {
            return false;
        } else
        {
            return com.baidu.android.pushservice.a.a.g.a(Uri.parse(s));
        }
    }

    private static f b(a a1, Context context, String s, String s1)
    {
        RemoteViews remoteviews;
        boolean flag;
        a a2;
label0:
        {
            if (b())
            {
                return new i(context, s, s1);
            }
            if (a1 != a.d)
            {
                a2 = a1;
                if (a1 != com.baidu.android.pushservice.a.b.a.e)
                {
                    break label0;
                }
            }
            a2 = a1;
            if (c())
            {
                a2 = com.baidu.android.pushservice.a.b.a.a;
            }
        }
        if (f())
        {
            remoteviews = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_normal_layout_xiaomi"));
        } else
        if (h())
        {
            remoteviews = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_normal_layout_xiaomi_1s"));
        } else
        if (a())
        {
            remoteviews = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_normal_layout_honor"));
        } else
        {
            remoteviews = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_normal_layout"));
        }
        com.baidu.android.pushservice.a.b._cls1.a[a2.ordinal()];
        JVM INSTR tableswitch 1 5: default 116
    //                   1 232
    //                   2 323
    //                   3 414
    //                   4 470
    //                   5 634;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        a1 = new i(context, s, s1);
        flag = false;
_L12:
        if (flag)
        {
            a1 = new i(context, s, s1);
        }
        a(a1, s, s1);
        return a1;
_L2:
        if (!com.baidu.android.pushservice.a.b.g.c(context))
        {
            a1 = null;
            flag = true;
        } else
        {
            a1 = new h(remoteviews, context);
            if (d())
            {
                a1.b(0xff020202);
                a1.a(0xff6d6d6d);
                a1.c(0xfff0f0f0);
                flag = false;
            } else
            {
                a1.b(-1);
                a1.a(0xff686868);
                a1.c(0xff000000);
                flag = false;
            }
        }
          goto _L7
_L3:
        if (!com.baidu.android.pushservice.a.b.g.c(context))
        {
            a1 = null;
            flag = true;
        } else
        {
            a1 = new h(remoteviews, context);
            if (d())
            {
                a1.b(0xff020202);
                a1.a(0xff6d6d6d);
                a1.c(0xfff0f0f0);
                flag = false;
            } else
            {
                a1.b(-1);
                a1.a(0xff6d6d6d);
                a1.c(0xff2b2b2b);
                flag = false;
            }
        }
          goto _L7
_L4:
        if (!com.baidu.android.pushservice.a.b.g.c(context))
        {
            a1 = null;
            flag = true;
        } else
        {
            a1 = new h(remoteviews, context);
            a1.b(0xff020202);
            a1.a(0xff6d6d6d);
            a1.c(0xfff0f0f0);
            flag = false;
        }
          goto _L7
_L5:
        if (!com.baidu.android.pushservice.a.b.g.b(context))
        {
            a1 = null;
            flag = true;
        } else
        {
            if (f())
            {
                a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_picture_layout_xiaomi"));
            } else
            if (a())
            {
                a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_picture_layout_honor"));
            } else
            {
                a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_picture_layout"));
            }
            a1 = new b(remoteviews, a1, context);
            if (d())
            {
                a1.b(0xff020202);
                a1.a(0xff6d6d6d);
                a1.c(0xfff0f0f0);
                flag = false;
            } else
            {
                a1.b(-1);
                a1.a(0xff686868);
                a1.c(0xff000000);
                flag = false;
            }
        }
          goto _L7
_L6:
        if (com.baidu.android.pushservice.a.b.g.a(context)) goto _L9; else goto _L8
_L8:
        a1 = null;
        flag = true;
          goto _L7
_L9:
        if (!f()) goto _L11; else goto _L10
_L10:
        a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout_xiaomi"));
_L13:
        a1 = new com.baidu.android.pushservice.a.b.a(remoteviews, a1, context);
        if (!d())
        {
            a1.b(-1);
            a1.a(0xff686868);
            a1.c(0xff000000);
            flag = false;
        } else
        {
            flag = false;
        }
_L7:
        if (true) goto _L12; else goto _L11
_L11:
        if (h())
        {
            a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout_xiaomi_1s"));
        } else
        if (d())
        {
            a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout_bbk"));
        } else
        if (e())
        {
            a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout_9250"));
        } else
        if (g())
        {
            a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout_2k"));
        } else
        if (a())
        {
            a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout_honor"));
        } else
        {
            a1 = new RemoteViews(context.getPackageName(), com.baidu.android.pushservice.a.b.g.b(context, "advertise_advance_bigstyle_layout"));
        }
          goto _L13
    }

    private static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT < 15;
    }

    private static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT < 16;
    }

    private static boolean d()
    {
        return (Build.MANUFACTURER.contains("BBK") || Build.MANUFACTURER.contains("vivo")) && Build.BRAND.contains("vivo") && (Build.MODEL.contains("X1St") || Build.MODEL.contains("vivo X3L") || Build.MODEL.contains("Y11"));
    }

    private static boolean e()
    {
        return Build.MANUFACTURER.contains("Baidu") && Build.MODEL.contains("9250");
    }

    private static boolean f()
    {
        return Build.MANUFACTURER.contains("Xiaomi") && (Build.MODEL.contains("MI 4") || Build.MODEL.contains("MI 3"));
    }

    private static boolean g()
    {
        return Build.MANUFACTURER.contains("motorola") && Build.BRAND.contains("google") && Build.MODEL.contains("Nexus 6");
    }

    private static boolean h()
    {
        return Build.MANUFACTURER.contains("Xiaomi") && Build.MODEL.contains("HM 1S");
    }

    /* member class not found */
    class a {}


    /* member class not found */
    class _cls1 {}

}
