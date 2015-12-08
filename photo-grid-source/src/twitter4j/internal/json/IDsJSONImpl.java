// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.Arrays;
import twitter4j.IDs;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, z_T4JInternalParseUtil

final class IDsJSONImpl extends TwitterResponseImpl
    implements IDs
{

    private static final long serialVersionUID = 0xa49d493b84decd47L;
    private long ids[];
    private long nextCursor;
    private long previousCursor;

    IDsJSONImpl(String s)
    {
        previousCursor = -1L;
        nextCursor = -1L;
        init(s);
    }

    IDsJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        super(httpresponse);
        previousCursor = -1L;
        nextCursor = -1L;
        httpresponse = httpresponse.asString();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    private void init(String s)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        JSONArray jsonarray;
        if (!s.startsWith("{"))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s = new JSONObject(s);
        jsonarray = s.getJSONArray("ids");
        ids = new long[jsonarray.length()];
_L1:
        j = jsonarray.length();
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        ids[i] = Long.parseLong(jsonarray.getString(i));
        i++;
          goto _L1
        NumberFormatException numberformatexception;
        numberformatexception;
        try
        {
            throw new TwitterException((new StringBuilder("Twitter API returned malformed response: ")).append(s).toString(), numberformatexception);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        previousCursor = z_T4JInternalParseUtil.getLong("previous_cursor", s);
        nextCursor = z_T4JInternalParseUtil.getLong("next_cursor", s);
        return;
        s = new JSONArray(s);
        ids = new long[s.length()];
        i = j;
_L2:
        j = s.length();
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        ids[i] = Long.parseLong(s.getString(i));
        i++;
          goto _L2
        numberformatexception;
        throw new TwitterException((new StringBuilder("Twitter API returned malformed response: ")).append(s).toString(), numberformatexception);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof IDs))
            {
                return false;
            }
            obj = (IDs)obj;
            if (!Arrays.equals(ids, ((IDs) (obj)).getIDs()))
            {
                return false;
            }
        }
        return true;
    }

    public final long[] getIDs()
    {
        return ids;
    }

    public final long getNextCursor()
    {
        return nextCursor;
    }

    public final long getPreviousCursor()
    {
        return previousCursor;
    }

    public final boolean hasNext()
    {
        return 0L != nextCursor;
    }

    public final boolean hasPrevious()
    {
        return 0L != previousCursor;
    }

    public final int hashCode()
    {
        if (ids != null)
        {
            return Arrays.hashCode(ids);
        } else
        {
            return 0;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("IDsJSONImpl{ids=")).append(Arrays.toString(ids)).append(", previousCursor=").append(previousCursor).append(", nextCursor=").append(nextCursor).append('}').toString();
    }
}
