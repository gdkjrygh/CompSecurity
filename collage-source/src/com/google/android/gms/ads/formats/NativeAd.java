// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public abstract class NativeAd
{
    public static interface Image
    {

        public abstract Drawable getDrawable();

        public abstract Uri getUri();
    }


    public NativeAd()
    {
    }

    protected abstract Object zzaH();
}
