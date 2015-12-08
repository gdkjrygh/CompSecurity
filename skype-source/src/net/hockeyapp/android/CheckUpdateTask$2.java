// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;
import org.json.JSONArray;

// Referenced classes of package net.hockeyapp.android:
//            CheckUpdateTask, VersionCache, UpdateManager

final class val.updateInfo
    implements android.content.ClickListener
{

    final CheckUpdateTask this$0;
    final JSONArray val$updateInfo;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (getCachingEnabled())
        {
            VersionCache.setVersionInfo(CheckUpdateTask.access$100(CheckUpdateTask.this), "[]");
        }
        if (UpdateManager.fragmentsSupported().booleanValue() && UpdateManager.runsOnTablet(CheckUpdateTask.access$100(CheckUpdateTask.this)).booleanValue())
        {
            CheckUpdateTask.access$200(CheckUpdateTask.this, val$updateInfo);
            return;
        } else
        {
            CheckUpdateTask.access$300(CheckUpdateTask.this, val$updateInfo, Boolean.valueOf(false));
            return;
        }
    }

    istener()
    {
        this$0 = final_checkupdatetask;
        val$updateInfo = JSONArray.this;
        super();
    }
}
