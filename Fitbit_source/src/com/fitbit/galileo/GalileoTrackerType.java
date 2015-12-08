// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.fitbit.bluetooth.broadcom.a;
import com.fitbit.data.domain.device.DeviceVersion;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;

public final class GalileoTrackerType extends Enum
{

    public static final GalileoTrackerType a;
    public static final GalileoTrackerType b;
    public static final GalileoTrackerType c;
    public static final GalileoTrackerType d;
    public static final GalileoTrackerType e;
    public static final GalileoTrackerType f;
    public static final GalileoTrackerType g;
    public static final GalileoTrackerType h;
    private static final GalileoTrackerType i[];
    private final String defaultAttributes;
    private final DeviceVersion deviceVersion;
    private final String names[];
    private final byte productIds[];

    private GalileoTrackerType(String s, int j, DeviceVersion deviceversion, byte abyte0[], String as[], String s1)
    {
        super(s, j);
        deviceVersion = deviceversion;
        productIds = abyte0;
        names = as;
        defaultAttributes = s1;
    }

    public static GalileoTrackerType a(BluetoothDevice bluetoothdevice)
    {
        if (bluetoothdevice != null)
        {
            return a(bluetoothdevice.getName());
        } else
        {
            return h;
        }
    }

    public static GalileoTrackerType a(String s)
    {
        Object obj1;
label0:
        {
            Object obj = h;
            if (!TextUtils.isEmpty(s))
            {
                String s1 = s.toLowerCase(Locale.US).trim();
                Iterator iterator = EnumSet.complementOf(EnumSet.of(h)).iterator();
                do
                {
                    obj1 = obj;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    GalileoTrackerType galileotrackertype = (GalileoTrackerType)iterator.next();
                    String as[] = galileotrackertype.names;
                    int k = as.length;
                    int j = 0;
                    obj1 = obj;
                    do
                    {
                        obj = obj1;
                        if (j >= k)
                        {
                            break;
                        }
                        obj = as[j];
                        if (((String) (obj)).equalsIgnoreCase(s))
                        {
                            return galileotrackertype;
                        }
                        if (s1.startsWith(((String) (obj)).toLowerCase(Locale.US).trim()))
                        {
                            obj1 = galileotrackertype;
                        }
                        j++;
                    } while (true);
                } while (true);
            }
            obj1 = obj;
        }
        return ((GalileoTrackerType) (obj1));
    }

    public static GalileoTrackerType a(byte abyte0[])
    {
        byte byte0 = com.fitbit.bluetooth.broadcom.a.c(abyte0);
        abyte0 = values();
        int l = abyte0.length;
        for (int j = 0; j < l; j++)
        {
            GalileoTrackerType galileotrackertype = abyte0[j];
            byte abyte1[] = galileotrackertype.productIds;
            int i1 = abyte1.length;
            for (int k = 0; k < i1; k++)
            {
                if (abyte1[k] == byte0)
                {
                    return galileotrackertype;
                }
            }

        }

        return h;
    }

    public static GalileoTrackerType valueOf(String s)
    {
        return (GalileoTrackerType)Enum.valueOf(com/fitbit/galileo/GalileoTrackerType, s);
    }

    public static GalileoTrackerType[] values()
    {
        return (GalileoTrackerType[])i.clone();
    }

    public DeviceVersion a()
    {
        return deviceVersion;
    }

    public boolean a(GalileoTrackerType galileotrackertype)
    {
        if ((d.equals(this) || g.equals(this)) && (d.equals(galileotrackertype) || g.equals(galileotrackertype)))
        {
            return true;
        } else
        {
            return equals(galileotrackertype);
        }
    }

    public String b()
    {
        return defaultAttributes;
    }

    public String c()
    {
        if (names != null && names.length > 0)
        {
            return names[0];
        } else
        {
            return "";
        }
    }

    static 
    {
        a = new GalileoTrackerType("ZIP", 0, DeviceVersion.ZIP, new byte[] {
            1, 2
        }, new String[] {
            "zip", "galileo"
        }, "0601");
        b = new GalileoTrackerType("ONE", 1, DeviceVersion.ONE, new byte[] {
            5, 6
        }, new String[] {
            "one", "hadron"
        }, "0605");
        c = new GalileoTrackerType("FLEX", 2, DeviceVersion.FLEX, new byte[] {
            7
        }, new String[] {
            "flex", "quark"
        }, "0607");
        d = new GalileoTrackerType("FORCE", 3, DeviceVersion.FORCE, new byte[] {
            8
        }, new String[] {
            "force", "neutrino", "aforce"
        }, "0608");
        e = new GalileoTrackerType("SURGE", 4, DeviceVersion.SURGE, new byte[] {
            16
        }, new String[] {
            "proton", "surge", "surg"
        }, "0610");
        f = new GalileoTrackerType("CHARGE_HR", 5, DeviceVersion.CHARGE_HR, new byte[] {
            18
        }, new String[] {
            "graviton", "charge \u2665\uFE0E", "charge hr"
        }, "0612");
        g = new GalileoTrackerType("CHARGE", 6, DeviceVersion.CHARGE, new byte[] {
            8
        }, new String[] {
            "tau", "charge"
        }, "0608");
        h = new GalileoTrackerType("UNKNOWN", 7, DeviceVersion.UNKNOWN, new byte[0], new String[] {
            ""
        }, "");
        i = (new GalileoTrackerType[] {
            a, b, c, d, e, f, g, h
        });
    }
}
