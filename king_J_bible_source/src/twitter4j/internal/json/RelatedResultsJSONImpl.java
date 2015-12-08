// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.RelatedResults;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl, StatusJSONImpl

final class RelatedResultsJSONImpl extends TwitterResponseImpl
    implements RelatedResults, Serializable
{

    private static final String TWEETS_FROM_USER = "TweetsFromUser";
    private static final String TWEETS_WITH_CONVERSATION = "TweetsWithConversation";
    private static final String TWEETS_WITH_REPLY = "TweetsWithReply";
    private static final long serialVersionUID = 0x99114d9b472e63cdL;
    private Map tweetsMap;

    RelatedResultsJSONImpl(JSONArray jsonarray)
        throws TwitterException
    {
        init(jsonarray, null, false);
    }

    RelatedResultsJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        init(httpresponse.asJSONArray(), httpresponse, configuration.isJSONStoreEnabled());
    }

    private void init(JSONArray jsonarray, HttpResponse httpresponse, boolean flag)
        throws TwitterException
    {
        int i;
        tweetsMap = new HashMap(2);
        i = 0;
        Object obj;
        Object obj1;
        JSONArray jsonarray1;
        Object obj2;
        int j;
        int k;
        int l;
        try
        {
            k = jsonarray.length();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
_L4:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        obj = jsonarray.getJSONObject(i);
        if (!"Tweet".equals(((JSONObject) (obj)).getString("resultType")))
        {
            break MISSING_BLOCK_LABEL_263;
        }
        obj2 = ((JSONObject) (obj)).getString("groupName");
        if (((String) (obj2)).length() == 0 || !((String) (obj2)).equals("TweetsWithConversation") && !((String) (obj2)).equals("TweetsWithReply") && !((String) (obj2)).equals("TweetsFromUser"))
        {
            break MISSING_BLOCK_LABEL_263;
        }
        jsonarray1 = ((JSONObject) (obj)).getJSONArray("results");
        obj1 = (ResponseList)tweetsMap.get(obj2);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = new ResponseListImpl(jsonarray1.length(), httpresponse);
        tweetsMap.put(obj2, obj);
        j = 0;
        l = jsonarray1.length();
_L2:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = jsonarray1.getJSONObject(j).getJSONObject("value");
        obj2 = new StatusJSONImpl(((JSONObject) (obj1)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        DataObjectFactoryUtil.registerJSONObject(obj2, obj1);
        ((ResponseList) (obj)).add(obj2);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        DataObjectFactoryUtil.registerJSONObject(obj, jsonarray1);
        break MISSING_BLOCK_LABEL_263;
        return;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (obj instanceof RelatedResultsJSONImpl)
            {
                obj = (RelatedResultsJSONImpl)obj;
                if (tweetsMap != null ? tweetsMap.equals(((RelatedResultsJSONImpl) (obj)).tweetsMap) : ((RelatedResultsJSONImpl) (obj)).tweetsMap == null)
                {
                    break label0;
                }
            }
            return false;
        }
        return true;
    }

    public ResponseList getTweetsFromUser()
    {
        ResponseList responselist = (ResponseList)tweetsMap.get("TweetsFromUser");
        if (responselist != null)
        {
            return responselist;
        } else
        {
            return new ResponseListImpl(0, null);
        }
    }

    public ResponseList getTweetsWithConversation()
    {
        ResponseList responselist = (ResponseList)tweetsMap.get("TweetsWithConversation");
        if (responselist != null)
        {
            return responselist;
        } else
        {
            return new ResponseListImpl(0, null);
        }
    }

    public ResponseList getTweetsWithReply()
    {
        ResponseList responselist = (ResponseList)tweetsMap.get("TweetsWithReply");
        if (responselist != null)
        {
            return responselist;
        } else
        {
            return new ResponseListImpl(0, null);
        }
    }

    public int hashCode()
    {
        return tweetsMap.hashCode() + 31;
    }

    public String toString()
    {
        return "RelatedResultsJSONImpl {tweetsMap=" + tweetsMap + "}";
    }
}
