// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.a:
//            g

public class e extends g
{

    public e(Context context, Uri uri)
    {
        super(context, uri);
    }

    protected ParcelFileDescriptor a(Uri uri, ContentResolver contentresolver)
        throws FileNotFoundException
    {
        return contentresolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }

    protected void a(ParcelFileDescriptor parcelfiledescriptor)
        throws IOException
    {
        parcelfiledescriptor.close();
    }

    protected volatile void a(Object obj)
        throws IOException
    {
        a((ParcelFileDescriptor)obj);
    }

    protected Object b(Uri uri, ContentResolver contentresolver)
        throws FileNotFoundException
    {
        return a(uri, contentresolver);
    }
}
