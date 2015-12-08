// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.Activity;
import android.content.DialogInterface;
import com.jcp.http.c;
import com.jcp.util.g;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.activities:
//            DebugSettingsActivity

class n
    implements android.content.DialogInterface.OnClickListener
{

    final DebugSettingsActivity a;

    n(DebugSettingsActivity debugsettingsactivity)
    {
        a = debugsettingsactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        c.a();
        g.a().c();
        a.finish();
        if (com.jcp.activities.DebugSettingsActivity.c() != null)
        {
            dialoginterface = (Activity)com.jcp.activities.DebugSettingsActivity.c().get();
            if (dialoginterface != null)
            {
                dialoginterface.finish();
            }
        }
        System.exit(1);
    }
}
