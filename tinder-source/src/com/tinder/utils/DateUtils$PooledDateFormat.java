// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

// Referenced classes of package com.tinder.utils:
//            DateUtils

private static class  extends SimpleDateFormat
{

    private static final android.support.v4.g. a = new android.support.v4.g.();

    public static SimpleDateFormat a()
    {
        SimpleDateFormat simpledateformat1 = (SimpleDateFormat)a.();
        SimpleDateFormat simpledateformat = simpledateformat1;
        if (simpledateformat1 == null)
        {
            simpledateformat = new SimpleDateFormat("yy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpledateformat.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        }
        return simpledateformat;
    }

}
