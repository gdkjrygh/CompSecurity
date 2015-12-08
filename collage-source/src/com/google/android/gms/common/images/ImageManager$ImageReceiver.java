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
import com.google.android.gms.common.internal.e;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class b extends ResultReceiver
{

    final ImageManager a;
    private final Uri b;
    private final ArrayList c = new ArrayList();

    static ArrayList a(b b1)
    {
        return b1.c;
    }

    public void a()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", b);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.b(a).sendBroadcast(intent);
    }

    public void a(a a1)
    {
        e.a("ImageReceiver.addImageRequest() must be called in the main thread");
        c.add(a1);
    }

    public void b(a a1)
    {
        e.a("ImageReceiver.removeImageRequest() must be called in the main thread");
        c.remove(a1);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.f(a).execute(new a(a, b, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        a = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        b = uri;
    }
}
