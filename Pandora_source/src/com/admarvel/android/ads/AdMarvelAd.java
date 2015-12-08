// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.location.Location;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelXMLReader, AdMarvelXMLElement, AdMarvelView, AdMarvelInterstitialAds, 
//            Decoder

public class AdMarvelAd
    implements Serializable
{
    public static final class AdType extends Enum
    {

        public static final AdType CUSTOM;
        private static final AdType ENUM$VALUES[];
        public static final AdType ERROR;
        public static final AdType IMAGE;
        public static final AdType JAVASCRIPT;
        public static final AdType SDKCALL;
        public static final AdType TEXT;

        public static AdType valueOf(String s)
        {
            return (AdType)Enum.valueOf(com/admarvel/android/ads/AdMarvelAd$AdType, s);
        }

        public static AdType[] values()
        {
            AdType aadtype[] = ENUM$VALUES;
            int i = aadtype.length;
            AdType aadtype1[] = new AdType[i];
            System.arraycopy(aadtype, 0, aadtype1, 0, i);
            return aadtype1;
        }

        static 
        {
            TEXT = new AdType("TEXT", 0);
            IMAGE = new AdType("IMAGE", 1);
            JAVASCRIPT = new AdType("JAVASCRIPT", 2);
            SDKCALL = new AdType("SDKCALL", 3);
            ERROR = new AdType("ERROR", 4);
            CUSTOM = new AdType("CUSTOM", 5);
            ENUM$VALUES = (new AdType[] {
                TEXT, IMAGE, JAVASCRIPT, SDKCALL, ERROR, CUSTOM
            });
        }

        private AdType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 1L;
    private final String PATH = "/data/com.admarvel.android.admarvelcachedads";
    private String adFormat;
    private String adId;
    private AdType adType;
    private String admobExtras;
    private String admobTestAction;
    private String admobTestDeviceId[];
    private String amazonAdvancedOptions;
    private final String androidId;
    private String appId;
    private String appName;
    private String bannerid;
    private boolean cachingEnabled;
    private String channelId;
    private String clickURL;
    private String closeFunction;
    private String companyName;
    private String creativeType;
    private final String deviceConnectivity;
    private String disableAdDuration;
    private boolean disableAdRequest;
    private final boolean enableCachedAds;
    private int errorCode;
    private String errorReason;
    private String excluded;
    private String expandDirection;
    private String height;
    private int id;
    private String imageAlt;
    private int imageHeight;
    private String imageURL;
    private int imageWidth;
    private String interstitialAction;
    private String ipAddress;
    private String keywordsContentUrl;
    private int maxretries;
    private boolean mustBeVisible;
    private String offlineBaseUrl;
    private String offlinekeyUrl;
    private final int orientation;
    private final String packageName;
    private final String partnerId;
    private List pixels;
    private String pubId;
    private Boolean retry;
    private int retrynum;
    private String scene;
    private AdMarvelUtils.SDKAdNetwork sdkAdNetwork;
    private String sdkNetwork;
    private boolean setTrackingId;
    private final String siteId;
    private String slotName;
    private String source;
    private final Map targetParams;
    private boolean test;
    private String text;
    private String width;
    private String xhtml;
    private final String xml;
    private String zoneId;

    public AdMarvelAd(String s, Map map, String s1, String s2, String s3, int i, String s4, 
            boolean flag, String s5)
    {
        imageWidth = -1;
        imageHeight = -1;
        admobExtras = null;
        expandDirection = null;
        adFormat = null;
        disableAdRequest = false;
        mustBeVisible = false;
        xml = s;
        targetParams = map;
        partnerId = s1;
        siteId = s2;
        androidId = s3;
        orientation = i;
        deviceConnectivity = s4;
        enableCachedAds = flag;
        packageName = s5;
        if (s3 != null && map.get("UNIQUE_ID") == null)
        {
            map.put("UNIQUE_ID", s3);
        }
    }

    public String getAdFormat()
    {
        return adFormat;
    }

    public String getAdId()
    {
        return adId;
    }

    public String getAdMobExtras()
    {
        return admobExtras;
    }

    public AdType getAdType()
    {
        return adType;
    }

    public String getAdmobAdFormat()
    {
        return admobTestAction;
    }

    public String getAdmobTestAction()
    {
        return admobTestAction;
    }

    public String[] getAdmobTestDeviceId()
    {
        return admobTestDeviceId;
    }

    public String getAmazonAdvancedOptions()
    {
        return amazonAdvancedOptions;
    }

    public String getAndroidId()
    {
        return androidId;
    }

    public String getAppId()
    {
        return appId;
    }

    public String getAppName()
    {
        return appName;
    }

    public String getBannerid()
    {
        return bannerid;
    }

    public String getChannelId()
    {
        return channelId;
    }

    public String getClickURL()
    {
        return clickURL;
    }

    public String getCloseFunction()
    {
        return closeFunction;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public String getCreativeType()
    {
        return creativeType;
    }

    public String getDeviceConnectivity()
    {
        return deviceConnectivity;
    }

    public String getDisableAdDuration()
    {
        return disableAdDuration;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getErrorReason()
    {
        return errorReason;
    }

    public String getExcluded()
    {
        return excluded;
    }

    public String getExpandDirection()
    {
        return expandDirection;
    }

    public String getHeight()
    {
        return height;
    }

    public int getId()
    {
        return id;
    }

    public String getImageAlt()
    {
        return imageAlt;
    }

    public int getImageHeight()
    {
        return imageHeight;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public int getImageWidth()
    {
        return imageWidth;
    }

    public String getInterstitialAction()
    {
        return interstitialAction;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public String getKeywordsContentUrl()
    {
        return keywordsContentUrl;
    }

    public int getMaxretries()
    {
        return maxretries;
    }

    public String getOfflineBaseUrl()
    {
        return offlineBaseUrl;
    }

    public String getOfflinekeyUrl()
    {
        return offlinekeyUrl;
    }

    public int getOrientation()
    {
        return orientation;
    }

    public String getPartnerId()
    {
        return partnerId;
    }

    public List getPixels()
    {
        return pixels;
    }

    public String getPubId()
    {
        return pubId;
    }

    public Boolean getRetry()
    {
        return retry;
    }

    public int getRetrynum()
    {
        return retrynum;
    }

    public String getScene()
    {
        return scene;
    }

    public AdMarvelUtils.SDKAdNetwork getSdkAdNetwork()
    {
        return sdkAdNetwork;
    }

    public String getSdkNetwork()
    {
        return sdkNetwork;
    }

    public String getSiteId()
    {
        return siteId;
    }

    public String getSlotName()
    {
        return slotName;
    }

    public String getSource()
    {
        return source;
    }

    public Map getTargetParams()
    {
        return targetParams;
    }

    public String getText()
    {
        return text;
    }

    public String getWidth()
    {
        return width;
    }

    public String getXHTML()
    {
        return xhtml;
    }

    public String getXhtml()
    {
        return xhtml;
    }

    public String getXml()
    {
        return xml;
    }

    public String getZoneId()
    {
        return zoneId;
    }

    public boolean hasImage()
    {
        return imageURL != null;
    }

    public boolean isCachingEnabled()
    {
        return cachingEnabled;
    }

    public boolean isDisableAdrequest()
    {
        return disableAdRequest;
    }

    public boolean isMustBeVisible()
    {
        return mustBeVisible;
    }

    public boolean isTest()
    {
        return test;
    }

    public boolean isTrackingIdSet()
    {
        return setTrackingId;
    }

    public AdMarvelXMLReader loadAd(File file)
        throws ParserConfigurationException, SAXException, IOException
    {
        if (xml != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj1;
        AdMarvelXMLReader admarvelxmlreader;
        admarvelxmlreader = new AdMarvelXMLReader();
        admarvelxmlreader.parseXMLString(xml);
        obj1 = admarvelxmlreader.getParsedXMLData();
        if (obj1 == null) goto _L1; else goto _L3
_L3:
        Object obj;
        AdMarvelXMLElement admarvelxmlelement;
        int i;
        if (((AdMarvelXMLElement) (obj1)).getName().equals("ad"))
        {
            obj = (String)((AdMarvelXMLElement) (obj1)).getAttributes().get("id");
            if (obj != null && ((String) (obj)).length() > 0)
            {
                id = Integer.parseInt(((String) (obj)));
                bannerid = ((String) (obj));
            }
            obj = (String)((AdMarvelXMLElement) (obj1)).getAttributes().get("ip");
            if (obj != null && ((String) (obj)).length() > 0)
            {
                ipAddress = ((String) (obj));
            }
            obj = (String)((AdMarvelXMLElement) (obj1)).getAttributes().get("type");
            int j;
            if ("text".equals(obj))
            {
                adType = AdType.TEXT;
            } else
            if ("image".equals(obj))
            {
                adType = AdType.IMAGE;
            } else
            if ("javascript".equals(obj))
            {
                adType = AdType.JAVASCRIPT;
            } else
            if ("error".equals(obj))
            {
                adType = AdType.ERROR;
            } else
            if ("sdkcall".equals(obj))
            {
                adType = AdType.SDKCALL;
            } else
            if ("custom".equals(obj))
            {
                adType = AdType.CUSTOM;
            }
            obj = (String)((AdMarvelXMLElement) (obj1)).getAttributes().get("source");
            if (obj != null && ((String) (obj)).length() > 0)
            {
                source = ((String) (obj));
            }
        } else
        {
            adType = AdType.ERROR;
        }
        if (!((AdMarvelXMLElement) (obj1)).getChildren().containsKey("pixels")) goto _L5; else goto _L4
_L4:
        admarvelxmlelement = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj1)).getChildren().get("pixels")).get(0);
        if (!admarvelxmlelement.getChildren().containsKey("pixel")) goto _L5; else goto _L6
_L6:
        j = ((ArrayList)admarvelxmlelement.getChildren().get("pixel")).size();
        i = 0;
_L8:
        if (i < j) goto _L7; else goto _L5
_L5:
        if ((AdMarvelView.enableOfflineSDK || AdMarvelInterstitialAds.enableOfflineSDK) && ((AdMarvelXMLElement) (obj1)).getChildren().containsKey("file"))
        {
            obj = ((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj1)).getChildren().get("file")).get(0)).getData();
            if (adType.equals(AdType.JAVASCRIPT))
            {
                xhtml = AdmarvelOfflineUtils.readData(offlinekeyUrl, ((String) (obj)));
                if (xhtml != null)
                {
                    xhtml = xhtml.replaceAll("\\{siteid\\}", getSiteId());
                }
            }
            offlinekeyUrl = (new StringBuilder(String.valueOf(offlinekeyUrl))).append("/").append(((String) (obj))).toString();
        }
        if (!adType.equals(AdType.SDKCALL) || !((AdMarvelXMLElement) (obj1)).getChildren().containsKey("xhtml"))
        {
            break MISSING_BLOCK_LABEL_2095;
        }
        obj = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj1)).getChildren().get("xhtml")).get(0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2095;
        }
        obj = ((AdMarvelXMLElement) (obj)).getData();
        admarvelxmlreader.parseXMLString((new Decoder()).htmlEntityDecode(((String) (obj))));
        obj = admarvelxmlreader.getParsedXMLData();
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("network");
        String s;
        if ("admob".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.ADMOB;
        } else
        if ("rhythm".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.RHYTHM;
        } else
        if ("greystripe".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.GREYSTRIPE;
        } else
        if ("medialets".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.MEDIALETS;
        } else
        if ("millennial".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.MILLENNIAL;
        } else
        if ("amazon".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.AMAZON;
        } else
        if ("adcolony".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.ADCOLONY;
        } else
        if ("pinsight".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.PINSIGHT;
        } else
        if ("pulse3d".equals(obj1))
        {
            sdkNetwork = "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter";
            sdkAdNetwork = AdMarvelUtils.SDKAdNetwork.PULSE3D;
        } else
        if ("disable_ad_request".equals(obj1))
        {
            obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("durationinseconds");
            if (obj1 != null)
            {
                disableAdRequest = true;
                disableAdDuration = ((String) (obj1));
            }
        } else
        {
            adType = AdType.ERROR;
            errorCode = 307;
            errorReason = "Missing SDK ad network";
        }
        if ("YES".equals((String)((AdMarvelXMLElement) (obj)).getAttributes().get("retry")))
        {
            retry = Boolean.valueOf(true);
        } else
        {
            retry = Boolean.valueOf(false);
        }
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("bannerid");
        if (obj1 != null && ((String) (obj1)).length() > 0)
        {
            bannerid = ((String) (obj1));
        }
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("retrynum");
        if (obj1 != null && ((String) (obj1)).length() > 0)
        {
            retrynum = Integer.parseInt(((String) (obj1)));
        }
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("excluded");
        if (obj1 != null && ((String) (obj1)).length() > 0)
        {
            excluded = ((String) (obj1));
        }
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("maxretries");
        if (obj1 != null && ((String) (obj1)).length() > 0)
        {
            maxretries = Integer.parseInt(((String) (obj1)));
        } else
        {
            maxretries = 1;
        }
