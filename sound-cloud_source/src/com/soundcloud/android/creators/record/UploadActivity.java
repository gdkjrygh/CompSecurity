// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import rx.X;
import rx.b;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, RecordingOperations

public class UploadActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;
    Navigator navigator;
    RecordingOperations operations;

    public UploadActivity()
    {
    }

    private boolean isUploadIntent()
    {
        Intent intent = getIntent();
        String s = intent.getAction();
        return intent.hasExtra("android.intent.extra.STREAM") && ("android.intent.action.SEND".equals(s) || "com.soundcloud.android.SHARE".equals(s) || "com.soundcloud.android.EDIT".equals(s));
    }

    private X uploadSubscriber(final Intent intent)
    {
        return new _cls1();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300a5);
        if (!isUploadIntent())
        {
            finish();
            return;
        } else
        {
            bundle = getIntent();
            Uri uri = (Uri)bundle.getParcelableExtra("android.intent.extra.STREAM");
            operations.upload(SoundRecorder.UPLOAD_DIR, uri, bundle.getType(), getContentResolver()).subscribe(uploadSubscriber(bundle));
            return;
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setContainerLayout(this);
    }

    private class _cls1 extends DefaultSubscriber
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
            recording.title = intent.getStringExtra("com.soundcloud.android.extra.title");
            Uri uri;
            if (intent.getBooleanExtra("com.soundcloud.android.extra.public", true))
            {
                flag = false;
            }
            recording.is_private = flag;
            recording.tags = intent.getStringArrayExtra("com.soundcloud.android.extra.tags");
            recording.description = intent.getStringExtra("com.soundcloud.android.extra.description");
            recording.genre = intent.getStringExtra("com.soundcloud.android.extra.genre");
            uri = (Uri)intent.getParcelableExtra("com.soundcloud.android.extra.artwork");
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

        _cls1()
        {
            this$0 = UploadActivity.this;
            intent = intent1;
            super();
        }
    }

}
