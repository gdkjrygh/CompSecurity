// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import com.pandora.android.artist.ArtistMessageTrackView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;

// Referenced classes of package com.pandora.android.view:
//            AudioAdViewPhone, ExplicitWarningTrackView, TrackView, NowPlayingView

public class d
{

    public static NowPlayingView a(Context context, aa aa1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ac.values().length];
                try
                {
                    a[ac.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ac.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ac.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[aa1.l().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("createViewByType: unknown TrackData type ").append(aa1).toString());

        case 1: // '\001'
            return ArtistMessageTrackView.a(context, aa1);

        case 2: // '\002'
            return AudioAdViewPhone.a(context, aa1);

        case 3: // '\003'
            break;
        }
        if (aa1.k())
        {
            return ExplicitWarningTrackView.a(context, aa1);
        } else
        {
            return new TrackView(context);
        }
    }
}
