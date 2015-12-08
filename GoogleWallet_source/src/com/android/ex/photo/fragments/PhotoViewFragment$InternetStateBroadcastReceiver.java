// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.LoaderManager;
import com.android.ex.photo.views.ProgressBarWrapper;

// Referenced classes of package com.android.ex.photo.fragments:
//            PhotoViewFragment

final class <init> extends BroadcastReceiver
{

    final PhotoViewFragment this$0;

    public final void onReceive(Context context, Intent intent)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || !context.isConnected())
        {
            mConnected = false;
        } else
        if (!mConnected && !isPhotoBound())
        {
            if (!mThumbnailShown)
            {
                getLoaderManager().restartLoader(2, null, PhotoViewFragment.this);
            }
            getLoaderManager().restartLoader(3, null, PhotoViewFragment.this);
            mConnected = true;
            mPhotoProgressBar.setVisibility(0);
            return;
        }
    }

    private ()
    {
        this$0 = PhotoViewFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
