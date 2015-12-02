// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.View;

// Referenced classes of package com.facebook.orca.compose:
//            LocationDisabledNuxView

class at
    implements android.view.View.OnClickListener
{

    final LocationDisabledNuxView a;

    at(LocationDisabledNuxView locationdisablednuxview)
    {
        a = locationdisablednuxview;
        super();
    }

    public void onClick(View view)
    {
        LocationDisabledNuxView.b(a);
    }
}
