// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;

public interface IInitializeComponent
{
    public static interface IInitFinishListener
    {

        public abstract void onError();

        public abstract void onSuccess();
    }


    public abstract int initialize(Context context)
        throws SecException;

    public abstract void initializeAsync(Context context);

    public abstract boolean isSoValid(Context context)
        throws SecException;

    public abstract void loadLibraryAsync(Context context)
        throws SecException;

    public abstract void loadLibraryAsync(Context context, String s)
        throws SecException;

    public abstract int loadLibrarySync(Context context)
        throws SecException;

    public abstract int loadLibrarySync(Context context, String s)
        throws SecException;

    public abstract void registerInitFinishListener(IInitFinishListener iinitfinishlistener)
        throws SecException;

    public abstract void unregisterInitFinishListener(IInitFinishListener iinitfinishlistener)
        throws SecException;
}
