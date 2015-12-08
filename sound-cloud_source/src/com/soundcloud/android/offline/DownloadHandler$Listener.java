// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            DownloadHandler, DownloadState

static interface 
{

    public abstract void onCancel(DownloadState downloadstate);

    public abstract void onError(DownloadState downloadstate);

    public abstract void onProgress(DownloadState downloadstate);

    public abstract void onSuccess(DownloadState downloadstate);
}
