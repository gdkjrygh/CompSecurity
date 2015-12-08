// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import android.net.Uri;
import android.util.Pair;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.tasks.FindPlaylistTask;
import com.brightcove.player.media.tasks.FindVideoTask;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.Playlist;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
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
//            VideoFields

public class MediaService extends AbstractComponent
{
    final class a
        implements EventListener
    {

        private MediaService a;

        public final void processEvent(Event event)
        {
            Object obj;
            obj = new HashMap();
            ((Map) (obj)).put("token", MediaService.a(a));
            ((Map) (obj)).put("media_delivery", "http");
            if (event.properties.containsKey("options"))
            {
                ((Map) (obj)).putAll((Map)event.properties.get("options"));
            }
            try
            {
                if (event.properties.containsKey("videoID"))
                {
                    (new FindVideoTask(MediaService.b(a), event, MediaService.c(a), ((Map) (obj)))).findVideoById((String)event.properties.get("videoID"));
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                MediaService.a(a, event, ((Exception) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                MediaService.a(a, event, ((Exception) (obj)));
                return;
            }
            if (event.properties.containsKey("videoReferenceID"))
            {
                (new FindVideoTask(MediaService.d(a), event, MediaService.c(a), ((Map) (obj)))).findVideoByReferenceId((String)event.properties.get("videoReferenceID"));
                return;
            }
            if (event.properties.containsKey("playlistID"))
            {
                (new FindPlaylistTask(MediaService.e(a), event, MediaService.c(a), ((Map) (obj)))).findPlaylistById((String)event.properties.get("playlistID"));
                return;
            }
            if (event.properties.containsKey("playlistReferenceID"))
            {
                (new FindPlaylistTask(MediaService.f(a), event, MediaService.c(a), ((Map) (obj)))).findPlaylistByReferenceId((String)event.properties.get("playlistReferenceID"));
                return;
            }
            throw new IllegalArgumentException(ErrorUtil.getMessage("keyNotFound"));
        }

        private a()
        {
            a = MediaService.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


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
    private a c;

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
        c = new a((byte)0);
        addListener("findVideo", c);
        addListener("findPlaylist", c);
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
        Object obj;
        if (!jsonobject.isNull("videoStillURL"))
        {
            obj = jsonobject.getString("videoStillURL");
            Iterator iterator1;
            String s2;
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
            list = jsonobject.getJSONObject("customFields");
            obj = new HashMap();
            if (list != null && list.length() > 0)
            {
                iterator1 = list.keys();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    s2 = (String)iterator1.next();
                    if (s2 != null)
                    {
                        ((Map) (obj)).put(s2, list.getString(s2));
                    }
                } while (true);
                if (((Map) (obj)).size() > 0)
                {
                    hashmap.put("customFields", obj);
                    list = ((Map) (obj)).entrySet().iterator();
                    do
                    {
                        if (!list.hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry)list.next();
                        String s = (String)entry.getKey();
                        if (s.equals("captions"))
                        {
                            a("en", (String)entry.getValue(), ((Map) (hashmap)));
                        } else
                        if (s.startsWith("captions_") && s.length() > 9)
                        {
                            a(s.split("_")[1], (String)entry.getValue(), ((Map) (hashmap)));
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
                Iterator iterator = jsonobject.keys();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)iterator.next();
                    if (s1 != null)
                    {
                        list.put(s1.split("_")[1], jsonobject.get(s1));
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
        Object obj1 = new HashSet();
        ((Set) (obj1)).addAll(a(jsonobject, "renditions"));
        ((Set) (obj1)).addAll(a(jsonobject, "WVMRenditions"));
        ((Set) (obj1)).addAll(a(jsonobject, "IOSRenditions"));
        if (!((Set) (obj1)).isEmpty())
        {
            HashMap hashmap = new HashMap();
            obj1 = ((Set) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Source source = (Source)((Iterator) (obj1)).next();
                DeliveryType deliverytype1 = source.getDeliveryType();
                if (!hashset1.contains(deliverytype1))
                {
                    if (hashmap.get(deliverytype1) == null)
                    {
                        hashmap.put(deliverytype1, new HashSet());
                    }
                    ((Set)hashmap.get(deliverytype1)).add(source);
                }
            } while (true);
            DeliveryType deliverytype;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); hashset1.add(deliverytype))
            {
                deliverytype = (DeliveryType)iterator.next();
                hashset.add(new SourceCollection((Set)hashmap.get(deliverytype), deliverytype));
            }

        }
        if (!jsonobject.isNull("videoFullLength"))
        {
            Object obj2 = jsonobject.getJSONObject("videoFullLength");
            Object obj = new HashSet();
            obj2 = buildSourceFromJSON(((JSONObject) (obj2)));
            ((Set) (obj)).add(obj2);
            obj = new SourceCollection(((Set) (obj)), ((Source) (obj2)).getDeliveryType());
            obj2 = ((SourceCollection) (obj)).getDeliveryType();
            if (!hashset1.contains(obj2))
            {
                hashset.add(obj);
                hashset1.add(obj2);
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

    static void a(MediaService mediaservice, Event event, Exception exception)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(String.format(ErrorUtil.getMessage("mediaRequestError"), new Object[] {
            exception.getMessage()
        }));
        event.properties.put("errors", arraylist);
        mediaservice.eventEmitter.respond(event);
    }

    private static void a(String s, String s1, Map map)
    {
        if (!StringUtil.isEmpty(s1))
        {
            List list = (List)map.get("captionSources");
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                map.put("captionSources", obj);
            }
            s = BrightcoveCaptionFormat.createCaptionFormat("text/unknown", s);
            ((List) (obj)).add(Pair.create(Uri.parse(s1), s));
        }
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
        return mediaservice.eventEmitter;
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

    public static CuePoint buildCuePointFromJSON(JSONObject jsonobject, EventEmitter eventemitter, List list)
    {
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
        int i = 0;
        eventemitter = null;
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
        String s1 = (String)hashmap.get("url");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        s1 = (new URI(s1)).getScheme();
        if (s1.equals("http")) goto _L4; else goto _L3
_L3:
        boolean flag1 = s1.equals("https");
        if (!flag1) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L6:
        URISyntaxException urisyntaxexception;
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
_L5:
        flag = false;
          goto _L6
        urisyntaxexception;
        flag = false;
          goto _L6
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

    static String c(MediaService mediaservice)
    {
        return mediaservice.b;
    }

    static EventEmitter d(MediaService mediaservice)
    {
        return mediaservice.eventEmitter;
    }

    static EventEmitter e(MediaService mediaservice)
    {
        return mediaservice.eventEmitter;
    }

    static EventEmitter f(MediaService mediaservice)
    {
        return mediaservice.eventEmitter;
    }

}
