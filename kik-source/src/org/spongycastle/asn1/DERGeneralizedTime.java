// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1GeneralizedTime, ASN1OutputStream, j

public class DERGeneralizedTime extends ASN1Primitive
{

    private byte a[];

    public DERGeneralizedTime(String s)
    {
        a = Strings.d(s);
        try
        {
            d();
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
        a = abyte0;
    }

    private static String a(int k)
    {
        if (k < 10)
        {
            return (new StringBuilder("0")).append(k).toString();
        } else
        {
            return Integer.toString(k);
        }
    }

    public static ASN1GeneralizedTime a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1GeneralizedTime))
        {
            return (ASN1GeneralizedTime)obj;
        }
        if (obj instanceof DERGeneralizedTime)
        {
            return new ASN1GeneralizedTime(((DERGeneralizedTime)obj).a);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    private String e()
    {
        String s;
        TimeZone timezone;
        int i1;
        int j1;
        s = "+";
        timezone = TimeZone.getDefault();
        i1 = timezone.getRawOffset();
        int k = i1;
        if (i1 < 0)
        {
            s = "-";
            k = -i1;
        }
        i1 = k / 0x36ee80;
        j1 = (k - i1 * 60 * 60 * 1000) / 60000;
        if (!timezone.useDaylightTime() || !timezone.inDaylightTime(d())) goto _L2; else goto _L1
_L1:
        boolean flag = s.equals("+");
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = -1;
        }
        l += i1;
_L4:
        return (new StringBuilder("GMT")).append(s).append(a(l)).append(":").append(a(j1)).toString();
        ParseException parseexception;
        parseexception;
_L2:
        l = i1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean j()
    {
        boolean flag1 = false;
        int k = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (k != a.length)
                {
                    if (a[k] != 46 || k != 14)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            k++;
        } while (true);
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(24, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERGeneralizedTime))
        {
            return false;
        } else
        {
            return Arrays.a(a, ((DERGeneralizedTime)asn1primitive).a);
        }
    }

    public final String c()
    {
        String s = Strings.b(a);
        if (s.charAt(s.length() - 1) == 'Z')
        {
            return (new StringBuilder()).append(s.substring(0, s.length() - 1)).append("GMT+00:00").toString();
        }
        int k = s.length() - 5;
        char c1 = s.charAt(k);
        if (c1 == '-' || c1 == '+')
        {
            return (new StringBuilder()).append(s.substring(0, k)).append("GMT").append(s.substring(k, k + 3)).append(":").append(s.substring(k + 3)).toString();
        }
        k = s.length() - 3;
        c1 = s.charAt(k);
        if (c1 == '-' || c1 == '+')
        {
            return (new StringBuilder()).append(s.substring(0, k)).append("GMT").append(s.substring(k)).append(":00").toString();
        } else
        {
            return (new StringBuilder()).append(s).append(e()).toString();
        }
    }

    public final Date d()
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s;
        int k;
        obj1 = Strings.b(a);
        if (((String) (obj1)).endsWith("Z"))
        {
            char c1;
            if (j())
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
        if (((String) (obj1)).indexOf('-') > 0 || ((String) (obj1)).indexOf('+') > 0)
        {
            obj1 = c();
            if (j())
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
            if (j())
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
        if (!j()) goto _L2; else goto _L1
_L1:
        s = ((String) (obj)).substring(14);
        k = 1;
        do
        {
            if (k >= s.length())
            {
                break;
            }
            c1 = s.charAt(k);
            if ('0' > c1 || c1 > '9')
            {
                break;
            }
            k++;
        } while (true);
        if (k - 1 <= 3) goto _L4; else goto _L3
_L3:
        obj1 = (new StringBuilder()).append(s.substring(0, 4)).append(s.substring(k)).toString();
        obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
_L2:
        return ((SimpleDateFormat) (obj2)).parse(((String) (obj1)));
_L4:
        if (k - 1 == 1)
        {
            obj1 = (new StringBuilder()).append(s.substring(0, k)).append("00").append(s.substring(k)).toString();
            obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
        } else
        {
            obj1 = obj;
            if (k - 1 == 2)
            {
                obj1 = (new StringBuilder()).append(s.substring(0, k)).append("0").append(s.substring(k)).toString();
                obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return Arrays.a(a);
    }

    final int i()
    {
        int k = a.length;
        return k + (org.spongycastle.asn1.j.a(k) + 1);
    }
}
