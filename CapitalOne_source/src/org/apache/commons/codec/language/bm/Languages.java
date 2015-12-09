// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            NameType

public class Languages
{
    public static abstract class LanguageSet
    {

        public static LanguageSet from(Set set)
        {
            if (set.isEmpty())
            {
                return Languages.NO_LANGUAGES;
            } else
            {
                return new SomeLanguages(set);
            }
        }

        public abstract boolean contains(String s);

        public abstract String getAny();

        public abstract boolean isEmpty();

        public abstract boolean isSingleton();

        public abstract LanguageSet restrictTo(LanguageSet languageset);

        public LanguageSet()
        {
        }
    }

    public static final class SomeLanguages extends LanguageSet
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

        public LanguageSet restrictTo(LanguageSet languageset)
        {
            Object obj;
            if (languageset == Languages.NO_LANGUAGES)
            {
                obj = languageset;
            } else
            {
                obj = this;
                if (languageset != Languages.ANY_LANGUAGE)
                {
                    languageset = (SomeLanguages)languageset;
                    obj = this;
                    if (!((SomeLanguages) (languageset)).languages.containsAll(languages))
                    {
                        HashSet hashset = new HashSet(languages);
                        hashset.retainAll(((SomeLanguages) (languageset)).languages);
                        return from(hashset);
                    }
                }
            }
            return ((LanguageSet) (obj));
        }

        public String toString()
        {
            return (new StringBuilder()).append("Languages(").append(languages.toString()).append(")").toString();
        }

        private SomeLanguages(Set set)
        {
            languages = Collections.unmodifiableSet(set);
        }

    }


    public static final String ANY = "any";
    public static final LanguageSet ANY_LANGUAGE = new LanguageSet() {

        public boolean contains(String s)
        {
            return true;
        }

        public String getAny()
        {
            throw new NoSuchElementException("Can't fetch any language from the any language set.");
        }

        public boolean isEmpty()
        {
            return false;
        }

        public boolean isSingleton()
        {
            return false;
        }

        public LanguageSet restrictTo(LanguageSet languageset)
        {
            return languageset;
        }

        public String toString()
        {
            return "ANY_LANGUAGE";
        }

    };
    private static final Map LANGUAGES;
    public static final LanguageSet NO_LANGUAGES = new LanguageSet() {

        public boolean contains(String s)
        {
            return false;
        }

        public String getAny()
        {
            throw new NoSuchElementException("Can't fetch any language from the empty language set.");
        }

        public boolean isEmpty()
        {
            return true;
        }

        public boolean isSingleton()
        {
            return false;
        }

        public LanguageSet restrictTo(LanguageSet languageset)
        {
            return this;
        }

        public String toString()
        {
            return "NO_LANGUAGES";
        }

    };
    private final Set languages;

    private Languages(Set set)
    {
        languages = set;
    }

    public static Languages getInstance(String s)
    {
        HashSet hashset = new HashSet();
        java.io.InputStream inputstream = org/apache/commons/codec/language/bm/Languages.getClassLoader().getResourceAsStream(s);
        if (inputstream == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unable to resolve required resource: ").append(s).toString());
        }
        s = new Scanner(inputstream, "UTF-8");
        boolean flag = false;
        do
        {
            if (!s.hasNextLine())
            {
                break;
            }
            String s1 = s.nextLine().trim();
            if (flag)
            {
                if (s1.endsWith("*/"))
                {
                    flag = false;
                }
            } else
            if (s1.startsWith("/*"))
            {
                flag = true;
            } else
            if (s1.length() > 0)
            {
                hashset.add(s1);
            }
        } while (true);
        return new Languages(Collections.unmodifiableSet(hashset));
    }

    public static Languages getInstance(NameType nametype)
    {
        return (Languages)LANGUAGES.get(nametype);
    }

    private static String langResourceName(NameType nametype)
    {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", new Object[] {
            nametype.getName()
        });
    }

    public Set getLanguages()
    {
        return languages;
    }

    static 
    {
        LANGUAGES = new EnumMap(org/apache/commons/codec/language/bm/NameType);
        NameType anametype[] = NameType.values();
        int j = anametype.length;
        for (int i = 0; i < j; i++)
        {
            NameType nametype = anametype[i];
            LANGUAGES.put(nametype, getInstance(langResourceName(nametype)));
        }

    }
}
