// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.edge;

import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.util.ErrorUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.brightcove.player.edge:
//            a, VideoListener

public class GetVideoTask extends a
{

    private static final String g = com/brightcove/player/edge/GetVideoTask.getSimpleName();
    private VideoListener h;

    public GetVideoTask(EventEmitter eventemitter, String s, Map map, String s1, String s2)
    {
        super(eventemitter, s, map, s1, s2);
    }

    protected void b(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            try
            {
                jsonobject = a(jsonobject);
                h.onVideo(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                f.add(String.format(ErrorUtil.getMessage("mediaRequestInvalidJSON"), new Object[] {
                    d
                }));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                f.add(String.format(ErrorUtil.getMessage("mediaRequestNoJSON"), new Object[] {
                    d
                }));
            }
        } else
        {
            f.add((new StringBuilder()).append("No data was found that matched your request: ").append(d).toString());
        }
        if (!f.isEmpty())
        {
            String s;
            for (jsonobject = f.iterator(); jsonobject.hasNext(); h.onError(s))
            {
                s = (String)jsonobject.next();
            }

        }
    }

    public void getById(String s, VideoListener videolistener)
    {
        h = videolistener;
        try
        {
            execute(new URI[] {
                new URI((new StringBuilder()).append(b).append("accounts/").append(c).append("/videos/").append(s).toString())
            });
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
        h = videolistener;
        try
        {
            execute(new URI[] {
                new URI((new StringBuilder()).append(b).append("accounts/").append(c).append("/videos/ref:").append(s).toString())
            });
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
        b((JSONObject)obj);
    }

}
