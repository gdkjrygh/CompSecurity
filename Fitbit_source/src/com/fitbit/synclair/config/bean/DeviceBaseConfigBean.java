// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.synclair.config.bean:
//            DeviceScreenBean, d

public abstract class DeviceBaseConfigBean
{
    public static final class SynclairScreenType extends Enum
    {

        public static final SynclairScreenType a;
        public static final SynclairScreenType b;
        public static final SynclairScreenType c;
        public static final SynclairScreenType d;
        public static final SynclairScreenType e;
        public static final SynclairScreenType f;
        public static final SynclairScreenType g;
        public static final SynclairScreenType h;
        public static final SynclairScreenType i;
        public static final SynclairScreenType j;
        public static final SynclairScreenType k;
        public static final SynclairScreenType l;
        public static final SynclairScreenType m;
        public static final SynclairScreenType n;
        public static final SynclairScreenType o;
        public static final SynclairScreenType p;
        public static final SynclairScreenType q;
        public static final SynclairScreenType r;
        public static final SynclairScreenType s;
        private static final SynclairScreenType t[];

        public static SynclairScreenType valueOf(String s1)
        {
            return (SynclairScreenType)Enum.valueOf(com/fitbit/synclair/config/bean/DeviceBaseConfigBean$SynclairScreenType, s1);
        }

        public static SynclairScreenType[] values()
        {
            return (SynclairScreenType[])t.clone();
        }

        static 
        {
            a = new SynclairScreenType("PREPARATION", 0);
            b = new SynclairScreenType("SEARCHING", 1);
            c = new SynclairScreenType("FOUND", 2);
            d = new SynclairScreenType("MULTIPLE_CANDIDATES", 3);
            e = new SynclairScreenType("STILL_WAITING", 4);
            f = new SynclairScreenType("TROUBLESHOOTING", 5);
            g = new SynclairScreenType("CODE_INPUT", 6);
            h = new SynclairScreenType("EXERCISE_SELECTION", 7);
            i = new SynclairScreenType("EDIT_GREETING", 8);
            j = new SynclairScreenType("TAU_FORCE_CONFLICT_SCREEN", 9);
            k = new SynclairScreenType("PAIR_FW_OPTIONAL", 10);
            l = new SynclairScreenType("PAIR_FW_OPTIONAL_ALWAYS", 11);
            m = new SynclairScreenType("PAIR_FW_LOW_BATTERY_REQUIRED", 12);
            n = new SynclairScreenType("FW_CONNECTING", 13);
            o = new SynclairScreenType("FW_UPDATING", 14);
            p = new SynclairScreenType("FW_BLE_ERROR", 15);
            q = new SynclairScreenType("FW_INCOMPLETE", 16);
            r = new SynclairScreenType("FW_LOW_BATTERY", 17);
            s = new SynclairScreenType("ORIENTATION", 18);
            t = (new SynclairScreenType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s
            });
        }

        private SynclairScreenType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private final Map a = new HashMap();
    private d b;

    public DeviceBaseConfigBean()
    {
    }

    public DeviceScreenBean a(SynclairScreenType synclairscreentype, int i)
    {
        synclairscreentype = (List)a.get(synclairscreentype);
        if (synclairscreentype != null && i >= 0 && i < synclairscreentype.size())
        {
            return (DeviceScreenBean)synclairscreentype.get(i);
        } else
        {
            return null;
        }
    }

    public d a()
    {
        return b;
    }

    public void a(SynclairScreenType synclairscreentype, DeviceScreenBean devicescreenbean)
    {
        if (devicescreenbean != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(devicescreenbean);
            a.put(synclairscreentype, arraylist);
            return;
        } else
        {
            a.remove(synclairscreentype);
            return;
        }
    }

    public void a(SynclairScreenType synclairscreentype, List list)
    {
        if (list != null)
        {
            a.put(synclairscreentype, list);
            return;
        } else
        {
            a.remove(synclairscreentype);
            return;
        }
    }

    public void a(d d)
    {
        b = d;
    }

    public boolean a(SynclairScreenType synclairscreentype)
    {
        return a.containsKey(synclairscreentype);
    }

    public abstract List b();

    public List b(SynclairScreenType synclairscreentype)
    {
        return (List)a.get(synclairscreentype);
    }

    public DeviceScreenBean c(SynclairScreenType synclairscreentype)
    {
        return a(synclairscreentype, 0);
    }
}
