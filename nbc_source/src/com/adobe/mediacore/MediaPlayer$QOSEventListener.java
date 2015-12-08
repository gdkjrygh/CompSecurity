// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.qos.LoadInfo;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer

public static interface ng
    extends ng
{

    public abstract void onBufferComplete();

    public abstract void onBufferStart();

    public abstract void onLoadInfo(LoadInfo loadinfo);

    public abstract void onOperationFailed(ng ng);

    public abstract void onSeekComplete(long l);

    public abstract void onSeekStart();
}
