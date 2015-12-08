// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            v

class XG
    implements Runnable
{

    final List XF;
    final long XG;
    final v XH;

    public void run()
    {
        v.a(XH, XF, XG);
    }

    (v v1, List list, long l)
    {
        XH = v1;
        XF = list;
        XG = l;
        super();
    }
}
