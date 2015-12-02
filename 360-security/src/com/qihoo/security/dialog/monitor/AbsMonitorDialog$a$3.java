// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.widget.CompoundButton;
import com.qihoo.security.malware.vo.MaliciousInfo;
import java.util.List;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements android.widget.kedChangeListener
{

    final MaliciousInfo a;
    final b b;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            AbsMonitorDialog.g(b.b).add(Integer.valueOf(a._id));
        } else
        {
            AbsMonitorDialog.g(b.b).remove(Integer.valueOf(a._id));
        }
        AbsMonitorDialog.t(b.b);
    }

    ( , MaliciousInfo maliciousinfo)
    {
        b = ;
        a = maliciousinfo;
        super();
    }
}
