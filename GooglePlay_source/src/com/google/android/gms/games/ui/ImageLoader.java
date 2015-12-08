// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.net.Uri;
import com.google.android.gms.common.images.internal.LoadingImageView;

public interface ImageLoader
{

    public abstract void loadImage(LoadingImageView loadingimageview, Uri uri, int i);

    public abstract void loadImage(LoadingImageView loadingimageview, Uri uri, int i, com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onimageloadedlistener);
}
