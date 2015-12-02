// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            be, DivebarChatAvailabilityWarning

class bi
    implements android.view.View.OnFocusChangeListener
{

    final be a;

    bi(be be1)
    {
        a = be1;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        byte byte1 = 8;
        view = be.b(a);
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        view = be.c(a);
        if (flag)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }
}
