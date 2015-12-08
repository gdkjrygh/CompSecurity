// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.util.regex.Pattern;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class StringArrayTransform
    implements Transform
{

    private final Pattern pattern;
    private final String token;

    public StringArrayTransform()
    {
        this(",");
    }

    public StringArrayTransform(String s)
    {
        pattern = Pattern.compile(s);
        token = s;
    }

    private String[] read(String s, String s1)
    {
        s = pattern.split(s);
        for (int i = 0; i < s.length; i++)
        {
            s1 = s[i];
            if (s1 != null)
            {
                s[i] = s1.trim();
            }
        }

        return s;
    }

    private String write(String as[], String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < as.length; i++)
        {
            String s1 = as[i];
            if (s1 == null)
            {
                continue;
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(s);
                stringbuilder.append(' ');
            }
            stringbuilder.append(s1);
        }

        return stringbuilder.toString();
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public String[] read(String s)
    {
        return read(s, token);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((String[])obj);
    }

    public String write(String as[])
    {
        return write(as, token);
    }
}
