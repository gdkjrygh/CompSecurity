// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.HashtagEntity;
import twitter4j.TwitterException;

class HashtagEntityJSONImpl
    implements HashtagEntity
{

    private static final long serialVersionUID = 0x3877f7012d9cd490L;
    private int end;
    private int start;
    private String text;

    HashtagEntityJSONImpl(JSONObject jsonobject)
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
            if (!jsonobject.isNull("text"))
            {
                text = jsonobject.getString("text");
            }
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
            obj = (HashtagEntityJSONImpl)obj;
            if (end != ((HashtagEntityJSONImpl) (obj)).end)
            {
                return false;
            }
            if (start != ((HashtagEntityJSONImpl) (obj)).start)
            {
                return false;
            }
            if (text == null ? ((HashtagEntityJSONImpl) (obj)).text != null : !text.equals(((HashtagEntityJSONImpl) (obj)).text))
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

    public int getStart()
    {
        return start;
    }

    public String getText()
    {
        return text;
    }

    public int hashCode()
    {
        int j = start;
        int k = end;
        int i;
        if (text != null)
        {
            i = text.hashCode();
        } else
        {
            i = 0;
        }
        return (j * 31 + k) * 31 + i;
    }

    public String toString()
    {
        return "HashtagEntityJSONImpl{start=" + start + ", end=" + end + ", text='" + text + '\'' + '}';
    }
}
