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
import com.google.android.gms.internal.gy;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mUri extends ResultReceiver
{

    private final ArrayList Fe = new ArrayList();
    final ImageManager Ff;
    private final Uri mUri;

    static ArrayList a(mUri muri)
    {
        return muri.Fe;
    }

    public void b(a a1)
    {
        gy.ay("ImageReceiver.addImageRequest() must be called in the main thread");
        Fe.add(a1);
    }

    public void c(a a1)
    {
        gy.ay("ImageReceiver.removeImageRequest() must be called in the main thread");
        Fe.remove(a1);
    }

    public void fa()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.b(Ff).sendBroadcast(intent);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.f(Ff).execute(new Ff(Ff, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        Ff = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
