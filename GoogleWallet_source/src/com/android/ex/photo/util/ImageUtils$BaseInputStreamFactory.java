// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;

// Referenced classes of package com.android.ex.photo.util:
//            ImageUtils

static class mUri
    implements mUri
{

    protected final ContentResolver mResolver;
    protected final Uri mUri;

    public InputStream createInputStream()
        throws FileNotFoundException
    {
        return mResolver.openInputStream(mUri);
    }

    public A(ContentResolver contentresolver, Uri uri)
    {
        mResolver = contentresolver;
        mUri = uri;
    }
}
