// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.internal.fb;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mUri extends ResultReceiver
{

    private final ArrayList Ch = new ArrayList();
    final ImageManager Ci;
    private final Uri mUri;

    static ArrayList a(mUri muri)
    {
        return muri.Ch;
    }

    public void b(a a1)
    {
        fb.aj("ImageReceiver.addImageRequest() must be called in the main thread");
        Ch.add(a1);
    }

    public void c(a a1)
    {
        fb.aj("ImageReceiver.removeImageRequest() must be called in the main thread");
        Ch.remove(a1);
    }

    public void ey()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.b(Ci).sendBroadcast(intent);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.e(Ci).execute(new Ci(Ci, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        Ci = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
