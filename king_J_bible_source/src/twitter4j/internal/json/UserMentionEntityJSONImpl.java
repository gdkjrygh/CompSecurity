// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.TwitterException;
import twitter4j.UserMentionEntity;
import twitter4j.internal.util.z_T4JInternalParseUtil;

class UserMentionEntityJSONImpl
    implements UserMentionEntity
{

    private static final long serialVersionUID = 0x5b5263422916aeb6L;
    private int end;
    private long id;
    private String name;
    private String screenName;
    private int start;

    UserMentionEntityJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        start = -1;
        end = -1;
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        try
        {
            JSONArray jsonarray = jsonobject.getJSONArray("indices");
            start = jsonarray.getInt(0);
            end = jsonarray.getInt(1);
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
            if (end != ((UserMentionEntityJSONImpl) (obj)).end)
            {
                return false;
            }
            if (id != ((UserMentionEntityJSONImpl) (obj)).id)
            {
                return false;
            }
            if (start != ((UserMentionEntityJSONImpl) (obj)).start)
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
        return end;
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
        return start;
    }

    public int hashCode()
    {
        int j = 0;
        int k = start;
        int l = end;
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
        return (((k * 31 + l) * 31 + i) * 31 + j) * 31 + (int)(id ^ id >>> 32);
    }

    public String toString()
    {
        return "UserMentionEntityJSONImpl{start=" + start + ", end=" + end + ", name='" + name + '\'' + ", screenName='" + screenName + '\'' + ", id=" + id + '}';
    }
}
