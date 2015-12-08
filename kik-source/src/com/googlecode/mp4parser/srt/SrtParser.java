// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.srt;

import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.List;

public class SrtParser
{

    public SrtParser()
    {
    }

    private static long parse(String s)
    {
        return Long.parseLong(s.split(":")[0].trim()) * 60L * 60L * 1000L + Long.parseLong(s.split(":")[1].trim()) * 60L * 1000L + Long.parseLong(s.split(":")[2].split(",")[0].trim()) * 1000L + Long.parseLong(s.split(":")[2].split(",")[1].trim());
    }

    public static TextTrackImpl parse(InputStream inputstream)
    {
        LineNumberReader linenumberreader;
        TextTrackImpl texttrackimpl;
        linenumberreader = new LineNumberReader(new InputStreamReader(inputstream, "UTF-8"));
        texttrackimpl = new TextTrackImpl();
_L2:
        if (linenumberreader.readLine() == null)
        {
            return texttrackimpl;
        }
        String s = linenumberreader.readLine();
        inputstream = "";
        do
        {
            String s1;
label0:
            {
                s1 = linenumberreader.readLine();
                if (s1 != null && !s1.trim().equals(""))
                {
                    break label0;
                }
                long l = parse(s.split("-->")[0]);
                long l1 = parse(s.split("-->")[1]);
                texttrackimpl.getSubs().add(new com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line(l, l1, inputstream));
            }
            if (true)
            {
                continue;
            }
            inputstream = (new StringBuilder(String.valueOf(inputstream))).append(s1).append("\n").toString();
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
