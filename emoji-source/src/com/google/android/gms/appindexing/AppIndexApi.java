// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public interface AppIndexApi
{
    public static final class AppIndexingLink
    {

        public final Uri appIndexingUrl;
        public final int viewId;
        public final Uri webUrl;

        public AppIndexingLink(Uri uri, Uri uri1, View view1)
        {
            appIndexingUrl = uri;
            webUrl = uri1;
            viewId = view1.getId();
        }
    }


    public abstract PendingResult view(GoogleApiClient googleapiclient, Activity activity, Intent intent, String s, Uri uri, List list);

    public abstract PendingResult view(GoogleApiClient googleapiclient, Activity activity, Uri uri, String s, Uri uri1, List list);

    public abstract PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Intent intent);

    public abstract PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Uri uri);
}
