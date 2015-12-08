// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.babayaga;

import android.content.Context;
import android.content.SharedPreferences;
import com.uservoice.uservoicesdk.model.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk.babayaga:
//            BabayagaTask

public class Babayaga
{
    public static final class Event extends Enum
    {

        private static final Event $VALUES[];
        public static final Event AUTHENTICATE;
        public static final Event COMMENT_IDEA;
        public static final Event IDENTIFY;
        public static final Event SEARCH_ARTICLES;
        public static final Event SEARCH_IDEAS;
        public static final Event SUBMIT_IDEA;
        public static final Event SUBMIT_TICKET;
        public static final Event SUBSCRIBE_IDEA;
        public static final Event VIEW_APP;
        public static final Event VIEW_ARTICLE;
        public static final Event VIEW_CHANNEL;
        public static final Event VIEW_FORUM;
        public static final Event VIEW_IDEA;
        public static final Event VIEW_KB;
        public static final Event VIEW_TOPIC;
        public static final Event VOTE_ARTICLE;
        public static final Event VOTE_IDEA;
        private final String code;

        public static Event valueOf(String s)
        {
            return (Event)Enum.valueOf(com/uservoice/uservoicesdk/babayaga/Babayaga$Event, s);
        }

        public static Event[] values()
        {
            return (Event[])$VALUES.clone();
        }

        public String getCode()
        {
            return code;
        }

        static 
        {
            VIEW_APP = new Event("VIEW_APP", 0, "g");
            VIEW_FORUM = new Event("VIEW_FORUM", 1, "m");
            VIEW_TOPIC = new Event("VIEW_TOPIC", 2, "c");
            VIEW_KB = new Event("VIEW_KB", 3, "k");
            VIEW_CHANNEL = new Event("VIEW_CHANNEL", 4, "o");
            VIEW_IDEA = new Event("VIEW_IDEA", 5, "i");
            VIEW_ARTICLE = new Event("VIEW_ARTICLE", 6, "f");
            AUTHENTICATE = new Event("AUTHENTICATE", 7, "u");
            SEARCH_IDEAS = new Event("SEARCH_IDEAS", 8, "s");
            SEARCH_ARTICLES = new Event("SEARCH_ARTICLES", 9, "r");
            VOTE_IDEA = new Event("VOTE_IDEA", 10, "v");
            VOTE_ARTICLE = new Event("VOTE_ARTICLE", 11, "z");
            SUBMIT_TICKET = new Event("SUBMIT_TICKET", 12, "t");
            SUBMIT_IDEA = new Event("SUBMIT_IDEA", 13, "d");
            SUBSCRIBE_IDEA = new Event("SUBSCRIBE_IDEA", 14, "b");
            IDENTIFY = new Event("IDENTIFY", 15, "y");
            COMMENT_IDEA = new Event("COMMENT_IDEA", 16, "h");
            $VALUES = (new Event[] {
                VIEW_APP, VIEW_FORUM, VIEW_TOPIC, VIEW_KB, VIEW_CHANNEL, VIEW_IDEA, VIEW_ARTICLE, AUTHENTICATE, SEARCH_IDEAS, SEARCH_ARTICLES, 
                VOTE_IDEA, VOTE_ARTICLE, SUBMIT_TICKET, SUBMIT_IDEA, SUBSCRIBE_IDEA, IDENTIFY, COMMENT_IDEA
            });
        }

        private Event(String s, int i, String s1)
        {
            super(s, i);
            code = s1;
        }
    }


    public static String CHANNEL = "d";
    static String DOMAIN = "by.uservoice.com";
    public static String EXTERNAL_CHANNEL = "x";
    private static SharedPreferences prefs;
    private static String uvts;

    public Babayaga()
    {
    }

    public static String getUvts()
    {
        return uvts;
    }

    public static void init(Context context)
    {
        setContext(context);
        track(Event.VIEW_APP);
    }

    public static void setContext(Context context)
    {
        prefs = context.getSharedPreferences("uv", 0);
        if (prefs.contains("uvts"))
        {
            uvts = prefs.getString("uvts", null);
        }
    }

    public static void setUvts(String s)
    {
        uvts = s;
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.putString("uvts", s);
        editor.commit();
    }

    public static void track(Event event)
    {
        track(event, ((Map) (null)));
    }

    public static void track(Event event, int i)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("id", Integer.valueOf(i));
        track(event, ((Map) (hashmap)));
    }

    public static void track(Event event, String s, List list)
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(Integer.valueOf(((BaseModel)list.next()).getId()))) { }
        hashmap.put("ids", arraylist);
        hashmap.put("text", s);
        track(event, ((Map) (hashmap)));
    }

    public static void track(Event event, Map map)
    {
        track(event.getCode(), map);
    }

    public static void track(String s, Map map)
    {
        (new BabayagaTask(s, uvts, map)).execute(new String[0]);
    }


    // Unreferenced inner class com/uservoice/uservoicesdk/babayaga/Babayaga$Track
    /* block-local class not found */
    class Track {}

}
