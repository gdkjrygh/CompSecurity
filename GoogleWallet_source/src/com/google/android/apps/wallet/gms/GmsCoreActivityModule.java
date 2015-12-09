// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms;

import android.app.Activity;
import com.google.android.gms.wallet.ia.CreateProfileIntentBuilder;

public class GmsCoreActivityModule
{

    public GmsCoreActivityModule()
    {
    }

    static CreateProfileIntentBuilder provideProfileIntentBuilder(Activity activity)
    {
        return new CreateProfileIntentBuilder(activity);
    }
}
