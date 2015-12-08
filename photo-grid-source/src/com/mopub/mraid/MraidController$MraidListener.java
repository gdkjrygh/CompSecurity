// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.View;

public interface 
{

    public abstract void onClose();

    public abstract void onExpand();

    public abstract void onFailedToLoad();

    public abstract void onLoaded(View view);

    public abstract void onOpen();
}
