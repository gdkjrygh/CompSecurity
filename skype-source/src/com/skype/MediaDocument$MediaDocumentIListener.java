// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            MediaDocument

public static interface 
{

    public abstract void onDownloadError(MediaDocument mediadocument, String s,  , boolean flag);

    public abstract void onMediaLinkProgress(MediaDocument mediadocument, String s, int i, int j, int k);

    public abstract void onMediaLinkStatusChange(MediaDocument mediadocument,  , String s, String s1);

    public abstract void onMetadataUpdated(MediaDocument mediadocument);

    public abstract void onUploadError(MediaDocument mediadocument, String s,  , boolean flag);

    public abstract void onUploadProgress(MediaDocument mediadocument, String s, int i, int j);

    public abstract void onUploadStatusChanged(MediaDocument mediadocument, String s,  );
}
