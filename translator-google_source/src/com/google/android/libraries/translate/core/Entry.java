// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.common.base.p;
import java.io.Serializable;

// Referenced classes of package com.google.android.libraries.translate.core:
//            m

public class Entry
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public boolean isFavorite;
    private long mAccessedTime;
    private long mCreatedTime;
    private String mId;
    private final String mInputText;
    private final String mLanguageFrom;
    private final String mLanguageTo;
    private final String mOutputText;

    public Entry(Entry entry)
    {
        mId = "";
        isFavorite = false;
        mLanguageFrom = entry.mLanguageFrom;
        mLanguageTo = entry.mLanguageTo;
        mInputText = entry.mInputText;
        mOutputText = entry.mOutputText;
        mAccessedTime = entry.mAccessedTime;
        mCreatedTime = entry.mCreatedTime;
    }

    public Entry(Entry entry, String s)
    {
        mId = "";
        isFavorite = false;
        mLanguageFrom = entry.mLanguageFrom;
        mLanguageTo = entry.mLanguageTo;
        mInputText = entry.mInputText;
        mOutputText = s;
        mAccessedTime = entry.mAccessedTime;
        mCreatedTime = entry.mCreatedTime;
    }

    public Entry(Language language, Language language1, String s, String s1)
    {
        mId = "";
        isFavorite = false;
        mLanguageFrom = ((Language)p.a(language)).getShortName();
        mLanguageTo = ((Language)p.a(language1)).getShortName();
        mInputText = (String)p.a(s);
        mOutputText = (String)p.a(s1);
        long l = System.currentTimeMillis();
        mAccessedTime = l;
        mCreatedTime = l;
    }

    public Entry(String s, String s1, String s2, String s3)
    {
        mId = "";
        isFavorite = false;
        mLanguageFrom = (String)p.a(s);
        mLanguageTo = (String)p.a(s1);
        mInputText = (String)p.a(s2);
        mOutputText = (String)p.a(s3);
        long l = System.currentTimeMillis();
        mAccessedTime = l;
        mCreatedTime = l;
    }

    public static Entry getNullHistoryEntry()
    {
        return new Entry("null", "null", "", "");
    }

    public long getCreatedTime()
    {
        return mCreatedTime;
    }

    public Entry getEntryWithoutOnMemoryAttributes()
    {
        m m1 = new m(mOutputText);
        Entry entry = this;
        if (m1.b())
        {
            entry = new Entry(this, m1.toString());
        }
        return entry;
    }

    public Language getFromLanguage(d d1)
    {
        return d1.b(mLanguageFrom);
    }

    public String getFromLanguageShortName()
    {
        return mLanguageFrom;
    }

    public String getId()
    {
        return mId;
    }

    public String getInputText()
    {
        return mInputText;
    }

    public String getOutputText()
    {
        return mOutputText;
    }

    public Language getToLanguage(d d1)
    {
        return d1.c(mLanguageTo);
    }

    public String getToLanguageShortName()
    {
        return mLanguageTo;
    }

    public String getTranslation()
    {
        int i = mOutputText.indexOf("\t");
        if (i != -1)
        {
            return mOutputText.substring(0, i).trim();
        } else
        {
            return mOutputText;
        }
    }

    public boolean isSameSource(Entry entry)
    {
        return entry.mLanguageFrom.equals(mLanguageFrom) && entry.mLanguageTo.equals(mLanguageTo) && entry.mInputText.equals(mInputText);
    }

    public void setCreatedTime(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        mCreatedTime = l;
    }

    public void setId(String s)
    {
        mId = s;
    }
}
