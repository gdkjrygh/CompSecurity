// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import com.google.common.base.Objects;

public final class AnalyticsCustomDimension
{

    private final int id;
    private final String value;

    public AnalyticsCustomDimension(int i, String s)
    {
        id = i;
        value = s;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AnalyticsCustomDimension))
            {
                return false;
            }
            obj = (AnalyticsCustomDimension)obj;
            if (id != ((AnalyticsCustomDimension) (obj)).id || !Objects.equal(value, ((AnalyticsCustomDimension) (obj)).value))
            {
                return false;
            }
        }
        return true;
    }

    public final int getId()
    {
        return id;
    }

    public final String getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(id), value
        });
    }

    public final String toString()
    {
        int i = id;
        String s = value;
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(":").append(s).toString();
    }
}
