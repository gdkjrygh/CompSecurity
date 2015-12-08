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
import com.google.android.gms.internal.je;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mUri extends ResultReceiver
{

    private final ArrayList LE = new ArrayList();
    final ImageManager LF;
    private final Uri mUri;

    static ArrayList a(mUri muri)
    {
        return muri.LE;
    }

    public void b(a a1)
    {
        je.aU("ImageReceiver.addImageRequest() must be called in the main thread");
        LE.add(a1);
    }

    public void c(a a1)
    {
        je.aU("ImageReceiver.removeImageRequest() must be called in the main thread");
        LE.remove(a1);
    }

    public void hg()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.b(LF).sendBroadcast(intent);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.f(LF).execute(new LF(LF, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        LF = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
