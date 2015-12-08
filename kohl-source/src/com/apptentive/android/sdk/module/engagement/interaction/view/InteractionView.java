// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view;

import android.app.Activity;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.module.ActivityContent;
import com.apptentive.android.sdk.module.engagement.interaction.model.Interaction;

public abstract class InteractionView extends ActivityContent
{

    protected Interaction interaction;

    public InteractionView(Interaction interaction1)
    {
        interaction = interaction1;
    }

    public void show(Activity activity)
    {
        Log.d("Showing interaction.", new Object[0]);
    }
}
