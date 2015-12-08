// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.Playlist;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.brightcove.player.media:
//            DeliveryType, CuePointFields, PlaylistFields, SourceFields, 
//            VideoFields, e

public class MediaService extends AbstractComponent
{

    public static final String COMMAND = "command";
    public static final String DEFAULT_MEDIA_DELIVERY = "http";
    public static final String DEFAULT_QUERY_BASE_URL = "https://api.brightcove.com/services/library";
    public static final String FIND_PLAYLIST_BY_ID = "find_playlist_by_id";
    public static final String FIND_PLAYLIST_BY_REFERENCE_ID = "find_playlist_by_reference_id";
    public static final String FIND_VIDEO_BY_ID = "find_video_by_id";
    public static final String FIND_VIDEO_BY_REFERENCE_ID = "find_video_by_reference_id";
    public static final String HLS_MEDIA_DELIVERY = "http_ios";
    public static final String ID = "id";
    public static final String KK_QUERY_BASE_URL = "https://api.brightcove.co.jp/services/library";
    public static final String MEDIA_DELIVERY = "media_delivery";
    public static final String OPTIONS = "options";
    public static final String PLAYLIST_ID = "playlist_id";
    public static final String REFERENCE_ID = "reference_id";
    public static final String TAG = com/brightcove/player/media/MediaService.getSimpleName();
    public static final String TOKEN = "token";
    public static final String VIDEO_FIELDS = "video_fields";
    public static final String VIDEO_ID = "video_id";
    private String a;
    private String b;
    private e c;

    public MediaService(EventEmitter eventemitter, String s)
    {
        this(eventemitter, s, null);
    }

