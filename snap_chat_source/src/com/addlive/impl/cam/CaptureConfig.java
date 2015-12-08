// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureConfig
{

    private static final int FPS = 15;
    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private int fps;
    private int height;
    private int width;

    public CaptureConfig()
    {
        width = 640;
        height = 480;
        fps = 15;
    }

    public int getFps()
    {
        return fps;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int processProperty(String s, String s1)
    {
        char c1 = '\u03EA';
        if (s.equals("global.dev.camera.FPS"))
        {
            fps = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_133;
        }
        if (s.equals("global.dev.camera.height"))
        {
            height = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_133;
        }
        if (s.equals("global.dev.camera.width"))
        {
            width = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_133;
        }
        char c = c1;
        try
        {
            if (!s.equals("global.dev.camera.mode"))
            {
                break MISSING_BLOCK_LABEL_135;
            }
            s = Pattern.compile("(\\d{1,3})x(\\d{1,3})@(\\d{1,2})").matcher(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 1002;
        }
        c = c1;
        if (!s.matches())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        width = Integer.parseInt(s.group(1));
        height = Integer.parseInt(s.group(2));
        fps = Integer.parseInt(s.group(3));
        c = '\0';
        return c;
    }

    public void setFps(int i)
    {
        fps = i;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setWidth(int i)
    {
        width = i;
    }
}
