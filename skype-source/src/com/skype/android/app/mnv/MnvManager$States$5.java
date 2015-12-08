// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.content.Context;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, ProfileServicesClient, c

static final class nit> extends nit>
{

    protected final t performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
    {
        profileservicesclient.register(mnvmanager);
        if (profileservicesclient.call(c.EDIT_RESEND_PIN_BY_VOICE, mnvmanager.getPhoneEntry()))
        {
            return IT_VERIFY_PIN;
        } else
        {
            return MPLETED;
        }
    }

    t(String s, int i)
    {
        super(s, i, null);
    }
}