    public MediaService(EventEmitter eventemitter, String s, String s1)
    {
        super(eventemitter, com/brightcove/player/media/MediaService);
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("readTokenRequired"));
        }
        eventemitter = s1;
        if (s1 == null)
        {
            eventemitter = "https://api.brightcove.com/services/library";
        }
        a = s;
        b = eventemitter;
        a();
    }

    private static Serializable a(Object obj)
    {
        if (obj instanceof Serializable)
        {
            return (Serializable)obj;
        }
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            HashMap hashmap = new HashMap();
            String s;
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); hashmap.put(s, a(((JSONObject) (obj)).get(s))))
            {
                s = (String)iterator.next();
            }

            return hashmap;
        } else
        {
            return null;
        }
    }

    static String a(MediaService mediaservice)
    {
        return mediaservice.a;
    }

    private static List a(JSONObject jsonobject, EventEmitter eventemitter, List list)
    {
        ArrayList arraylist = null;
        if (!jsonobject.isNull("cuePoints"))
        {
            arraylist = new ArrayList();
            jsonobject = jsonobject.getJSONArray("cuePoints");
            for (int i = 0; i < jsonobject.length(); i++)
            {
                arraylist.add(buildCuePointFromJSON(jsonobject.getJSONObject(i), eventemitter, list));
            }

        }
        return arraylist;
    }

    private static Map a(JSONObject jsonobject, List list)
    {
        HashMap hashmap = new HashMap();
        if (!jsonobject.isNull("accountId"))
        {
            hashmap.put("pubId", jsonobject.getString("accountId"));
        }
        if (!jsonobject.isNull("id"))
        {
            hashmap.put("id", Long.valueOf(jsonobject.getLong("id")));
        }
        if (!jsonobject.isNull("referenceId"))
        {
            hashmap.put("referenceId", jsonobject.getString("referenceId"));
        }
        if (!jsonobject.isNull("name"))
        {
            hashmap.put("name", jsonobject.getString("name"));
        }
        if (!jsonobject.isNull("shortDescription"))
        {
            hashmap.put("shortDescription", jsonobject.getString("shortDescription"));
        }
        if (!jsonobject.isNull("length"))
        {
            hashmap.put("duration", Integer.valueOf(jsonobject.getInt("length")));
        }
        if (!jsonobject.isNull("videoStillURL"))
        {
            Object obj = jsonobject.getString("videoStillURL");
            Iterator iterator2;
            String s1;
            try
            {
                hashmap.put("stillImageUri", new URI(((String) (obj))));
            }
            catch (URISyntaxException urisyntaxexception)
            {
                list.add(String.format(ErrorUtil.getMessage("invalidURI"), new Object[] {
                    obj
                }));
            }
        }
        if (!jsonobject.isNull("customFields"))
        {
            obj = jsonobject.getJSONObject("customFields");
            list = new HashMap();
            if (obj != null && ((JSONObject) (obj)).length() > 0)
            {
                iterator2 = ((JSONObject) (obj)).keys();
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    s1 = (String)iterator2.next();
                    if (s1 != null)
                    {
                        list.put(s1, ((JSONObject) (obj)).getString(s1));
                    }
                } while (true);
                if (list.size() > 0)
                {
                    hashmap.put("customFields", list);
                    Iterator iterator = list.entrySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                        if (((String)entry.getKey()).startsWith("captions"))
                        {
                            Object obj1 = ((String)entry.getKey()).split("_")[1];
                            if (!StringUtil.isEmpty((String)list.get(entry.getKey())))
                            {
                                ArrayList arraylist = new ArrayList();
                                obj1 = BrightcoveCaptionFormat.createCaptionFormat("text/unknown", ((String) (obj1)));
                                arraylist.add(Pair.create(Uri.parse((String)entry.getValue()), obj1));
                                hashmap.put("captionSources", arraylist);
                            }
                        }
                    } while (true);
                }
            }
        }
        if (!jsonobject.isNull("captioning"))
        {
            jsonobject = (JSONObject)jsonobject.getJSONObject("captioning").getJSONArray("captionSources").get(0);
            list = new HashMap();
            if (jsonobject != null && jsonobject.length() > 0)
            {
                Iterator iterator1 = jsonobject.keys();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if (s != null)
                    {
                        list.put(s.split("_")[1], jsonobject.get(s));
                    }
                } while (true);
                if (list.size() > 0)
                {
                    hashmap.put("captionSources", list);
                }
            }
        }
        return hashmap;
    }

    private static Set a(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        if (!jsonobject.isNull("HLSURL"))
        {
            SourceCollection sourcecollection = b(jsonobject, "HLSURL");
            if (sourcecollection != null)
            {
                hashset.add(sourcecollection);
                hashset1.add(DeliveryType.HLS);
            }
        }
        Object obj = b(jsonobject);
        if (!((Set) (obj)).isEmpty())
        {
            HashMap hashmap = new HashMap();
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Source source = (Source)((Iterator) (obj)).next();
                DeliveryType deliverytype2 = source.getDeliveryType();
                if (!hashset1.contains(deliverytype2))
                {
                    if (hashmap.get(deliverytype2) == null)
                    {
                        hashmap.put(deliverytype2, new HashSet());
                    }
                    ((Set)hashmap.get(deliverytype2)).add(source);
                }
            } while (true);
            DeliveryType deliverytype1;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); hashset1.add(deliverytype1))
            {
                deliverytype1 = (DeliveryType)iterator.next();
                hashset.add(new SourceCollection((Set)hashmap.get(deliverytype1), deliverytype1));
            }

        }
        if (!jsonobject.isNull("videoFullLength"))
        {
            SourceCollection sourcecollection1 = c(jsonobject);
            DeliveryType deliverytype = sourcecollection1.getDeliveryType();
            if (!hashset1.contains(deliverytype))
            {
                hashset.add(sourcecollection1);
                hashset1.add(deliverytype);
            }
        }
        if (!hashset1.contains(DeliveryType.HLS) && !jsonobject.isNull("FLVURL"))
        {
            jsonobject = b(jsonobject, "FLVURL");
            if (jsonobject != null)
            {
                hashset.add(jsonobject);
            }
        }
        return hashset;
    }

    private static Set a(JSONObject jsonobject, String s)
    {
        HashSet hashset = new HashSet();
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject != null)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                hashset.add(buildSourceFromJSON(jsonobject.getJSONObject(i)));
            }

        }
        return hashset;
    }

    private void a(Event event, Exception exception)
    {
        ArrayList arraylist = new ArrayList();
        Log.e(TAG, "Got unexpected exception attempting to issue Media API request.", exception);
        arraylist.add(String.format(ErrorUtil.getMessage("mediaRequestError"), new Object[] {
            exception.getMessage()
        }));
        event.properties.put("errors", arraylist);
        F.respond(event);
    }

    static void a(MediaService mediaservice, Event event, Exception exception)
    {
        mediaservice.a(event, exception);
    }

    private static void a(JSONObject jsonobject, Map map, List list)
    {
        if (jsonobject == null || map == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("jsonAndPropertiesRequired"));
        }
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        list = jsonobject.keys();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (!StringUtil.isEmpty(s) && !jsonobject.isNull(s) && !((List) (obj)).contains(s))
            {
                try
                {
                    map.put(s, jsonobject.getJSONObject(s).toString());
                }
                catch (JSONException jsonexception)
                {
                    try
                    {
                        map.put(s, jsonobject.getJSONArray(s).toString());
                    }
                    catch (JSONException jsonexception1)
                    {
                        map.put(s, jsonobject.getString(s));
                    }
                }
            }
        } while (true);
    }

    static EventEmitter b(MediaService mediaservice)
    {
        return mediaservice.F;
    }

    private static SourceCollection b(JSONObject jsonobject, String s)
    {
        s = jsonobject.getString(s);
        jsonobject = null;
        if (s.indexOf(".m3u8") > 0)
        {
            jsonobject = new SourceCollection(new Source(s, DeliveryType.HLS), DeliveryType.HLS);
        }
        return jsonobject;
    }

    private static Set b(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        hashset.addAll(a(jsonobject, "renditions"));
        hashset.addAll(a(jsonobject, "WVMRenditions"));
        hashset.addAll(a(jsonobject, "IOSRenditions"));
        return hashset;
    }

    public static CuePoint buildCuePointFromJSON(JSONObject jsonobject, EventEmitter eventemitter, List list)
    {
        eventemitter = null;
        int i = 0;
        if (jsonobject.isNull("time"))
        {
            list.add(String.format(ErrorUtil.getMessage("missingCuePointProperty"), new Object[] {
                "time"
            }));
            return null;
        }
        if (jsonobject.isNull("typeEnum"))
        {
            list.add(String.format(ErrorUtil.getMessage("missingCuePointProperty"), new Object[] {
                "typeEnum"
            }));
            return null;
        }
        list = jsonobject.keys();
        HashMap hashmap = new HashMap();
        while (list.hasNext()) 
        {
            String s = (String)list.next();
            if (s.equals("time"))
            {
                i = jsonobject.getInt("time");
            } else
            if (s.equals("typeEnum"))
            {
                eventemitter = jsonobject.getString("typeEnum");
            } else
            {
                hashmap.put(s, a(jsonobject.get(s)));
            }
        }
        a(jsonobject, hashmap, Arrays.asList(CuePointFields.DEFAULT_FIELDS));
        return new CuePoint(i, eventemitter, hashmap);
    }

    public static Playlist buildPlaylistFromJSON(JSONObject jsonobject, EventEmitter eventemitter, List list)
    {
        if (jsonobject == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("jsonRequired"));
        }
        HashMap hashmap = new HashMap();
        if (!jsonobject.isNull("id"))
        {
            hashmap.put("id", Long.valueOf(jsonobject.getLong("id")));
        }
        if (!jsonobject.isNull("referenceId"))
        {
            hashmap.put("referenceId", jsonobject.getString("referenceId"));
        }
        if (!jsonobject.isNull("name"))
        {
            hashmap.put("name", jsonobject.getString("name"));
        }
        if (!jsonobject.isNull("shortDescription"))
        {
            hashmap.put("shortDescription", jsonobject.getString("shortDescription"));
        }
        if (!jsonobject.isNull("thumbnailURL"))
        {
            hashmap.put("thumbnailURL", jsonobject.getString("thumbnailURL"));
        }
        ArrayList arraylist = new ArrayList();
        if (!jsonobject.isNull("videos"))
        {
            JSONArray jsonarray = jsonobject.getJSONArray("videos");
            for (int i = 0; i < jsonarray.length(); i++)
            {
                JSONObject jsonobject1 = jsonarray.getJSONObject(i);
                if (jsonobject1 != null)
                {
                    arraylist.add(buildVideoFromJSON(jsonobject1, eventemitter, list));
                }
            }

        }
        a(jsonobject, hashmap, Arrays.asList(PlaylistFields.DEFAULT_FIELDS));
        return new Playlist(hashmap, arraylist);
    }

    public static Source buildSourceFromJSON(JSONObject jsonobject)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (!jsonobject.isNull("url"))
        {
            hashmap.put("url", jsonobject.getString("url"));
        }
        if (!jsonobject.isNull("videoDuration"))
        {
            hashmap.put("duration", Long.valueOf(jsonobject.getLong("videoDuration")));
        }
        if (!jsonobject.isNull("encodingRate"))
        {
            hashmap.put("bitRate", Integer.valueOf(jsonobject.getInt("encodingRate")));
        }
        if (jsonobject.isNull("videoContainer")) goto _L2; else goto _L1