_L9:
        if (adType.equals(AdType.JAVASCRIPT) && ((AdMarvelXMLElement) (obj)).getChildren().containsKey("customdata"))
        {
            obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("customdata")).get(0);
            if (((AdMarvelXMLElement) (obj1)).getChildren().containsKey("close_func"))
            {
                closeFunction = ((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj1)).getChildren().get("close_func")).get(0)).getData();
            }
        }
        if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("errorCode"))
        {
            obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("errorCode")).get(0);
            if (obj1 != null)
            {
                errorCode = Integer.parseInt(((AdMarvelXMLElement) (obj1)).getData());
            }
        }
        if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("errorReason"))
        {
            obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("errorReason")).get(0);
            if (obj1 != null)
            {
                errorReason = ((AdMarvelXMLElement) (obj1)).getData();
            }
        }
        if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("xhtml"))
        {
            obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("xhtml")).get(0);
            if (obj1 != null)
            {
                xhtml = ((AdMarvelXMLElement) (obj1)).getData();
            }
        }
        if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("clickurl"))
        {
            obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("clickurl")).get(0);
            if (obj1 != null)
            {
                clickURL = ((AdMarvelXMLElement) (obj1)).getData();
                if ((AdMarvelView.enableOfflineSDK || AdMarvelInterstitialAds.enableOfflineSDK) && clickURL != null)
                {
                    clickURL = clickURL.replaceAll("\\{siteid\\}", getSiteId());
                }
            }
        }
        if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("image"))
        {
            if (((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().containsKey("url"))
            {
                obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().get("url")).get(0);
                if (obj1 != null)
                {
                    imageURL = ((AdMarvelXMLElement) (obj1)).getData();
                }
            }
            if (((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().containsKey("alt"))
            {
                obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().get("alt")).get(0);
                if (obj1 != null)
                {
                    imageAlt = ((AdMarvelXMLElement) (obj1)).getData();
                }
            }
            if (((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().containsKey("width"))
            {
                obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().get("width")).get(0);
                if (obj1 != null)
                {
                    imageWidth = Integer.parseInt(((AdMarvelXMLElement) (obj1)).getData());
                }
            }
            if (((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().containsKey("height"))
            {
                obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("image")).get(0)).getChildren().get("height")).get(0);
                if (obj1 != null)
                {
                    imageHeight = Integer.parseInt(((AdMarvelXMLElement) (obj1)).getData());
                }
            }
        }
        if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("text"))
        {
            obj1 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("text")).get(0);
            if (obj1 != null)
            {
                text = ((AdMarvelXMLElement) (obj1)).getData();
            }
        }
        if (enableCachedAds && !adType.equals(AdType.ERROR))
        {
            if (((AdMarvelXMLElement) (obj)).getChildren().containsKey("image"))
            {
                obj = imageURL.replace("http://admarvel.s3.amazonaws.com", "");
                file = new File(file, (new StringBuilder("/data/com.admarvel.android.admarvelcachedads")).append(((String) (obj))).toString());
                Logging.log((new StringBuilder("AdMarvelAd::loadAd: ")).append(file.getAbsolutePath()).toString());
                if (file.exists())
                {
                    imageURL = imageURL.replace("http://admarvel.s3.amazonaws.com", (new StringBuilder("content://")).append(packageName).append(".AdMarvelCachedImageLocalFileContentProvider").toString());
                } else
                {
                    adType = AdType.ERROR;
                    errorCode = 205;
                    errorReason = "Cached Ad Unable to render";
                }
            } else
            {
                adType = AdType.ERROR;
                errorCode = 205;
                errorReason = "Cached Ad Unable to render: Only images are supported.  server-side configuration error";
            }
        }
        return admarvelxmlreader;
