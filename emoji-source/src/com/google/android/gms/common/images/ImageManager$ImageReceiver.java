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
import com.google.android.gms.internal.gx;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mUri extends ResultReceiver
{

    private final ArrayList Fh = new ArrayList();
    final ImageManager Fi;
    private final Uri mUri;

    static ArrayList a(mUri muri)
    {
        return muri.Fh;
    }

    public void b(a a1)
    {
        gx.ay("ImageReceiver.addImageRequest() must be called in the main thread");
        Fh.add(a1);
    }

    public void c(a a1)
    {
        gx.ay("ImageReceiver.removeImageRequest() must be called in the main thread");
        Fh.remove(a1);
    }

    public void ff()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.b(Fi).sendBroadcast(intent);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.f(Fi).execute(new Fi(Fi, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        Fi = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
