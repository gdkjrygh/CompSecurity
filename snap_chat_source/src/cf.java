// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class cf extends AsyncTask
    implements Component
{

    public EventEmitter a;
    public String b;
    public String c;
    public URI d;
    public List e;
    private Map f;
    private String g;
    private HttpService h;

    public cf(EventEmitter eventemitter, String s, Map map, String s1, String s2)
    {
        a = RegisteringEventEmitter.build(eventemitter, cf);
        b = s;
        f = map;
        c = s1;
        g = s2;
        h = new HttpService();
        e = new ArrayList();
    }

    private transient JSONObject a(URI auri[])
    {
        if (auri == null || auri.length != 1)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        }
        d = auri[0];
        auri = new HashMap();
        auri.put("BCOV-POLICY", g);
        if (f != null)
        {
            auri.putAll(f);
        }
        try
        {
            auri = h.doJSONGetRequest(d, auri);
        }
        // Misplaced declaration of an exception variable
        catch (URI auri[])
        {
            (new StringBuilder("IOException: ")).append(auri);
            a(String.format(ErrorUtil.getMessage("uriError"), new Object[] {
                d.toString()
            }), ((Exception) (auri)));
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (URI auri[])
        {
            (new StringBuilder("JSONException")).append(auri);
            a("Not a valid JSON Response", ((Exception) (auri)));
            return null;
        }
        return auri;
    }

    private void a(String s, Exception exception)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("message", (new StringBuilder()).append(s).append(": ").append(exception.getMessage()).toString());
        a.emit("error", hashmap);
    }

    private static void a(JSONObject jsonobject, Map map, Set set)
    {
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!StringUtil.isEmpty(s) && !jsonobject.isNull(s) && !set.contains(s))
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

    private Map b(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (!jsonobject.isNull("account_id"))
        {
            hashmap.put("pubId", jsonobject.getString("account_id"));
        }
        if (!jsonobject.isNull("id"))
        {
            hashmap.put("id", jsonobject.getString("id"));
        }
        if (!jsonobject.isNull("duration"))
        {
            hashmap.put("duration", Integer.valueOf(jsonobject.getInt("duration")));
        }
        if (!jsonobject.isNull("poster"))
        {
            Object obj = jsonobject.getString("poster");
            Iterator iterator;
            String s;
            try
            {
                hashmap.put("stillImageUri", new URI(((String) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj = String.format(ErrorUtil.getMessage("invalidURI"), new Object[] {
                    obj
                });
                e.add(obj);
            }
        }
        if (!jsonobject.isNull("custom_fields"))
        {
            obj = jsonobject.getJSONObject("custom_fields");
            Object obj1 = new HashMap();
            if (obj != null && ((JSONObject) (obj)).length() > 0)
            {
                iterator = ((JSONObject) (obj)).keys();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    s = (String)iterator.next();
                    if (s != null)
                    {
                        ((Map) (obj1)).put(s, ((JSONObject) (obj)).getString(s));
                    }
                } while (true);
                if (((Map) (obj1)).size() > 0)
                {
                    hashmap.put("customFields", obj1);
                }
            }
        }
        HashSet hashset = new HashSet();
        hashset.add("account_id");
        hashset.add("cue_points");
        hashset.add("custom_fields");
        hashset.add("duration");
        hashset.add("id");
        hashset.add("poster");
        hashset.add("sources");
        a(jsonobject, hashmap, hashset);
        return hashmap;
    }

    private static Set c(JSONObject jsonobject)
    {
        HashSet hashset;
        JSONArray jsonarray;
        hashset = new HashSet();
        jsonarray = jsonobject.optJSONArray("sources");
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        while (i < jsonarray.length()) 
        {
            jsonobject = jsonarray.getJSONObject(i);
            HashMap hashmap = new HashMap();
            if (!jsonobject.isNull("src"))
            {
                hashmap.put("url", jsonobject.getString("src"));
                if (!jsonobject.isNull("container"))
                {
                    Object obj = jsonobject.getString("container");
                    if (((String) (obj)).equalsIgnoreCase("mp4"))
                    {
                        hashmap.put("deliveryType", DeliveryType.MP4);
                    } else
                    if (((String) (obj)).equalsIgnoreCase("m2ts"))
                    {
                        hashmap.put("deliveryType", DeliveryType.HLS);
                    } else
                    if (((String) (obj)).equalsIgnoreCase("flv"))
                    {
                        hashmap.put("deliveryType", DeliveryType.FLV);
                    } else
                    if (((String) (obj)).equalsIgnoreCase("wvm"))
                    {
                        hashmap.put("deliveryType", DeliveryType.WVM);
                    } else
                    {
                        hashmap.put("deliveryType", DeliveryType.UNKNOWN);
                    }
                }
                if (!jsonobject.isNull("type") && jsonobject.getString("type").equalsIgnoreCase("application/dash+xml"))
                {
                    hashmap.put("deliveryType", DeliveryType.DASH);
                }
                if (!jsonobject.isNull("avg_bitrate"))
                {
                    hashmap.put("bitRate", Integer.valueOf(jsonobject.getInt("avg_bitrate")));
                }
                obj = new HashSet(4);
                ((Set) (obj)).add("src");
                ((Set) (obj)).add("container");
                ((Set) (obj)).add("type");
                ((Set) (obj)).add("avg_bitrate");
                a(jsonobject, hashmap, ((Set) (obj)));
                jsonobject = new Source(hashmap);
            } else
            {
                (new StringBuilder("Ignoring source without a src: ")).append(jsonobject);
                jsonobject = null;
            }
            if (jsonobject != null)
            {
                hashset.add(jsonobject);
            }
            i++;
        }
_L2:
        return hashset;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private List d(JSONObject jsonobject)
    {
        ArrayList arraylist = null;
        if (!jsonobject.isNull("cue_points"))
        {
            arraylist = new ArrayList();
            jsonobject = jsonobject.getJSONArray("cue_points");
            for (int i = 0; i < jsonobject.length(); i++)
            {
                arraylist.add(e(jsonobject.getJSONObject(i)));
            }

        }
        return arraylist;
    }

    private CuePoint e(JSONObject jsonobject)
    {
        if (jsonobject.isNull("time"))
        {
            jsonobject = String.format(ErrorUtil.getMessage("missingCuePointProperty"), new Object[] {
                "time"
            });
            e.add(jsonobject);
            return null;
        }
        if (jsonobject.isNull("type"))
        {
            jsonobject = String.format(ErrorUtil.getMessage("missingCuePointProperty"), new Object[] {
                "type"
            });
            e.add(jsonobject);
            return null;
        }
        Object obj = jsonobject.keys();
        HashMap hashmap = new HashMap();
        int i = 0;
        String s = null;
        while (((Iterator) (obj)).hasNext()) 
        {
            String s1 = (String)((Iterator) (obj)).next();
            if (s1.equals("time"))
            {
                i = (int)(jsonobject.getDouble("time") * 1000D);
            } else
            if (s1.equals("type"))
            {
                s = jsonobject.getString("type");
            } else
            {
                hashmap.put(s1, jsonobject.get(s1).toString());
            }
        }
        obj = new HashSet(2);
        ((Set) (obj)).add("time");
        ((Set) (obj)).add("type");
        a(jsonobject, hashmap, ((Set) (obj)));
        return new CuePoint(i, s, hashmap);
    }

    public final Video a(JSONObject jsonobject)
    {
        Map map = b(jsonobject);
        HashSet hashset = new HashSet();
        Object obj = c(jsonobject);
        HashSet hashset1 = new HashSet();
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
        jsonobject = d(jsonobject);
        if (jsonobject != null)
        {
            return new Video(map, hashset, jsonobject);
        } else
        {
            return new Video(map, hashset);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((URI[])aobj);
    }

    static 
    {
        cf.getSimpleName();
    }
}
