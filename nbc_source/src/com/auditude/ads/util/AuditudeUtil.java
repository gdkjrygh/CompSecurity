// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.auditude.ads.util:
//            Size, StringUtil, BrowserUtil

public class AuditudeUtil
{
    public static class AssetURI
        implements ITagResult
    {

        public String getResult()
        {
            if (AuditudeUtil.assetUri != null && AuditudeUtil.assetUri.length() > 0)
            {
                return AuditudeUtil.assetUri;
            } else
            {
                return "[ASSETURI]";
            }
        }

        public AssetURI()
        {
        }
    }

    public static class CacheBustingTagResult
        implements ITagResult
    {

        public String getResult()
        {
            return String.valueOf((new Random()).nextInt(0x55d4a7f) + 0x989680);
        }

        public CacheBustingTagResult()
        {
        }
    }

    public static class ContentPlayhead
        implements ITagResult
    {

        public String getResult()
        {
            if (AuditudeUtil.contentPlayhead >= 0)
            {
                return StringUtil.convertToHHMMSS(Math.round(AuditudeUtil.contentPlayhead / 1000));
            } else
            {
                return "[CONTENTPLAYHEAD]";
            }
        }

        public ContentPlayhead()
        {
        }
    }

    public static class HeightTagResult
        implements ITagResult
    {

        public String getResult()
        {
            if (AuditudeUtil.AuditudePluginSize != null)
            {
                return String.valueOf(AuditudeUtil.AuditudePluginSize.height);
            } else
            {
                return "0";
            }
        }

        public HeightTagResult()
        {
        }
    }

    public static interface ITagResult
    {

        public abstract String getResult();
    }

    public static class LocaltimeTagResult
        implements ITagResult
    {

        public String getResult()
        {
            String s;
            Object obj;
            String s4;
            obj = Calendar.getInstance();
            ((Calendar) (obj)).setTime(new Date());
            s4 = Integer.toString(((Calendar) (obj)).get(1));
            s = Integer.toString(((Calendar) (obj)).get(2) + 1);
_L9:
            if (s.length() < 2) goto _L2; else goto _L1
_L1:
            String s1 = Integer.toString(((Calendar) (obj)).get(5));
_L10:
            if (s1.length() < 2) goto _L4; else goto _L3
_L3:
            String s2 = Integer.toString(((Calendar) (obj)).get(11));
_L11:
            if (s2.length() < 2) goto _L6; else goto _L5
_L5:
            String s3 = Integer.toString(((Calendar) (obj)).get(12));
_L12:
            if (s3.length() < 2) goto _L8; else goto _L7
_L7:
            obj = Integer.toString(((Calendar) (obj)).get(13));
_L13:
            if (((String) (obj)).length() >= 2)
            {
                return (new StringBuilder(String.valueOf(s4))).append(s).append(s1).append(s2).append(s3).append(((String) (obj))).toString();
            }
            break MISSING_BLOCK_LABEL_259;
_L2:
            s = (new StringBuilder(String.valueOf('0'))).append(s).toString();
              goto _L9
_L4:
            s1 = (new StringBuilder(String.valueOf('0'))).append(s1).toString();
              goto _L10
_L6:
            s2 = (new StringBuilder(String.valueOf('0'))).append(s2).toString();
              goto _L11
_L8:
            s3 = (new StringBuilder(String.valueOf('0'))).append(s3).toString();
              goto _L12
            obj = (new StringBuilder(String.valueOf('0'))).append(((String) (obj))).toString();
              goto _L13
        }

        public LocaltimeTagResult()
        {
        }
    }

    public static class PageUrlTagResult
        implements ITagResult
    {

        public String getResult()
        {
            String s;
            try
            {
                s = BrowserUtil.getPageUrl();
            }
            catch (RuntimeException runtimeexception)
            {
                return "";
            }
            return s;
        }

        public PageUrlTagResult()
        {
        }
    }

    public static class RandomTagResult
        implements ITagResult
    {

        public String getResult()
        {
            return String.valueOf((new Random()).nextInt(0xf4240));
        }

        public RandomTagResult()
        {
        }
    }

    public static class TimestampTagResult
        implements ITagResult
    {

        public String getResult()
        {
            return String.valueOf((new Date()).getTime() / 1000L);
        }

        public TimestampTagResult()
        {
        }
    }

