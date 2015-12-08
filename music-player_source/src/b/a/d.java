// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;

// Referenced classes of package b.a:
//            en, fg

public final class d
{

    public static en a(Context context)
    {
        Object obj;
        en en1;
        Object obj1;
        int i;
        long l;
        long l1;
        try
        {
            en1 = new en();
            obj1 = Class.forName("android.net.TrafficStats");
            obj = ((Class) (obj1)).getMethod("getUidRxBytes", new Class[] {
                Integer.TYPE
            });
            obj1 = ((Class) (obj1)).getMethod("getUidTxBytes", new Class[] {
                Integer.TYPE
            });
            i = context.getApplicationInfo().uid;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.d("MobclickAgent", "sdk less than 2.2 has get no traffic");
            return null;
        }
        if (i != -1) goto _L2; else goto _L1
_L1:
        obj = null;
          goto _L3
_L2:
        obj = (new long[] {
            ((Long)((Method) (obj)).invoke(null, new Object[] {
                Integer.valueOf(i)
            })).longValue(), ((Long)((Method) (obj1)).invoke(null, new Object[] {
                Integer.valueOf(i)
            })).longValue()
        });
          goto _L3
_L5:
        context = context.getSharedPreferences("umeng_general_config", 0);
        l = context.getLong("uptr", -1L);
        l1 = context.getLong("dntr", -1L);
        context.edit().putLong("uptr", obj[1]).putLong("dntr", obj[0]).commit();
        if (l <= 0L || l1 <= 0L)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_260;
_L6:
        en1.b((int)obj[0]);
        en1.a((int)obj[1]);
        return en1;
_L3:
        if (obj[0] > 0L && obj[1] > 0L) goto _L5; else goto _L4
_L4:
        return null;
        obj[0] = obj[0] - l1;
        obj[1] = obj[1] - l;
        if (obj[0] <= 0L || obj[1] <= 0L)
        {
            return null;
        }
          goto _L6
    }
}
