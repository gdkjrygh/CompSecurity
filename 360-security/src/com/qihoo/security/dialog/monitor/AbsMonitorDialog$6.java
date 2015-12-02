// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import com.qihoo.security.malware.vo.MaliciousInfo;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements Comparator
{

    final AbsMonitorDialog a;

    public int a(MaliciousInfo maliciousinfo, MaliciousInfo maliciousinfo1)
    {
        int j = 0;
        int i;
        if (maliciousinfo.isTrojan())
        {
            i = 0;
        } else
        if (maliciousinfo.isDanger())
        {
            i = 1;
        } else
        if (maliciousinfo.isWarning())
        {
            i = 2;
        } else
        {
            i = 3;
        }
        if (!maliciousinfo1.isTrojan())
        {
            if (maliciousinfo1.isDanger())
            {
                j = 1;
            } else
            if (maliciousinfo1.isWarning())
            {
                j = 2;
            } else
            {
                j = 3;
            }
        }
        return i - j;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((MaliciousInfo)obj, (MaliciousInfo)obj1);
    }

    (AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
    }
}
