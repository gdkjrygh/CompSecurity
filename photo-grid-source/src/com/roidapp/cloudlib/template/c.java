// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import android.content.Context;
import android.text.format.DateFormat;
import com.roidapp.cloudlib.at;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{

    private Pattern a;

    public c()
    {
    }

    public final String a(Context context, String s)
    {
        StringBuilder stringbuilder;
        int i;
label0:
        {
            if (s != null)
            {
                if (a == null)
                {
                    a = Pattern.compile("\\$\\{TEXT_(.*?)\\}");
                }
                Matcher matcher = a.matcher(s);
                stringbuilder = new StringBuilder(s.length());
                i = 0;
                boolean flag = true;
                do
                {
                    if (!matcher.find())
                    {
                        break;
                    }
                    if (matcher.groupCount() > 0)
                    {
                        Object obj = matcher.group(1);
                        Object obj1;
                        if ("DATE".equals(obj))
                        {
                            obj = DateFormat.getDateFormat(context).format(new Date());
                        } else
                        if ("TIME".equals(obj))
                        {
                            obj = DateFormat.getTimeFormat(context).format(new Date());
                        } else
                        if ("WEEK".equals(obj))
                        {
                            obj = DateFormat.format("EEEE", new Date());
                        } else
                        if ("CITY".equals(obj))
                        {
                            obj = context.getString(at.aS);
                        } else
                        if ("PROVINCE".equals(obj))
                        {
                            obj = context.getString(at.aY);
                        } else
                        if ("COUNTRY".equals(obj))
                        {
                            obj = context.getString(at.aT);
                        } else
                        if ("TEMP".equals(obj))
                        {
                            obj = " 25";
                        } else
                        if ("AQI".equals(obj))
                        {
                            obj = "25";
                        } else
                        if ("WEATHER".equals(obj))
                        {
                            obj = "SUNNY";
                        } else
                        {
                            obj = null;
                        }
                        obj1 = obj;
                        if (obj == null)
                        {
                            obj1 = "";
                        }
                        stringbuilder.append(s, i, matcher.start());
                        stringbuilder.append(((CharSequence) (obj1)));
                        i = matcher.end();
                        flag = false;
                    }
                } while (true);
                if (!flag)
                {
                    break label0;
                }
            }
            return s;
        }
        if (i < s.length())
        {
            stringbuilder.append(s, i, s.length());
        }
        return stringbuilder.toString();
    }
}
