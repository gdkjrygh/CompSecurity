// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            NameType, RuleType, Languages

public class Rule
{
    public static final class Phoneme
        implements PhonemeExpr
    {

        public static final Comparator COMPARATOR = new Comparator() {

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((Phoneme)obj, (Phoneme)obj1);
            }

            public int compare(Phoneme phoneme1, Phoneme phoneme2)
            {
                int i = 0;
_L6:
                if (i >= phoneme1.phonemeText.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                if (i < phoneme2.phonemeText.length()) goto _L2; else goto _L1
_L1:
                int j = 1;
_L4:
                return j;
_L2:
                int k;
                k = phoneme1.phonemeText.charAt(i) - phoneme2.phonemeText.charAt(i);
                j = k;
                if (k != 0) goto _L4; else goto _L3
_L3:
                i++;
                if (true) goto _L6; else goto _L5
_L5:
                return phoneme1.phonemeText.length() >= phoneme2.phonemeText.length() ? 0 : -1;
            }

        };
        private final Languages.LanguageSet languages;
        private final CharSequence phonemeText;

        public Phoneme append(CharSequence charsequence)
        {
            return new Phoneme((new StringBuilder()).append(phonemeText.toString()).append(charsequence.toString()).toString(), languages);
        }

        public Languages.LanguageSet getLanguages()
        {
            return languages;
        }

        public CharSequence getPhonemeText()
        {
            return phonemeText;
        }

        public Iterable getPhonemes()
        {
            return Collections.singleton(this);
        }

        public Phoneme join(Phoneme phoneme1)
        {
            return new Phoneme((new StringBuilder()).append(phonemeText.toString()).append(phoneme1.phonemeText.toString()).toString(), languages.restrictTo(phoneme1.languages));
        }



        public Phoneme(CharSequence charsequence, Languages.LanguageSet languageset)
        {
            phonemeText = charsequence;
            languages = languageset;
        }
    }

    public static interface PhonemeExpr
    {

        public abstract Iterable getPhonemes();
    }

    public static final class PhonemeList
        implements PhonemeExpr
    {

        private final List phonemes;

        public volatile Iterable getPhonemes()
        {
            return getPhonemes();
        }

        public List getPhonemes()
        {
            return phonemes;
        }

        public PhonemeList(List list)
        {
            phonemes = list;
        }
    }

    public static interface RPattern
    {

        public abstract boolean isMatch(CharSequence charsequence);
    }


    public static final String ALL = "ALL";
    public static final RPattern ALL_STRINGS_RMATCHER = new RPattern() {

        public boolean isMatch(CharSequence charsequence)
        {
            return true;
        }

    };
    private static final String DOUBLE_QUOTE = "\"";
    private static final String HASH_INCLUDE = "#include";
    private static final Map RULES;
    private final RPattern lContext;
    private final String pattern;
    private final PhonemeExpr phoneme;
    private final RPattern rContext;

    public Rule(String s, String s1, String s2, PhonemeExpr phonemeexpr)
    {
        pattern = s;
        lContext = pattern((new StringBuilder()).append(s1).append("$").toString());
        rContext = pattern((new StringBuilder()).append("^").append(s2).toString());
        phoneme = phonemeexpr;
    }

    private static boolean contains(CharSequence charsequence, char c)
    {
        for (int i = 0; i < charsequence.length(); i++)
        {
            if (charsequence.charAt(i) == c)
            {
                return true;
            }
        }

        return false;
    }

