// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.common:
//            RecentConversationItem, Charsets

public class RecentConversationList
    implements Iterable
{
    public static class DeserializeResult
        implements g
    {

        private RecentConversationList recentConversationList;
        private final Status status;

        public RecentConversationList getRecentConversationList()
        {
            return recentConversationList;
        }

        public Status getStatus()
        {
            return status;
        }

        private DeserializeResult(Status status1)
        {
            status = status1;
        }


        private DeserializeResult(RecentConversationList recentconversationlist)
        {
            recentConversationList = recentconversationlist;
            status = new Status(0);
        }

    }


    public static final String CONVERSATION_OBJECT_ID = "conversationObjectId";
    public static final String DISPLAY_NAME = "displayName";
    public static final String IDENTITY = "identity";
    public static final String LAST_MESSAGE_OBJECT_ID = "lastMessageObjectId";
    public static final String LAST_MESSAGE_TEXT = "last_message_text";
    public static final String RECENT_CONVERSATION_LIST = "recentconversationlist";
    public static final String UNREAD_COUNT = "unreadCount";
    private List recentConversationItems;

    public RecentConversationList()
    {
        recentConversationItems = new ArrayList();
    }

    public static RecentConversationList deserialize(String s)
        throws JSONException
    {
        Object obj = new JSONObject(s);
        s = new RecentConversationList();
        obj = ((JSONObject) (obj)).getJSONArray("recentconversationlist");
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            RecentConversationItem recentconversationitem = new RecentConversationItem(jsonobject.optInt("conversationObjectId"), jsonobject.optString("identity"), jsonobject.optString("displayName"), jsonobject.optInt("lastMessageObjectId"), jsonobject.optInt("unreadCount"));
            recentconversationitem.setLastMessageText(jsonobject.optString("last_message_text"));
            s.add(recentconversationitem);
        }

        return s;
    }

    public static void deserialize(com.google.android.gms.common.api.c c1, Asset asset, h h1)
    {
        if (asset == null)
        {
            h1.onResult(new DeserializeResult(new Status(13, "Asset is null.")));
            return;
        } else
        {
            o.a.a(c1, asset).a(new h(h1) {

                final h val$resultCallback;

                public final volatile void onResult(g g)
                {
                    onResult((com.google.android.gms.wearable.c.d)g);
                }

                public final void onResult(com.google.android.gms.wearable.c.d d)
                {
                    boolean flag = d.getStatus().d();
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_115;
                    }
                    RecentConversationList recentconversationlist = RecentConversationList.deserialize((new Scanner(d.b(), Charsets.UTF_8.name())).useDelimiter("\\A").next());
                    resultCallback.onResult(new DeserializeResult(recentconversationlist));
_L1:
                    d.a();
                    return;
                    Object obj;
                    obj;
                    Status status = new Status(13, ((JSONException) (obj)).getMessage());
                    resultCallback.onResult(new DeserializeResult(status));
                      goto _L1
                    status;
                    d.a();
                    throw status;
                    resultCallback.onResult(new DeserializeResult(d.getStatus()));
                      goto _L1
                }

            
            {
                resultCallback = h1;
                super();
            }
            });
            return;
        }
    }

    public void add(RecentConversationItem recentconversationitem)
    {
        recentConversationItems.add(recentconversationitem);
    }

    public List getRecentConversationItems()
    {
        return recentConversationItems;
    }

    public Iterator iterator()
    {
        return recentConversationItems.iterator();
    }

    public Asset serializeAsAsset()
    {
        Asset asset;
        try
        {
            asset = Asset.a(serializeAsJson().getBytes(Charsets.UTF_8));
        }
        catch (JSONException jsonexception)
        {
            throw new IllegalStateException(jsonexception);
        }
        return asset;
    }

    public String serializeAsJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject1;
        for (Iterator iterator1 = recentConversationItems.iterator(); iterator1.hasNext(); jsonarray.put(jsonobject1))
        {
            RecentConversationItem recentconversationitem = (RecentConversationItem)iterator1.next();
            jsonobject1 = new JSONObject();
            jsonobject1.put("conversationObjectId", recentconversationitem.getConversationObjectId());
            jsonobject1.put("identity", recentconversationitem.getIdentity());
            jsonobject1.put("displayName", recentconversationitem.getDisplayName());
            jsonobject1.put("lastMessageObjectId", recentconversationitem.getLastMessageObjectId());
            jsonobject1.put("unreadCount", recentconversationitem.getLastMessageObjectId());
            jsonobject1.put("last_message_text", recentconversationitem.getLastMessageText());
        }

        jsonobject.put("recentconversationlist", jsonarray);
        return jsonobject.toString();
    }
}
