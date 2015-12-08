// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.net.Uri;
import android.os.Handler;

class this._cls1
    implements android.media.on.OnScanCompletedListener
{

    final _cls1 this$1;

    public void onScanCompleted(String s, final Uri uri)
    {
        class _cls1
            implements Runnable
        {

            final GPUImage.SaveTask._cls1 this$2;
            final Uri val$uri;

            public void run()
            {
                GPUImage.SaveTask.access$200(this$1).onPictureSaved(uri);
            }

            _cls1()
            {
                this$2 = GPUImage.SaveTask._cls1.this;
                uri = uri1;
                super();
            }
        }

        if (cess._mth200(this._cls1.this) != null)
        {
            cess._mth300(this._cls1.this).post(new _cls1());
        }
    }

    _cls1()
    {
        this$1 = this._cls1.this;
        super();
    }
}
