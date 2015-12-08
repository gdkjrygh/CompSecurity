// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl

class RelationshipJSONImpl extends TwitterResponseImpl
    implements Relationship, Serializable
{

    private static final long serialVersionUID = 0x6b34ca39712b59e8L;
    private final boolean sourceBlockingTarget;
    private final boolean sourceFollowedByTarget;
    private final boolean sourceFollowingTarget;
    private final boolean sourceNotificationsEnabled;
    private final long sourceUserId;
    private final String sourceUserScreenName;
    private final long targetUserId;
    private final String targetUserScreenName;

    RelationshipJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        this(null, jsonobject);
    }

    RelationshipJSONImpl(HttpResponse httpresponse, JSONObject jsonobject)
        throws TwitterException
    {
        super(httpresponse);
        try
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("relationship");
            httpresponse = jsonobject1.getJSONObject("source");
            jsonobject1 = jsonobject1.getJSONObject("target");
            sourceUserId = z_T4JInternalParseUtil.getLong("id", httpresponse);
            targetUserId = z_T4JInternalParseUtil.getLong("id", jsonobject1);
            sourceUserScreenName = z_T4JInternalParseUtil.getUnescapedString("screen_name", httpresponse);
            targetUserScreenName = z_T4JInternalParseUtil.getUnescapedString("screen_name", jsonobject1);
            sourceBlockingTarget = z_T4JInternalParseUtil.getBoolean("blocking", httpresponse);
            sourceFollowingTarget = z_T4JInternalParseUtil.getBoolean("following", httpresponse);
            sourceFollowedByTarget = z_T4JInternalParseUtil.getBoolean("followed_by", httpresponse);
            sourceNotificationsEnabled = z_T4JInternalParseUtil.getBoolean("notifications_enabled", httpresponse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse.getMessage() + ":" + jsonobject.toString(), httpresponse);
        }
    }

    RelationshipJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        this(httpresponse, httpresponse.asJSONObject());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asJSONObject());
        }
    }

    static ResponseList createRelationshipList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        JSONArray jsonarray;
        JSONObject jsonobject;
        RelationshipJSONImpl relationshipjsonimpl;
        int i;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            jsonarray = httpresponse.asJSONArray();
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw httpresponse;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        relationshipjsonimpl = new RelationshipJSONImpl(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(relationshipjsonimpl, jsonobject);
        }
        httpresponse.add(relationshipjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Relationship))
            {
                return false;
            }
            obj = (Relationship)obj;
            if (sourceUserId != ((Relationship) (obj)).getSourceUserId())
            {
                return false;
            }
            if (targetUserId != ((Relationship) (obj)).getTargetUserId())
            {
                return false;
            }
            if (!sourceUserScreenName.equals(((Relationship) (obj)).getSourceUserScreenName()))
            {
                return false;
            }
            if (!targetUserScreenName.equals(((Relationship) (obj)).getTargetUserScreenName()))
            {
                return false;
            }
        }
        return true;
    }

    public long getSourceUserId()
    {
        return sourceUserId;
    }

    public String getSourceUserScreenName()
    {
        return sourceUserScreenName;
    }

    public long getTargetUserId()
    {
        return targetUserId;
    }

    public String getTargetUserScreenName()
    {
        return targetUserScreenName;
    }

    public int hashCode()
    {
        int i1 = 1;
        int j1 = 0;
        int k1 = (int)(targetUserId ^ targetUserId >>> 32);
        int i;
        int j;
        int k;
        int l;
        int l1;
        if (targetUserScreenName != null)
        {
            i = targetUserScreenName.hashCode();
        } else
        {
            i = 0;
        }
        if (sourceBlockingTarget)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (sourceNotificationsEnabled)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (sourceFollowingTarget)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (!sourceFollowedByTarget)
        {
            i1 = 0;
        }
        l1 = (int)(sourceUserId ^ sourceUserId >>> 32);
        if (sourceUserScreenName != null)
        {
            j1 = sourceUserScreenName.hashCode();
        }
        return ((((((k1 * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + l1) * 31 + j1;
    }

    public boolean isSourceBlockingTarget()
    {
        return sourceBlockingTarget;
    }

    public boolean isSourceFollowedByTarget()
    {
        return sourceFollowedByTarget;
    }

    public boolean isSourceFollowingTarget()
    {
        return sourceFollowingTarget;
    }

    public boolean isSourceNotificationsEnabled()
    {
        return sourceNotificationsEnabled;
    }

    public boolean isTargetFollowedBySource()
    {
        return sourceFollowingTarget;
    }

    public boolean isTargetFollowingSource()
    {
        return sourceFollowedByTarget;
    }

    public String toString()
    {
        return "RelationshipJSONImpl{sourceUserId=" + sourceUserId + ", targetUserId=" + targetUserId + ", sourceUserScreenName='" + sourceUserScreenName + '\'' + ", targetUserScreenName='" + targetUserScreenName + '\'' + ", sourceFollowingTarget=" + sourceFollowingTarget + ", sourceFollowedByTarget=" + sourceFollowedByTarget + ", sourceNotificationsEnabled=" + sourceNotificationsEnabled + '}';
    }
}
