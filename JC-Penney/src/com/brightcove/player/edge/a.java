// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.edge;

import android.os.AsyncTask;
import android.util.Log;
import com.brightcove.player.event.EventEmitter;
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

abstract class a extends AsyncTask
{

    private static final String g = com/brightcove/player/edge/a.getSimpleName();
    protected EventEmitter a;
    protected String b;
    protected String c;
    protected URI d;
    protected HttpService e;
    protected List f;
    private Map h;
    private String i;

    a(EventEmitter eventemitter, String s, Map map, String s1, String s2)
    {
        a = eventemitter;
        b = s;
        h = map;
        c = s1;
        i = s2;
        e = new HttpService();
        f = new ArrayList();
    }

    private List a(JSONObject jsonobject, EventEmitter eventemitter)
    {
        ArrayList arraylist = null;
        if (!jsonobject.isNull("cue_points"))
        {
            arraylist = new ArrayList();
            jsonobject = jsonobject.getJSONArray("cue_points");
            for (int j = 0; j < jsonobject.length(); j++)
            {
                arraylist.add(b(jsonobject.getJSONObject(j), eventemitter));
            }

        }
        return arraylist;
    }

    private void a(String s, Exception exception)
    {
        Log.e(g, s, exception);
        HashMap hashmap = new HashMap();
        hashmap.put("message", (new StringBuilder()).append(s).append(": ").append(exception.getMessage()).toString());
        a.emit("error", hashmap);
    }

    private CuePoint b(JSONObject jsonobject, EventEmitter eventemitter)
    {
        eventemitter = null;
        int j = 0;
        if (jsonobject.isNull("time"))
        {
            jsonobject = String.format(ErrorUtil.getMessage("missingCuePointProperty"), new Object[] {
                "time"
            });
            f.add(jsonobject);
            return null;
        }
        if (jsonobject.isNull("type"))
        {
            jsonobject = String.format(ErrorUtil.getMessage("missingCuePointProperty"), new Object[] {
                "type"
            });
            f.add(jsonobject);
            return null;
        }
        Object obj = jsonobject.keys();
        HashMap hashmap = new HashMap();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            if (s.equals("time"))
            {
                j = (int)(jsonobject.getDouble("time") * 1000D);
            } else
            if (s.equals("type"))
            {
                eventemitter = jsonobject.getString("type");
            } else
            {
                hashmap.put(s, jsonobject.get(s).toString());
            }
        }
        obj = new HashSet(2);
        ((Set) (obj)).add("time");
        ((Set) (obj)).add("type");
        a(jsonobject, hashmap, ((Set) (obj)));
        return new CuePoint(j, eventemitter, hashmap);
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
                f.add(obj);
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

    private Set c(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        Object obj = d(jsonobject);
        jsonobject = new HashSet();
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
                if (!jsonobject.contains(deliverytype1))
                {
                    if (hashmap.get(deliverytype1) == null)
                    {
                        hashmap.put(deliverytype1, new HashSet());
                    }
                    ((Set)hashmap.get(deliverytype1)).add(source);
                }
            } while (true);
            DeliveryType deliverytype;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); jsonobject.add(deliverytype))
            {
                deliverytype = (DeliveryType)iterator.next();
                hashset.add(new SourceCollection((Set)hashmap.get(deliverytype), deliverytype));
            }

        }
        return hashset;
    }

    private Set d(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        jsonobject = jsonobject.optJSONArray("sources");
        if (jsonobject != null)
        {
            for (int j = 0; j < jsonobject.length(); j++)
            {
                hashset.add(e(jsonobject.getJSONObject(j)));
            }

        }
        return hashset;
    }

    private Source e(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (!jsonobject.isNull("src"))
        {
            hashmap.put("url", jsonobject.getString("src"));
        }
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
        obj = new HashSet(2);
        ((Set) (obj)).add("src");
        ((Set) (obj)).add("container");
        ((Set) (obj)).add("type");
        a(jsonobject, hashmap, ((Set) (obj)));
        return new Source(hashmap);
    }

    protected Video a(JSONObject jsonobject)
    {
        Map map = b(jsonobject);
        Set set = c(jsonobject);
        jsonobject = a(jsonobject, a);
        if (jsonobject != null)
        {
            return new Video(map, set, jsonobject);
        } else
        {
            return new Video(map, set);
        }
    }

    protected transient JSONObject a(URI auri[])
    {
        if (auri == null || auri.length != 1)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        }
        d = auri[0];
        auri = new HashMap();
        auri.put("BCOV-POLICY", i);
        if (h != null)
        {
            auri.putAll(h);
        }
        if (auri == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        return e.doJSONGetRequest(d, auri);
        auri = e.doJSONGetRequest(d);
        return auri;
        auri;
        Log.e(g, (new StringBuilder()).append("IOException: ").append(auri).toString());
        a(String.format(ErrorUtil.getMessage("uriError"), new Object[] {
            d.toString()
        }), ((Exception) (auri)));
        return null;
        auri;
        Log.e(g, (new StringBuilder()).append("JSONException").append(auri).toString());
        a("Not a valid JSON Response", ((Exception) (auri)));
        return null;
    }

    protected void a(JSONObject jsonobject, Map map, Set set)
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

    protected Object doInBackground(Object aobj[])
    {
        return a((URI[])aobj);
    }

}
