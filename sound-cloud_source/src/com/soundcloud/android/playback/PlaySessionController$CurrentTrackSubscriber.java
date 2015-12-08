// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, PlaySessionStateProvider

private final class <init> extends DefaultSubscriber
{

    final PlaySessionController this$0;

    private void playIfTrackChanged(PropertySet propertyset)
    {
        propertyset = (Urn)propertyset.get(TrackProperty.URN);
        Urn urn = PlaySessionController.access$2700(PlaySessionController.this);
        if (PlaySessionController.access$2400(PlaySessionController.this).isPlaying() && !propertyset.equals(urn))
        {
            playCurrent();
        }
    }

    public final void onNext(PropertySet propertyset)
    {
        if (!PlaySessionController.access$2300(PlaySessionController.this).isCasting()) goto _L2; else goto _L1
_L1:
        playIfTrackChanged(propertyset);
_L4:
        PlaySessionController.access$2502(PlaySessionController.this, propertyset);
        PlaySessionController.access$2600(PlaySessionController.this);
        return;
_L2:
        if (PlaySessionController.access$2400(PlaySessionController.this).isPlaying())
        {
            playCurrent();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    private ()
    {
        this$0 = PlaySessionController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
