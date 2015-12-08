// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.io.File;

// Referenced classes of package com.soundcloud.android.creators.record:
//            UploadActivity

class nit> extends DefaultSubscriber
{

    final UploadActivity this$0;
    final Intent val$intent;

    public void onCompleted()
    {
        finish();
    }

    public void onNext(Recording recording)
    {
        boolean flag = true;
        recording.title = val$intent.getStringExtra("com.soundcloud.android.extra.title");
        Uri uri;
        if (val$intent.getBooleanExtra("com.soundcloud.android.extra.public", true))
        {
            flag = false;
        }
        recording.is_private = flag;
        recording.tags = val$intent.getStringArrayExtra("com.soundcloud.android.extra.tags");
        recording.description = val$intent.getStringExtra("com.soundcloud.android.extra.description");
        recording.genre = val$intent.getStringExtra("com.soundcloud.android.extra.genre");
        uri = (Uri)val$intent.getParcelableExtra("com.soundcloud.android.extra.artwork");
        if (uri != null && "file".equals(uri.getScheme()))
        {
            recording.artwork_path = new File(uri.getPath());
        }
        navigator.openRecord(UploadActivity.this, recording);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Recording)obj);
    }

    ()
    {
        this$0 = final_uploadactivity;
        val$intent = Intent.this;
        super();
    }
}
