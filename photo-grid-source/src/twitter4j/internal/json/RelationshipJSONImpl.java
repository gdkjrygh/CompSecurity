// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, z_T4JInternalParseUtil, ResponseListImpl

class RelationshipJSONImpl extends TwitterResponseImpl
    implements Serializable, Relationship
{

    private static final long serialVersionUID = 0x6b34ca39712b59e8L;
    private final boolean sourceBlockingTarget;
    private final boolean sourceCanDm;
    private final boolean sourceFollowedByTarget;
    private final boolean sourceFollowingTarget;
    private final boolean sourceNotificationsEnabled;
    private final long sourceUserId;
    private final String sourceUserScreenName;
    private final long targetUserId;
    private final String targetUserScreenName;
    private boolean wantRetweets;

    RelationshipJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        this(httpresponse, httpresponse.asJSONObject());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asJSONObject());
        }
    }

    RelationshipJSONImpl(HttpResponse httpresponse, JSONObject jsonobject)
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
            sourceCanDm = z_T4JInternalParseUtil.getBoolean("can_dm", httpresponse);
            sourceNotificationsEnabled = z_T4JInternalParseUtil.getBoolean("notifications_enabled", httpresponse);
            wantRetweets = z_T4JInternalParseUtil.getBoolean("want_retweets", httpresponse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException((new StringBuilder()).append(httpresponse.getMessage()).append(":").append(jsonobject.toString()).toString(), httpresponse);
        }
    }

    RelationshipJSONImpl(JSONObject jsonobject)
    {
        this(null, jsonobject);
    }

    static ResponseList createRelationshipList(HttpResponse httpresponse, Configuration configuration)
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

    public boolean canSourceDm()
    {
        return sourceCanDm;
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
        int j1 = 1;
        int k1 = 0;
        int l1 = (int)(targetUserId ^ targetUserId >>> 32);
        int i;
        int j;
        int k;
        int l;
        int i1;
        int i2;
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
        if (sourceFollowedByTarget)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!sourceCanDm)
        {
            j1 = 0;
        }
        i2 = (int)(sourceUserId ^ sourceUserId >>> 32);
        if (sourceUserScreenName != null)
        {
            k1 = sourceUserScreenName.hashCode();
        }
        return (((i1 + (l + (k + (j + (i + l1 * 31) * 31) * 31) * 31) * 31) * 31 + j1) * 31 + i2) * 31 + k1;
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

    public boolean isSourceWantRetweets()
    {
        return wantRetweets;
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
        return (new StringBuilder("RelationshipJSONImpl{sourceUserId=")).append(sourceUserId).append(", targetUserId=").append(targetUserId).append(", sourceUserScreenName='").append(sourceUserScreenName).append('\'').append(", targetUserScreenName='").append(targetUserScreenName).append('\'').append(", sourceFollowingTarget=").append(sourceFollowingTarget).append(", sourceFollowedByTarget=").append(sourceFollowedByTarget).append(", sourceCanDm=").append(sourceCanDm).append(", sourceNotificationsEnabled=").append(sourceNotificationsEnabled).append('}').toString();
    }
}
