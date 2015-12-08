// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

protected static class delimiter
{

    private String delimiter;
    private int limit;
    private boolean removeEmpties;
    private String string;
    private boolean unescape;

    public delimiter limit(int i)
    {
        limit = i;
        return this;
    }

    public limit removeEmpties(boolean flag)
    {
        removeEmpties = flag;
        return this;
    }

    public List split()
    {
        String as[] = string.split((new StringBuilder()).append("\\s*(?<!\\\\)").append(Pattern.quote(delimiter)).append("\\s*").toString(), limit);
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            if (s1.length() != 0 || !removeEmpties)
            {
                String s = s1;
                if (unescape)
                {
                    s = VCardPropertyScribe.unescape(s1);
                }
                arraylist.add(s);
            }
            i++;
        }
        return arraylist;
    }

    public unescape unescape(boolean flag)
    {
        unescape = flag;
        return this;
    }

    public (String s, String s1)
    {
        removeEmpties = false;
        unescape = false;
        limit = -1;
        string = s;
        delimiter = s1;
    }
}
