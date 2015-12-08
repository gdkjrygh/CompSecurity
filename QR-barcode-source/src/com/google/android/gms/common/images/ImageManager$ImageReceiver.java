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
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mUri extends ResultReceiver
{

    private final ArrayList KC = new ArrayList();
    final ImageManager KD;
    private final Uri mUri;

    static ArrayList a(mUri muri)
    {
        return muri.KC;
    }

    public void b(com.google.android.gms.common.images.a a1)
    {
        com.google.android.gms.common.internal.a.aT("ImageReceiver.addImageRequest() must be called in the main thread");
        KC.add(a1);
    }

    public void c(com.google.android.gms.common.images.a a1)
    {
        com.google.android.gms.common.internal.a.aT("ImageReceiver.removeImageRequest() must be called in the main thread");
        KC.remove(a1);
    }

    public void gJ()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.b(KD).sendBroadcast(intent);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.f(KD).execute(new KD(KD, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        KD = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
