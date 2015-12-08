// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.support;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class BluetoothSupportStatus
{
    public static final class SupportLevel extends Enum
    {

        public static final SupportLevel a;
        public static final SupportLevel b;
        public static final SupportLevel c;
        public static final SupportLevel d;
        private static final SupportLevel e[];
        private boolean btleSupported;

        public static SupportLevel a(String s)
        {
            try
            {
                s = valueOf(s.toUpperCase(Locale.US));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return b();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return b();
            }
            return s;
        }

        public static SupportLevel b()
        {
            return a;
        }

        public static SupportLevel valueOf(String s)
        {
            return (SupportLevel)Enum.valueOf(com/fitbit/bluetooth/support/BluetoothSupportStatus$SupportLevel, s);
        }

        public static SupportLevel[] values()
        {
            return (SupportLevel[])e.clone();
        }

        public boolean a()
        {
            return btleSupported;
        }

        static 
        {
            a = new SupportLevel("UNKNOWN", 0, false);
            b = new SupportLevel("NOT_SUPPORTED", 1, false);
            c = new SupportLevel("SUPPORTED", 2, true);
            d = new SupportLevel("PARTIALLY_SUPPORTED", 3, true);
            e = (new SupportLevel[] {
                a, b, c, d
            });
        }

        private SupportLevel(String s, int i, boolean flag)
        {
            super(s, i);
            btleSupported = flag;
        }
    }


    private SupportLevel a;
    private String b;

    public BluetoothSupportStatus()
    {
        this(SupportLevel.b(), null);
    }

    public BluetoothSupportStatus(SupportLevel supportlevel, String s)
    {
        a = supportlevel;
        b = s;
    }

    public static BluetoothSupportStatus a(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = null;
        Object obj1 = null;
        if (jsonobject != null)
        {
            String s = jsonobject.getString("supportLevel");
            obj = obj1;
            if (jsonobject.has("message"))
            {
                obj = jsonobject.getString("message");
            }
            obj = new BluetoothSupportStatus(SupportLevel.a(s), ((String) (obj)));
        }
        return ((BluetoothSupportStatus) (obj));
    }

    public SupportLevel a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof BluetoothSupportStatus))
            {
                return false;
            }
            obj = (BluetoothSupportStatus)obj;
            if (a != ((BluetoothSupportStatus) (obj)).a || b != ((BluetoothSupportStatus) (obj)).b && (b == null || !b.equals(((BluetoothSupportStatus) (obj)).b)))
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        return (new StringBuilder()).append("level = ").append(a).append(", message = ").append(b).toString();
    }
}
