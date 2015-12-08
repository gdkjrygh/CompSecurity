// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

static final class lang.String
{

    private static final Pattern c = Pattern.compile("\\((.*?)\\)");
    private static final Pattern d = Pattern.compile("\\s+at\\s.+");
    String a;
    StackTraceElement b[];

    private lang.String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            a = "NO STACK TRACE PROVIDED";
        } else
        {
            a = s;
            String as[] = TextUtils.split(s, "\n");
            if (as.length > 1)
            {
                Object obj = null;
                s = null;
                ArrayList arraylist = new ArrayList();
                int i = 1;
                while (i < as.length) 
                {
                    if (!TextUtils.isEmpty(as[i]))
                    {
                        Object obj2 = as[i];
                        Object obj1 = c.matcher(((CharSequence) (obj2)));
                        if (!TextUtils.isEmpty(((CharSequence) (obj2))) && d.matcher(((CharSequence) (obj2))).matches() && ((Matcher) (obj1)).find())
                        {
                            obj2 = ((String) (obj2)).replaceFirst("\\s+at\\s+", "");
                            String s1 = ((Matcher) (obj1)).group();
                            obj2 = ((String) (obj2)).replace(s1, "");
                            if (TextUtils.isEmpty(((CharSequence) (obj2))))
                            {
                                obj1 = new String[0];
                            } else
                            {
                                obj1 = ((String) (obj2)).split("\\.");
                            }
                            if (obj1.length == 1)
                            {
                                obj1 = "";
                            } else
                            if (obj1.length >= 2)
                            {
                                obj1 = obj1[obj1.length - 1];
                                obj2 = ((String) (obj2)).substring(0, ((String) (obj2)).length() - ((String) (obj1)).length() - 1);
                            } else
                            {
                                obj1 = "";
                                obj2 = "";
                            }
                            obj1 = Pair.create(obj2, obj1);
                            obj2 = b(s1);
                            obj1 = new StackTraceElement((String)((Pair) (obj1)).first, (String)((Pair) (obj1)).second, (String)((Pair) (obj2)).first, ((Integer)((Pair) (obj2)).second).intValue());
                        } else
                        {
                            obj1 = new StackTraceElement(((String) (obj2)), "", null, -1);
                        }
                        if (obj == null && as[i].contains("com.snapchat"))
                        {
                            obj = obj1;
                        }
                        if (s == null)
                        {
                            obj2 = as[i];
                            if (d.matcher(((CharSequence) (obj2))).matches())
                            {
                                s = ((String) (obj1));
                            }
                        }
                        arraylist.add(obj1);
                    }
                    i++;
                }
                obj1 = as[0];
                if (obj != null)
                {
                    obj = ((StackTraceElement) (obj)).toString();
                } else
                {
                    obj = obj1;
                    if (s != null)
                    {
                        obj = s.toString();
                    }
                }
                a = ((String) (obj));
                if (!arraylist.isEmpty())
                {
                    b = (StackTraceElement[])arraylist.toArray(new StackTraceElement[0]);
                    return this;
                } else
                {
                    b = null;
                    return this;
                }
            }
        }
        return this;
    }

    private static Pair b(String s)
    {
        Object obj;
        StringTokenizer stringtokenizer;
        int i;
        i = -1;
        obj = s;
        if (s.length() >= 2)
        {
            obj = s.substring(1, s.length() - 1);
        }
        stringtokenizer = new StringTokenizer(((String) (obj)), ":~");
        if (stringtokenizer.countTokens() != 2) goto _L2; else goto _L1
_L1:
        s = stringtokenizer.nextToken();
        obj = stringtokenizer.nextToken();
        int j;
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(((CharSequence) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((NumberFormatException) (obj)).printStackTrace();
            continue; /* Loop/switch isn't completed */
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        return Pair.create(s, Integer.valueOf(i));
_L4:
        j = Integer.parseInt(((String) (obj)));
        i = j;
        continue; /* Loop/switch isn't completed */
_L2:
        s = ((String) (obj));
        if ("Native Method".equalsIgnoreCase(((String) (obj))))
        {
            i = -2;
            s = ((String) (obj));
        }
        if (true) goto _L3; else goto _L5
_L5:
    }


    >()
    {
    }

    >(String s)
    {
        a(s);
    }
}
