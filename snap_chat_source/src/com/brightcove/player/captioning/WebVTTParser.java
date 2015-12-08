// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import com.brightcove.player.model.WebVTTDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.brightcove.player.captioning:
//            BrightcoveClosedCaption

public class WebVTTParser
{

    private static final Pattern a = Pattern.compile("(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}");

    public WebVTTParser()
    {
    }

    private static long a(String s)
    {
        int i = 0;
        if (!s.matches("(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}"))
        {
            throw new NumberFormatException("has invalid format");
        }
        s = s.split("\\.", 2);
        long l = 0L;
        String as[] = s[0].split(":");
        for (int j = as.length; i < j; i++)
        {
            l = l * 60L + Long.parseLong(as[i]);
        }

        return Long.parseLong(s[1]) + l * 1000L;
    }

    public static WebVTTDocument parse(InputStream inputstream, String s)
    {
        ArrayList arraylist = new ArrayList();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, s));
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            throw new IOException("Expected WEBVTT. Got null");
        }
        s = s1;
        if (s1.startsWith("\uFEFF"))
        {
            s = s1.substring(1);
        }
        if (!s.startsWith("WEBVTT"))
        {
            throw new IOException((new StringBuilder("Expected WEBVTT. Got ")).append(s).toString());
        }
        do
        {
            s = bufferedreader.readLine();
            if (s == null)
            {
                throw new IOException("Expected an empty line after webvtt header");
            }
        } while (!s.isEmpty());
        do
        {
            s = bufferedreader.readLine();
            if (s == null)
            {
                break;
            }
            Matcher matcher = a.matcher(s);
            long l = 0L;
            String s2 = "";
            if (matcher.find())
            {
                long l1 = a(matcher.group());
                s = s2;
                if (matcher.find())
                {
                    l = a(matcher.group());
                    s = s2;
                }
                do
                {
                    String s3 = bufferedreader.readLine();
                    if (s3 == null || s3.isEmpty())
                    {
                        break;
                    }
                    s = (new StringBuilder()).append(s).append(s3.trim()).append("\n").toString();
                } while (true);
                arraylist.add(new BrightcoveClosedCaption((int)l1, (int)l, s));
            }
        } while (true);
        bufferedreader.close();
        inputstream.close();
        return new WebVTTDocument(arraylist);
    }

    static 
    {
        com/brightcove/player/captioning/WebVTTParser.getSimpleName();
    }
}
