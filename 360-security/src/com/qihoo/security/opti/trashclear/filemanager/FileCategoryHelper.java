// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;


public class FileCategoryHelper
{
    public static final class FileCategory extends Enum
    {

        public static final FileCategory All;
        public static final FileCategory Apk;
        public static final FileCategory Custom;
        public static final FileCategory Doc;
        public static final FileCategory Favorite;
        public static final FileCategory Music;
        public static final FileCategory Other;
        public static final FileCategory Picture;
        public static final FileCategory Theme;
        public static final FileCategory Video;
        public static final FileCategory Zip;
        private static final FileCategory a[];

        public static FileCategory valueOf(String s)
        {
            return (FileCategory)Enum.valueOf(com/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory, s);
        }

        public static FileCategory[] values()
        {
            return (FileCategory[])a.clone();
        }

        static 
        {
            All = new FileCategory("All", 0);
            Music = new FileCategory("Music", 1);
            Video = new FileCategory("Video", 2);
            Picture = new FileCategory("Picture", 3);
            Theme = new FileCategory("Theme", 4);
            Doc = new FileCategory("Doc", 5);
            Zip = new FileCategory("Zip", 6);
            Apk = new FileCategory("Apk", 7);
            Custom = new FileCategory("Custom", 8);
            Other = new FileCategory("Other", 9);
            Favorite = new FileCategory("Favorite", 10);
            a = (new FileCategory[] {
                All, Music, Video, Picture, Theme, Doc, Zip, Apk, Custom, Other, 
                Favorite
            });
        }

        private FileCategory(String s, int i)
        {
            super(s, i);
        }
    }


    public static String a = "apk";
    public static String b = "mtz";
    public static String c[] = {
        "log", "xml", "ini", "lrc", "txt", "doc", "docx", "pdf", "chm", "epub", 
        "xls", "xlsx", "ppt", "pptx"
    };
    public static String d[] = {
        "zip", "rar"
    };
    public static String e[] = {
        "mpeg", "mp4", "m4v", "3gp", "3gpp", "3g2", "3gpp2", "mkv", "webm", "ts", 
        "wmv", "asf", "avi", "flv", "rm", "rmvb", "mpg", "vob", "mov", "tp", 
        "f4v", "bdv", "vdat"
    };
    public static String f[] = {
        "jpg", "jpeg", "gif", "png", "bmp", "wbmp", "psd", "svg", "vsd"
    };
    public static String g[] = {
        "mp3", "wma", "wav", "mid", "aac", "m4a", "amr", "awb", "ogg", "oga", 
        "mka", "ape", "flac", "midi"
    };

    public static FileCategory a(String s)
    {
        int i = s.lastIndexOf('.');
        if (i == -1)
        {
            return FileCategory.Other;
        }
        s = s.substring(i + 1, s.length());
        if (s.equalsIgnoreCase(a))
        {
            return FileCategory.Apk;
        }
        if (s.equalsIgnoreCase(b))
        {
            return FileCategory.Theme;
        }
        if (a(s, c))
        {
            return FileCategory.Doc;
        }
        if (a(s, d))
        {
            return FileCategory.Zip;
        }
        if (a(s, e))
        {
            return FileCategory.Video;
        }
        if (a(s, f))
        {
            return FileCategory.Picture;
        }
        if (a(s, g))
        {
            return FileCategory.Music;
        } else
        {
            return FileCategory.Other;
        }
    }

    private static boolean a(String s, String as[])
    {
        boolean flag1 = false;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!as[i].equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

}
