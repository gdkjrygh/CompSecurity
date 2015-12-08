// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public interface Target
{

    public abstract void onBitmapFailed(Drawable drawable);

    public abstract void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedfrom);

    public abstract void onPrepareLoad(Drawable drawable);
}