    private static String createResourceName(NameType nametype, RuleType ruletype, String s)
    {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", new Object[] {
            nametype.getName(), ruletype.getName(), s
        });
    }

    private static Scanner createScanner(String s)
    {
        s = String.format("org/apache/commons/codec/language/bm/%s.txt", new Object[] {
            s
        });
        java.io.InputStream inputstream = org/apache/commons/codec/language/bm/Languages.getClassLoader().getResourceAsStream(s);
        if (inputstream == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unable to load resource: ").append(s).toString());
        } else
        {
            return new Scanner(inputstream, "UTF-8");
        }
    }

    private static Scanner createScanner(NameType nametype, RuleType ruletype, String s)
    {
        nametype = createResourceName(nametype, ruletype, s);
        ruletype = org/apache/commons/codec/language/bm/Languages.getClassLoader().getResourceAsStream(nametype);
        if (ruletype == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unable to load resource: ").append(nametype).toString());
        } else
        {
            return new Scanner(ruletype, "UTF-8");
        }
    }

    private static boolean endsWith(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence1.length() <= charsequence.length()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length() - 1;
        int i = charsequence1.length() - 1;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                if (charsequence.charAt(j) != charsequence1.charAt(i))
                {
                    break label0;
                }
                j--;
                i--;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static List getInstance(NameType nametype, RuleType ruletype, String s)
    {
        List list = (List)((Map)((Map)RULES.get(nametype)).get(ruletype)).get(s);
        if (list == null)
        {
            throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", new Object[] {
                nametype.getName(), ruletype.getName(), s
            }));
        } else
        {
            return list;
        }
    }

    public static List getInstance(NameType nametype, RuleType ruletype, Languages.LanguageSet languageset)
    {
        if (languageset.isSingleton())
        {
            return getInstance(nametype, ruletype, languageset.getAny());
        } else
        {
            return getInstance(nametype, ruletype, "any");
        }
    }

    private static Phoneme parsePhoneme(String s)
    {
        int i = s.indexOf("[");
        if (i >= 0)
        {
            if (!s.endsWith("]"))
            {
                throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
            } else
            {
                return new Phoneme(s.substring(0, i), Languages.LanguageSet.from(new HashSet(Arrays.asList(s.substring(i + 1, s.length() - 1).split("[+]")))));
            }
        } else
        {
            return new Phoneme(s, Languages.ANY_LANGUAGE);
        }
    }

    private static PhonemeExpr parsePhonemeExpr(String s)
    {
        if (s.startsWith("("))
        {
            if (!s.endsWith(")"))
            {
                throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
            }
            ArrayList arraylist = new ArrayList();
            s = s.substring(1, s.length() - 1);
            String as[] = s.split("[|]");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(parsePhoneme(as[i]));
            }

            if (s.startsWith("|") || s.endsWith("|"))
            {
                arraylist.add(new Phoneme("", Languages.ANY_LANGUAGE));
            }
            return new PhonemeList(arraylist);
        } else
        {
            return parsePhoneme(s);
        }
    }

    private static List parseRules(Scanner scanner, String s)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        boolean flag = false;
        do
        {
            if (!scanner.hasNextLine())
            {
                break;
            }
            int j = i + 1;
            String s3 = scanner.nextLine();
            String s1 = s3;
            if (flag)
            {
                i = j;
                if (s1.endsWith("*/"))
                {
                    flag = false;
                    i = j;
                }
            } else
            if (s1.startsWith("/*"))
            {
                flag = true;
                i = j;
            } else
            {
                i = s1.indexOf("//");
                String s2 = s1;
                if (i >= 0)
                {
                    s2 = s1.substring(0, i);
                }
                s1 = s2.trim();
                i = j;
                if (s1.length() != 0)
                {
                    if (s1.startsWith("#include"))
                    {
                        s1 = s1.substring("#include".length()).trim();
                        if (s1.contains(" "))
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Malformed import statement '").append(s3).append("' in ").append(s).toString());
                        }
                        arraylist.addAll(parseRules(createScanner(s1), (new StringBuilder()).append(s).append("->").append(s1).toString()));
                        i = j;
                    } else
                    {
                        String as[] = s1.split("\\s+");
                        if (as.length != 4)
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Malformed rule statement split into ").append(as.length).append(" parts: ").append(s3).append(" in ").append(s).toString());
                        }
                        try
                        {
                            arraylist.add(new Rule(stripQuotes(as[0]), stripQuotes(as[1]), stripQuotes(as[2]), parsePhonemeExpr(stripQuotes(as[3])), j, s) {

                                private final String loc;
                                private final int myLine;
                                final int val$cLine;
                                final String val$location;

                                public String toString()
                                {
                                    StringBuilder stringbuilder = new StringBuilder();
                                    stringbuilder.append("Rule");
                                    stringbuilder.append("{line=").append(myLine);
                                    stringbuilder.append(", loc='").append(loc).append('\'');
                                    stringbuilder.append('}');
                                    return stringbuilder.toString();
                                }

            
            {
                cLine = i;
                location = s3;
                super(s, s1, s2, phonemeexpr);
                myLine = cLine;
                loc = location;
            }
                            });
                        }
                        // Misplaced declaration of an exception variable
                        catch (Scanner scanner)
                        {
                            throw new IllegalStateException((new StringBuilder()).append("Problem parsing line '").append(j).append("' in ").append(s).toString(), scanner);
                        }
                        i = j;
                    }
                }
            }
        } while (true);
        return arraylist;
    }

    private static RPattern pattern(String s)
    {
        boolean flag = true;
        boolean flag1 = s.startsWith("^");
        boolean flag2 = s.endsWith("$");
        String s1;
        int i;
        int j;
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag2)
        {
            j = s.length() - 1;
        } else
        {
            j = s.length();
        }
        s1 = s.substring(i, j);
        if (!s1.contains("["))
        {
            if (flag1 && flag2)
            {
                if (s1.length() == 0)
                {
                    return new RPattern() {

                        public boolean isMatch(CharSequence charsequence)
                        {
                            return charsequence.length() == 0;
                        }

                    };
                } else
                {
                    return new RPattern(s1) {

                        final String val$content;

                        public boolean isMatch(CharSequence charsequence)
                        {
                            return charsequence.equals(content);
                        }

            
            {
                content = s;
                super();
            }
                    };
                }
            }
            if ((flag1 || flag2) && s1.length() == 0)
            {
                return ALL_STRINGS_RMATCHER;
            }
            if (flag1)
            {
                return new RPattern(s1) {

                    final String val$content;

                    public boolean isMatch(CharSequence charsequence)
                    {
                        return Rule.startsWith(charsequence, content);
                    }

            
            {
                content = s;
                super();
            }
                };
            }
            if (flag2)
            {
                return new RPattern(s1) {

                    final String val$content;

                    public boolean isMatch(CharSequence charsequence)
                    {
                        return Rule.endsWith(charsequence, content);
                    }

            
            {
                content = s;
                super();
            }
                };
            }
        } else
        {
            boolean flag3 = s1.startsWith("[");
            boolean flag5 = s1.endsWith("]");
            if (flag3 && flag5)
            {
                String s3 = s1.substring(1, s1.length() - 1);
                if (!s3.contains("["))
                {
                    boolean flag4 = s3.startsWith("^");
                    String s2 = s3;
                    if (flag4)
                    {
                        s2 = s3.substring(1);
                    }
                    if (flag4)
                    {
                        flag = false;
                    }
                    if (flag1 && flag2)
                    {
                        return new RPattern(s2, flag) {

                            final String val$bContent;
                            final boolean val$shouldMatch;

                            public boolean isMatch(CharSequence charsequence)
                            {
                                return charsequence.length() == 1 && Rule.contains(bContent, charsequence.charAt(0)) == shouldMatch;
                            }

            
            {
                bContent = s;
                shouldMatch = flag;
                super();
            }
                        };
                    }
                    if (flag1)
                    {
                        return new RPattern(s2, flag) {

                            final String val$bContent;
                            final boolean val$shouldMatch;

                            public boolean isMatch(CharSequence charsequence)
                            {
                                boolean flag7 = false;
                                boolean flag6 = flag7;
                                if (charsequence.length() > 0)
                                {
                                    flag6 = flag7;
                                    if (Rule.contains(bContent, charsequence.charAt(0)) == shouldMatch)
                                    {
                                        flag6 = true;
                                    }
                                }
                                return flag6;
                            }

            
            {
                bContent = s;
                shouldMatch = flag;
                super();
            }
                        };
                    }
                    if (flag2)
                    {
                        return new RPattern(s2, flag) {

                            final String val$bContent;
                            final boolean val$shouldMatch;

                            public boolean isMatch(CharSequence charsequence)
                            {
                                return charsequence.length() > 0 && Rule.contains(bContent, charsequence.charAt(charsequence.length() - 1)) == shouldMatch;
                            }

            
            {
                bContent = s;
                shouldMatch = flag;
                super();
            }
                        };
                    }
                }
            }
        }
        return new RPattern(s) {

            Pattern pattern;
            final String val$regex;

            public boolean isMatch(CharSequence charsequence)
            {
                return pattern.matcher(charsequence).find();
            }

            
            {
                regex = s;
                super();
                pattern = Pattern.compile(regex);
            }
        };
    }

    private static boolean startsWith(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence1.length() <= charsequence.length()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= charsequence1.length())
                {
                    break label1;
                }
                if (charsequence.charAt(i) != charsequence1.charAt(i))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static String stripQuotes(String s)
    {
        String s1 = s;
        if (s.startsWith("\""))
        {
            s1 = s.substring(1);
        }
        s = s1;
        if (s1.endsWith("\""))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        return s;
    }

    public RPattern getLContext()
    {
        return lContext;
    }

    public String getPattern()
    {
        return pattern;
    }

    public PhonemeExpr getPhoneme()
    {
        return phoneme;
    }

    public RPattern getRContext()
    {
        return rContext;
    }

    public boolean patternAndContextMatches(CharSequence charsequence, int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        for (int j = i + pattern.length(); j > charsequence.length() || !charsequence.subSequence(i, j).equals(pattern) || !rContext.isMatch(charsequence.subSequence(j, charsequence.length()));)
        {
            return false;
        }

        return lContext.isMatch(charsequence.subSequence(0, i));
    }

    static 
    {
        RULES = new EnumMap(org/apache/commons/codec/language/bm/NameType);
        NameType anametype[] = NameType.values();
        int k = anametype.length;
        for (int i = 0; i < k; i++)
        {
            NameType nametype = anametype[i];
            EnumMap enummap = new EnumMap(org/apache/commons/codec/language/bm/RuleType);
            RuleType aruletype[] = RuleType.values();
            int l = aruletype.length;
            for (int j = 0; j < l; j++)
            {
                RuleType ruletype = aruletype[j];
                HashMap hashmap = new HashMap();
                for (Iterator iterator = Languages.getInstance(nametype).getLanguages().iterator(); iterator.hasNext();)
                {
                    String s = (String)iterator.next();
                    try
                    {
                        hashmap.put(s, parseRules(createScanner(nametype, ruletype, s), createResourceName(nametype, ruletype, s)));
                    }
                    catch (IllegalStateException illegalstateexception)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Problem processing ").append(createResourceName(nametype, ruletype, s)).toString(), illegalstateexception);
                    }
                }

                if (!ruletype.equals(RuleType.RULES))
                {
                    hashmap.put("common", parseRules(createScanner(nametype, ruletype, "common"), createResourceName(nametype, ruletype, "common")));
                }
                enummap.put(ruletype, Collections.unmodifiableMap(hashmap));
            }

            RULES.put(nametype, Collections.unmodifiableMap(enummap));
        }

    }



}