_L7:
label0:
        {
label1:
            {
                obj = (AdMarvelXMLElement)((ArrayList)admarvelxmlelement.getChildren().get("pixel")).get(i);
                if (obj == null)
                {
                    break label0;
                }
                s = ((AdMarvelXMLElement) (obj)).getData();
                if (!AdMarvelView.enableOfflineSDK)
                {
                    obj = s;
                    if (!AdMarvelInterstitialAds.enableOfflineSDK)
                    {
                        break label1;
                    }
                }
                obj = s.replaceAll("\\{siteid\\}", getSiteId()).replaceAll("\\{random\\}", String.valueOf(System.currentTimeMillis())).replaceAll("\\{uniqueid\\}", getAndroidId());
            }
            if (pixels == null)
            {
                pixels = new ArrayList();
            }
            pixels.add(obj);
        }
        i++;
          goto _L8
        obj = obj1;
          goto _L9
    }

    public void removeNonStringEntriesTargetParam()
    {
        Iterator iterator = targetParams.entrySet().iterator();
        do
        {
            java.util.Map.Entry entry;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                entry = (java.util.Map.Entry)iterator.next();
            } while (entry.getValue() instanceof String);
            if ((entry.getValue() instanceof Location) && ((String)entry.getKey()).equals("LOCATION_OBJECT"))
            {
                Location location = (Location)entry.getValue();
                targetParams.put("GEOLOCATION", String.format("%f,%f", new Object[] {
                    Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
                }));
                targetParams.remove(entry.getKey());
            } else
            {
                targetParams.remove(entry.getKey());
            }
        } while (true);
    }

    public void setAdFormat(String s)
    {
        adFormat = s;
    }

    public void setAdId(String s)
    {
        adId = s;
    }

    public void setAdMobExtras(String s)
    {
        admobExtras = s;
    }

    public void setAdType(AdType adtype)
    {
        adType = adtype;
    }

    public void setAdmobTestAction(String s)
    {
        admobTestAction = s;
    }

    public void setAdmobTestDeviceId(String as[])
    {
        admobTestDeviceId = as;
    }

    public void setAmazonAdvancedOptions(String s)
    {
        amazonAdvancedOptions = s;
    }

    public void setAppId(String s)
    {
        appId = s;
    }

    public void setAppName(String s)
    {
        appName = s;
    }

    public void setBannerid(String s)
    {
        bannerid = s;
    }

    public void setCachingEnabled(boolean flag)
    {
        cachingEnabled = flag;
    }

    public void setChannelId(String s)
    {
        channelId = s;
    }

    public void setClickURL(String s)
    {
        clickURL = s;
    }

    public void setCloseFunction(String s)
    {
        closeFunction = s;
    }

    public void setCompanyName(String s)
    {
        companyName = s;
    }

    public void setCreativeType(String s)
    {
        creativeType = s;
    }

    public void setErrorCode(int i)
    {
        errorCode = i;
    }

    public void setErrorReason(String s)
    {
        errorReason = s;
    }

    public void setExcluded(String s)
    {
        excluded = s;
    }

    public void setExpandDirection(String s)
    {
        expandDirection = s;
    }

    public void setHeight(String s)
    {
        height = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setImageAlt(String s)
    {
        imageAlt = s;
    }

    public void setImageHeight(int i)
    {
        imageHeight = i;
    }

    public void setImageURL(String s)
    {
        imageURL = s;
    }

    public void setImageWidth(int i)
    {
        imageWidth = i;
    }

    public void setInterstitialAction(String s)
    {
        interstitialAction = s;
    }

    public void setIpAddress(String s)
    {
        ipAddress = s;
    }

    public void setKeywordsContentUrl(String s)
    {
        keywordsContentUrl = s;
    }

    public void setMustBeVisible(boolean flag)
    {
        mustBeVisible = flag;
    }

    public void setOfflineBaseUrl(String s)
    {
        offlineBaseUrl = s;
    }

    public void setOfflinekeyUrl(String s)
    {
        offlinekeyUrl = s;
    }

    public void setPixels(List list)
    {
        pixels = list;
    }

    public void setPubId(String s)
    {
        pubId = s;
    }

    public void setRetry(Boolean boolean1)
    {
        retry = boolean1;
    }

    public void setRetrynum(int i)
    {
        retrynum = i;
    }

    public void setScene(String s)
    {
        scene = s;
    }

    public void setSdkNetwork(String s)
    {
        sdkNetwork = s;
    }

    public void setSetTrackingId(boolean flag)
    {
        setTrackingId = flag;
    }

    public void setSlotName(String s)
    {
        slotName = s;
    }

    public void setSource(String s)
    {
        source = s;
    }

    public void setTest(boolean flag)
    {
        test = flag;
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setWidth(String s)
    {
        width = s;
    }

    public void setXhtml(String s)
    {
        xhtml = s;
    }

    public void setZoneId(String s)
    {
        zoneId = s;
    }
}
