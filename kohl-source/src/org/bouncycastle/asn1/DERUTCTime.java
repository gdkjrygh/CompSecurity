// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1UTCTime, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERUTCTime extends ASN1Primitive
{

    private byte time[];

    public DERUTCTime(String s)
    {
        time = Strings.toByteArray(s);
        try
        {
            getDate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid date string: ").append(s.getMessage()).toString());
        }
    }

    public DERUTCTime(Date date)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpledateformat.setTimeZone(new SimpleTimeZone(0, "Z"));
        time = Strings.toByteArray(simpledateformat.format(date));
    }

    DERUTCTime(byte abyte0[])
    {
        time = abyte0;
    }

    public static ASN1UTCTime getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1UTCTime))
        {
            return (ASN1UTCTime)obj;
        }
        if (obj instanceof DERUTCTime)
        {
            return new ASN1UTCTime(((DERUTCTime)obj).time);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof ASN1UTCTime))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new ASN1UTCTime(((ASN1OctetString)asn1taggedobject).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUTCTime))
        {
            return false;
        } else
        {
            return Arrays.areEqual(time, ((DERUTCTime)asn1primitive).time);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.write(23);
        int j = time.length;
        asn1outputstream.writeLength(j);
        for (int i = 0; i != j; i++)
        {
            asn1outputstream.write(time[i]);
        }

    }

    int encodedLength()
    {
        int i = time.length;
        return i + (StreamUtil.calculateBodyLength(i) + 1);
    }

    public Date getAdjustedDate()
        throws ParseException
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpledateformat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpledateformat.parse(getAdjustedTime());
    }

    public String getAdjustedTime()
    {
        String s = getTime();
        if (s.charAt(0) < '5')
        {
            return (new StringBuilder()).append("20").append(s).toString();
        } else
        {
            return (new StringBuilder()).append("19").append(s).toString();
        }
    }

    public Date getDate()
        throws ParseException
    {
        return (new SimpleDateFormat("yyMMddHHmmssz")).parse(getTime());
    }

    public String getTime()
    {
        String s1 = Strings.fromByteArray(time);
        if (s1.indexOf('-') < 0 && s1.indexOf('+') < 0)
        {
            if (s1.length() == 11)
            {
                return (new StringBuilder()).append(s1.substring(0, 10)).append("00GMT+00:00").toString();
            } else
            {
                return (new StringBuilder()).append(s1.substring(0, 12)).append("GMT+00:00").toString();
            }
        }
        int j = s1.indexOf('-');
        int i = j;
        if (j < 0)
        {
            i = s1.indexOf('+');
        }
        String s = s1;
        if (i == s1.length() - 3)
        {
            s = (new StringBuilder()).append(s1).append("00").toString();
        }
        if (i == 10)
        {
            return (new StringBuilder()).append(s.substring(0, 10)).append("00GMT").append(s.substring(10, 13)).append(":").append(s.substring(13, 15)).toString();
        } else
        {
            return (new StringBuilder()).append(s.substring(0, 12)).append("GMT").append(s.substring(12, 15)).append(":").append(s.substring(15, 17)).toString();
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(time);
    }

    boolean isConstructed()
    {
        return false;
    }

    public String toString()
    {
        return Strings.fromByteArray(time);
    }
}
