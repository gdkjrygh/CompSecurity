// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.content.Context;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, ProfileServicesClient, c

static final class it> extends it>
{

    protected final  performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
    {
        profileservicesclient.register(mnvmanager);
        profileservicesclient.call(c.PRE_CHECK, null);
        return _CHECK;
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
