// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.loaders;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.CursorLoader;

public final class PhotoPagerLoader extends CursorLoader
{

    private final Uri mPhotosUri;
    private final String mProjection[];

    public PhotoPagerLoader(Context context, Uri uri, String as[])
    {
        super(context);
        mPhotosUri = uri;
        if (as == null)
        {
            as = com.android.ex.photo.provider.PhotoContract.PhotoQuery.PROJECTION;
        }
        mProjection = as;
    }

    public final Cursor loadInBackground()
    {
        setUri(mPhotosUri.buildUpon().appendQueryParameter("contentType", "image/").build());
        setProjection(mProjection);
        return super.loadInBackground();
    }

    public final volatile Object loadInBackground()
    {
        return loadInBackground();
    }
}
