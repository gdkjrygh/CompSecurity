// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.video.view.exo:
//            ExoPlayerDashStreamRendererBuilder

class b
    implements com.google.android.exoplayer.util._20__20__20__20__7B__0A_h
{

    final ExoPlayerDashStreamRendererBuilder a;
    private a b;

    private void a(MediaPresentationDescription mediapresentationdescription)
    {
        Representation representation;
        boolean flag = true;
        Iterator iterator;
        if (mediapresentationdescription.i.size() != 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        iterator = ((Period)mediapresentationdescription.i.get(0)).d.iterator();
        representation = null;
        do
        {
label0:
            {
                Object obj;
                Iterator iterator1;
label1:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (AdaptationSet)iterator.next();
                    switch (((AdaptationSet) (obj)).b)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        obj = ((AdaptationSet) (obj)).c.iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            ((Iterator) (obj)).next();
                        }
                        break;

                    case 1: // '\001'
                        iterator1 = ((AdaptationSet) (obj)).c.iterator();
                        obj = representation;
                        break label1;
                    }
                    if (false)
                    {
                        break label0;
                    }
                    continue;
                }
                do
                {
                    representation = ((Representation) (obj));
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    representation = (Representation)iterator1.next();
                    if (obj == null)
                    {
                        obj = representation;
                    }
                } while (true);
            }
        } while (true);
        mediapresentationdescription = ExoPlayerDashStreamRendererBuilder.a(a, mediapresentationdescription);
        com.google.android.exoplayer.MediaCodecAudioTrackRenderer mediacodecaudiotrackrenderer = ExoPlayerDashStreamRendererBuilder.a(a, representation);
        b.b(mediapresentationdescription, mediacodecaudiotrackrenderer);
        return;
    }

    public final void a(IOException ioexception)
    {
        b.b(ioexception);
    }

    public final volatile void a(Object obj)
    {
        a((MediaPresentationDescription)obj);
    }

    public Y(ExoPlayerDashStreamRendererBuilder exoplayerdashstreamrendererbuilder, Y y)
    {
        a = exoplayerdashstreamrendererbuilder;
        super();
        b = y;
    }
}
