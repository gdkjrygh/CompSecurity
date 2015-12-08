// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.TwitterException;
import twitter4j.UserMentionEntity;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            EntityIndex, z_T4JInternalParseUtil

class UserMentionEntityJSONImpl extends EntityIndex
    implements UserMentionEntity
{

    private static final long serialVersionUID = 0x5b5263422916aeb6L;
    private long id;
    private String name;
    private String screenName;

    UserMentionEntityJSONImpl()
    {
    }

    UserMentionEntityJSONImpl(int i, int j, String s, String s1, long l)
    {
        setStart(i);
        setEnd(j);
        name = s;
        screenName = s1;
        id = l;
    }

    UserMentionEntityJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = jsonobject.getJSONArray("indices");
            setStart(jsonarray.getInt(0));
            setEnd(jsonarray.getInt(1));
            if (!jsonobject.isNull("name"))
            {
                name = jsonobject.getString("name");
            }
            if (!jsonobject.isNull("screen_name"))
            {
                screenName = jsonobject.getString("screen_name");
            }
            id = z_T4JInternalParseUtil.getLong("id", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UserMentionEntityJSONImpl)obj;
            if (id != ((UserMentionEntityJSONImpl) (obj)).id)
            {
                return false;
            }
            if (name == null ? ((UserMentionEntityJSONImpl) (obj)).name != null : !name.equals(((UserMentionEntityJSONImpl) (obj)).name))
            {
                return false;
            }
            if (screenName == null ? ((UserMentionEntityJSONImpl) (obj)).screenName != null : !screenName.equals(((UserMentionEntityJSONImpl) (obj)).screenName))
            {
                return false;
            }
        }
        return true;
    }

    public int getEnd()
    {
        return super.getEnd();
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getScreenName()
    {
        return screenName;
    }

    public int getStart()
    {
        return super.getStart();
    }

    public String getText()
    {
        return screenName;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (screenName != null)
        {
            j = screenName.hashCode();
        }
        return (i * 31 + j) * 31 + (int)(id ^ id >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder("UserMentionEntityJSONImpl{name='")).append(name).append('\'').append(", screenName='").append(screenName).append('\'').append(", id=").append(id).append('}').toString();
    }
}
