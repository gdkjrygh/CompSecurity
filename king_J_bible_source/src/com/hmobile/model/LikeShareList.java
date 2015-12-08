// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.hmobile.model:
//            ServiceHelper, LikeShareInfo, BookInfo, VerseInfo

public class LikeShareList
{

    private static volatile LikeShareList _instance = null;
    protected ArrayList m_modelLikeList;
    protected ArrayList m_modelShareList;

    private LikeShareList()
    {
        m_modelLikeList = null;
        m_modelShareList = null;
    }

    public static LikeShareList Instance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        com/hmobile/model/LikeShareList;
        JVM INSTR monitorenter ;
        _instance = new LikeShareList();
        com/hmobile/model/LikeShareList;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        com/hmobile/model/LikeShareList;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void clearList()
    {
        m_modelLikeList = null;
        m_modelShareList = null;
    }

    public ArrayList getAllLike(String s)
    {
        if (m_modelLikeList != null && m_modelLikeList.size() > 0) goto _L2; else goto _L1
_L1:
        s = ServiceHelper.Instance().call(s);
        if (s.length() <= 0) goto _L2; else goto _L3
_L3:
        m_modelLikeList = LikeShareInfo.parse(s);
        if (m_modelLikeList == null || m_modelLikeList.size() <= 0) goto _L2; else goto _L4
_L4:
        s = m_modelLikeList.iterator();
_L7:
        if (s.hasNext()) goto _L5; else goto _L2
_L2:
        return m_modelLikeList;
_L5:
        LikeShareInfo likeshareinfo = (LikeShareInfo)s.next();
        if (likeshareinfo.verseinfo.equalsIgnoreCase(""))
        {
            int i = BookInfo.getBookIdByName(likeshareinfo.book);
            if (i != 0)
            {
                String s1 = VerseInfo.getVerseStringByBookAndChapter(String.valueOf(i), likeshareinfo.chapter, likeshareinfo.verse);
                if (s1 != null)
                {
                    likeshareinfo.verseinfo = s1;
                }
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public ArrayList getAllShare(String s)
    {
        if (m_modelShareList != null && m_modelShareList.size() > 0) goto _L2; else goto _L1
_L1:
        s = ServiceHelper.Instance().call(s);
        if (s.length() <= 0) goto _L2; else goto _L3
_L3:
        m_modelShareList = LikeShareInfo.parse(s);
        if (m_modelShareList == null || m_modelShareList.size() <= 0) goto _L2; else goto _L4
_L4:
        s = m_modelShareList.iterator();
_L7:
        if (s.hasNext()) goto _L5; else goto _L2
_L2:
        return m_modelShareList;
_L5:
        LikeShareInfo likeshareinfo = (LikeShareInfo)s.next();
        if (likeshareinfo.verseinfo.equalsIgnoreCase(""))
        {
            int i = BookInfo.getBookIdByName(likeshareinfo.book);
            if (i != 0)
            {
                String s1 = VerseInfo.getVerseStringByBookAndChapter(String.valueOf(i), likeshareinfo.chapter, likeshareinfo.verse);
                if (s1 != null)
                {
                    likeshareinfo.verseinfo = s1;
                }
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

}
