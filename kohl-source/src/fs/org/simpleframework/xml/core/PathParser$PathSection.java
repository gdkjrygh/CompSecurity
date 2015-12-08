// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Expression, PathParser

private class end
    implements Expression
{

    private int begin;
    private List cache;
    private int end;
    private String path;
    private String section;
    final PathParser this$0;

    private String getCanonicalPath()
    {
        int i = 0;
        int j;
        for (j = 0; j < begin; j++)
        {
            i = PathParser.access$600(PathParser.this).indexOf('/', i + 1);
        }

        int l = i;
        int k = j;
        j = l;
        for (; k <= end; k++)
        {
            int i1 = PathParser.access$600(PathParser.this).indexOf('/', j + 1);
            j = i1;
            if (i1 == -1)
            {
                j = PathParser.access$600(PathParser.this).length();
            }
        }

        return PathParser.access$600(PathParser.this).substring(i + 1, j);
    }

    private String getFragment()
    {
        int i = PathParser.access$700(PathParser.this);
        int i1 = 0;
        int j = 0;
        do
        {
label0:
            {
                int k = i;
                if (j <= end)
                {
                    if (i < PathParser.access$800(PathParser.this))
                    {
                        break label0;
                    }
                    k = i + 1;
                }
                return new String(PathParser.access$900(PathParser.this), i1, k - 1 - i1);
            }
            char ac[] = PathParser.access$900(PathParser.this);
            int l = i + 1;
            int j1 = j;
            if (ac[i] == '/')
            {
                j++;
                j1 = j;
                if (j == begin)
                {
                    i1 = l;
                    i = l;
                    continue;
                }
            }
            i = l;
            j = j1;
        } while (true);
    }

    public String getAttribute(String s)
    {
        String s2 = getPath();
        String s1 = s;
        if (s2 != null)
        {
            s1 = PathParser.access$300(PathParser.this, s2, s);
        }
        return s1;
    }

    public String getElement(String s)
    {
        String s2 = getPath();
        String s1 = s;
        if (s2 != null)
        {
            s1 = PathParser.access$200(PathParser.this, s2, s);
        }
        return s1;
    }

    public String getFirst()
    {
        return (String)PathParser.access$100(PathParser.this).get(begin);
    }

    public int getIndex()
    {
        return ((Integer)PathParser.access$400(PathParser.this).get(begin)).intValue();
    }

    public String getLast()
    {
        return (String)PathParser.access$100(PathParser.this).get(end);
    }

    public Expression getPath(int i)
    {
        return getPath(i, 0);
    }

    public Expression getPath(int i, int j)
    {
        return new <init>(begin + i, end - j);
    }

    public String getPath()
    {
        if (section == null)
        {
            section = getCanonicalPath();
        }
        return section;
    }

    public String getPrefix()
    {
        return (String)PathParser.access$500(PathParser.this).get(begin);
    }

    public boolean isAttribute()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (PathParser.access$000(PathParser.this))
        {
            flag = flag1;
            if (end >= PathParser.access$100(PathParser.this).size() - 1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean isEmpty()
    {
        return begin == end;
    }

    public boolean isPath()
    {
        return end - begin >= 1;
    }

    public Iterator iterator()
    {
        if (cache.isEmpty())
        {
            for (int i = begin; i <= end; i++)
            {
                String s = (String)PathParser.access$100(PathParser.this).get(i);
                if (s != null)
                {
                    cache.add(s);
                }
            }

        }
        return cache.iterator();
    }

    public String toString()
    {
        if (path == null)
        {
            path = getFragment();
        }
        return path;
    }

    public (int i, int j)
    {
        this$0 = PathParser.this;
        super();
        cache = new ArrayList();
        begin = i;
        end = j;
    }
}
