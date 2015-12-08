// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.languages;

import android.support.v4.c.h;
import com.google.android.libraries.translate.e.f;
import com.google.common.base.p;
import java.io.Serializable;

public final class Language
    implements Serializable, Comparable
{

    private static final long serialVersionUID = 1L;
    private String mLongName;
    private String mShortName;

    public Language(String s, String s1)
    {
        mLongName = (String)p.a(s1);
        mShortName = (String)p.a(s);
    }

    public final int compareTo(Language language)
    {
        return mLongName.compareTo(language.mLongName);
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((Language)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Language))
            {
                return false;
            }
            obj = (Language)obj;
            if (!mLongName.equals(((Language) (obj)).mLongName) || !mShortName.equals(((Language) (obj)).mShortName))
            {
                return false;
            }
        }
        return true;
    }

    public final String getLongName()
    {
        return mLongName;
    }

    public final String getShortName()
    {
        return mShortName;
    }

    public final int hashCode()
    {
        return mLongName.hashCode() ^ mShortName.hashCode();
    }

    public final boolean isRTL()
    {
        switch (h.a(f.a(getShortName())))
        {
        case 0: // '\0'
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public final String toString()
    {
        return mLongName;
    }
}
