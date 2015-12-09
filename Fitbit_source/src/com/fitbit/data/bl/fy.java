// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.e.a;
import com.fitbit.savedstate.LoadSavedState;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class fy extends com.fitbit.data.bl.a
{

    static final String b = "com.fitbit.data.bl.UpdateProfilePhotoTask.ACTION";
    private static final String c = "UpdateProfilePhotoTask";
    private static final String d = "com.fitbit.data.bl.UpdateProfilePhotoTask.EXTRA_URI";

    public fy()
    {
    }

    public static Intent a(Context context, Uri uri)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.UpdateProfilePhotoTask.ACTION");
        context.putExtra("com.fitbit.data.bl.UpdateProfilePhotoTask.EXTRA_URI", uri);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        syncservice = (Uri)intent.getParcelableExtra("com.fitbit.data.bl.UpdateProfilePhotoTask.EXTRA_URI");
        if (b.a.a())
        {
            com.fitbit.e.a.a("UpdateProfilePhotoTask", "Uri: %s", new Object[] {
                syncservice
            });
        }
        if (syncservice == null)
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.c);
            return;
        } else
        {
            dg.d().a(syncservice, null);
            return;
        }
    }

    public boolean b()
    {
        return com.fitbit.data.bl.an.a().j();
    }
}
