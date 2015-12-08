// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            wq, wn

public final class wr
{

    private static final Method a = a();
    private static final Method b = b();
    private static final Method c = c();
    private static final Method d = d();
    private static final Method e = e();

    private static WorkSource a(int i, String s)
    {
        WorkSource worksource = new WorkSource();
        if (b != null)
        {
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            try
            {
                b.invoke(worksource, new Object[] {
                    Integer.valueOf(i), s1
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", s);
                return worksource;
            }
        } else
        if (a != null)
        {
            try
            {
                a.invoke(worksource, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", s);
                return worksource;
            }
            return worksource;
        }
        return worksource;
    }

    public static WorkSource a(Context context, String s)
    {
        if (context == null || context.getPackageManager() == null)
        {
            return null;
        }
        try
        {
            context = context.getPackageManager().getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("WorkSourceUtil", (new StringBuilder("Could not find package: ")).append(s).toString());
            return null;
        }
        if (context == null)
        {
            Log.e("WorkSourceUtil", (new StringBuilder("Could not get applicationInfo from package: ")).append(s).toString());
            return null;
        } else
        {
            return a(((ApplicationInfo) (context)).uid, s);
        }
    }

    private static String a(WorkSource worksource, int i)
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        worksource = (String)e.invoke(worksource, new Object[] {
            Integer.valueOf(i)
        });
        return worksource;
        worksource;
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", worksource);
        return null;
    }

    private static Method a()
    {
        Method method;
        try
        {
            method = android/os/WorkSource.getMethod("add", new Class[] {
                Integer.TYPE
            });
        }
        catch (Exception exception)
        {
            return null;
        }
        return method;
    }

    public static List a(WorkSource worksource)
    {
        Object obj;
        int i;
        int j;
        j = 0;
        if (worksource == null)
        {
            i = 0;
        } else
        {
            i = b(worksource);
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        obj = Collections.EMPTY_LIST;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        do
        {
            obj = arraylist;
            if (j >= i)
            {
                continue;
            }
            obj = a(worksource, j);
            if (!wq.a(((String) (obj))))
            {
                arraylist.add(obj);
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(Context context)
    {
        return context.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }

    private static int b(WorkSource worksource)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        int i = ((Integer)c.invoke(worksource, new Object[0])).intValue();
        return i;
        worksource;
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", worksource);
        return 0;
    }

    private static Method b()
    {
        Method method = null;
        if (wn.f())
        {
            try
            {
                method = android/os/WorkSource.getMethod("add", new Class[] {
                    Integer.TYPE, java/lang/String
                });
            }
            catch (Exception exception)
            {
                return null;
            }
        }
        return method;
    }

    private static Method c()
    {
        Method method;
        try
        {
            method = android/os/WorkSource.getMethod("size", new Class[0]);
        }
        catch (Exception exception)
        {
            return null;
        }
        return method;
    }

    private static Method d()
    {
        Method method;
        try
        {
            method = android/os/WorkSource.getMethod("get", new Class[] {
                Integer.TYPE
            });
        }
        catch (Exception exception)
        {
            return null;
        }
        return method;
    }

    private static Method e()
    {
        Method method = null;
        if (wn.f())
        {
            try
            {
                method = android/os/WorkSource.getMethod("getName", new Class[] {
                    Integer.TYPE
                });
            }
            catch (Exception exception)
            {
                return null;
            }
        }
        return method;
    }

}