_L1:
        String s = jsonobject.getString("videoContainer");
        Object obj = (String)hashmap.get("url");
        if (obj == null) goto _L4; else goto _L3
_L3:
        String s1 = (new URI(((String) (obj)))).getScheme();
        if (s1.equals("http")) goto _L6; else goto _L5
_L5:
        boolean flag1 = s1.equals("https");
        if (!flag1) goto _L7; else goto _L6
_L6:
        boolean flag = true;
_L8:
        if (!flag)
        {
            hashmap.put("deliveryType", DeliveryType.UNKNOWN);
        } else
        if (s.equals("MP4"))
        {
            hashmap.put("deliveryType", DeliveryType.MP4);
        } else
        if (s.equals("M2TS"))
        {
            hashmap.put("deliveryType", DeliveryType.HLS);
        } else
        if (s.equals("FLV"))
        {
            hashmap.put("deliveryType", DeliveryType.FLV);
        } else
        if (s.equals("WVM"))
        {
            hashmap.put("deliveryType", DeliveryType.WVM);
        } else
        {
            hashmap.put("deliveryType", DeliveryType.UNKNOWN);
        }
_L2:
        a(jsonobject, hashmap, Arrays.asList(SourceFields.DEFAULT_FIELDS));
        return new Source(hashmap);
