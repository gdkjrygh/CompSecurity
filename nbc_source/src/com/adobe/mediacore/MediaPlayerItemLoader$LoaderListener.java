// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.MediaErrorCode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItemLoader, MediaPlayerItem

public static interface 
{

    public abstract void onError(MediaErrorCode mediaerrorcode, String s);

    public abstract void onLoadComplete(MediaPlayerItem mediaplayeritem);
}
