// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            FbAlbum

public class this._cls0
{
    public class PictureData
    {

        private String mURL;
        final FbAlbum.Picture this$1;

        public String getURL()
        {
            return mURL;
        }

        public void setURL(String s)
        {
            mURL = s;
        }

        public PictureData()
        {
            this$1 = FbAlbum.Picture.this;
            super();
        }
    }


    private PictureData mData;
    final FbAlbum this$0;

    public PictureData getData()
    {
        return mData;
    }

    public PictureData.this._cls1()
    {
        this$0 = FbAlbum.this;
        super();
    }
}
