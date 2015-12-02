// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;

public class TypeMatcher
{

    public static final int FILE_TYPE_APK = 3;
    public static final int FILE_TYPE_DOCUMENT = 4;
    public static final int FILE_TYPE_IMAGE = 0;
    public static final int FILE_TYPE_MUSIC = 1;
    public static final int FILE_TYPE_UNKNOWN = -1;
    public static final int FILE_TYPE_VIEDO = 2;
    private static HashMap a = new HashMap();

    public TypeMatcher()
    {
    }

    private static void a(String s, int i)
    {
        a.put(s, Integer.valueOf(i));
    }

    public static int getFileType(File file)
    {
        while (file == null || !file.exists() || file.isDirectory()) 
        {
            return -1;
        }
        return getFileType(file.getName());
    }

    public static int getFileType(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return -1;
        }
        int i = s.lastIndexOf(".");
        if (i < 0)
        {
            return -1;
        }
        s = (Integer)a.get(s.substring(i + 1).toUpperCase());
        if (s == null)
        {
            return -1;
        } else
        {
            return s.intValue();
        }
    }

    public static boolean isAudioFile(File file)
    {
        return getFileType(file) == 1;
    }

    public static boolean isDocFile(File file)
    {
        return getFileType(file) == 4;
    }

    public static boolean isMediaFile(File file)
    {
        int i = getFileType(file);
        return i == 4 || i == 0 || i == 1 || i == 2;
    }

    public static boolean isPictureFile(File file)
    {
        return getFileType(file) == 0;
    }

    public static boolean isVideoFile(File file)
    {
        return getFileType(file) == 2;
    }

    static 
    {
        a("JPG", 0);
        a("JPEG", 0);
        a("GIF", 0);
        a("PNG", 0);
        a("BMP", 0);
        a("WBMP", 0);
        a("PSD", 0);
        a("SVG", 0);
        a("MP3", 1);
        a("M4A", 1);
        a("WAV", 1);
        a("AMR", 1);
        a("AWB", 1);
        a("WMA", 1);
        a("OGG", 1);
        a("OGA", 1);
        a("AAC", 1);
        a("MKA", 1);
        a("APE", 1);
        a("FLAC", 1);
        a("MID", 1);
        a("MIDI", 1);
        a("XMF", 1);
        a("RTTTL", 1);
        a("SMF", 1);
        a("IMY", 1);
        a("RTX", 1);
        a("OTA", 1);
        a("MXMF", 1);
        a("MPEG", 2);
        a("MP4", 2);
        a("M4V", 2);
        a("3GP", 2);
        a("3GPP", 2);
        a("3G2", 2);
        a("3GPP2", 2);
        a("MKV", 2);
        a("WEBM", 2);
        a("TS", 2);
        a("WMV", 2);
        a("ASF", 2);
        a("FLV", 2);
        a("AVI", 2);
        a("RM", 2);
        a("RMVB", 2);
        a("MPG", 2);
        a("VOB", 2);
        a("MOV", 2);
        a("TP", 2);
        a("APK", 3);
        a("TXT", 4);
        a("DOC", 4);
        a("DOCX", 4);
        a("PDF", 4);
        a("CHM", 4);
        a("EPUB", 4);
        a("XLS", 4);
        a("XLSX", 4);
        a("PPT", 4);
        a("PPTX", 4);
    }
}
