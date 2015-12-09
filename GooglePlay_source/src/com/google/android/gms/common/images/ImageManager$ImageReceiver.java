// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private final class mUri extends ResultReceiver
{

    final ArrayList mImageRequestList = new ArrayList();
    final Uri mUri;
    final ImageManager this$0;

    public final void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.access$800(ImageManager.this).execute(new DiskRunnable(ImageManager.this, mUri, bundle));
    }


    DiskRunnable(Uri uri)
    {
        this$0 = ImageManager.this;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
