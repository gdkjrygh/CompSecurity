// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.List;

public final class SharedElementTransition
{

    public int mAnimation;
    public Bundle mSharedViewInfo;
    private List mSharedViews;

    public SharedElementTransition()
    {
        this(0);
    }

    public SharedElementTransition(int i)
    {
        mAnimation = i;
        mSharedViews = new ArrayList();
        mSharedViewInfo = new Bundle();
    }

    public SharedElementTransition(Intent intent)
    {
        mSharedViews = new ArrayList();
        intent = intent.getExtras();
        if (intent == null)
        {
            mAnimation = 0;
            mSharedViewInfo = new Bundle();
            return;
        } else
        {
            mAnimation = intent.getInt("com.google.android.gms.games.ANIMATION", 0);
            mSharedViewInfo = (Bundle)intent.getParcelable("com.google.android.gms.client.SHARED_VIEW_INFO");
            return;
        }
    }

    public static SharedElementTransition createAvatarTransition()
    {
        return new SharedElementTransition(3);
    }

    public static SharedElementTransition createHeroIconTransition()
    {
        return new SharedElementTransition(1);
    }

    public final void addSharedLoadingImageView(LoadingImageView loadingimageview, String s, Uri uri, int i)
    {
        addSharedView(loadingimageview, s);
        mSharedViewInfo.putParcelable((new StringBuilder()).append(s).append(";uri").toString(), uri);
        mSharedViewInfo.putInt((new StringBuilder()).append(s).append(";defaultResId").toString(), i);
    }

    public final void addSharedTextView(TextView textview, String s)
    {
        addSharedView(textview, s);
        textview = textview.getText();
        mSharedViewInfo.putString((new StringBuilder()).append(s).append(";text").toString(), textview.toString());
    }

    public final void addSharedView(View view, String s)
    {
        mSharedViews.add(new Pair(view, s));
    }

    public final void initSharedView(View view, String s)
    {
        if (view instanceof TextView)
        {
            s = mSharedViewInfo.getString((new StringBuilder()).append(s).append(";text").toString());
            ((TextView)view).setText(s);
        } else
        if (view instanceof LoadingImageView)
        {
            Uri uri = (Uri)mSharedViewInfo.getParcelable((new StringBuilder()).append(s).append(";uri").toString());
            int i = mSharedViewInfo.getInt((new StringBuilder()).append(s).append(";defaultResId").toString());
            ((LoadingImageView)view).loadUri$3329f911(uri, i, false);
            return;
        }
    }

    public final void startActivity(Activity activity, Intent intent)
    {
        if (PlatformVersion.checkVersion(21) && mAnimation != 0 && mSharedViews.size() > 0)
        {
            intent.putExtra("com.google.android.gms.games.ANIMATION", mAnimation);
            intent.putExtra("com.google.android.gms.client.SHARED_VIEW_INFO", mSharedViewInfo);
            activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity, (Pair[])mSharedViews.toArray(new Pair[mSharedViews.size()])).toBundle());
            return;
        } else
        {
            activity.startActivity(intent);
            return;
        }
    }
}
