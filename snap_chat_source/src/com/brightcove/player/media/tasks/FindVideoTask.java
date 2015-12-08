// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media.tasks;

import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.MediaService;
import com.brightcove.player.util.ErrorUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.brightcove.player.media.tasks:
//            FindMediaTask

public class FindVideoTask extends FindMediaTask
    implements Component
{

    public FindVideoTask(EventEmitter eventemitter, Event event, String s, Map map)
    {
        super(eventemitter, event, s, map);
    }

    public void findVideoById(String s)
    {
        executeWithCommand("find_video_by_id", "video_id", s);
    }

    public void findVideoByReferenceId(String s)
    {
        executeWithCommand("find_video_by_reference_id", "reference_id", s);
    }

    protected void onPostExecute(Object obj)
    {
        Object obj1 = (JSONObject)obj;
        obj = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put("catalogUrl", b);
        hashmap.put("responseTimeMs", Long.valueOf(System.currentTimeMillis() - d));
        a.emit("analyticsCatalogResponse", hashmap);
        if (obj1 == null)
        {
            ((ArrayList) (obj)).add((new StringBuilder("No data was found that matched your request. ")).append(b).toString());
        } else
        if (!((JSONObject) (obj1)).isNull("error"))
        {
            try
            {
                ((ArrayList) (obj)).add(((JSONObject) (obj1)).getString("error"));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((ArrayList) (obj)).add(String.format(ErrorUtil.getMessage("mediaRequestInvalidJSON"), new Object[] {
                    b
                }));
            }
        } else
        {
            try
            {
                obj1 = MediaService.buildVideoFromJSON(((JSONObject) (obj1)), a, ((java.util.List) (obj)));
                c.properties.put("video", obj1);
            }
            catch (JSONException jsonexception)
            {
                ((ArrayList) (obj)).add(String.format(ErrorUtil.getMessage("mediaRequestInvalidJSON"), new Object[] {
                    b
                }));
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                ((ArrayList) (obj)).add(String.format(ErrorUtil.getMessage("mediaRequestNoJSON"), new Object[] {
                    b
                }));
            }
        }
        if (!((ArrayList) (obj)).isEmpty())
        {
            c.properties.put("errors", obj);
        }
        a.respond(c);
    }
}
