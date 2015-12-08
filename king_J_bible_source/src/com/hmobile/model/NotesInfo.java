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

public class NotesInfo extends ActiveRecordBase
{

    public String Lable;
    public String Title;
    public String Verse;
    public int book_id;
    public int chap_number;
    public long date;
    public int verse_id;

    public NotesInfo()
    {
        Lable = "";
        Title = "";
        Verse = "";
        book_id = 1;
        chap_number = 1;
        verse_id = 1;
        date = 0L;
    }

    public static void SaveNotes(int i, int j, String s, String s1, String s2, int k)
    {
        try
        {
            NotesInfo notesinfo = (NotesInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/NotesInfo);
            notesinfo.Title = s1;
            notesinfo.Lable = s;
            notesinfo.Verse = s2;
            notesinfo.book_id = i;
            notesinfo.chap_number = j;
            notesinfo.verse_id = k;
            notesinfo.date = System.currentTimeMillis();
            notesinfo.save();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public static ArrayList getAllNotes()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/NotesInfo);
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
        arraylist.add((NotesInfo)((Iterator) (obj)).next());
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return arraylist;
    }

    public static NotesInfo getNotesInfoById(long l)
    {
        NotesInfo notesinfo;
        try
        {
            notesinfo = (NotesInfo)HolyBibleApplication.LocalConnection().findByID(com/hmobile/model/NotesInfo, l);
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return null;
        }
        return notesinfo;
    }

    public static ArrayList getNotesInfoByPageNumber(int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = HolyBibleApplication.LocalConnection().find(com/hmobile/model/NotesInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("book_id")))).append("=? and ").append(CamelNotationHelper.toSQLName("chap_number")).append("=?").toString(), new String[] {
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
        arraylist.add((NotesInfo)((Iterator) (obj)).next());
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

    public static NotesInfo isVerseNoted(int i, int j, int k)
    {
        Object obj = HolyBibleApplication.LocalConnection().find(com/hmobile/model/NotesInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("book_id")))).append("=? and ").append(CamelNotationHelper.toSQLName("chap_number")).append("=? and ").append(CamelNotationHelper.toSQLName("verse_id")).append("=?").toString(), new String[] {
            String.valueOf(i), String.valueOf(j), String.valueOf(k)
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = (NotesInfo)((List) (obj)).get(0);
        return ((NotesInfo) (obj));
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
        return null;
    }
}
