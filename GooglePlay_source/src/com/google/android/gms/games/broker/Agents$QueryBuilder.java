// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.provider.QuerySpec;

// Referenced classes of package com.google.android.gms.games.broker:
//            Agents, GamesClientContext

public static final class Context
{

    private final Context mContext;
    String mProjection[];
    QuerySpec mQuery;
    String mSortOrder;
    int mStatusCode;

    public final DataHolder query()
    {
        AbstractWindowedCursor abstractwindowedcursor = queryCursor();
        return new DataHolder(abstractwindowedcursor, Agents.resolveStatusCode(abstractwindowedcursor, mStatusCode));
    }

    public final AbstractWindowedCursor queryCursor()
    {
        ContentProviderClient contentproviderclient;
        if (mQuery == null)
        {
            throw new IllegalArgumentException("You must call setQuerySpec before querying.");
        }
        contentproviderclient = mContext.getContentResolver().acquireContentProviderClient("com.google.android.gms.games.background");
        AbstractWindowedCursor abstractwindowedcursor = (AbstractWindowedCursor)contentproviderclient.query(mQuery.mUri, mProjection, mQuery.getSelection(), mQuery.mSelectionArgs, mSortOrder);
        contentproviderclient.release();
        return abstractwindowedcursor;
        Object obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        contentproviderclient.release();
        throw obj;
    }

    public final mSortOrder setQuerySpec(Uri uri)
    {
        mQuery = new QuerySpec(uri);
        return this;
    }

    public final mQuery setQuerySpec(Uri uri, String s, String as[])
    {
        mQuery = new QuerySpec(uri, s, as);
        return this;
    }

    public (Context context)
    {
        mContext = context;
        mQuery = null;
        mProjection = null;
        mSortOrder = null;
        mStatusCode = 0;
    }

    public mStatusCode(GamesClientContext gamesclientcontext)
    {
        this(gamesclientcontext.mContext);
    }
}
