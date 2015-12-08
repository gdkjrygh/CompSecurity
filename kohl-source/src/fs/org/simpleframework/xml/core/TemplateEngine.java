// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.filter.Filter;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Template

class TemplateEngine
{

    private Filter filter;
    private Template name;
    private int off;
    private Template source;
    private Template text;

    public TemplateEngine(Filter filter1)
    {
        source = new Template();
        name = new Template();
        text = new Template();
        filter = filter1;
    }

    private void name()
    {
        do
        {
            char c;
label0:
            {
                if (off < source.count)
                {
                    char ac[] = source.buf;
                    int i = off;
                    off = i + 1;
                    c = ac[i];
                    if (c != '}')
                    {
                        break label0;
                    }
                    replace();
                }
                if (name.length() > 0)
                {
                    text.append("${");
                    text.append(name);
                }
                return;
            }
            name.append(c);
        } while (true);
    }

    private void parse()
    {
        do
        {
            if (off >= source.count)
            {
                break;
            }
            char ac[] = source.buf;
            int i = off;
            off = i + 1;
            char c = ac[i];
            if (c == '$' && off < source.count)
            {
                char ac1[] = source.buf;
                int j = off;
                off = j + 1;
                if (ac1[j] == '{')
                {
                    name();
                    continue;
                }
                off = off - 1;
            }
            text.append(c);
        } while (true);
    }

    private void replace()
    {
        if (name.length() > 0)
        {
            replace(name);
        }
        name.clear();
    }

    private void replace(Template template)
    {
        replace(template.toString());
    }

    private void replace(String s)
    {
        String s1 = filter.replace(s);
        if (s1 == null)
        {
            text.append("${");
            text.append(s);
            text.append("}");
            return;
        } else
        {
            text.append(s1);
            return;
        }
    }

    public void clear()
    {
        name.clear();
        text.clear();
        source.clear();
        off = 0;
    }

    public String process(String s)
    {
        if (s.indexOf('$') < 0)
        {
            return s;
        }
        source.append(s);
        parse();
        s = text.toString();
        clear();
        return s;
        s;
        clear();
        throw s;
    }
}
