// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.initialize;

import android.content.Context;

public interface IInitializeComponent
{
    public static interface IInitFinishListener
    {

        public abstract void onError();

        public abstract void onSuccess();
    }


    public abstract int initialize(Context context);

    public abstract void initializeAsync(Context context);

    public abstract boolean isSoValid(Context context);

    public abstract void loadLibraryAsync(Context context);

    public abstract void loadLibraryAsync(Context context, String s);

    public abstract int loadLibrarySync(Context context);

    public abstract int loadLibrarySync(Context context, String s);

    public abstract void registerInitFinishListener(IInitFinishListener iinitfinishlistener);

    public abstract void unregisterInitFinishListener(IInitFinishListener iinitfinishlistener);
}
