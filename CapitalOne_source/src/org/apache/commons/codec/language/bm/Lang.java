// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            NameType, Languages

public class Lang
{
    private static final class LangRule
    {

        private final boolean acceptOnMatch;
        private final Set languages;
        private final Pattern pattern;

        public boolean matches(String s)
        {
            return pattern.matcher(s).find();
        }



        private LangRule(Pattern pattern1, Set set, boolean flag)
        {
            pattern = pattern1;
            languages = set;
            acceptOnMatch = flag;
        }

    }


    private static final String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/lang.txt";
    private static final Map Langs;
    private final Languages languages;
    private final List rules;

    private Lang(List list, Languages languages1)
    {
        rules = Collections.unmodifiableList(list);
        languages = languages1;
    }

    public static Lang instance(NameType nametype)
    {
        return (Lang)Langs.get(nametype);
    }

    public static Lang loadFromResource(String s, Languages languages1)
    {
        ArrayList arraylist = new ArrayList();
        java.io.InputStream inputstream = org/apache/commons/codec/language/bm/Lang.getClassLoader().getResourceAsStream(s);
        if (inputstream == null)
        {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
        }
        Scanner scanner = new Scanner(inputstream, "UTF-8");
        boolean flag = false;
        do
        {
            if (!scanner.hasNextLine())
            {
                break;
            }
            String s3 = scanner.nextLine();
            String s1 = s3;
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
            {
                int i = s1.indexOf("//");
                String s2 = s1;
                if (i >= 0)
                {
                    s2 = s1.substring(0, i);
                }
                s1 = s2.trim();
                if (s1.length() != 0)
                {
                    String as[] = s1.split("\\s+");
                    if (as.length != 3)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Malformed line '").append(s3).append("' in language resource '").append(s).append("'").toString());
                    }
                    Pattern pattern = Pattern.compile(as[0]);
                    String as1[] = as[1].split("\\+");
                    boolean flag1 = as[2].equals("true");
                    arraylist.add(new LangRule(pattern, new HashSet(Arrays.asList(as1)), flag1));
                }
            }
        } while (true);
        return new Lang(arraylist, languages1);
    }

    public String guessLanguage(String s)
    {
        s = guessLanguages(s);
        if (s.isSingleton())
        {
            return s.getAny();
        } else
        {
            return "any";
        }
    }

    public Languages.LanguageSet guessLanguages(String s)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        Object obj = new HashSet(languages.getLanguages());
        Iterator iterator = rules.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LangRule langrule = (LangRule)iterator.next();
            if (langrule.matches(s))
            {
                if (langrule.acceptOnMatch)
                {
                    ((Set) (obj)).retainAll(langrule.languages);
                } else
                {
                    ((Set) (obj)).removeAll(langrule.languages);
                }
            }
        } while (true);
        obj = Languages.LanguageSet.from(((Set) (obj)));
        s = ((String) (obj));
        if (obj.equals(Languages.NO_LANGUAGES))
        {
            s = Languages.ANY_LANGUAGE;
        }
        return s;
    }

    static 
    {
        Langs = new EnumMap(org/apache/commons/codec/language/bm/NameType);
        NameType anametype[] = NameType.values();
        int j = anametype.length;
        for (int i = 0; i < j; i++)
        {
            NameType nametype = anametype[i];
            Langs.put(nametype, loadFromResource("org/apache/commons/codec/language/bm/lang.txt", Languages.getInstance(nametype)));
        }

    }
}
