// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.biblekjv.HolyBibleApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.hmobile.model:
//            VerseInfo

public class FavoriteInfo extends ActiveRecordBase
{

    public int BookId;
    public int ChapterNumber;
    public String Verse;
    public int VerseNumber;

    public FavoriteInfo()
    {
        ChapterNumber = 0;
        BookId = 0;
        VerseNumber = 0;
        Verse = "";
    }

    public static void copyFavs()
    {
        Object obj = HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/FavoriteInfo);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        if (((List) (obj)).size() > 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = HolyBibleApplication.Connection().findAll(com/hmobile/model/FavoriteInfo);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = ((List) (obj)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            return;
        }
        FavoriteInfo favoriteinfo = (FavoriteInfo)((Iterator) (obj)).next();
        FavoriteInfo favoriteinfo1 = (FavoriteInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/FavoriteInfo);
        favoriteinfo1.copyFrom(favoriteinfo);
        favoriteinfo1.save();
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
    }

    public static ArrayList getAllLocalFavorite()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1;
        try
        {
            arraylist1 = new ArrayList(HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/FavoriteInfo));
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return arraylist;
        }
        return arraylist1;
    }

    public static boolean isExist(VerseInfo verseinfo)
    {
        boolean flag1 = false;
        boolean flag = false;
        Iterator iterator;
        FavoriteInfo favoriteinfo;
        int i;
        int j;
        try
        {
            iterator = HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/FavoriteInfo).iterator();
        }
        // Misplaced declaration of an exception variable
        catch (VerseInfo verseinfo)
        {
            verseinfo.printStackTrace();
            return flag1;
        }
        flag1 = flag;
        if (!iterator.hasNext())
        {
            return flag;
        }
        flag1 = flag;
        favoriteinfo = (FavoriteInfo)iterator.next();
        flag1 = flag;
        if (favoriteinfo.VerseNumber != verseinfo.VerseNumber)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (favoriteinfo.BookId != verseinfo.BookId)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        i = favoriteinfo.ChapterNumber;
        flag1 = flag;
        j = verseinfo.ChapterNumber;
        if (i == j)
        {
            flag = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_110;
_L2:
        break MISSING_BLOCK_LABEL_20;
    }
}
