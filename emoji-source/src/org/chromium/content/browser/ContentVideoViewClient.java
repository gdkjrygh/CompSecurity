// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.View;

public interface ContentVideoViewClient
{

    public abstract View getVideoLoadingProgressView();

    public abstract void onDestroyContentVideoView();

    public abstract boolean onShowCustomView(View view);
}
