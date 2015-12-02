// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;


// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileCategoryHelper

public static final class  extends Enum
{

    public static final Favorite All;
    public static final Favorite Apk;
    public static final Favorite Custom;
    public static final Favorite Doc;
    public static final Favorite Favorite;
    public static final Favorite Music;
    public static final Favorite Other;
    public static final Favorite Picture;
    public static final Favorite Theme;
    public static final Favorite Video;
    public static final Favorite Zip;
    private static final Favorite a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        All = new <init>("All", 0);
        Music = new <init>("Music", 1);
        Video = new <init>("Video", 2);
        Picture = new <init>("Picture", 3);
        Theme = new <init>("Theme", 4);
        Doc = new <init>("Doc", 5);
        Zip = new <init>("Zip", 6);
        Apk = new <init>("Apk", 7);
        Custom = new <init>("Custom", 8);
        Other = new <init>("Other", 9);
        Favorite = new <init>("Favorite", 10);
        a = (new a[] {
            All, Music, Video, Picture, Theme, Doc, Zip, Apk, Custom, Other, 
            Favorite
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
