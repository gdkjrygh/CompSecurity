// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import com.b.a.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            ho, hl, fg, f

public final class hq
{

    private final int a = 128;
    private final int b = 256;
    private ho c;
    private Context d;
    private hl e;

    public hq(Context context)
    {
        if (context == null)
        {
            throw new RuntimeException("Context is null, can't track event");
        }
        d = context.getApplicationContext();
        c = new ho(d);
        context = c;
        boolean flag;
        if (!a.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.a(flag);
        e = b.a.hl.a(d);
    }

    private static boolean a(String s)
    {
        if (s != null)
        {
            int i = s.trim().getBytes().length;
            if (i > 0 && i <= 128)
            {
                return true;
            }
        }
        fg.b("MobclickAgent", "Event id is empty or too long in tracking Event");
        return false;
    }

    public final void a(String s, Map map)
    {
        if (!a(s))
        {
            return;
        }
        if (map == null) goto _L2; else goto _L1
_L1:
        if (!map.isEmpty()) goto _L3; else goto _L2
_L2:
        fg.b("MobclickAgent", "map is null or empty in onEvent");
        boolean flag = false;
_L10:
        Iterator iterator;
        Object obj;
        if (flag)
        {
            try
            {
                e.a(new f(s, map));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                fg.b("MobclickAgent", "Exception occurred in Mobclick.onEvent(). ", s);
            }
            return;
        } else
        {
            return;
        }
_L3:
        iterator = map.entrySet().iterator();
_L7:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        obj = (java.util.Map.Entry)iterator.next();
        if (!a((String)((java.util.Map.Entry) (obj)).getKey()))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (((java.util.Map.Entry) (obj)).getValue() != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        continue; /* Loop/switch isn't completed */
        if (!(((java.util.Map.Entry) (obj)).getValue() instanceof String)) goto _L7; else goto _L6
_L6:
        obj = ((java.util.Map.Entry) (obj)).getValue().toString();
        if (obj == null)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).trim().getBytes().length <= 256)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        fg.b("MobclickAgent", "Event label or value is empty or too long in tracking Event");
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (flag) goto _L7; else goto _L8
_L8:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
