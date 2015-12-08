// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerItem

public class PlayerAd extends PlayerItem
{

    PlayerAd(PropertySet propertyset)
    {
        super(propertyset);
    }

    String getAdTitle()
    {
        return (String)source.get(PlayableProperty.TITLE);
    }

    Uri getArtwork()
    {
        return (Uri)source.get(AdProperty.ARTWORK);
    }

    int getDefaultBackgroundColor()
    {
        return Color.parseColor((String)source.get(AdProperty.DEFAULT_BACKGROUND_COLOR));
    }

    int getDefaultTextColor()
    {
        return Color.parseColor((String)source.get(AdProperty.DEFAULT_TEXT_COLOR));
    }

    int getFocusedBackgroundColor()
    {
        return Color.parseColor((String)source.get(AdProperty.FOCUSED_BACKGROUND_COLOR));
    }

    int getFocusedTextColor()
    {
        return Color.parseColor((String)source.get(AdProperty.FOCUSED_TEXT_COLOR));
    }

    Urn getMonetizableTrack()
    {
        return (Urn)source.get(AdProperty.MONETIZABLE_TRACK_URN);
    }

    int getPressedBackgroundColor()
    {
        return Color.parseColor((String)source.get(AdProperty.PRESSED_BACKGROUND_COLOR));
    }

    int getPressedTextColor()
    {
        return Color.parseColor((String)source.get(AdProperty.PRESSED_TEXT_COLOR));
    }

    String getPreviewTitle(Resources resources)
    {
        return resources.getString(0x7f07006d, new Object[] {
            (String)source.get(AdProperty.MONETIZABLE_TRACK_TITLE), (String)source.get(AdProperty.MONETIZABLE_TRACK_CREATOR)
        });
    }
}
