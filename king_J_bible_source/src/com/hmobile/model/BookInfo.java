// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import android.content.Context;
import android.content.res.Resources;
import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.activerecorbase.CamelNotationHelper;
import com.hmobile.biblekjv.HolyBibleApplication;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.hmobile.model:
//            VerseInfo, TodayVerseInfo

public class BookInfo extends ActiveRecordBase
{

    public String BookName;
    public int ChapterCount;
    public int VerseCount;
    public int id;

    public BookInfo()
    {
        id = 0;
        BookName = "";
        ChapterCount = 0;
        VerseCount = 0;
    }

    public static BookInfo getBookByBookName(String s)
    {
        s = HolyBibleApplication.Connection().excecuteRawQuery(com/hmobile/model/BookInfo, (new StringBuilder("select * from BOOK_INFO where BOOK_NAME like '%")).append(String.valueOf(s)).append("%'").toString(), null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s = (BookInfo)s.get(0);
        return s;
        s;
        s.printStackTrace();
        return null;
    }

    public static int getBookCount()
    {
        int i;
        try
        {
            i = HolyBibleApplication.Connection().getRecordCount(com/hmobile/model/BookInfo);
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return 0;
        }
        return i;
    }

    public static int getBookIdByName(String s)
    {
        s = HolyBibleApplication.Connection().excecuteRawQuery(com/hmobile/model/BookInfo, (new StringBuilder("select * from BOOK_INFO where BOOK_NAME like '%")).append(String.valueOf(s)).append("%'").toString(), null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        long l;
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        l = ((BookInfo)s.get(0)).getID();
        return (int)l;
        s;
        s.printStackTrace();
        return 0;
    }

    public static BookInfo getBookInfoByBookid(long l)
    {
        BookInfo bookinfo = (BookInfo)HolyBibleApplication.Connection().findByID(com/hmobile/model/BookInfo, l);
        if (bookinfo != null)
        {
            return bookinfo;
        }
        break MISSING_BLOCK_LABEL_24;
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return null;
    }

    public static ArrayList getBookList()
    {
        ArrayList arraylist;
        try
        {
            arraylist = new ArrayList(HolyBibleApplication.Connection().findAll(com/hmobile/model/BookInfo));
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return null;
        }
        return arraylist;
    }

    public static String getBookNameByBookid(long l)
    {
        String s = "";
        BookInfo bookinfo;
        try
        {
            bookinfo = (BookInfo)HolyBibleApplication.Connection().findByID(com/hmobile/model/BookInfo, l);
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return "";
        }
        if (bookinfo == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        s = bookinfo.BookName.trim();
        return s;
    }

    public static ArrayList getBookbyPage(int i, int j)
    {
        ArrayList arraylist;
        try
        {
            arraylist = (ArrayList)HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("BookId")))).append("=? and ").append(CamelNotationHelper.toSQLName("ChapterNumber")).append("=?").toString(), new String[] {
                String.valueOf(i), String.valueOf(j)
            });
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return null;
        }
        return arraylist;
    }

    public static BookInfo getTodayBook()
    {
        BookInfo bookinfo = (BookInfo)HolyBibleApplication.Connection().getRandom(com/hmobile/model/BookInfo);
        if (bookinfo != null)
        {
            return bookinfo;
        }
        break MISSING_BLOCK_LABEL_23;
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return null;
    }

    public static TodayVerseInfo getTodayVerse()
    {
        TodayVerseInfo todayverseinfo;
        if (!HolyBibleApplication.getContext().getResources().getString(0x7f0700c0).equalsIgnoreCase("on"))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/TodayVerseInfo);
        todayverseinfo = (TodayVerseInfo)HolyBibleApplication.LocalConnection().getRandom(com/hmobile/model/TodayVerseInfo);
        if (todayverseinfo != null)
        {
            return todayverseinfo;
        }
        break MISSING_BLOCK_LABEL_118;
        VerseInfo verseinfo;
        todayverseinfo = (TodayVerseInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/TodayVerseInfo);
        verseinfo = (VerseInfo)HolyBibleApplication.Connection().getRandom(com/hmobile/model/VerseInfo);
        if (verseinfo == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        todayverseinfo.ChapterNumber = verseinfo.ChapterNumber;
        todayverseinfo.BookId = verseinfo.BookId;
        todayverseinfo.VerseNumber = verseinfo.VerseNumber;
        todayverseinfo.Verse = verseinfo.Verse;
        todayverseinfo.save();
        return todayverseinfo;
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return null;
    }

    public static int getTotalChapterCountBybookid(long l)
    {
        int i;
        try
        {
            i = ((BookInfo)HolyBibleApplication.Connection().findByID(com/hmobile/model/BookInfo, l)).ChapterCount;
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return 0;
        }
        return i;
    }

    public static int getVerseCountByBookAndChapId(int i, int j)
    {
        boolean flag = false;
        ArrayList arraylist = getBookbyPage(i, j);
        i = ((flag) ? 1 : 0);
        if (arraylist != null)
        {
            i = arraylist.size();
        }
        return i;
    }
}
