// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.widgets;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.cast.o;

public interface IMiniController
{

    public abstract boolean isVisible();

    public abstract void setCurrentVisibility(boolean flag);

    public abstract void setIcon(Bitmap bitmap);

    public abstract void setIcon(Uri uri);

    public abstract void setOnMiniControllerChangedListener(MiniController.OnMiniControllerChangedListener onminicontrollerchangedlistener);

    public abstract void setPlaybackStatus(int i, int j);

    public abstract void setProgress(int i, int j);

    public abstract void setProgressVisibility(boolean flag);

    public abstract void setStreamType(int i);

    public abstract void setSubtitle(String s);

    public abstract void setTitle(String s);

    public abstract void setUpcomingItem(o o);

    public abstract void setUpcomingVisibility(boolean flag);

    public abstract void setVisibility(int i);
}
