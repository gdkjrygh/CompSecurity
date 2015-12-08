// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            AppContentAgent, Agents

private final class entUri
{

    private final Context mContext;
    final Map mGroupImageCount = new ArrayMap();
    final Uri mImageContentUri;
    final ArrayList mImageIdIndex = new ArrayList();
    final ArrayList mOps = new ArrayList();
    final SparseArray mUriRowAndColumnMap = new SparseArray();
    final AppContentAgent this$0;

    public final void applyOperationsAndInsertUris()
    {
        ArrayList arraylist = Agents.applyContentOperationsWithResult(mContext.getContentResolver(), mOps, "AppContentAgent");
        if (arraylist != null)
        {
            int i = 0;
            int j = arraylist.size();
            while (i < j) 
            {
                Integer integer = (Integer)mImageIdIndex.get(i);
                Pair pair = (Pair)mUriRowAndColumnMap.get(integer.intValue());
                ((ContentValues)pair.first).put((String)pair.second, ((ContentProviderResult)arraylist.get(integer.intValue())).uri.toString());
                i++;
            }
        }
    }

    (Context context, ClientContext clientcontext)
    {
        this$0 = AppContentAgent.this;
        super();
        mContext = context;
        mImageContentUri = com.google.android.gms.games.provider.tUri(clientcontext);
    }
}
