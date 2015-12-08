// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            Player

public static interface 
{

    public abstract void onPlaystateChanged( );

    public abstract void onProgressEvent(long l, long l1);

    public abstract boolean requestAudioFocus();
}
