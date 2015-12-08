// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.Loader;
import com.android.ex.photo.adapters.PhotoPagerAdapter;
import com.android.ex.photo.fragments.PhotoViewFragment;

public interface PhotoViewCallbacks
{
    public static interface CursorChangedListener
    {

        public abstract void onCursorChanged(Cursor cursor);
    }

    public static interface OnScreenListener
    {

        public abstract void onFullScreenChanged(boolean flag);

        public abstract boolean onInterceptMoveLeft(float f, float f1);

        public abstract boolean onInterceptMoveRight(float f, float f1);

        public abstract void onViewActivated();

        public abstract void onViewUpNext();
    }


    public abstract void addCursorListener(CursorChangedListener cursorchangedlistener);

    public abstract void addScreenListener(int i, OnScreenListener onscreenlistener);

    public abstract PhotoPagerAdapter getAdapter();

    public abstract boolean isFragmentActive(Fragment fragment);

    public abstract boolean isFragmentFullScreen(Fragment fragment);

    public abstract Loader onCreateBitmapLoader(int i, Bundle bundle, String s);

    public abstract void onFragmentPhotoLoadComplete(PhotoViewFragment photoviewfragment, boolean flag);

    public abstract void removeCursorListener(CursorChangedListener cursorchangedlistener);

    public abstract void removeScreenListener(int i);

    public abstract void toggleFullScreen();
}
