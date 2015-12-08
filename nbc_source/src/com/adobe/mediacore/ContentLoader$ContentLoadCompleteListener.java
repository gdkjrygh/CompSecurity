// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            AdManifestLoadCompleteListener, ContentLoader, AdHandle, ContentCache, 
//            MediaPlayerEvent, VideoEngineDispatcher

private class <init>
    implements AdManifestLoadCompleteListener
{

    final ContentLoader this$0;

    public void onCompleted(int i, int j, long l)
    {
        AdHandle adhandle = new AdHandle(j, l);
        String s = ContentLoader.access$300(ContentLoader.this)._mth0(i);
        ContentLoader.access$400(ContentLoader.this).addContent(s, adhandle);
        ContentLoader.access$300(ContentLoader.this).tentResolved(i);
        if (ContentLoader.access$300(ContentLoader.this).shedLoading())
        {
            ContentLoader.access$500(ContentLoader.this).dispatch(new MediaPlayerEvent(AD_COMPLETE));
        }
    }

    private ()
    {
        this$0 = ContentLoader.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
