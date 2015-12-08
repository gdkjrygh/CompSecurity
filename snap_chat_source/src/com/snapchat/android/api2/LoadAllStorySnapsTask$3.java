// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;


// Referenced classes of package com.snapchat.android.api2:
//            LoadAllStorySnapsTask

final class atus
    implements Runnable
{

    final LoadAllStorySnapsTask this$0;
    final atus val$status;

    public final void run()
    {
        LoadAllStorySnapsTask loadallstorysnapstask = LoadAllStorySnapsTask.this;
        boolean flag;
        if (val$status == atus.SUCCESS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loadallstorysnapstask.a(flag);
    }

    atus()
    {
        this$0 = final_loadallstorysnapstask;
        val$status = atus.this;
        super();
    }
}
