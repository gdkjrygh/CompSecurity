// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, Relationship, TwitterException, JSONException, 
//            JSONObject, ParseUtil, HttpResponse, TwitterObjectFactory, 
//            JSONArray, ResponseListImpl, ResponseList

class RelationshipJSONImpl extends TwitterResponseImpl
    implements Serializable, Relationship
{

    private static final long serialVersionUID = 0xe4394c672b0c23e0L;
    private final boolean sourceBlockingTarget;
    private final boolean sourceCanDm;
    private final boolean sourceFollowedByTarget;
    private final boolean sourceFollowingTarget;
    private final boolean sourceMutingTarget;
    private final boolean sourceNotificationsEnabled;
    private final long sourceUserId;
    private final String sourceUserScreenName;
    private final long targetUserId;
    private final String targetUserScreenName;
    private boolean wantRetweets;

    RelationshipJSONImpl(HttpResponse httpresponse, JSONObject jsonobject)
        throws TwitterException
    {
        super(httpresponse);
        try
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("relationship");
            httpresponse = jsonobject1.getJSONObject("source");
            jsonobject1 = jsonobject1.getJSONObject("target");
            sourceUserId = ParseUtil.getLong("id", httpresponse);
            targetUserId = ParseUtil.getLong("id", jsonobject1);
            sourceUserScreenName = ParseUtil.getUnescapedString("screen_name", httpresponse);
            targetUserScreenName = ParseUtil.getUnescapedString("screen_name", jsonobject1);
            sourceBlockingTarget = ParseUtil.getBoolean("blocking", httpresponse);
            sourceFollowingTarget = ParseUtil.getBoolean("following", httpresponse);
            sourceFollowedByTarget = ParseUtil.getBoolean("followed_by", httpresponse);
            sourceCanDm = ParseUtil.getBoolean("can_dm", httpresponse);
            sourceMutingTarget = ParseUtil.getBoolean("muting", httpresponse);
            sourceNotificationsEnabled = ParseUtil.getBoolean("notifications_enabled", httpresponse);
            wantRetweets = ParseUtil.getBoolean("want_retweets", httpresponse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException((new StringBuilder()).append(httpresponse.getMessage()).append(":").append(jsonobject.toString()).toString(), httpresponse);
        }
    }

    RelationshipJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        this(httpresponse, httpresponse.asJSONObject());
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, httpresponse.asJSONObject());
        }
    }

    RelationshipJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        this(null, jsonobject);
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
                TwitterObjectFactory.clearThreadLocalMap();
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
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        relationshipjsonimpl = new RelationshipJSONImpl(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(relationshipjsonimpl, jsonobject);
        }
        httpresponse.add(relationshipjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
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
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RelationshipJSONImpl)obj;
            if (sourceBlockingTarget != ((RelationshipJSONImpl) (obj)).sourceBlockingTarget)
            {
                return false;
            }
            if (sourceCanDm != ((RelationshipJSONImpl) (obj)).sourceCanDm)
            {
                return false;
            }
            if (sourceFollowedByTarget != ((RelationshipJSONImpl) (obj)).sourceFollowedByTarget)
            {
                return false;
            }
            if (sourceFollowingTarget != ((RelationshipJSONImpl) (obj)).sourceFollowingTarget)
            {
                return false;
            }
            if (sourceMutingTarget != ((RelationshipJSONImpl) (obj)).sourceMutingTarget)
            {
                return false;
            }
            if (sourceNotificationsEnabled != ((RelationshipJSONImpl) (obj)).sourceNotificationsEnabled)
            {
                return false;
            }
            if (sourceUserId != ((RelationshipJSONImpl) (obj)).sourceUserId)
            {
                return false;
            }
            if (targetUserId != ((RelationshipJSONImpl) (obj)).targetUserId)
            {
                return false;
            }
            if (wantRetweets != ((RelationshipJSONImpl) (obj)).wantRetweets)
            {
                return false;
            }
            if (sourceUserScreenName == null ? ((RelationshipJSONImpl) (obj)).sourceUserScreenName != null : !sourceUserScreenName.equals(((RelationshipJSONImpl) (obj)).sourceUserScreenName))
            {
                return false;
            }
            if (targetUserScreenName == null ? ((RelationshipJSONImpl) (obj)).targetUserScreenName != null : !targetUserScreenName.equals(((RelationshipJSONImpl) (obj)).targetUserScreenName))
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
        int i2 = 1;
        int j2 = (int)(targetUserId ^ targetUserId >>> 32);
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int k2;
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
        if (sourceCanDm)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (sourceMutingTarget)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        k2 = (int)(sourceUserId ^ sourceUserId >>> 32);
        if (sourceUserScreenName != null)
        {
            l1 = sourceUserScreenName.hashCode();
        } else
        {
            l1 = 0;
        }
        if (!wantRetweets)
        {
            i2 = 0;
        }
        return (l1 + ((k1 + (j1 + (i1 + (l + (k + (j + (i + j2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2) * 31) * 31 + i2;
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

    public boolean isSourceMutingTarget()
    {
        return sourceMutingTarget;
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
        return (new StringBuilder()).append("RelationshipJSONImpl{targetUserId=").append(targetUserId).append(", targetUserScreenName='").append(targetUserScreenName).append('\'').append(", sourceBlockingTarget=").append(sourceBlockingTarget).append(", sourceNotificationsEnabled=").append(sourceNotificationsEnabled).append(", sourceFollowingTarget=").append(sourceFollowingTarget).append(", sourceFollowedByTarget=").append(sourceFollowedByTarget).append(", sourceCanDm=").append(sourceCanDm).append(", sourceMutingTarget=").append(sourceMutingTarget).append(", sourceUserId=").append(sourceUserId).append(", sourceUserScreenName='").append(sourceUserScreenName).append('\'').append(", wantRetweets=").append(wantRetweets).append('}').toString();
    }
}
