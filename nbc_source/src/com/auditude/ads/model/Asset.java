// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.reporting.ReportingHelper;
import com.auditude.ads.util.AuditudeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model:
//            BaseElement, IAsset, Click, IClick, 
//            Ad

public class Asset extends BaseElement
    implements IAsset
{

    public static final String TYPE_COMPANION = "companion";
    public static final String TYPE_LINEAR = "linear";
    public static final String TYPE_NONLINEAR = "nonlinear";
    public static final String TYPE_UNKNOWN = "unknown";
    private String adParameters;
    private String apiFramework;
    private HashMap auditudeParams;
    private IClick click;
    private String companionRequired;
    private String creativeType;
    private HashMap customData;
    private String description;
    private int duration;
    private String format;
    private int height;
    private boolean isDisplayed;
    private int leadTime;
    private ArrayList mediaFiles;
    private String networkAdId;
    private String resourceType;
    private int skipOffset;
    private String title;
    private int width;

    public Asset(BaseElement baseelement)
    {
        super(baseelement);
        skipOffset = -1;
        companionRequired = "none";
        auditudeParams = new HashMap();
        mediaFiles = new ArrayList();
    }

    public final void AddMediaFile(MediaFile mediafile)
    {
        if (mediaFiles == null)
        {
            mediaFiles = new ArrayList();
        }
        mediaFiles.add(mediafile);
    }

    public void CopyTo(Asset asset)
    {
        if (asset == null)
        {
            return;
        }
        asset.auditudeParams = auditudeParams;
        asset.customData = customData;
        if (asset.click == null && click != null)
        {
            asset.setClick(new Click(asset));
        }
        if (click != null && asset.click != null)
        {
            Click click1 = (Click)click;
            IClick iclick;
            if (asset.click instanceof Click)
            {
                iclick = asset.click;
            } else
            {
                iclick = null;
            }
            click1.copyTrackingEventsTo((Click)iclick, "click", asset.click.getUrl());
        }
        copyTrackingEventsTo(asset, "creativeview", asset.getUrl());
    }

    public final void Reset()
    {
        isDisplayed = false;
        resetTrackingEvents();
    }

    public final void Show()
    {
        isDisplayed = true;
    }

    public final String getAdParameters()
    {
        return adParameters;
    }

    public final String getApiFramework()
    {
        return apiFramework;
    }

    public final HashMap getAuditudeParams()
    {
        return auditudeParams;
    }

    public final MediaFile getBestMediaFile()
    {
        MediaFile mediafile;
        MediaFile mediafile1;
        String as[];
        int ai[];
        int i1;
        as = new String[5];
        as[0] = "application/x-mpegurl";
        as[1] = "video/mp4";
        as[2] = "video/m4v";
        as[3] = "video/x-flv";
        as[4] = "video/webm";
        ai = new int[5];
        ai;
        ai[0] = 50;
        ai[1] = 40;
        ai[2] = 30;
        ai[3] = 20;
        ai[4] = 10;
        mediafile = null;
        mediafile1 = null;
        i1 = 0;
        if (mediaFiles == null) goto _L2; else goto _L1
_L1:
        int k;
        k = 0;
        mediafile = mediafile1;
_L5:
        if (k < mediaFiles.size()) goto _L3; else goto _L2
_L2:
        return mediafile;
_L3:
        MediaFile mediafile2;
        int l;
        mediafile1 = (MediaFile)mediaFiles.get(k);
        if (mediafile1.mimeType.toLowerCase().equalsIgnoreCase(as[0]))
        {
            int i = ai[0];
            return mediafile1;
        }
        l = 1;
        mediafile2 = mediafile;
_L6:
label0:
        {
            if (l < as.length)
            {
                break label0;
            }
            k++;
            mediafile = mediafile2;
        }
        if (true) goto _L5; else goto _L4
_L4:
        int j;
label1:
        {
            j = i1;
            mediafile = mediafile2;
            if (!mediafile1.mimeType.toLowerCase().equalsIgnoreCase(as[l]))
            {
                break label1;
            }
            j = i1;
            mediafile = mediafile2;
            if (i1 >= ai[l - 1])
            {
                break label1;
            }
            if (mediafile2 == null)
            {
                break MISSING_BLOCK_LABEL_282;
            }
            if (!mediafile2.mimeType.toLowerCase().equalsIgnoreCase(mediafile1.mimeType) || mediafile1.bitrate <= mediafile2.bitrate)
            {
                j = i1;
                mediafile = mediafile2;
                if (mediafile2.mimeType.equalsIgnoreCase(mediafile1.mimeType))
                {
                    break label1;
                }
            }
            j = ai[l];
            mediafile = mediafile1;
        }
_L7:
        l++;
        i1 = j;
        mediafile2 = mediafile;
          goto _L6
        j = ai[l];
        mediafile = mediafile1;
          goto _L7
    }

    public IClick getClick()
    {
        return click;
    }

    public final String getCompanionRequired()
    {
        return companionRequired;
    }

    public final String getCreativeType()
    {
        return creativeType;
    }

    public final HashMap getCustomData()
    {
        return customData;
    }

    public final String getDescription()
    {
        return description;
    }

    public final int getDurationInMillis()
    {
        return duration;
    }

    public final String getFormat()
    {
        return format;
    }

    public final int getHeight()
    {
        if (getMediaFile() != null)
        {
            return getMediaFile().height;
        } else
        {
            return height;
        }
    }

    public final Boolean getIsSkippable()
    {
        if (skipOffset >= 0)
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public final int getLeadTimeInMillis()
    {
        return leadTime;
    }

    public final MediaFile getMediaFile()
    {
        if (mediaFiles.size() > 0)
        {
            return (MediaFile)mediaFiles.get(0);
        } else
        {
            return null;
        }
    }

    public final ArrayList getMediaFiles()
    {
        return mediaFiles;
    }

    public final String getNetworkAdId()
    {
        return networkAdId;
    }

    public String getResourceType()
    {
        return resourceType;
    }

    public final int getSkipOffset()
    {
        return skipOffset;
    }

    public final String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return "unknown";
    }

    public String getUrl()
    {
        if (getMediaFile() != null)
        {
            String s = getMediaFile().source;
            if (!isNetworkAd())
            {
                s = AuditudeUtil.getUrlWithState(getMediaFile().source, AuditudeEnv.getInstance().getReportingHelper().currentAdState());
            }
            return s;
        } else
        {
            return null;
        }
    }

    public final int getWidth()
    {
        if (getMediaFile() != null)
        {
            return getMediaFile().width;
        } else
        {
            return width;
        }
    }

    public final Boolean hasAssetsWithMimeType(ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = mediaFiles.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return Boolean.valueOf(false);
_L3:
        MediaFile mediafile = (MediaFile)iterator.next();
        Iterator iterator1 = arraylist.iterator();
        String s;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
        } while (mediafile == null || mediafile.mimeType == null || !mediafile.mimeType.toLowerCase().equalsIgnoreCase(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        return Boolean.valueOf(true);
    }

    public final boolean isDisplayed()
    {
        return isDisplayed;
    }

    public final boolean isNetworkAd()
    {
        return getParent() != null && (getParent() instanceof Ad) && ((Ad)getParent()).getIsNetworkAd();
    }

    public final void setAdParameters(String s)
    {
        adParameters = s;
    }

    public final void setApiFramework(String s)
    {
        apiFramework = s;
    }

    public final void setAuditudeParams(HashMap hashmap)
    {
        auditudeParams = hashmap;
    }

    public void setClick(IClick iclick)
    {
        click = iclick;
    }

    public final void setCompanionRequired(String s)
    {
        companionRequired = s;
    }

    public final void setCreativeType(String s)
    {
        creativeType = s;
    }

    public final void setCustomData(HashMap hashmap)
    {
        customData = hashmap;
    }

    public final void setDescription(String s)
    {
        description = s;
    }

    public final void setDurationInMillis(int i)
    {
        duration = i;
    }

    public final void setFormat(String s)
    {
        format = s;
    }

    public final void setHeight(int i)
    {
        height = i;
    }

    public final void setLeadTimeInMillis(int i)
    {
        leadTime = i;
    }

    public final void setMediaFiles(ArrayList arraylist)
    {
        mediaFiles = arraylist;
    }

    public void setMimeType(String s)
    {
        if (getMediaFile() != null)
        {
            getMediaFile().mimeType = s;
        }
    }

    public final void setNetworkAdId(String s)
    {
        networkAdId = s;
    }

    public void setResourceType(String s)
    {
        resourceType = s;
    }

    public final void setSkipOffset(int i)
    {
        skipOffset = i;
    }

    public final void setTitle(String s)
    {
        title = s;
    }

    public void setUrl(String s)
    {
        if (getMediaFile() != null)
        {
            getMediaFile().source = s;
        }
    }

    public final void setWidth(int i)
    {
        width = i;
    }
}
