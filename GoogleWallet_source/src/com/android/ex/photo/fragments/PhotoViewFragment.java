// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ex.photo.PhotoViewCallbacks;
import com.android.ex.photo.adapters.PhotoPagerAdapter;
import com.android.ex.photo.loaders.PhotoBitmapLoaderInterface;
import com.android.ex.photo.views.PhotoView;
import com.android.ex.photo.views.ProgressBarWrapper;

public class PhotoViewFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener, com.android.ex.photo.PhotoViewCallbacks.CursorChangedListener, com.android.ex.photo.PhotoViewCallbacks.OnScreenListener
{
    final class InternetStateBroadcastReceiver extends BroadcastReceiver
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

        private InternetStateBroadcastReceiver()
        {
            this$0 = PhotoViewFragment.this;
            super();
        }

    }


    protected PhotoPagerAdapter mAdapter;
    protected PhotoViewCallbacks mCallback;
    protected boolean mConnected;
    protected boolean mDisplayThumbsFullScreen;
    protected TextView mEmptyText;
    protected boolean mFullScreen;
    protected Intent mIntent;
    protected BroadcastReceiver mInternetStateReceiver;
    protected boolean mOnlyShowSpinner;
    protected View mPhotoPreviewAndProgress;
    protected ImageView mPhotoPreviewImage;
    protected ProgressBarWrapper mPhotoProgressBar;
    protected PhotoView mPhotoView;
    protected int mPosition;
    protected boolean mProgressBarNeeded;
    protected String mResolvedPhotoUri;
    protected ImageView mRetryButton;
    protected boolean mThumbnailShown;
    protected String mThumbnailUri;
    protected boolean mWatchNetworkState;

    public PhotoViewFragment()
    {
        mProgressBarNeeded = true;
    }

    private void bindPhoto(Drawable drawable)
    {
        if (drawable != null)
        {
            if (mPhotoView != null)
            {
                mPhotoView.bindDrawable(drawable);
            }
            enableImageTransforms(true);
            mPhotoPreviewAndProgress.setVisibility(8);
            mProgressBarNeeded = false;
        }
    }

    private void displayPhoto(com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult bitmapresult)
    {
        if (bitmapresult.status == 1)
        {
            mProgressBarNeeded = false;
            mEmptyText.setText(com.android.ex.photo.R.string.failed);
            mEmptyText.setVisibility(0);
            mCallback.onFragmentPhotoLoadComplete(this, false);
            return;
        } else
        {
            mEmptyText.setVisibility(8);
            bindPhoto(bitmapresult.getDrawable(getResources()));
            mCallback.onFragmentPhotoLoadComplete(this, true);
            return;
        }
    }

    private void enableImageTransforms(boolean flag)
    {
        mPhotoView.enableImageTransforms(flag);
    }

    private PhotoViewCallbacks getCallbacks()
    {
        return ((com.android.ex.photo.PhotoViewController.ActivityInterface)getActivity()).getController();
    }

    private static void initializeArguments(Intent intent, int i, boolean flag, PhotoViewFragment photoviewfragment)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", flag);
        photoviewfragment.setArguments(bundle);
    }

    private void initializeView(View view)
    {
        mPhotoView = (PhotoView)view.findViewById(com.android.ex.photo.R.id.photo_view);
        mPhotoView.setMaxInitialScale(mIntent.getFloatExtra("max_scale", 1.0F));
        mPhotoView.setOnClickListener(this);
        mPhotoView.setFullScreen(mFullScreen, false);
        mPhotoView.enableImageTransforms(false);
        mPhotoPreviewAndProgress = view.findViewById(com.android.ex.photo.R.id.photo_preview);
        mPhotoPreviewImage = (ImageView)view.findViewById(com.android.ex.photo.R.id.photo_preview_image);
        mThumbnailShown = false;
        ProgressBar progressbar = (ProgressBar)view.findViewById(com.android.ex.photo.R.id.indeterminate_progress);
        mPhotoProgressBar = new ProgressBarWrapper((ProgressBar)view.findViewById(com.android.ex.photo.R.id.determinate_progress), progressbar, true);
        mEmptyText = (TextView)view.findViewById(com.android.ex.photo.R.id.empty_text);
        mRetryButton = (ImageView)view.findViewById(com.android.ex.photo.R.id.retry_button);
        setViewVisibility();
    }

    public static PhotoViewFragment newInstance(Intent intent, int i, boolean flag)
    {
        PhotoViewFragment photoviewfragment = new PhotoViewFragment();
        initializeArguments(intent, i, flag, photoviewfragment);
        return photoviewfragment;
    }

    private void onLoadFinished(Loader loader, com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult bitmapresult)
    {
        if (getView() != null && isAdded()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Drawable drawable = bitmapresult.getDrawable(getResources());
        loader.getId();
        JVM INSTR tableswitch 2 3: default 52
    //                   2 88
    //                   3 184;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_184;
_L6:
        if (!mProgressBarNeeded)
        {
            mPhotoProgressBar.setVisibility(8);
        }
        if (drawable != null)
        {
            loader = mCallback;
            int i = mPosition;
        }
        setViewVisibility();
        return;
_L4:
        if (!mDisplayThumbsFullScreen)
        {
            continue; /* Loop/switch isn't completed */
        }
        displayPhoto(bitmapresult);
          goto _L6
        if (isPhotoBound()) goto _L1; else goto _L7
_L7:
        if (drawable == null)
        {
            mPhotoPreviewImage.setImageResource(com.android.ex.photo.R.drawable.default_image);
            mThumbnailShown = false;
        } else
        {
            mPhotoPreviewImage.setImageDrawable(drawable);
            mThumbnailShown = true;
        }
        mPhotoPreviewImage.setVisibility(0);
        if (getResources().getBoolean(com.android.ex.photo.R.bool.force_thumbnail_no_scaling))
        {
            mPhotoPreviewImage.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
        enableImageTransforms(false);
          goto _L6
        displayPhoto(bitmapresult);
          goto _L6
    }

    private void resetPhotoView()
    {
        if (mPhotoView != null)
        {
            mPhotoView.bindPhoto(null);
        }
    }

    private void resetViews()
    {
        if (mPhotoView != null)
        {
            mPhotoView.resetTransformations();
        }
    }

    private void setFullScreen(boolean flag)
    {
        mFullScreen = flag;
    }

    private void setViewVisibility()
    {
        boolean flag;
        if (mCallback == null)
        {
            flag = false;
        } else
        {
            flag = mCallback.isFragmentFullScreen(this);
        }
        setFullScreen(flag);
    }

    public final String getPhotoUri()
    {
        return mResolvedPhotoUri;
    }

    public final boolean isPhotoBound()
    {
        return mPhotoView != null && mPhotoView.isPhotoBound();
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mCallback = getCallbacks();
        if (mCallback == null)
        {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        mAdapter = mCallback.getAdapter();
        if (mAdapter == null)
        {
            throw new IllegalStateException("Callback reported null adapter");
        } else
        {
            setViewVisibility();
            return;
        }
    }

    public void onClick(View view)
    {
        mCallback.toggleFullScreen();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            mIntent = (Intent)bundle1.getParcelable("arg-intent");
            mDisplayThumbsFullScreen = mIntent.getBooleanExtra("display_thumbs_fullscreen", false);
            mPosition = bundle1.getInt("arg-position");
            mOnlyShowSpinner = bundle1.getBoolean("arg-show-spinner");
            mProgressBarNeeded = true;
            if (bundle != null)
            {
                bundle = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT");
                if (bundle != null)
                {
                    mIntent = (new Intent()).putExtras(bundle);
                }
            }
            if (mIntent != null)
            {
                mResolvedPhotoUri = mIntent.getStringExtra("resolved_photo_uri");
                mThumbnailUri = mIntent.getStringExtra("thumbnail_uri");
                mWatchNetworkState = mIntent.getBooleanExtra("watch_network", false);
                return;
            }
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        String s;
        if (mOnlyShowSpinner)
        {
            return null;
        }
        s = null;
        i;
        JVM INSTR tableswitch 2 3: default 36
    //                   2 49
    //                   3 57;
           goto _L1 _L2 _L3
_L1:
        return mCallback.onCreateBitmapLoader(i, bundle, s);
_L2:
        s = mThumbnailUri;
        continue; /* Loop/switch isn't completed */
_L3:
        s = mResolvedPhotoUri;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.android.ex.photo.R.layout.photo_fragment_view, viewgroup, false);
        initializeView(layoutinflater);
        return layoutinflater;
    }

    public final void onCursorChanged(Cursor cursor)
    {
        if (mAdapter != null && cursor.moveToPosition(mPosition) && !isPhotoBound())
        {
            Object obj = mCallback;
            obj = getLoaderManager();
            Object obj1 = ((LoaderManager) (obj)).getLoader(3);
            if (obj1 != null)
            {
                obj1 = (PhotoBitmapLoaderInterface)obj1;
                mResolvedPhotoUri = mAdapter.getPhotoUri(cursor);
                ((PhotoBitmapLoaderInterface) (obj1)).setPhotoUri(mResolvedPhotoUri);
                ((PhotoBitmapLoaderInterface) (obj1)).forceLoad();
            }
            if (!mThumbnailShown)
            {
                obj = ((LoaderManager) (obj)).getLoader(2);
                if (obj != null)
                {
                    obj = (PhotoBitmapLoaderInterface)obj;
                    mThumbnailUri = mAdapter.getThumbnailUri(cursor);
                    ((PhotoBitmapLoaderInterface) (obj)).setPhotoUri(mThumbnailUri);
                    ((PhotoBitmapLoaderInterface) (obj)).forceLoad();
                    return;
                }
            }
        }
    }

    public final void onDestroyView()
    {
        if (mPhotoView != null)
        {
            mPhotoView.clear();
            mPhotoView = null;
        }
        super.onDestroyView();
    }

    public final void onDetach()
    {
        mCallback = null;
        super.onDetach();
    }

    public final void onFullScreenChanged(boolean flag)
    {
        setViewVisibility();
    }

    public final boolean onInterceptMoveLeft(float f, float f1)
    {
        while (!mCallback.isFragmentActive(this) || mPhotoView == null || !mPhotoView.interceptMoveLeft(f, f1)) 
        {
            return false;
        }
        return true;
    }

    public final boolean onInterceptMoveRight(float f, float f1)
    {
        while (!mCallback.isFragmentActive(this) || mPhotoView == null || !mPhotoView.interceptMoveRight(f, f1)) 
        {
            return false;
        }
        return true;
    }

    public final volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult)obj);
    }

    public final void onLoaderReset(Loader loader)
    {
    }

    public final void onPause()
    {
        if (mWatchNetworkState)
        {
            getActivity().unregisterReceiver(mInternetStateReceiver);
        }
        mCallback.removeCursorListener(this);
        mCallback.removeScreenListener(mPosition);
        resetPhotoView();
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        mCallback.addScreenListener(mPosition, this);
        mCallback.addCursorListener(this);
        if (mWatchNetworkState)
        {
            if (mInternetStateReceiver == null)
            {
                mInternetStateReceiver = new InternetStateBroadcastReceiver();
            }
            getActivity().registerReceiver(mInternetStateReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo networkinfo = ((ConnectivityManager)getActivity().getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkinfo != null)
            {
                mConnected = networkinfo.isConnected();
            } else
            {
                mConnected = false;
            }
        }
        if (!isPhotoBound())
        {
            mProgressBarNeeded = true;
            mPhotoPreviewAndProgress.setVisibility(0);
            getLoaderManager().initLoader(2, null, this);
            getLoaderManager().initLoader(3, null, this);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mIntent != null)
        {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", mIntent.getExtras());
        }
    }

    public final void onViewActivated()
    {
        if (!mCallback.isFragmentActive(this))
        {
            resetViews();
            return;
        }
        if (!isPhotoBound())
        {
            getLoaderManager().restartLoader(2, null, this);
        }
        PhotoViewCallbacks photoviewcallbacks = mCallback;
    }

    public final void onViewUpNext()
    {
        resetViews();
    }
}
