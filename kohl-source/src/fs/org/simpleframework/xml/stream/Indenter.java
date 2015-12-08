// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Format

class Indenter
{
    private class Cache
    {

        private int count;
        private String list[];
        final Indenter this$0;

        private void resize(int i)
        {
            String as[] = new String[i];
            for (i = 0; i < list.length; i++)
            {
                as[i] = list[i];
            }

            list = as;
        }

        public String get(int i)
        {
            if (i < list.length)
            {
                return list[i];
            } else
            {
                return null;
            }
        }

        public void set(int i, String s)
        {
            if (i >= list.length)
            {
                resize(i * 2);
            }
            if (i > count)
            {
                count = i;
            }
            list[i] = s;
        }

        public int size()
        {
            return count;
        }

        public Cache(int i)
        {
            this$0 = Indenter.this;
            super();
            list = new String[i];
        }
    }


    private Cache cache;
    private int count;
    private int indent;
    private int index;

    public Indenter()
    {
        this(new Format());
    }

    public Indenter(Format format)
    {
        this(format, 16);
    }

    private Indenter(Format format, int i)
    {
        indent = format.getIndent();
        cache = new Cache(i);
    }

    private String create()
    {
        char ac[] = new char[count + 1];
        if (count > 0)
        {
            ac[0] = '\n';
            for (int i = 1; i <= count; i++)
            {
                ac[i] = ' ';
            }

            return new String(ac);
        } else
        {
            return "\n";
        }
    }

    private String indent(int i)
    {
        if (indent > 0)
        {
            String s1 = cache.get(i);
            String s = s1;
            if (s1 == null)
            {
                s = create();
                cache.set(i, s);
            }
            if (cache.size() > 0)
            {
                return s;
            }
        }
        return "";
    }

    public String pop()
    {
        int i = index - 1;
        index = i;
        String s = indent(i);
        if (indent > 0)
        {
            count = count - indent;
        }
        return s;
    }

    public String push()
    {
        int i = index;
        index = i + 1;
        String s = indent(i);
        if (indent > 0)
        {
            count = count + indent;
        }
        return s;
    }

    public String top()
    {
        return indent(index);
    }
}
