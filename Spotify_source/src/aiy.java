// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;

public final class aiy
{

    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c = false;

    public static boolean a(Context context)
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
        aiz aiz1;
        aiz1 = new aiz((byte)0);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        flag = flag2;
        if (!context.bindService(intent, aiz1, 1))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        boolean flag3 = (new aja(aiz1.a())).b();
        flag = flag1;
        if (!flag3)
        {
            flag = true;
        }
        context.unbindService(aiz1);
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
        context.unbindService(aiz1);
        flag = flag2;
          goto _L5
        obj;
        context.unbindService(aiz1);
        throw obj;
    }

    public static final aix b(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT > 4)
        {
            flag = aiv.a(context);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                flag = d(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                if (a(context))
                {
                    context = e(context);
                } else
                {
                    context = "none";
                }
                return new aix(context);
            } else
            {
                return null;
            }
        } else
        {
            return c(context);
        }
    }

    public static aix c(Context context)
    {
        String s;
        byte byte1;
        byte byte0;
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
        {
            s = aiw.a();
        } else
        {
            s = null;
        }
        if (s == null || s.length() <= 0 || s.equals("unknown") || s.length() <= 3 || s.substring(0, 3).equals("***") || s.substring(0, 3).equals("000"))
        {
            s = null;
        }
        byte0 = 1;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() < 3) goto _L2; else goto _L1
_L1:
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context == null || context.length() <= 0 || "9774d56d682e549c".equals(context) || "unknown".equals(context) || "android_id".equals(context)) goto _L2; else goto _L3
_L3:
        if (context == null || context.length() <= 0)
        {
            context = null;
        }
        byte1 = 7;
        byte0 = 2;
_L4:
        return new aix(context, byte1, byte0);
_L2:
        context = null;
          goto _L3
        byte1 = 3;
        context = s;
          goto _L4
    }

    private static boolean d(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            aiz aiz1;
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
            aiz1 = new aiz((byte)0);
            intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aiz1, 1))
            {
                context.unbindService(aiz1);
                return true;
            }
        }
        return false;
    }

    private static String e(Context context)
    {
        Exception exception1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        String s = "";
        aiz aiz1 = new aiz((byte)0);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, aiz1, 1))
        {
            try
            {
                s = (new aja(aiz1.a())).a();
            }
            catch (Exception exception)
            {
                context.unbindService(aiz1);
                return "";
            }
            finally
            {
                context.unbindService(aiz1);
            }
            context.unbindService(aiz1);
        }
        return s;
        throw exception1;
    }

}
