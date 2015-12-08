// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package twitter4j:
//            HttpParameter

public final class Paging
    implements Serializable
{

    static final String COUNT = "count";
    private static final HttpParameter NULL_PARAMETER_ARRAY[] = new HttpParameter[0];
    private static final List NULL_PARAMETER_LIST = new ArrayList(0);
    static final String PER_PAGE = "per_page";
    static final char S[] = {
        's'
    };
    static final char SMCP[] = {
        's', 'm', 'c', 'p'
    };
    private static final long serialVersionUID = 0x9bb7aff3202b5151L;
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
                    throw new IllegalStateException((new StringBuilder()).append("Paging parameter [").append(s).append("] is not supported with this operation.").toString());
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

    HttpParameter[] asPostParameterArray()
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

    HttpParameter[] asPostParameterArray(char ac[], String s)
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

    List asPostParameterList()
    {
        return asPostParameterList(SMCP, "count");
    }

    List asPostParameterList(char ac[])
    {
        return asPostParameterList(ac, "count");
    }

    List asPostParameterList(char ac[], String s)
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

    public Paging count(int i)
    {
        setCount(i);
        return this;
    }

    public boolean equals(Object obj)
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

    public int getCount()
    {
        return count;
    }

    public long getMaxId()
    {
        return maxId;
    }

    public int getPage()
    {
        return page;
    }

    public long getSinceId()
    {
        return sinceId;
    }

    public int hashCode()
    {
        return ((page * 31 + count) * 31 + (int)(sinceId ^ sinceId >>> 32)) * 31 + (int)(maxId ^ maxId >>> 32);
    }

    public Paging maxId(long l)
    {
        setMaxId(l);
        return this;
    }

    public void setCount(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("count should be positive integer. passed:").append(i).toString());
        } else
        {
            count = i;
            return;
        }
    }

    public void setMaxId(long l)
    {
        if (l < 1L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("max_id should be positive integer. passed:").append(l).toString());
        } else
        {
            maxId = l;
            return;
        }
    }

    public void setPage(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("page should be positive integer. passed:").append(i).toString());
        } else
        {
            page = i;
            return;
        }
    }

    public void setSinceId(long l)
    {
        if (l < 1L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("since_id should be positive integer. passed:").append(l).toString());
        } else
        {
            sinceId = l;
            return;
        }
    }

    public Paging sinceId(long l)
    {
        setSinceId(l);
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Paging{page=").append(page).append(", count=").append(count).append(", sinceId=").append(sinceId).append(", maxId=").append(maxId).append('}').toString();
    }

}
