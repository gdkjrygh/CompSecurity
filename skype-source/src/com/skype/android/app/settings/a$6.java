// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.content.Intent;
import com.skype.android.app.mnv.MnvAddNumberActivity;

// Referenced classes of package com.skype.android.app.settings:
//            a

static final class nit> extends a
{

    public final Intent launchActivity(Context context)
    {
        return new Intent(context, com/skype/android/app/mnv/MnvAddNumberActivity);
    }

    berActivity(String s, int i, String s1)
    {
        super(s, i, s1, null);
    }
}
