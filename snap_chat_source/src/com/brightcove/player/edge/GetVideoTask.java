// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.edge;

import cf;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.util.ErrorUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.brightcove.player.edge:
//            VideoListener

public class GetVideoTask extends cf
    implements Component
{

    private VideoListener f;
    private long g;

    public GetVideoTask(EventEmitter eventemitter, String s, Map map, String s1, String s2)
    {
        super(eventemitter, s, map, s1, s2);
    }

    private void a(URI uri)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("catalogUrl", uri);
        a.emit("analyticsCatalogRequest", hashmap);
        g = System.currentTimeMillis();
    }

    public void getById(String s, VideoListener videolistener)
    {
        f = videolistener;
        try
        {
            s = new URI((new StringBuilder()).append(b).append("accounts/").append(c).append("/videos/").append(s).toString());
            execute(new URI[] {
                s
            });
            a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void getByReferenceId(String s, VideoListener videolistener)
    {
        f = videolistener;
        try
        {
            s = new URI((new StringBuilder()).append(b).append("accounts/").append(c).append("/videos/ref:").append(s).toString());
            execute(new URI[] {
                s
            });
            a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    protected void onPostExecute(Object obj)
    {
        obj = (JSONObject)obj;
        HashMap hashmap = new HashMap();
        hashmap.put("catalogUrl", d);
        hashmap.put("responseTimeMs", Long.valueOf(System.currentTimeMillis() - g));
        a.emit("analyticsCatalogResponse", hashmap);
        if (obj != null)
        {
            try
            {
                obj = a(((JSONObject) (obj)));
                f.onVideo(((com.brightcove.player.model.Video) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                e.add(String.format(ErrorUtil.getMessage("mediaRequestInvalidJSON"), new Object[] {
                    d
                }));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                e.add(String.format(ErrorUtil.getMessage("mediaRequestNoJSON"), new Object[] {
                    d
                }));
            }
        } else
        {
            e.add((new StringBuilder("No data was found that matched your request: ")).append(d).toString());
        }
        if (!e.isEmpty())
        {
            String s;
            for (obj = e.iterator(); ((Iterator) (obj)).hasNext(); f.onError(s))
            {
                s = (String)((Iterator) (obj)).next();
            }

        }
    }

    static 
    {
        com/brightcove/player/edge/GetVideoTask.getSimpleName();
    }
}
