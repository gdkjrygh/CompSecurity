// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.net.Uri;
import android.text.TextUtils;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.ImageType;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

public class AssetViewModel
{

    public static final int DEFAULT_SHOWCASE_HEIGHT = 210;
    public static final int DEFAULT_SHOWCASE_WIDTH = 320;
    Asset asset;
    String authenticatedStreamUrl;
    VideoSource selectedSource;
    private boolean useFailover;

    public AssetViewModel(Asset asset1)
    {
        asset = new Asset();
        asset = asset1;
    }

    private Uri getImageUri(String s, String s1, int i, int j, ImageType imagetype)
    {
        return Uri.parse((new StringBuilder()).append(s).append(s1).append(ImageType.getExtension(imagetype, i, j)).toString());
    }

    public Asset asset()
    {
        return asset;
    }

    public boolean canFailover()
    {
        return !TextUtils.isEmpty(getFailoverStreamUrl());
    }

    public boolean equals(Object obj)
    {
        return obj != null && (obj instanceof AssetViewModel) && asset.equals(((AssetViewModel)obj).asset());
    }

    public void failover()
    {
        useFailover = true;
    }

    public String getAuthenticatedStreamUrl()
    {
        String s;
        try
        {
            if (authenticatedStreamUrl != null)
            {
                return authenticatedStreamUrl.trim();
            }
            s = getStreamUrl().trim();
        }
        catch (NullPointerException nullpointerexception)
        {
            return "";
        }
        return s;
    }

    public String getFailoverStreamUrl()
    {
        String s;
        try
        {
            if (getSelectedSource() != null)
            {
                return getSelectedSource().getFailoverStreamUrl().trim();
            }
            s = asset.getBackupUrl().trim();
        }
        catch (NullPointerException nullpointerexception)
        {
            return "";
        }
        return s;
    }

    public String getId()
    {
        if (selectedSource != null)
        {
            return selectedSource.getId();
        } else
        {
            return asset.getId();
        }
    }

    public Uri getImageUri(String s, int i)
    {
        return getImageUri(s, asset.getImage(), i, 0, ImageType.SHOWCASE);
    }

    public int getProviderThumbnail()
    {
        if (asset.getChannel() != null)
        {
            String s = asset.getChannel().toLowerCase();
            if (s.contains("golf"))
            {
                return 0x7f020080;
            }
            if (s.contains("msnbc"))
            {
                return 0x7f0200c7;
            }
            if (s.contains("cnbc"))
            {
                return 0x7f020053;
            }
            if (s.contains("nbcolympics"))
            {
                return 0x7f020106;
            }
            if (s.contains("nbcsports"))
            {
                return 0x7f020108;
            }
            if (s.contains("nbc_linear"))
            {
                return 0x7f020106;
            }
            if (s.contains("usa"))
            {
                return 0x7f02015c;
            }
            if (s.equals("e"))
            {
                return 0x7f02007a;
            }
            if (s.contains("syfy"))
            {
                return 0x7f02014b;
            }
            if (s.contains("oxygen"))
            {
                return 0x7f02010b;
            }
            if (s.contains("bravo"))
            {
                return 0x7f020050;
            }
            if (s.contains("esquire"))
            {
                return 0x7f02007c;
            }
            if (s.equals("nbc"))
            {
                return 0x7f020106;
            }
            if (s.equals("mun2"))
            {
                return 0x7f0200c9;
            }
            if (s.contains("telemundo"))
            {
                return 0x7f020150;
            }
            if (s.startsWith("csn"))
            {
                return 0x7f020070;
            }
        }
        return -1;
    }

    public VideoSource getSelectedSource()
    {
        return selectedSource;
    }

    public Uri getShowcaseImageUri(String s)
    {
        return getImageUri(s, asset.getImage(), 320, 210, ImageType.SHOWCASE);
    }

    public String getSport()
    {
        String s1 = asset.getSport();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = asset.getSportName();
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = asset.getTour();
        }
        return s1;
    }

    public String getSportName(List list)
    {
        Object obj;
label0:
        {
            obj = asset.getSportName();
            list = ((List) (obj));
            if (obj == null)
            {
                list = asset.getTour();
            }
            if (list != null)
            {
                obj = list;
                if (!list.equalsIgnoreCase("generic"))
                {
                    break label0;
                }
            }
            obj = "";
        }
        return ((String) (obj));
    }

    public String getStreamUrl()
    {
        if (useFailover)
        {
            return getFailoverStreamUrl();
        }
        String s;
        try
        {
            if (getSelectedSource() != null)
            {
                return getSelectedSource().getAndroidStreamUrl().trim();
            }
            s = asset.getStreamUrl().trim();
        }
        catch (NullPointerException nullpointerexception)
        {
            return "";
        }
        return s;
    }

    public Uri getThumbnailImageUri(String s)
    {
        return getImageUri(s, asset.getImage(), 280, 158, ImageType.THUMBNAIL);
    }

    public Object getTrackName()
    {
        if (selectedSource != null)
        {
            if (selectedSource.getTrackName() != null)
            {
                return selectedSource.getTrackName();
            } else
            {
                return asset.getTrackName();
            }
        } else
        {
            return asset.getTrackName();
        }
    }

    public boolean hasAltCams(String s)
    {
        s = asset().getVideoSources(s);
        return !s.isEmpty() && s.size() > 1;
    }

    public boolean hasOverlayId()
    {
        boolean flag = false;
        if (Integer.getInteger(asset().getOverlayGameId(), 0).intValue() > 0)
        {
            flag = true;
        }
        return flag;
    }

    public int hashCode()
    {
        return asset.hashCode();
    }

    public VideoSource initSelectedSource(String s)
    {
        s = asset().getVideoSources(s);
        if (selectedSource == null && !CollectionUtils.isEmpty(s))
        {
            selectedSource = (VideoSource)s.get(0);
        }
        return selectedSource;
    }

    public boolean isFree()
    {
        return asset.isFree();
    }

    public boolean isLive()
    {
        return asset.isLive();
    }

    public boolean isReplay()
    {
        return asset.isReplay();
    }

    public boolean isVod()
    {
        return asset.isVod();
    }

    public void setAuthenticatedStreamUrl(String s)
    {
        authenticatedStreamUrl = s;
    }

    public void setSelectedSource(VideoSource videosource)
    {
        selectedSource = videosource;
    }
}
