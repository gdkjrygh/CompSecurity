// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.hardware.SensorManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.advertising.android:
//            az, AdWebView, av

final class bg extends az
{

    private static HashMap c = null;
    private boolean d;

    public bg(AdWebView adwebview)
    {
        super(adwebview);
        d = false;
        d();
    }

    public static String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{supports: [");
        Iterator iterator = c.entrySet().iterator();
        do
        {
            java.util.Map.Entry entry;
            do
            {
                if (!iterator.hasNext())
                {
                    stringbuilder.append("]}");
                    return stringbuilder.replace(stringbuilder.length() - 3, stringbuilder.length() - 2, "").toString();
                }
                entry = (java.util.Map.Entry)iterator.next();
            } while (!((Boolean)entry.getValue()).booleanValue());
            stringbuilder.append(String.format("\"%s\",", new Object[] {
                entry.getKey()
            }));
        } while (true);
    }

    public static String c()
    {
        return Locale.getDefault().toString().replace("_", "-");
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        HashMap hashmap = new HashMap();
        c = hashmap;
        hashmap.put("level-1", Boolean.valueOf(true));
        c.put("level-2", Boolean.valueOf(true));
        c.put("level-3", Boolean.valueOf(true));
        c.put("network", Boolean.valueOf(true));
        c.put("orientation", Boolean.valueOf(false));
        c.put("screen", Boolean.valueOf(true));
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (b.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 && b.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        c.put("location", Boolean.valueOf(flag1));
        obj = (SensorManager)b.getSystemService("sensor");
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((SensorManager) (obj)).getSensorList(2).isEmpty()) goto _L4; else goto _L5
_L5:
        flag = true;
_L15:
        obj = (SensorManager)b.getSystemService("sensor");
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (((SensorManager) (obj)).getSensorList(1).isEmpty()) goto _L7; else goto _L8
_L8:
        flag1 = true;
_L12:
        obj = (SensorManager)b.getSystemService("sensor");
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (((SensorManager) (obj)).getSensorList(4).isEmpty()) goto _L10; else goto _L11
_L11:
        flag2 = true;
_L13:
        obj = c;
        if (flag && flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        ((HashMap) (obj)).put("heading", Boolean.valueOf(flag3));
        c.put("shake", Boolean.valueOf(flag1));
        c.put("tilt", Boolean.valueOf(flag2));
        c.put("sms", Boolean.valueOf(false));
        c.put("phone", Boolean.valueOf(false));
        c.put("calendar", Boolean.valueOf(false));
        c.put("email", Boolean.valueOf(false));
        c.put("camera", Boolean.valueOf(false));
        c.put("video", Boolean.valueOf(true));
        c.put("audio", Boolean.valueOf(true));
        c.put("map", Boolean.valueOf(true));
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L7:
        flag1 = false;
          goto _L12
_L10:
        flag2 = false;
          goto _L13
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final void a(String s, Map map)
    {
        if (!s.equalsIgnoreCase("adError")) goto _L2; else goto _L1
_L1:
label0:
        {
            String s1 = (String)map.get("action");
            map = (String)map.get("message");
            if (!TextUtils.isEmpty(s1))
            {
                s = s1;
                if (!TextUtils.isEmpty(s1.trim()))
                {
                    break label0;
                }
            }
            s = "unknown action";
        }
        StringBuilder stringbuilder = new StringBuilder(String.valueOf(s));
        if (TextUtils.isEmpty(map) || TextUtils.isEmpty(map.trim()))
        {
            s = " unknown message";
        } else
        {
            s = (new StringBuilder(" ")).append(map).toString();
        }
        s = stringbuilder.append(s).toString();
        a.a(s);
_L4:
        return;
_L2:
        if (s.equalsIgnoreCase("ormmaLog"))
        {
            s = (String)map.get("message");
            av.b("Flow", (new StringBuilder("Ormma; ")).append(s).toString());
            return;
        }
        if (s.equalsIgnoreCase("publisherMessage"))
        {
            s = (String)map.get("type");
            map = (String)map.get("data");
            if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(map))
            {
                a.b(s, map);
                return;
            } else
            {
                av.c("OrmmaUtilityController", "publisherMessage has invalid message type or data");
                a.c("publisherMessage", "Publisher message has invalid message type or data");
                return;
            }
        }
        if (s.equalsIgnoreCase("setuserengaged"))
        {
            a(Boolean.valueOf((String)map.get("isengaged")).booleanValue(), false);
            return;
        }
        if (s.equalsIgnoreCase("addEventListener"))
        {
            s = (String)map.get("event");
            a.a("service", String.format("name=%s;action=add", new Object[] {
                s
            }));
            return;
        }
        if (s.equalsIgnoreCase("removeEventListener"))
        {
            s = (String)map.get("event");
            a.a("service", String.format("name=%s;action=remove", new Object[] {
                s
            }));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (!flag1 && a.a(bf.b.c))
        {
            return;
        }
        if (d != flag)
        {
            d = flag;
            (new StringBuilder("Set User Engaged state to ")).append(d);
            av.a("OrmmaUtilityController");
            a.q();
            return;
        } else
        {
            av.a("OrmmaUtilityController");
            return;
        }
    }

    public final boolean b()
    {
        StringBuilder stringbuilder = new StringBuilder("Get User Engaged state ");
        String s;
        if (d)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        stringbuilder.append(s);
        av.a("OrmmaUtilityController");
        return d;
    }

}
