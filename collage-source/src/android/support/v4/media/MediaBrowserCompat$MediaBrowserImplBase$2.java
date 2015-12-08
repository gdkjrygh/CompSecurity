// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat

class val.mediaId
    implements Runnable
{

    final val.mediaId this$0;
    final val.mediaId val$cb;
    final String val$mediaId;

    public void run()
    {
        val$cb.cb(val$mediaId);
    }

    ()
    {
        this$0 = final_;
        val$cb = 1;
        val$mediaId = String.this;
        super();
    }
}