    public static class WidthTagResult
        implements ITagResult
    {

        public String getResult()
        {
            if (AuditudeUtil.AuditudePluginSize != null)
            {
                return String.valueOf(AuditudeUtil.AuditudePluginSize.width);
            } else
            {
                return "0";
            }
        }

        public WidthTagResult()
        {
        }
    }


    public static Size AuditudePluginSize = new Size(0, 0);
    private static HashMap URL_TAGS = new HashMap();
    private static String assetUri;
    private static int contentPlayhead = 0;
    private static Boolean isInitialized = Boolean.valueOf(false);

    public AuditudeUtil()
    {
    }

    public static String getUrlWithState(String s, HashMap hashmap)
    {
        String s1 = s;
        Object obj = s1;
        if (!StringUtil.isNullOrEmpty(s1))
        {
            obj = s1;
            if (hashmap != null)
            {
                obj = s1;
                if (hashmap.size() > 0)
                {
                    boolean flag1 = s.matches("https?://.*.auditude.com/adserver/.*");
                    obj = AuditudeEnv.getInstance().getAdSettings();
                    boolean flag = flag1;
                    if (((AdSettings) (obj)).getProperty("adRequestDomain") != null)
                    {
                        flag = flag1;
                        if (StringUtil.isNotNullOrEmpty(((AdSettings) (obj)).getProperty("adRequestDomain").toString()))
                        {
                            obj = ((AdSettings) (obj)).getProperty("adRequestDomain").toString();
                            obj = (new StringBuilder("https?://")).append(((String) (obj))).append("/adserver/.*").toString();
                            int i;
                            if (!flag1 && !s.matches(((String) (obj))))
                            {
                                flag = false;
                            } else
                            {
                                flag = true;
                            }
                        }
                    }
                    obj = s1;
                    if (flag)
                    {
                        i = s.lastIndexOf("/");
                        obj = s1;
                        if (i > 0)
                        {
                            obj = (new StringBuilder(String.valueOf(s.substring(0, i)))).append("/").append(StringUtil.ConvertToString(hashmap, ";", "=")).append(s.substring(i)).toString();
                        }
                    }
                }
            }
        }
        return ((String) (obj));
    }

    private static void initialize()
    {
        if (isInitialized.booleanValue())
        {
            return;
        } else
        {
            URL_TAGS.put("[timestamp]", new TimestampTagResult());
            URL_TAGS.put("[random]", new RandomTagResult());
            URL_TAGS.put("[CACHEBUSTING]", new CacheBustingTagResult());
            URL_TAGS.put("%5BCACHEBUSTING%5D", new CacheBustingTagResult());
            URL_TAGS.put("[page_url]", new PageUrlTagResult());
            URL_TAGS.put("[width]", new WidthTagResult());
            URL_TAGS.put("[height]", new HeightTagResult());
            URL_TAGS.put("[localtime]", new LocaltimeTagResult());
            URL_TAGS.put("[CONTENTPLAYHEAD]", new ContentPlayhead());
            URL_TAGS.put("[ASSETURI]", new AssetURI());
            isInitialized = Boolean.valueOf(true);
            return;
        }
    }

    public static void setAssetURI(String s)
    {
        assetUri = s;
    }

    public static void setContentPlayhead(int i)
    {
        contentPlayhead = i;
    }

    public static String substituteCustomPublisherTags(String s, HashMap hashmap)
    {
        Object obj = s;
        if (StringUtil.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        if (hashmap != null) goto _L4; else goto _L3
_L3:
        obj = s;
_L2:
        return ((String) (obj));
_L4:
        hashmap = hashmap.entrySet().iterator();
        do
        {
            obj = s;
            if (!hashmap.hasNext())
            {
                continue;
            }
            obj = (java.util.Map.Entry)hashmap.next();
            s = s.replaceAll((new StringBuilder("\\[")).append((String)((java.util.Map.Entry) (obj)).getKey()).append("\\]").toString(), (String)((java.util.Map.Entry) (obj)).getValue());
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static String substituteTags(String s)
    {
        if (!StringUtil.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        String s1 = s;
_L4:
        return s1;
_L2:
        initialize();
        Iterator iterator = URL_TAGS.keySet().iterator();
        do
        {
            s1 = s;
            if (!iterator.hasNext())
            {
                continue;
            }
            s1 = (String)iterator.next();
            s = s.replace(s1, ((ITagResult)URL_TAGS.get(s1)).getResult());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }



}
