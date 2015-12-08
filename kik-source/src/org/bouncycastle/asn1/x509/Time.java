// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERUTCTime;

public class Time extends ASN1Encodable
    implements ASN1Choice
{

    DERObject a;

    private Time(DERObject derobject)
    {
        if (!(derobject instanceof DERUTCTime) && !(derobject instanceof DERGeneralizedTime))
        {
            throw new IllegalArgumentException("unknown object passed to Time");
        } else
        {
            a = derobject;
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

    public final DERObject d()
    {
        return a;
    }

    public final String e()
    {
        if (a instanceof DERUTCTime)
        {
            return ((DERUTCTime)a).f();
        } else
        {
            return ((DERGeneralizedTime)a).e();
        }
    }

    public final Date f()
    {
        Date date;
        try
        {
            if (a instanceof DERUTCTime)
            {
                DERUTCTime derutctime = (DERUTCTime)a;
                SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmmssz");
                simpledateformat.setTimeZone(new SimpleTimeZone(0, "Z"));
                return simpledateformat.parse(derutctime.f());
            }
            date = ((DERGeneralizedTime)a).f();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder("invalid date string: ")).append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public String toString()
    {
        return e();
    }
}
