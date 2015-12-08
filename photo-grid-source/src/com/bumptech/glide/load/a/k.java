// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.a:
//            i

public final class k extends i
{

    public k(Context context, Uri uri)
    {
        super(context, uri);
    }

    protected final Object a(Uri uri, ContentResolver contentresolver)
    {
        return contentresolver.openInputStream(uri);
    }

    protected final void a(Object obj)
    {
        ((InputStream)obj).close();
    }
}
