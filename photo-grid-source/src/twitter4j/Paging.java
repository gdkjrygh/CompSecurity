// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.internal.http.HttpParameter;

public final class Paging
    implements Serializable
{

    static final String COUNT = "count";
    private static HttpParameter NULL_PARAMETER_ARRAY[] = new HttpParameter[0];
    private static List NULL_PARAMETER_LIST = new ArrayList(0);
    static final String PER_PAGE = "per_page";
    static char S[] = {
        's'
    };
    static char SMCP[] = {
        's', 'm', 'c', 'p'
    };
    private static final long serialVersionUID = 0xd2664a1415d9dfc2L;
    private int count;
    private long maxId;
    private int page;
    private long sinceId;

    public Paging()
    {
        page = -1;
        count = -1;
        sinceId = -1L;
        maxId = -1L;
    }

    public Paging(int i)
    {
        page = -1;
        count = -1;
        sinceId = -1L;
        maxId = -1L;
        setPage(i);
    }

    public Paging(int i, int j)
    {
        this(i);
        setCount(j);
    }

    public Paging(int i, int j, long l)
    {
        this(i, j);
        setSinceId(l);
    }

    public Paging(int i, int j, long l, long l1)
    {
        this(i, j, l);
        setMaxId(l1);
    }

    public Paging(int i, long l)
    {
        this(i);
        setSinceId(l);
    }

    public Paging(long l)
    {
        page = -1;
        count = -1;
        sinceId = -1L;
        maxId = -1L;
        setSinceId(l);
    }

    private void addPostParameter(char ac[], char c, List list, String s, long l)
    {
        boolean flag1 = false;
        int j = ac.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (ac[i] != c)
                    {
                        break label1;
                    }
                    flag = true;
                }
                if (!flag && -1L != l)
                {
                    throw new IllegalStateException((new StringBuilder("Paging parameter [")).append(s).append("] is not supported with this operation.").toString());
                }
                break label0;
            }
            i++;
        } while (true);
        if (-1L != l)
        {
            list.add(new HttpParameter(s, String.valueOf(l)));
        }
    }

    final HttpParameter[] asPostParameterArray()
    {
        List list = asPostParameterList(SMCP, "count");
        if (list.size() == 0)
        {
            return NULL_PARAMETER_ARRAY;
        } else
        {
            return (HttpParameter[])list.toArray(new HttpParameter[list.size()]);
        }
    }

    final HttpParameter[] asPostParameterArray(char ac[], String s)
    {
        ArrayList arraylist = new ArrayList(ac.length);
        addPostParameter(ac, 's', arraylist, "since_id", getSinceId());
        addPostParameter(ac, 'm', arraylist, "max_id", getMaxId());
        addPostParameter(ac, 'c', arraylist, s, getCount());
        addPostParameter(ac, 'p', arraylist, "page", getPage());
        if (arraylist.size() == 0)
        {
            return NULL_PARAMETER_ARRAY;
        } else
        {
            return (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()]);
        }
    }

    final List asPostParameterList()
    {
        return asPostParameterList(SMCP, "count");
    }

    final List asPostParameterList(char ac[])
    {
        return asPostParameterList(ac, "count");
    }

    final List asPostParameterList(char ac[], String s)
    {
        ArrayList arraylist = new ArrayList(ac.length);
        addPostParameter(ac, 's', arraylist, "since_id", getSinceId());
        addPostParameter(ac, 'm', arraylist, "max_id", getMaxId());
        addPostParameter(ac, 'c', arraylist, s, getCount());
        addPostParameter(ac, 'p', arraylist, "page", getPage());
        ac = arraylist;
        if (arraylist.size() == 0)
        {
            ac = NULL_PARAMETER_LIST;
        }
        return ac;
    }

    public final Paging count(int i)
    {
        setCount(i);
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Paging))
            {
                return false;
            }
            obj = (Paging)obj;
            if (count != ((Paging) (obj)).count)
            {
                return false;
            }
            if (maxId != ((Paging) (obj)).maxId)
            {
                return false;
            }
            if (page != ((Paging) (obj)).page)
            {
                return false;
            }
            if (sinceId != ((Paging) (obj)).sinceId)
            {
                return false;
            }
        }
        return true;
    }

    public final int getCount()
    {
        return count;
    }

    public final long getMaxId()
    {
        return maxId;
    }

    public final int getPage()
    {
        return page;
    }

    public final long getSinceId()
    {
        return sinceId;
    }

    public final int hashCode()
    {
        return ((page * 31 + count) * 31 + (int)(sinceId ^ sinceId >>> 32)) * 31 + (int)(maxId ^ maxId >>> 32);
    }

    public final Paging maxId(long l)
    {
        setMaxId(l);
        return this;
    }

    public final void setCount(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("count should be positive integer. passed:")).append(i).toString());
        } else
        {
            count = i;
            return;
        }
    }

    public final void setMaxId(long l)
    {
        if (l < 1L)
        {
            throw new IllegalArgumentException((new StringBuilder("max_id should be positive integer. passed:")).append(l).toString());
        } else
        {
            maxId = l;
            return;
        }
    }

    public final void setPage(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("page should be positive integer. passed:")).append(i).toString());
        } else
        {
            page = i;
            return;
        }
    }

    public final void setSinceId(long l)
    {
        if (l < 1L)
        {
            throw new IllegalArgumentException((new StringBuilder("since_id should be positive integer. passed:")).append(l).toString());
        } else
        {
            sinceId = l;
            return;
        }
    }

    public final Paging sinceId(long l)
    {
        setSinceId(l);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Paging{page=")).append(page).append(", count=").append(count).append(", sinceId=").append(sinceId).append(", maxId=").append(maxId).append('}').toString();
    }

}
