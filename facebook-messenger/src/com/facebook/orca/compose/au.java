// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


// Referenced classes of package com.facebook.orca.compose:
//            LocationDisabledNuxView

class au
    implements Runnable
{

    final LocationDisabledNuxView a;

    au(LocationDisabledNuxView locationdisablednuxview)
    {
        a = locationdisablednuxview;
        super();
    }

    public void run()
    {
        LocationDisabledNuxView.c(a);
        LocationDisabledNuxView.d(a);
    }
}
