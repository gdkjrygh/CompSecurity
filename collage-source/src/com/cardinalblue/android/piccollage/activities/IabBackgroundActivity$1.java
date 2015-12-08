// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import com.cardinalblue.android.piccollage.controller.a;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            IabBackgroundActivity

class a
    implements android.content.Listener
{

    final IabBackgroundActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        com.cardinalblue.android.piccollage.controller.a.a().e();
    }

    (IabBackgroundActivity iabbackgroundactivity)
    {
        a = iabbackgroundactivity;
        super();
    }
}
