// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.graphics.Bitmap;

// Referenced classes of package net.coocent.android.xmlparser:
//            AsyncGiftImageLoader

public class this._cls0
{

    private Bitmap bitmap;
    private icon_netPath callback;
    private String icon_netPath;
    private String savePath;
    final AsyncGiftImageLoader this$0;

    public boolean equals(Object obj)
    {
        obj = (this._cls0)obj;
        return icon_netPath.equals(((icon_netPath) (obj)).icon_netPath);
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
        return icon_netPath;
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
        icon_netPath = s;
    }









    public ()
    {
        this$0 = AsyncGiftImageLoader.this;
        super();
    }
}
