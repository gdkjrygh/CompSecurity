// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media.tasks;

import android.os.AsyncTask;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.media.VideoFields;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class FindMediaTask extends AsyncTask
{

    private static final String g = com/brightcove/player/media/tasks/FindMediaTask.getSimpleName();
    protected EventEmitter a;
    protected String b;
    protected Map c;
    protected HttpService d;
    protected URI e;
    protected Event f;

    protected FindMediaTask(EventEmitter eventemitter, Event event, String s, Map map)
    {
        if (eventemitter == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("eventEmitterRequired"));
        }
        if (event == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("eventRequired"));
        }
        if (s == null || s.trim().equals(""))
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("baseURLRequired"));
        }
        String s1 = (String)map.get("token");
        if (s1 == null || s1.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("tokenRequired"));
        }
        s1 = (String)map.get("media_delivery");
        if (s1 == null || s1.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("mediaDeliveryRequired"));
        } else
        {
            a = eventemitter;
            f = event;
            b = s;
            c = map;
            d = new HttpService();
            return;
        }
    }

    protected transient JSONObject a(URI auri[])
    {
        if (auri == null || auri.length != 1)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        }
        e = auri[0];
        try
        {
            auri = d.doJSONGetRequest(e);
        }
        // Misplaced declaration of an exception variable
        catch (URI auri[])
        {
            Log.e(g, (new StringBuilder()).append("IOException: ").append(auri).toString());
            a(String.format(ErrorUtil.getMessage("uriError"), new Object[] {
                e.toString()
            }), ((Exception) (auri)));
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (URI auri[])
        {
            Log.e(g, (new StringBuilder()).append("JSONException").append(auri).toString());
            a("Not a valid JSON Response", ((Exception) (auri)));
            return null;
        }
        return auri;
    }

    protected void a(String s, Exception exception)
    {
        Log.e(g, s, exception);
        HashMap hashmap = new HashMap();
        hashmap.put("message", (new StringBuilder()).append(s).append(": ").append(exception.getMessage()).toString());
        a.emit("error", hashmap);
    }

    public URI buildURI(String s, String s1, String s2)
    {
        HashMap hashmap;
        hashmap = new HashMap(c);
        hashmap.put("command", s);
        hashmap.put(s1, s2);
        s = (String)c.get("video_fields");
        if (s != null) goto _L2; else goto _L1
_L1:
        hashmap.put("video_fields", StringUtil.join(VideoFields.DEFAULT_FIELDS, ","));
_L4:
        return HttpService.buildURIWithQueryParameters(b, hashmap);
_L2:
        if (!s.contains("accountId"))
        {
            if (s.length() == 0)
            {
                s = "accountId";
            } else
            {
                s = (new StringBuilder()).append(s).append(",").append("accountId").toString();
            }
            hashmap.put("video_fields", s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((URI[])aobj);
    }

    public void executeWithCommand(String s, String s1, String s2)
    {
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("mediaAPICommandRequired"));
        }
        if (s1 == null || s1.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("idFieldRequired"));
        }
        if (s2 == null || s2.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("idRequired"));
        } else
        {
            execute(new URI[] {
                buildURI(s, s1, s2)
            });
            return;
        }
    }

    public void executeWithURI(URI uri)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        } else
        {
            execute(new URI[] {
                uri
            });
            return;
        }
    }

}
