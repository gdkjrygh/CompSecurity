// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.DateFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class anA
    implements anC
{

    private HashMap a;

    public anA()
    {
        a = a();
    }

    private static HashMap a()
    {
        return new HashMap(7);
    }

    private String[] c(Locale locale, String s, String s1)
    {
        Object obj2 = null;
        this;
        JVM INSTR monitorenter ;
        if (locale != null && s != null && s1 != null) goto _L2; else goto _L1
_L1:
        locale = null;
_L14:
        this;
        JVM INSTR monitorexit ;
        return locale;
_L2:
        Object obj = (Map)a.get(locale);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        HashMap hashmap = a;
        obj = a();
        hashmap.put(locale, obj);
        Object obj3 = (Map)((Map) (obj)).get(s);
        Object obj1 = obj3;
        if (obj3 != null) goto _L4; else goto _L3
_L3:
        int j;
        obj3 = a();
        ((Map) (obj)).put(s, obj3);
        obj1 = alv.a(Locale.ENGLISH).getZoneStrings();
        j = obj1.length;
        int i = 0;
_L15:
        if (i >= j) goto _L6; else goto _L5
_L5:
        obj = obj1[i];
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (obj.length != 5 || !s.equals(obj[0])) goto _L8; else goto _L9
_L9:
        obj1 = alv.a(locale).getZoneStrings();
        j = obj1.length;
        i = 0;
_L16:
        locale = obj2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        locale = obj1[i];
        if (locale == null)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        if (locale.length != 5 || !s.equals(locale[0]))
        {
            break MISSING_BLOCK_LABEL_390;
        }
        obj1 = obj3;
        if (obj == null) goto _L4; else goto _L10
_L10:
        obj1 = obj3;
        if (locale == null) goto _L4; else goto _L11
_L11:
        ((Map) (obj3)).put(obj[2], new String[] {
            locale[2], locale[1]
        });
        if (!obj[2].equals(obj[4])) goto _L13; else goto _L12
_L12:
        ((Map) (obj3)).put((new StringBuilder()).append(obj[4]).append("-Summer").toString(), new String[] {
            locale[4], locale[3]
        });
        obj1 = obj3;
_L4:
        locale = (String[])((Map) (obj1)).get(s1);
          goto _L14
_L13:
        ((Map) (obj3)).put(obj[4], new String[] {
            locale[4], locale[3]
        });
        obj1 = obj3;
          goto _L4
        locale;
        throw locale;
_L6:
        obj = null;
          goto _L9
_L8:
        i++;
          goto _L15
        i++;
          goto _L16
    }

    public final String a(Locale locale, String s, String s1)
    {
        locale = c(locale, s, s1);
        if (locale == null)
        {
            return null;
        } else
        {
            return locale[0];
        }
    }

    public final String b(Locale locale, String s, String s1)
    {
        locale = c(locale, s, s1);
        if (locale == null)
        {
            return null;
        } else
        {
            return locale[1];
        }
    }
}
