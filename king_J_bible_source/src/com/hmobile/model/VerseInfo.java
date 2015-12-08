// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.activerecorbase.CamelNotationHelper;
import com.hmobile.biblekjv.HolyBibleApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.hmobile.model:
//            BookInfo

public class VerseInfo extends ActiveRecordBase
{

    public int BookId;
    public int ChapterNumber;
    public String Verse;
    public int VerseNumber;

    public VerseInfo()
    {
        ChapterNumber = 0;
        BookId = 0;
        VerseNumber = 0;
        Verse = "";
    }

    public static ArrayList getVerseByBookAndChapNumber(int i, int j)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist;
        List list;
        try
        {
            list = HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("BookId")))).append("=? and ").append(CamelNotationHelper.toSQLName("ChapterNumber")).append("=?").toString(), new String[] {
                (new StringBuilder()).append(i).toString(), (new StringBuilder()).append(j).toString()
            });
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return arraylist1;
        }
        arraylist = arraylist1;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        arraylist = arraylist1;
        if (list.size() > 0)
        {
            arraylist = new ArrayList(list);
        }
        return arraylist;
    }

    public static ArrayList getVerseByBookId(int i)
    {
        ArrayList arraylist;
        try
        {
            arraylist = (ArrayList)HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("BookId")))).append("=?").toString(), new String[] {
                String.valueOf(i)
            });
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return null;
        }
        return arraylist;
    }

    public static ArrayList getVerseByBookbySearchWord(String s, String s1)
    {
        int i = BookInfo.getBookIdByName(s1);
        try
        {
            s = new ArrayList(HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder("BOOK_ID=")).append(i).append(" AND VERSE like '%").append(s).append("%'").toString(), null));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static ArrayList getVerseBySearchWord(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder("Verse like '%")).append(s).append("%'").toString(), null));
        Iterator iterator = BookInfo.getBookList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return arraylist;
            }
            try
            {
                BookInfo bookinfo = (BookInfo)iterator.next();
                if (bookinfo.BookName.equalsIgnoreCase(s.trim()))
                {
                    arraylist.addAll(HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder("BOOK_ID=")).append(bookinfo.getID()).toString(), null));
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return arraylist;
            }
        } while (true);
    }

    public static VerseInfo getVerseInfoByDB_id(long l)
    {
        VerseInfo verseinfo = (VerseInfo)HolyBibleApplication.Connection().findByID(com/hmobile/model/VerseInfo, l);
        if (verseinfo != null)
        {
            return verseinfo;
        }
        break MISSING_BLOCK_LABEL_24;
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return null;
    }

    public static VerseInfo getVerseInfoByVerse(String s)
    {
        s = HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("Verse")))).append("=?").toString(), new String[] {
            s
        });
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s = (VerseInfo)s.get(0);
        return s;
        s;
        s.printStackTrace();
        return null;
    }

    public static VerseInfo getVerseInfoByVerseNumber(int i, ArrayList arraylist)
    {
        Object obj = null;
        Iterator iterator = arraylist.iterator();
        arraylist = obj;
        do
        {
            VerseInfo verseinfo;
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                verseinfo = (VerseInfo)iterator.next();
            } while (verseinfo.VerseNumber != i);
            arraylist = verseinfo;
        } while (true);
    }

    public static String getVerseStringByBookAndChapter(String s, String s1, String s2)
    {
        String s3 = "";
        try
        {
            s1 = HolyBibleApplication.Connection().find(com/hmobile/model/VerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("BookId")))).append("=? and ").append(CamelNotationHelper.toSQLName("ChapterNumber")).append("=? and ").append(CamelNotationHelper.toSQLName("VerseNumber")).append("=? ").toString(), new String[] {
                s, s1, s2
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        s = s3;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s = s3;
        if (s1.size() > 0)
        {
            s = ((VerseInfo)s1.get(0)).Verse;
        }
        return s;
    }
}
