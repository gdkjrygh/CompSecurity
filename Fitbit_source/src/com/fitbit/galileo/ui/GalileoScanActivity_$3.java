// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import java.util.List;

// Referenced classes of package com.fitbit.galileo.ui:
//            GalileoScanActivity_

class a
    implements Runnable
{

    final List a;
    final GalileoScanActivity_ b;

    public void run()
    {
        GalileoScanActivity_.a(b, a);
    }

    (GalileoScanActivity_ galileoscanactivity_, List list)
    {
        b = galileoscanactivity_;
        a = list;
        super();
    }
}
