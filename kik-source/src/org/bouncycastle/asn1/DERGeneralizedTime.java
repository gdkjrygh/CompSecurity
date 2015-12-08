// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DEROutputStream, DERObject

public class DERGeneralizedTime extends ASN1Object
{

    String a;

    public DERGeneralizedTime(String s)
    {
        a = s;
        try
        {
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid date string: ")).append(s.getMessage()).toString());
        }
    }

    DERGeneralizedTime(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        a = new String(ac);
    }

    private static String a(int i)
    {
        if (i < 10)
        {
            return (new StringBuilder("0")).append(i).toString();
        } else
        {
            return Integer.toString(i);
        }
    }

    public static DERGeneralizedTime a(Object obj)
    {
        if (obj == null || (obj instanceof DERGeneralizedTime))
        {
            return (DERGeneralizedTime)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    private String g()
    {
        String s;
        TimeZone timezone;
        int k;
        int l;
        s = "+";
        timezone = TimeZone.getDefault();
        k = timezone.getRawOffset();
        int i = k;
        if (k < 0)
        {
            s = "-";
            i = -k;
        }
        k = i / 0x36ee80;
        l = (i - k * 60 * 60 * 1000) / 60000;
        if (!timezone.useDaylightTime() || !timezone.inDaylightTime(f())) goto _L2; else goto _L1
_L1:
        boolean flag = s.equals("+");
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        j += k;
_L4:
        return (new StringBuilder("GMT")).append(s).append(a(j)).append(":").append(a(l)).toString();
        ParseException parseexception;
        parseexception;
_L2:
        j = k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean h()
    {
        return a.indexOf('.') == 14;
    }

    final void a(DEROutputStream deroutputstream)
    {
        char ac[] = a.toCharArray();
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != ac.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        deroutputstream.a(24, abyte0);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERGeneralizedTime))
        {
            return false;
        } else
        {
            return a.equals(((DERGeneralizedTime)derobject).a);
        }
    }

    public final String e()
    {
        if (a.charAt(a.length() - 1) == 'Z')
        {
            return (new StringBuilder()).append(a.substring(0, a.length() - 1)).append("GMT+00:00").toString();
        }
        int i = a.length() - 5;
        char c = a.charAt(i);
        if (c == '-' || c == '+')
        {
            return (new StringBuilder()).append(a.substring(0, i)).append("GMT").append(a.substring(i, i + 3)).append(":").append(a.substring(i + 3)).toString();
        }
        i = a.length() - 3;
        c = a.charAt(i);
        if (c == '-' || c == '+')
        {
            return (new StringBuilder()).append(a.substring(0, i)).append("GMT").append(a.substring(i)).append(":00").toString();
        } else
        {
            return (new StringBuilder()).append(a).append(g()).toString();
        }
    }

    public final Date f()
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s;
        int i;
        obj1 = a;
        if (a.endsWith("Z"))
        {
            char c;
            if (h())
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            }
            ((SimpleDateFormat) (obj)).setTimeZone(new SimpleTimeZone(0, "Z"));
            obj2 = obj;
            obj = obj1;
        } else
        if (a.indexOf('-') > 0 || a.indexOf('+') > 0)
        {
            obj1 = e();
            if (h())
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            } else
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmssz");
            }
            ((SimpleDateFormat) (obj)).setTimeZone(new SimpleTimeZone(0, "Z"));
            obj2 = obj;
            obj = obj1;
        } else
        {
            if (h())
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss");
            }
            ((SimpleDateFormat) (obj)).setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
            obj2 = obj;
            obj = obj1;
        }
        obj1 = obj;
        if (!h()) goto _L2; else goto _L1
_L1:
        s = ((String) (obj)).substring(14);
        i = 1;
        do
        {
            if (i >= s.length())
            {
                break;
            }
            c = s.charAt(i);
            if ('0' > c || c > '9')
            {
                break;
            }
            i++;
        } while (true);
        if (i - 1 <= 3) goto _L4; else goto _L3
_L3:
        obj1 = (new StringBuilder()).append(s.substring(0, 4)).append(s.substring(i)).toString();
        obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
_L2:
        return ((SimpleDateFormat) (obj2)).parse(((String) (obj1)));
_L4:
        if (i - 1 == 1)
        {
            obj1 = (new StringBuilder()).append(s.substring(0, i)).append("00").append(s.substring(i)).toString();
            obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
        } else
        {
            obj1 = obj;
            if (i - 1 == 2)
            {
                obj1 = (new StringBuilder()).append(s.substring(0, i)).append("0").append(s.substring(i)).toString();
                obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
