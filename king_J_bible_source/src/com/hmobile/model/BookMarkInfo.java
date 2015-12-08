// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.activerecorbase.CamelNotationHelper;
import com.hmobile.biblekjv.HolyBibleApplication;
import com.hmobile.common.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMarkInfo extends ActiveRecordBase
{

    public String Lable;
    public String Name;
    public String Verse;
    public int backColor;
    public int book_id;
    public int chap_number;
    public long date;
    public boolean isBackColor;
    public int verse_id;

    public BookMarkInfo()
    {
        Lable = "";
        Name = "";
        Verse = "";
        book_id = 1;
        chap_number = 1;
        date = 0L;
        verse_id = 1;
        isBackColor = false;
        backColor = 0;
    }

    public static void SaveBookMark(int i, int j, String s, String s1, String s2, int k, boolean flag, int l)
    {
        try
        {
            BookMarkInfo bookmarkinfo = (BookMarkInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/BookMarkInfo);
            bookmarkinfo.book_id = i;
            bookmarkinfo.chap_number = j;
            bookmarkinfo.Lable = s;
            bookmarkinfo.Name = s1;
            bookmarkinfo.Verse = s2;
            bookmarkinfo.verse_id = k;
            bookmarkinfo.date = System.currentTimeMillis();
            bookmarkinfo.isBackColor = flag;
            bookmarkinfo.backColor = l;
            bookmarkinfo.save();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public static void copyBookmarks()
    {
        Object obj = HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/BookMarkInfo);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        if (((List) (obj)).size() > 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = HolyBibleApplication.Connection().findAll(com/hmobile/model/BookMarkInfo);
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
        BookMarkInfo bookmarkinfo = (BookMarkInfo)((Iterator) (obj)).next();
        BookMarkInfo bookmarkinfo1 = (BookMarkInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/BookMarkInfo);
        bookmarkinfo1.copyFrom(bookmarkinfo);
        bookmarkinfo1.save();
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
    }

    public static ArrayList getAllBookMark()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/BookMarkInfo);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = ((List) (obj)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            return arraylist;
        }
        arraylist.add((BookMarkInfo)((Iterator) (obj)).next());
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return arraylist;
    }

    public static BookMarkInfo getBookMarkInfoById(long l)
    {
        BookMarkInfo bookmarkinfo;
        try
        {
            bookmarkinfo = (BookMarkInfo)HolyBibleApplication.LocalConnection().findByID(com/hmobile/model/BookMarkInfo, l);
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return null;
        }
        return bookmarkinfo;
    }

    public static ArrayList getBookMarkInfoByPageNumber(int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = HolyBibleApplication.LocalConnection().find(com/hmobile/model/BookMarkInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("book_id")))).append("=? and ").append(CamelNotationHelper.toSQLName("chap_number")).append("=?").toString(), new String[] {
            String.valueOf(i), String.valueOf(j)
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        obj = ((List) (obj)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            return arraylist;
        }
        arraylist.add((BookMarkInfo)((Iterator) (obj)).next());
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return arraylist;
    }

    public static String getStringFromArray(ArrayList arraylist)
    {
        String s1 = "";
        String s = s1;
        if (arraylist != null)
        {
            s = s1;
            if (arraylist.size() > 0)
            {
                s = Utils.Instance().join(arraylist, "###");
            }
        }
        return s;
    }
}
