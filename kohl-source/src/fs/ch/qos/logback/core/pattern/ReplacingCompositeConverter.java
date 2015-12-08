// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package fs.ch.qos.logback.core.pattern:
//            CompositeConverter

public class ReplacingCompositeConverter extends CompositeConverter
{

    Pattern pattern;
    String regex;
    String replacement;

    public ReplacingCompositeConverter()
    {
    }

    public void start()
    {
        List list = getOptionList();
        if (list == null)
        {
            addError("at least two options are expected whereas you have declared none");
            return;
        }
        int i = list.size();
        if (i < 2)
        {
            addError((new StringBuilder()).append("at least two options are expected whereas you have declared only ").append(i).append("as [").append(list).append("]").toString());
            return;
        } else
        {
            regex = (String)list.get(0);
            pattern = Pattern.compile(regex);
            replacement = (String)list.get(1);
            super.start();
            return;
        }
    }

    protected String transform(Object obj, String s)
    {
        if (!started)
        {
            return s;
        } else
        {
            return pattern.matcher(s).replaceAll(replacement);
        }
    }
}
