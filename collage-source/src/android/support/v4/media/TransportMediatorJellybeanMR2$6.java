// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//            TransportMediatorJellybeanMR2, TransportMediatorCallback

class this._cls0
    implements android.media.sitionUpdateListener
{

    final TransportMediatorJellybeanMR2 this$0;

    public void onPlaybackPositionUpdate(long l)
    {
        mTransportCallback.playbackPositionUpdate(l);
    }

    eListener()
    {
        this$0 = TransportMediatorJellybeanMR2.this;
        super();
    }
}
