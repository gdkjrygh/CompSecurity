// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            Languages

public static final class <init> extends <init>
{

    private final Set languages;

    public boolean contains(String s)
    {
        return languages.contains(s);
    }

    public String getAny()
    {
        return (String)languages.iterator().next();
    }

    public Set getLanguages()
    {
        return languages;
    }

    public boolean isEmpty()
    {
        return languages.isEmpty();
    }

    public boolean isSingleton()
    {
        return languages.size() == 1;
    }

    public languages restrictTo(languages languages1)
    {
        Object obj;
        if (languages1 == Languages.NO_LANGUAGES)
        {
            obj = languages1;
        } else
        {
            obj = this;
            if (languages1 != Languages.ANY_LANGUAGE)
            {
                languages1 = (languages)languages1;
                obj = this;
                if (!((languages) (languages1)).languages.containsAll(languages))
                {
                    HashSet hashset = new HashSet(languages);
                    hashset.retainAll(((languages) (languages1)).languages);
                    return from(hashset);
                }
            }
        }
        return ((from) (obj));
    }

    public String toString()
    {
        return (new StringBuilder()).append("Languages(").append(languages.toString()).append(")").toString();
    }

    private (Set set)
    {
        languages = Collections.unmodifiableSet(set);
    }

    languages(Set set, languages languages1)
    {
        this(set);
    }
}
