// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.util.Locale;

public interface NameProvider
{

    public abstract String getName(Locale locale, String s, String s1);

    public abstract String getShortName(Locale locale, String s, String s1);
}
