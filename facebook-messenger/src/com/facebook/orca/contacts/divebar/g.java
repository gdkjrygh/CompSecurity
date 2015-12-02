// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.view.View;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarChatAvailabilityWarning

class g
    implements android.view.View.OnClickListener
{

    final DivebarChatAvailabilityWarning a;

    g(DivebarChatAvailabilityWarning divebarchatavailabilitywarning)
    {
        a = divebarchatavailabilitywarning;
        super();
    }

    public void onClick(View view)
    {
        DivebarChatAvailabilityWarning.a(a);
    }
}
