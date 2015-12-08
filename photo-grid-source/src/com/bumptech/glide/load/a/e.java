// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.bumptech.glide.load.a:
//            i

public final class e extends i
{

    public e(Context context, Uri uri)
    {
        super(context, uri);
    }

    protected final Object a(Uri uri, ContentResolver contentresolver)
    {
        return contentresolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }

    protected final void a(Object obj)
    {
        ((ParcelFileDescriptor)obj).close();
    }
}
