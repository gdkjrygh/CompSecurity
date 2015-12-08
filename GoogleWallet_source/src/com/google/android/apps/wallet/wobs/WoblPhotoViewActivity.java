// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.ex.photo.Intents;
import com.android.ex.photo.PhotoViewActivity;
import com.android.ex.photo.PhotoViewController;
import com.google.android.apps.wallet.base.activity.RecentTasksStyler;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.userscope.UserScopedActivityInjectHelper;
import com.google.android.apps.wallet.userscope.UserScopedApplication;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.common.base.Preconditions;
import com.google.wallet.wobl.parser.WoblParser;
import com.squareup.picasso.Picasso;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblPhotoViewController, WoblPhotosProvider

public class WoblPhotoViewActivity extends PhotoViewActivity
    implements WoblPhotoViewController.ActivityInterface
{

    EventBus eventBus;
    FeatureManager featureManager;
    LayoutMatcher layoutMatcher;
    Picasso picasso;
    private String wobInstanceId;
    WoblParser woblParser;

    public WoblPhotoViewActivity()
    {
    }

    private static String extractWobInstanceId(Uri uri)
    {
        uri = uri.getPath().split("/");
        boolean flag;
        if (uri.length >= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkArgument(uri[1].equals("objects"));
        Preconditions.checkArgument(uri[2].equals("instance"));
        return uri[3];
    }

    public final PhotoViewController createController()
    {
        return new WoblPhotoViewController(this, picasso, eventBus, layoutMatcher, woblParser, featureManager);
    }

    public final String getWobInstanceId()
    {
        return wobInstanceId;
    }

    protected void onCreate(Bundle bundle)
    {
        if (getIntent().getData() != null)
        {
            wobInstanceId = extractWobInstanceId(getIntent().getData());
            String s = getIntent().getData().getQueryParameter("src");
            setIntent(Intents.newPhotoViewIntentBuilder(this, com/google/android/apps/wallet/wobs/WoblPhotoViewActivity).setInitialPhotoUri(WoblPhotosProvider.buildPhotoUri(s)).setMaxInitialScale(8F).setProjection(com.android.ex.photo.provider.PhotoContract.PhotoQuery.PROJECTION).setActionBarHiddenInitially(true).build());
        }
        Preconditions.checkArgument(getIntent().getComponent().getClassName().equals(getClass().getName()));
        java.util.List list = ((UserScopedApplication)getApplication()).getActivityModules();
        UserScopedActivityInjectHelper userscopedactivityinjecthelper = new UserScopedActivityInjectHelper();
        userscopedactivityinjecthelper.initGraph(this, list);
        userscopedactivityinjecthelper.inject(this);
        super.onCreate(bundle);
        RecentTasksStyler.styleRecentTasksEntry(this);
    }
}
