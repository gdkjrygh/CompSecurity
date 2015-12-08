// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.podbuster;

import android.app.Activity;
import android.content.Context;
import com.adobe.mediacore.DefaultAdvertisingFactory;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import com.adobe.mediacore.timeline.advertising.MetadataResolver;
import com.adobe.mediacore.timeline.advertising.customadmarkers.CustomAdMarkersContentResolver;
import com.adobe.mediacore.timeline.advertising.customadmarkers.DeleteContentResolver;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.content.podbuster:
//            NbcContentResolver

public class NbcAdvertisingFactory extends DefaultAdvertisingFactory
{

    private final Context context;
    private final boolean isLive;
    private final String pid;

    public NbcAdvertisingFactory(String s, boolean flag, AdSignalingMode adsignalingmode, Context context1)
    {
        super(adsignalingmode, context1);
        pid = s;
        isLive = flag;
        context = context1;
    }

    private boolean isActivityDead()
    {
        return context == null || ((Activity)context).isFinishing();
    }

    public ContentResolver createContentResolver(MediaPlayerItem mediaplayeritem)
    {
        if (!isActivityDead())
        {
            if ((mediaplayeritem = mediaplayeritem.getResource().getMetadata()) != null)
            {
                if (mediaplayeritem.containsKey(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue()))
                {
                    return new NbcContentResolver(context.getApplicationContext(), pid, isLive);
                }
                if (mediaplayeritem.containsKey(DefaultMetadataKeys.JSON_METADATA_KEY.getValue()))
                {
                    return new MetadataResolver();
                }
                if (mediaplayeritem.containsKey(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue()))
                {
                    return new CustomAdMarkersContentResolver();
                }
            }
        }
        return null;
    }

    public List createContentResolvers(MediaPlayerItem mediaplayeritem)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        mediaplayeritem = mediaplayeritem.getResource().getMetadata();
        if (mediaplayeritem == null) goto _L2; else goto _L1
_L1:
        if (!mediaplayeritem.containsKey(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue())) goto _L4; else goto _L3
_L3:
        String s = mediaplayeritem.getValue(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue());
        if (!s.equals("delete")) goto _L6; else goto _L5
_L5:
        arraylist.add(new DeleteContentResolver());
_L4:
        if (!mediaplayeritem.containsKey(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue())) goto _L8; else goto _L7
_L7:
        arraylist.add(new NbcContentResolver(context.getApplicationContext(), pid, isLive));
_L2:
        return arraylist;
_L6:
        if (s.equals("replace"))
        {
            arraylist.add(new DeleteContentResolver());
        } else
        if (s.equals("mark"))
        {
            arraylist.add(new CustomAdMarkersContentResolver());
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (!mediaplayeritem.containsKey(DefaultMetadataKeys.JSON_METADATA_KEY.getValue())) goto _L2; else goto _L9
_L9:
        arraylist.add(new MetadataResolver());
        return arraylist;
        if (true) goto _L4; else goto _L10
_L10:
    }
}
