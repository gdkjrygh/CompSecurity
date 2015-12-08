// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.app.Activity;
import android.content.DialogInterface;
import com.soundcloud.android.accounts.LogoutActivity;

// Referenced classes of package com.soundcloud.android.settings:
//            GeneralSettings

class val.parent
    implements android.content.ClickListener
{

    final GeneralSettings this$0;
    final Activity val$parent;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        LogoutActivity.start(val$parent);
    }

    ()
    {
        this$0 = final_generalsettings;
        val$parent = Activity.this;
        super();
    }
}
