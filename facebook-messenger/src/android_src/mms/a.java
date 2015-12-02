// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms;

import java.util.ArrayList;

public class a
{

    private static final ArrayList a;
    private static final ArrayList b;
    private static final ArrayList c;
    private static final ArrayList d;

    private a()
    {
    }

    public static ArrayList a()
    {
        return (ArrayList)b.clone();
    }

    public static boolean a(String s)
    {
        return s != null && s.startsWith("text/");
    }

    public static ArrayList b()
    {
        return (ArrayList)c.clone();
    }

    public static boolean b(String s)
    {
        return s != null && s.startsWith("image/");
    }

    public static ArrayList c()
    {
        return (ArrayList)d.clone();
    }

    public static boolean c(String s)
    {
        return s != null && s.startsWith("audio/");
    }

    public static boolean d(String s)
    {
        return s != null && s.startsWith("video/");
    }

    public static boolean e(String s)
    {
        return s != null && (s.equals("application/vnd.oma.drm.content") || s.equals("application/vnd.oma.drm.message"));
    }

    static 
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        a.add("text/plain");
        a.add("text/html");
        a.add("text/x-vCalendar");
        a.add("text/x-vCard");
        a.add("image/jpeg");
        a.add("image/gif");
        a.add("image/vnd.wap.wbmp");
        a.add("image/png");
        a.add("image/jpg");
        a.add("audio/aac");
        a.add("audio/amr");
        a.add("audio/imelody");
        a.add("audio/mid");
        a.add("audio/midi");
        a.add("audio/mp3");
        a.add("audio/mpeg3");
        a.add("audio/mpeg");
        a.add("audio/mpg");
        a.add("audio/x-mid");
        a.add("audio/x-midi");
        a.add("audio/x-mp3");
        a.add("audio/x-mpeg3");
        a.add("audio/x-mpeg");
        a.add("audio/x-mpg");
        a.add("audio/3gpp");
        a.add("application/ogg");
        a.add("video/3gpp");
        a.add("video/3gpp2");
        a.add("video/h263");
        a.add("video/mp4");
        a.add("application/smil");
        a.add("application/vnd.wap.xhtml+xml");
        a.add("application/xhtml+xml");
        a.add("application/vnd.oma.drm.content");
        a.add("application/vnd.oma.drm.message");
        b.add("image/jpeg");
        b.add("image/gif");
        b.add("image/vnd.wap.wbmp");
        b.add("image/png");
        b.add("image/jpg");
        c.add("audio/aac");
        c.add("audio/amr");
        c.add("audio/imelody");
        c.add("audio/mid");
        c.add("audio/midi");
        c.add("audio/mp3");
        c.add("audio/mpeg3");
        c.add("audio/mpeg");
        c.add("audio/mpg");
        c.add("audio/mp4");
        c.add("audio/x-mid");
        c.add("audio/x-midi");
        c.add("audio/x-mp3");
        c.add("audio/x-mpeg3");
        c.add("audio/x-mpeg");
        c.add("audio/x-mpg");
        c.add("audio/3gpp");
        c.add("application/ogg");
        d.add("video/3gpp");
        d.add("video/3gpp2");
        d.add("video/h263");
        d.add("video/mp4");
    }
}
