// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.View;

// Referenced classes of package com.facebook.orca.compose:
//            LocationNuxView

class ay
    implements android.view.View.OnClickListener
{

    final LocationNuxView a;

    ay(LocationNuxView locationnuxview)
    {
        a = locationnuxview;
        super();
    }

    public void onClick(View view)
    {
        LocationNuxView.a(a);
    }
}
