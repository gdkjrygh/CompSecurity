// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.ReportNotification;
import java.util.Comparator;

// Referenced classes of package com.tinder.parse:
//            UserParse

public static final class cation
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (ReportNotification)obj;
        obj1 = (ReportNotification)obj1;
        int j = ((ReportNotification) (obj1)).type.compareTo(((ReportNotification) (obj)).type);
        int i = j;
        if (j == 0)
        {
            i = ((ReportNotification) (obj1)).tier - ((ReportNotification) (obj)).tier;
        }
        return i;
    }

    public cation()
    {
    }
}
