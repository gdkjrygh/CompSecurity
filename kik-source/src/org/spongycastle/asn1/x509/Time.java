// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERUTCTime;

public class Time extends ASN1Object
    implements ASN1Choice
{

    ASN1Primitive a;

    private Time(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUTCTime) && !(asn1primitive instanceof DERGeneralizedTime))
        {
            throw new IllegalArgumentException("unknown object passed to Time");
        } else
        {
            a = asn1primitive;
            return;
        }
    }

    public static Time a(Object obj)
    {
        if (obj == null || (obj instanceof Time))
        {
            return (Time)obj;
        }
        if (obj instanceof DERUTCTime)
        {
            return new Time((DERUTCTime)obj);
        }
        if (obj instanceof DERGeneralizedTime)
        {
            return new Time((DERGeneralizedTime)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final String c()
    {
        if (a instanceof DERUTCTime)
        {
            return ((DERUTCTime)a).d();
        } else
        {
            return ((DERGeneralizedTime)a).c();
        }
    }

    public final Date d()
    {
        Date date;
        try
        {
            if (a instanceof DERUTCTime)
            {
                DERUTCTime derutctime = (DERUTCTime)a;
                SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmmssz");
                simpledateformat.setTimeZone(new SimpleTimeZone(0, "Z"));
                return simpledateformat.parse(derutctime.d());
            }
            date = ((DERGeneralizedTime)a).d();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder("invalid date string: ")).append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public String toString()
    {
        return c();
    }
}
