// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            EntityIndex, HashtagEntity, SymbolEntity, TwitterException, 
//            JSONException, JSONObject, JSONArray

class HashtagEntityJSONImpl extends EntityIndex
    implements HashtagEntity, SymbolEntity
{

    private static final long serialVersionUID = 0xb63346b4f95b6876L;
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
        throws TwitterException
    {
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
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
        return (new StringBuilder()).append("HashtagEntityJSONImpl{text='").append(text).append('\'').append('}').toString();
    }
}
