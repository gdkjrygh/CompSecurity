// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


class Template
{

    protected char buf[];
    protected String cache;
    protected int count;

    public Template()
    {
        this(16);
    }

    public Template(int i)
    {
        buf = new char[i];
    }

    public void append(char c)
    {
        ensureCapacity(count + 1);
        char ac[] = buf;
        int i = count;
        count = i + 1;
        ac[i] = c;
    }

    public void append(Template template)
    {
        append(template.buf, 0, template.count);
    }

    public void append(String s)
    {
        ensureCapacity(count + s.length());
        s.getChars(0, s.length(), buf, count);
        count = count + s.length();
    }

    public void append(char ac[], int i, int j)
    {
        ensureCapacity(count + j);
        System.arraycopy(ac, i, buf, count, j);
        count = count + j;
    }

    public void clear()
    {
        cache = null;
        count = 0;
    }

    protected void ensureCapacity(int i)
    {
        if (buf.length < i)
        {
            char ac[] = new char[Math.max(i, buf.length * 2)];
            System.arraycopy(buf, 0, ac, 0, count);
            buf = ac;
        }
    }

    public int length()
    {
        return count;
    }

    public String toString()
    {
        return new String(buf, 0, count);
    }
}
