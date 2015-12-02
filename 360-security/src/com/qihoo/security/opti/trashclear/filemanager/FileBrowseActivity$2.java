// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity

class a extends BroadcastReceiver
{

    final FileBrowseActivity a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.intent.action.MEDIA_MOUNTED") || context.equals("android.intent.action.MEDIA_UNMOUNTED"))
        {
            FileBrowseActivity.j(a).sendEmptyMessage(0);
        }
    }

    I(FileBrowseActivity filebrowseactivity)
    {
        a = filebrowseactivity;
        super();
    }
}
