// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


// Referenced classes of package com.facebook.orca.compose:
//            LocationNuxView

class az
    implements Runnable
{

    final LocationNuxView a;

    az(LocationNuxView locationnuxview)
    {
        a = locationnuxview;
        super();
    }

    public void run()
    {
        LocationNuxView.b(a);
        LocationNuxView.c(a);
    }
}
