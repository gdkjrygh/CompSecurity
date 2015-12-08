// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.HashtagEntity;
import twitter4j.SymbolEntity;
import twitter4j.TwitterException;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            EntityIndex

class HashtagEntityJSONImpl extends EntityIndex
    implements HashtagEntity, SymbolEntity
{

    private static final long serialVersionUID = 0x3877f7012d9cd490L;
    private String text;

    HashtagEntityJSONImpl()
    {
    }

    HashtagEntityJSONImpl(int i, int j, String s)
    {
        setStart(i);
        setEnd(j);
        text = s;
    }

    HashtagEntityJSONImpl(JSONObject jsonobject)
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
            if (text == null ? ((HashtagEntityJSONImpl) (obj)).text != null : !text.equals(((HashtagEntityJSONImpl) (obj)).text))
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

    public int getStart()
    {
        return super.getStart();
    }

    public String getText()
    {
        return text;
    }

    public int hashCode()
    {
        if (text != null)
        {
            return text.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return (new StringBuilder("HashtagEntityJSONImpl{text='")).append(text).append('\'').append('}').toString();
    }
}
