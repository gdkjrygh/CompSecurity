// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.text.DateFormat;
import java.util.TimeZone;

// Referenced classes of package me.lyft.android.common:
//            DateUtils

final class  extends ThreadLocal
{

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected DateFormat initialValue()
    {
        DateFormat dateformat = DateUtils.createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateformat;
    }

    ()
    {
    }
}
