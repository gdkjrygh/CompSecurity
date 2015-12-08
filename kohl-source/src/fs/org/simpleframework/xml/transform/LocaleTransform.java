// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.util.Locale;
import java.util.regex.Pattern;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform, InvalidFormatException

class LocaleTransform
    implements Transform
{

    private final Pattern pattern = Pattern.compile("_");

    public LocaleTransform()
    {
    }

    private Locale read(String as[])
        throws Exception
    {
        String as1[] = new String[3];
        as1[0] = "";
        as1[1] = "";
        as1[2] = "";
        for (int i = 0; i < as1.length; i++)
        {
            if (i < as.length)
            {
                as1[i] = as[i];
            }
        }

        return new Locale(as1[0], as1[1], as1[2]);
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public Locale read(String s)
        throws Exception
    {
        String as[] = pattern.split(s);
        if (as.length < 1)
        {
            throw new InvalidFormatException("Invalid locale %s", new Object[] {
                s
            });
        } else
        {
            return read(as);
        }
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Locale)obj);
    }

    public String write(Locale locale)
    {
        return locale.toString();
    }
}
