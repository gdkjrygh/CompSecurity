// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.graphics.Bitmap;

// Referenced classes of package com.arist.util:
//            AsyncImageLoader

public class this._cls0
{

    private Bitmap bitmap;
    private netPath callback;
    private String netPath;
    private String savePath;
    final AsyncImageLoader this$0;

    public boolean equals(Object obj)
    {
        obj = (this._cls0)obj;
        return savePath.equals(((savePath) (obj)).savePath);
    }

    public String getAlbumID()
    {
        return savePath;
    }

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public String getPath()
    {
        return netPath;
    }

    public void setAlbumID(String s)
    {
        savePath = s;
    }

    public void setBitmap(Bitmap bitmap1)
    {
        bitmap = bitmap1;
    }

    public void setPath(String s)
    {
        netPath = s;
    }









    public ()
    {
        this$0 = AsyncImageLoader.this;
        super();
    }
}
