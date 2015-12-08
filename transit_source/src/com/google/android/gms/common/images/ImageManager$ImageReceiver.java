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
import com.google.android.gms.internal.db;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mUri extends ResultReceiver
{

    private final ArrayList jK = new ArrayList();
    boolean jL;
    final ImageManager jM;
    private final Uri mUri;

    static ArrayList a(mUri muri)
    {
        return muri.jK;
    }

    public void aR()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.a(jM).sendBroadcast(intent);
    }

    public void c(a a1)
    {
        boolean flag;
        if (!jL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        db.a(flag, "Cannot add an ImageRequest when mHandlingRequests is true");
        db.w("ImageReceiver.addImageRequest() must be called in the main thread");
        jK.add(a1);
    }

    public void d(a a1)
    {
        boolean flag;
        if (!jL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        db.a(flag, "Cannot remove an ImageRequest when mHandlingRequests is true");
        db.w("ImageReceiver.removeImageRequest() must be called in the main thread");
        jK.remove(a1);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.d(jM).execute(new jM(jM, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        jM = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        jL = false;
        mUri = uri;
    }
}