_L7:
        flag = false;
          goto _L8
        obj;
        obj = null;
_L9:
        Log.e(TAG, (new StringBuilder()).append("Invalid URI syntax found: ").append(((String) (obj))).toString());
_L4:
        flag = false;
          goto _L8
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
          goto _L9
    }

    public static Video buildVideoFromJSON(JSONObject jsonobject, EventEmitter eventemitter, List list)
    {
        if (jsonobject == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("jsonRequired"));
        }
        Map map = a(jsonobject, list);
        Set set = a(jsonobject);
        eventemitter = a(jsonobject, eventemitter, list);
        a(jsonobject, map, Arrays.asList(VideoFields.DEFAULT_FIELDS));
        if (eventemitter != null)
        {
            return new Video(map, set, eventemitter);
        } else
        {
            return new Video(map, set);
        }
    }

    private static SourceCollection c(JSONObject jsonobject)
    {
        Object obj = jsonobject.getJSONObject("videoFullLength");
        jsonobject = new HashSet();
        obj = buildSourceFromJSON(((JSONObject) (obj)));
        jsonobject.add(obj);
        return new SourceCollection(jsonobject, ((Source) (obj)).getDeliveryType());
    }

    static String c(MediaService mediaservice)
    {
        return mediaservice.b;
    }

    static EventEmitter d(MediaService mediaservice)
    {
        return mediaservice.F;
    }

    static EventEmitter e(MediaService mediaservice)
    {
        return mediaservice.F;
    }

    static EventEmitter f(MediaService mediaservice)
    {
        return mediaservice.F;
    }

    protected void a()
    {
        c = new e(this, null);
        addListener("findVideo", c);
        addListener("findPlaylist", c);
    }

}
