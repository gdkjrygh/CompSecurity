// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import com.google.android.gms.cast.m;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            MediaAuthStatus, MediaAuthListener

public interface MediaAuthService
{

    public abstract void abortAuthorization(MediaAuthStatus mediaauthstatus);

    public abstract m getMediaInfo();

    public abstract String getPendingMessage();

    public abstract MediaAuthStatus getStatus();

    public abstract long getTimeout();

    public abstract void setMediaAuthListener(MediaAuthListener mediaauthlistener);

    public abstract void startAuthorization();
}
