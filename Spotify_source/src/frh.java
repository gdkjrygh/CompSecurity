// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConsumablePeriod;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class frh
{

    private static gip a = gip.b("upsell_consumables_triggered");
    private static final Pattern b = Pattern.compile("Tier-[A-E]");
    private static final Pattern c = Pattern.compile("Tier-[A-E]-\\d{1,4}[HDW]");
    private static final Map d;

    public static String a(Flags flags)
    {
        String s = (String)flags.a(fys.ai);
        if (s != null && c.matcher(s).matches())
        {
            flags = s.substring(0, 6);
            return (String)d.get(flags);
        }
        flags = (String)flags.a(fys.ah);
        if (flags != null && b.matcher(flags).matches())
        {
            return (String)d.get(flags);
        } else
        {
            return "-";
        }
    }

    public static void a(Context context)
    {
        context = c(context);
        int i = context.a(a, 0);
        context.b().a(a, i + 1).b();
    }

    public static boolean a(Context context, Reason reason, Flags flags)
    {
        return a(c(context), reason, flags);
    }

    public static boolean a(gin gin1, Reason reason, Flags flags)
    {
        boolean flag1 = false;
        int i = gin1.a(a, 0);
        gin1 = a(flags);
        boolean flag = flag1;
        if (reason == Reason.d)
        {
            flag = flag1;
            if (i < 3)
            {
                flag = flag1;
                if (!"-".equals(gin1))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static int b(Context context)
    {
        return c(context).a(a, 0);
    }

    public static ConsumablePeriod b(Flags flags)
    {
        flags = (String)flags.a(fys.ai);
        if (flags == null || !c.matcher(flags).matches()) goto _L2; else goto _L1
_L1:
        byte byte0;
        flags = flags.substring(flags.length() - 1);
        byte0 = -1;
        flags.hashCode();
        JVM INSTR lookupswitch 3: default 80
    //                   68: 126
    //                   72: 112
    //                   87: 140;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 108
    //                   0 154
    //                   1 158
    //                   2 162;
           goto _L2 _L7 _L8 _L9
_L2:
        return ConsumablePeriod.b;
_L5:
        if (flags.equals("H"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (flags.equals("D"))
        {
            byte0 = 1;
        }
          goto _L3
_L6:
        if (flags.equals("W"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        return ConsumablePeriod.a;
_L8:
        return ConsumablePeriod.b;
_L9:
        return ConsumablePeriod.c;
    }

    public static int c(Flags flags)
    {
        flags = (String)flags.a(fys.ai);
        if (flags != null && c.matcher(flags).matches())
        {
            return Integer.parseInt(flags.substring(7, flags.length() - 1));
        } else
        {
            return 1;
        }
    }

    private static gin c(Context context)
    {
        return ((giq)dmz.a(giq)).b(context);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        d = hashmap;
        hashmap.put("Tier-A", "0.49 CAD");
        d.put("Tier-B", "0.99 CAD");
        d.put("Tier-C", "1.99 CAD");
        d.put("Tier-D", "2.99 CAD");
        d.put("Tier-E", "3.99 CAD");
    }
}
