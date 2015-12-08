// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;

// Referenced classes of package p.ar:
//            f, g, c, a, 
//            b

public class d
{

    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c = false;
    private static final boolean d = false;

    public static boolean a(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            f f1;
            Intent intent;
            try
            {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            f1 = new f(null);
            intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, f1, 1))
            {
                context.unbindService(f1);
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        flag = false;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!c) goto _L2; else goto _L1
_L1:
        flag1 = flag;
_L4:
        return flag1;
_L2:
        f f1;
        f1 = new f(null);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        flag = flag2;
        if (!context.bindService(intent, f1, 1))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        boolean flag3 = (new g(f1.a())).a(true);
        flag = flag1;
        if (!flag3)
        {
            flag = true;
        }
        context.unbindService(f1);
_L5:
        flag1 = flag;
        if (!flag)
        {
            c = true;
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        context.unbindService(f1);
        flag = flag2;
          goto _L5
        obj;
        context.unbindService(f1);
        throw obj;
    }

    public static final c c(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (f(context))
        {
            boolean flag;
            try
            {
                flag = a(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                if (b(context))
                {
                    context = e(context);
                } else
                {
                    context = "none";
                }
                return new c(context);
            } else
            {
                return null;
            }
        } else
        {
            return d(context);
        }
    }

    public static c d(Context context)
    {
        String s1 = g(context);
        byte byte1 = 3;
        byte byte0 = 1;
        String s = s1;
        if (s1 == null)
        {
            s = h(context);
            byte1 = 7;
            byte0 = 2;
        }
        return new c(s, byte1, byte0);
    }

    private static String e(Context context)
    {
        Exception exception1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        String s = "";
        f f1 = new f(null);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, f1, 1))
        {
            try
            {
                s = (new g(f1.a())).a();
            }
            catch (Exception exception)
            {
                context.unbindService(f1);
                return "";
            }
            finally
            {
                context.unbindService(f1);
            }
            context.unbindService(f1);
        }
        return s;
        throw exception1;
    }

    private static boolean f(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT > 4)
        {
            if (d)
            {
                return true;
            } else
            {
                return p.ar.a.a(context);
            }
        } else
        {
            return false;
        }
    }

    private static final String g(Context context)
    {
        context = i(context);
        if (context != null && context.length() > 0 && !context.equals("unknown") && context.length() > 3 && !context.substring(0, 3).equals("***") && !context.substring(0, 3).equals("000"))
        {
            return context;
        } else
        {
            return null;
        }
    }

    private static final String h(Context context)
    {
        context = j(context);
        if (context != null && context.length() > 0)
        {
            return context;
        } else
        {
            return null;
        }
    }

    private static final String i(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
        {
            return p.ar.b.a(context);
        } else
        {
            return null;
        }
    }

    private static final String j(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 3)
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (context != null && context.length() > 0 && !"9774d56d682e549c".equals(context) && !"unknown".equals(context) && !"android_id".equals(context))
            {
                return context;
            }
        }
        return null;
    }

}
