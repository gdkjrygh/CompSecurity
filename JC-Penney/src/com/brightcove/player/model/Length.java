// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import android.util.Log;
import com.brightcove.player.util.StringUtil;
import java.io.Serializable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Length
    implements Serializable
{

    public static final Pattern PATTERN = Pattern.compile("^([0-9.-]+)(%|px|ems|pt)$");
    public static final String TAG = com/brightcove/player/model/Length.getSimpleName();
    private Double a;
    private StyledElement.Unit b;

    public Length(double d, StyledElement.Unit unit)
    {
        if (unit == null)
        {
            throw new IllegalArgumentException("must provide a Unit");
        } else
        {
            a = Double.valueOf(d);
            b = unit;
            return;
        }
    }

    public Length(String s)
    {
        if (StringUtil.isEmpty(s))
        {
            throw new IllegalArgumentException("must provide a non-empty expression String");
        }
        Object obj = PATTERN.matcher(s);
        if (((Matcher) (obj)).find() && ((Matcher) (obj)).groupCount() >= 2)
        {
            s = ((Matcher) (obj)).group(1);
            obj = ((Matcher) (obj)).group(2);
            if (StringUtil.isEmpty(s))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid number format: ").append(s).toString());
            }
            if (StringUtil.isEmpty(((String) (obj))))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid unit format: ").append(((String) (obj))).toString());
            } else
            {
                a = Double.valueOf(Double.parseDouble(s));
                b = StyledElement.Unit.fromString(((String) (obj)).toUpperCase(Locale.US));
                return;
            }
        } else
        {
            Log.w(TAG, (new StringBuilder()).append("unmatched: ").append(s).toString());
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Length)obj;
            if (Double.compare(((Length) (obj)).a.doubleValue(), a.doubleValue()) != 0)
            {
                return false;
            }
            if (b != ((Length) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public StyledElement.Unit getUnit()
    {
        return b;
    }

    public double getValue()
    {
        return a.doubleValue();
    }

    public int hashCode()
    {
        long l;
        if (a.doubleValue() != 0.0D)
        {
            l = Double.doubleToLongBits(a.doubleValue());
        } else
        {
            l = 0L;
        }
        return (int)(l ^ l >>> 32) * 31 + b.hashCode();
    }

}
