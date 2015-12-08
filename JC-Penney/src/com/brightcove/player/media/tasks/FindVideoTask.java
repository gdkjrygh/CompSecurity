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

    protected void a(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject == null)
        {
            arraylist.add((new StringBuilder()).append("No data was found that matched your request. ").append(e).toString());
        } else
        if (!jsonobject.isNull("error"))
        {
            try
            {
                arraylist.add(jsonobject.getString("error"));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                arraylist.add(String.format(ErrorUtil.getMessage("mediaRequestInvalidJSON"), new Object[] {
                    e
                }));
            }
        } else
        {
            try
            {
                jsonobject = MediaService.buildVideoFromJSON(jsonobject, a, arraylist);
                f.properties.put("video", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                arraylist.add(String.format(ErrorUtil.getMessage("mediaRequestInvalidJSON"), new Object[] {
                    e
                }));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                arraylist.add(String.format(ErrorUtil.getMessage("mediaRequestNoJSON"), new Object[] {
                    e
                }));
            }
        }
        if (!arraylist.isEmpty())
        {
            f.properties.put("errors", arraylist);
        }
        a.respond(f);
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
        a((JSONObject)obj);
    }
}
