// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.pedometer:
//            i, a, e, b, 
//            HtcPedometerAdapter

public class PedometerAdapterHelper
{
    public static final class PedometerManufacturer extends Enum
    {

        public static final PedometerManufacturer a;
        public static final PedometerManufacturer b;
        public static final PedometerManufacturer c;
        private static final PedometerManufacturer d[];
        private final String internalName;

        public static PedometerManufacturer a(String s)
        {
            PedometerManufacturer apedometermanufacturer[] = values();
            for (int j = 0; j < apedometermanufacturer.length; j++)
            {
                PedometerManufacturer pedometermanufacturer = apedometermanufacturer[j];
                if (pedometermanufacturer.internalName.equals(s))
                {
                    return pedometermanufacturer;
                }
            }

            return null;
        }

        public static PedometerManufacturer valueOf(String s)
        {
            return (PedometerManufacturer)Enum.valueOf(com/fitbit/pedometer/PedometerAdapterHelper$PedometerManufacturer, s);
        }

        public static PedometerManufacturer[] values()
        {
            return (PedometerManufacturer[])d.clone();
        }

        public String a()
        {
            return internalName;
        }

        static 
        {
            a = new PedometerManufacturer("DUMMY", 0, "DUMMY");
            b = new PedometerManufacturer("HTC", 1, "HTC");
            c = new PedometerManufacturer("GOOGLE", 2, "GOOGLE");
            d = (new PedometerManufacturer[] {
                a, b, c
            });
        }

        private PedometerManufacturer(String s, int j, String s1)
        {
            super(s, j);
            internalName = s1;
        }
    }


    static final String a = "PedometerAdapterHelper";
    private static Map b;
    private static Map c;
    private static List d;

    public PedometerAdapterHelper()
    {
    }

    public static PedometerManufacturer a()
    {
        Map map = b();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            PedometerManufacturer pedometermanufacturer = (PedometerManufacturer)iterator.next();
            if (((i)map.get(pedometermanufacturer)).a())
            {
                return pedometermanufacturer;
            }
        }

        return PedometerManufacturer.a;
    }

    public static e a(PedometerManufacturer pedometermanufacturer)
    {
        pedometermanufacturer = (Class)c().get(pedometermanufacturer);
        if (pedometermanufacturer != null)
        {
            try
            {
                pedometermanufacturer = ((PedometerManufacturer) (pedometermanufacturer.getConstructor(new Class[0]).newInstance(new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (PedometerManufacturer pedometermanufacturer)
            {
                pedometermanufacturer.printStackTrace();
                pedometermanufacturer = null;
            }
            if (pedometermanufacturer == null)
            {
                return new a();
            } else
            {
                return (e)pedometermanufacturer;
            }
        } else
        {
            return new a();
        }
    }

    private static Map b()
    {
        if (b == null)
        {
            b = new LinkedHashMap();
            b.put(PedometerManufacturer.c, new b.a());
            b.put(PedometerManufacturer.b, new HtcPedometerAdapter.a());
        }
        return b;
    }

    public static boolean b(PedometerManufacturer pedometermanufacturer)
    {
        return d().contains(pedometermanufacturer);
    }

    private static Map c()
    {
        if (c == null)
        {
            c = new HashMap();
            c.put(PedometerManufacturer.c, com/fitbit/pedometer/b);
            c.put(PedometerManufacturer.b, com/fitbit/pedometer/HtcPedometerAdapter);
        }
        return c;
    }

    private static List d()
    {
        if (d == null)
        {
            d = new ArrayList(2);
            d.add(PedometerManufacturer.c);
            d.add(PedometerManufacturer.b);
        }
        return d;
    }
}
