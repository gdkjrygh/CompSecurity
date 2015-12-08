// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import java.io.File;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

final class onHandlerAdapter extends PermissionHandlerAdapter
{

    final ChatFragment this$0;

    public final void onGranted()
    {
        analytics.c(AnalyticsEvent.bZ);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), (new StringBuilder("photo_")).append(System.currentTimeMillis()).append(".jpg").toString());
        ChatFragment.access$402(ChatFragment.this, Uri.fromFile(file));
        intent.putExtra("output", ChatFragment.access$400(ChatFragment.this));
        startActivityForResult(intent, 1);
    }

    ()
    {
        this$0 = ChatFragment.this;
        super();
    }
}
