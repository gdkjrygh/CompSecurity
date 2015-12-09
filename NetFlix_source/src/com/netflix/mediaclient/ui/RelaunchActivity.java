// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.netflix.mediaclient.ui:
//            LaunchActivity

public class RelaunchActivity extends LaunchActivity
{

    private static final String EXTRA_SOURCE = "extra_source";

    public RelaunchActivity()
    {
    }

    public static Intent createStartIntent(Activity activity, String s)
    {
        return (new Intent(activity, com/netflix/mediaclient/ui/RelaunchActivity)).putExtra("extra_source", s);
    }

    protected boolean shouldCreateUiSessions()
    {
        return false;
    }
}
