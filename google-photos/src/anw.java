// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class anw extends aob
{

    public anw(Context context, Uri uri)
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

    public final Class d()
    {
        return android/os/ParcelFileDescriptor;
    }
}
