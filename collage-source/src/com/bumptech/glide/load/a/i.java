// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.a:
//            g

public class i extends g
{

    public i(Context context, Uri uri)
    {
        super(context, uri);
    }

    protected InputStream a(Uri uri, ContentResolver contentresolver)
        throws FileNotFoundException
    {
        return contentresolver.openInputStream(uri);
    }

    protected void a(InputStream inputstream)
        throws IOException
    {
        inputstream.close();
    }

    protected volatile void a(Object obj)
        throws IOException
    {
        a((InputStream)obj);
    }

    protected Object b(Uri uri, ContentResolver contentresolver)
        throws FileNotFoundException
    {
        return a(uri, contentresolver);
    }
}
