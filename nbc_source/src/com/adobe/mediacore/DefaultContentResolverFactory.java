// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.Context;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import com.adobe.mediacore.timeline.advertising.MetadataResolver;
import com.adobe.mediacore.timeline.advertising.auditude.AuditudeResolver;
import com.adobe.mediacore.timeline.advertising.customadmarkers.CustomAdMarkersContentResolver;
import com.adobe.mediacore.timeline.advertising.customadmarkers.DeleteContentResolver;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            MediaResource

class DefaultContentResolverFactory
{

    DefaultContentResolverFactory()
    {
    }

    public static ContentResolver createContentResolver(MediaResource mediaresource, Context context)
    {
        mediaresource = (MetadataNode)mediaresource.getMetadata();
        if (mediaresource != null)
        {
            if (mediaresource.containsKey(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue()))
            {
                return new AuditudeResolver(context);
            }
            if (mediaresource.containsKey(DefaultMetadataKeys.JSON_METADATA_KEY.getValue()))
            {
                return new MetadataResolver();
            }
            if (mediaresource.containsKey(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
            {
                return new CustomAdMarkersContentResolver();
            }
        }
        return null;
    }

    public static List createContentResolvers(MediaResource mediaresource, Context context)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        mediaresource = (MetadataNode)mediaresource.getMetadata();
        if (mediaresource == null) goto _L2; else goto _L1
_L1:
        if (mediaresource.containsKey(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
        {
            arraylist.add(new CustomAdMarkersContentResolver());
        }
        if (!mediaresource.containsKey(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue())) goto _L4; else goto _L3
_L3:
        String s = mediaresource.getValue(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue());
        if (!s.equals("delete")) goto _L6; else goto _L5
_L5:
        arraylist.add(new DeleteContentResolver());
_L4:
        if (!mediaresource.containsKey(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue())) goto _L8; else goto _L7
_L7:
        arraylist.add(new AuditudeResolver(context));
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
        if (!mediaresource.containsKey(DefaultMetadataKeys.JSON_METADATA_KEY.getValue())) goto _L2; else goto _L9
_L9:
        arraylist.add(new MetadataResolver());
        return arraylist;
        if (true) goto _L4; else goto _L10
_L10:
    }
}
