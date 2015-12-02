// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import com.qihoo.security.malware.vo.MaliciousInfo;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            d

class a
    implements Comparator
{

    final d a;
    private final Collator b = Collator.getInstance();

    public int a(MaliciousInfo maliciousinfo, MaliciousInfo maliciousinfo1)
    {
        return b.compare(maliciousinfo.getLabel(d.a(a)), maliciousinfo1.getLabel(d.a(a)));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((MaliciousInfo)obj, (MaliciousInfo)obj1);
    }

    fo(d d1)
    {
        a = d1;
        super();
    }
}
