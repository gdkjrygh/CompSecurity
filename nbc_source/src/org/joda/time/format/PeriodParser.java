// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.util.Locale;
import org.joda.time.ReadWritablePeriod;

public interface PeriodParser
{

    public abstract int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale);
}
