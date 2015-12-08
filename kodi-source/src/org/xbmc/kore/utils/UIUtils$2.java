// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package org.xbmc.kore.utils:
//            UIUtils

static final class t
    implements android.view.ckListener
{

    final Activity val$activity;
    final Intent val$allCastActivityLaunchIntent;

    public void onClick(View view)
    {
        val$activity.startActivity(val$allCastActivityLaunchIntent);
        val$activity.overridePendingTransition(0x7f04000a, 0x7f04000b);
    }

    ner(Activity activity1, Intent intent)
    {
        val$activity = activity1;
        val$allCastActivityLaunchIntent = intent;
        super();
    }
}
