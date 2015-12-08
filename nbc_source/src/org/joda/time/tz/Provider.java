// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.util.Set;
import org.joda.time.DateTimeZone;

public interface Provider
{

    public abstract Set getAvailableIDs();

    public abstract DateTimeZone getZone(String s);
}
