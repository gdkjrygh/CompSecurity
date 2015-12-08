// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            NameType, RuleType, Lang, Rule

public class PhoneticEngine
{
    static final class PhonemeBuilder
    {

        private final Set phonemes;

        public static PhonemeBuilder empty(Languages.LanguageSet languageset)
        {
            return new PhonemeBuilder(Collections.singleton(new Rule.Phoneme("", languageset)));
        }

        public PhonemeBuilder append(CharSequence charsequence)
        {
            LinkedHashSet linkedhashset = new LinkedHashSet();
            for (Iterator iterator = phonemes.iterator(); iterator.hasNext(); linkedhashset.add(((Rule.Phoneme)iterator.next()).append(charsequence))) { }
            return new PhonemeBuilder(linkedhashset);
        }

        public PhonemeBuilder apply(Rule.PhonemeExpr phonemeexpr, int i)
        {
            LinkedHashSet linkedhashset;
            linkedhashset = new LinkedHashSet();
            Iterator iterator = phonemes.iterator();
            do
            {
label0:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    Rule.Phoneme phoneme = (Rule.Phoneme)iterator.next();
                    Iterator iterator1 = phonemeexpr.getPhonemes().iterator();
                    while (iterator1.hasNext()) 
                    {
                        Rule.Phoneme phoneme1 = phoneme.join((Rule.Phoneme)iterator1.next());
                        if (!phoneme1.getLanguages().isEmpty())
                        {
                            if (linkedhashset.size() >= i)
                            {
                                break label0;
                            }
                            linkedhashset.add(phoneme1);
                        }
                    }
                }
            } while (true);
            return new PhonemeBuilder(linkedhashset);
        }

        public Set getPhonemes()
        {
            return phonemes;
        }

        public String makeString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            Rule.Phoneme phoneme;
            for (Iterator iterator = phonemes.iterator(); iterator.hasNext(); stringbuilder.append(phoneme.getPhonemeText()))
            {
                phoneme = (Rule.Phoneme)iterator.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append("|");
                }
            }

            return stringbuilder.toString();
        }

        private PhonemeBuilder(Set set)
        {
            phonemes = set;
        }

    }

    private static final class RulesApplication
    {

        private final List finalRules;
        private boolean found;
        private int i;
        private final CharSequence input;
        private final int maxPhonemes;
        private PhonemeBuilder phonemeBuilder;

        public int getI()
        {
            return i;
        }

        public PhonemeBuilder getPhonemeBuilder()
        {
            return phonemeBuilder;
        }

        public RulesApplication invoke()
        {
            found = false;
            int j = 0;
            Iterator iterator = finalRules.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Rule rule = (Rule)iterator.next();
                int k = rule.getPattern().length();
                j = k;
                if (!rule.patternAndContextMatches(input, i))
                {
                    continue;
                }
                phonemeBuilder = phonemeBuilder.apply(rule.getPhoneme(), maxPhonemes);
                found = true;
                j = k;
                break;
            } while (true);
            if (!found)
            {
                j = 1;
            }
            i = i + j;
            return this;
        }

        public boolean isFound()
        {
            return found;
        }

        public RulesApplication(List list, CharSequence charsequence, PhonemeBuilder phonemebuilder, int j, int k)
        {
            if (list == null)
            {
                throw new NullPointerException("The finalRules argument must not be null");
            } else
            {
                finalRules = list;
                phonemeBuilder = phonemebuilder;
                input = charsequence;
                i = j;
                maxPhonemes = k;
                return;
            }
        }
    }


    private static final int DEFAULT_MAX_PHONEMES = 20;
    private static final Map NAME_PREFIXES;
    private final boolean concat;
    private final Lang lang;
    private final int maxPhonemes;
    private final NameType nameType;
    private final RuleType ruleType;

    public PhoneticEngine(NameType nametype, RuleType ruletype, boolean flag)
    {
        this(nametype, ruletype, flag, 20);
    }

    public PhoneticEngine(NameType nametype, RuleType ruletype, boolean flag, int i)
    {
        if (ruletype == RuleType.RULES)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("ruleType must not be ").append(RuleType.RULES).toString());
        } else
        {
            nameType = nametype;
            ruleType = ruletype;
            concat = flag;
            lang = Lang.instance(nametype);
            maxPhonemes = i;
            return;
        }
    }

    private PhonemeBuilder applyFinalRules(PhonemeBuilder phonemebuilder, List list)
    {
        if (list == null)
        {
            throw new NullPointerException("finalRules can not be null");
        }
        if (list.isEmpty())
        {
            return phonemebuilder;
        }
        TreeSet treeset = new TreeSet(Rule.Phoneme.COMPARATOR);
        for (Iterator iterator = phonemebuilder.getPhonemes().iterator(); iterator.hasNext(); treeset.addAll(phonemebuilder.getPhonemes()))
        {
            Rule.Phoneme phoneme = (Rule.Phoneme)iterator.next();
            phonemebuilder = PhonemeBuilder.empty(phoneme.getLanguages());
            CharSequence charsequence = cacheSubSequence(phoneme.getPhonemeText());
            RulesApplication rulesapplication;
            for (int i = 0; i < charsequence.length(); i = rulesapplication.getI())
            {
                rulesapplication = (new RulesApplication(list, charsequence, phonemebuilder, i, maxPhonemes)).invoke();
                boolean flag = rulesapplication.isFound();
                PhonemeBuilder phonemebuilder1 = rulesapplication.getPhonemeBuilder();
                phonemebuilder = phonemebuilder1;
                if (!flag)
                {
                    phonemebuilder = phonemebuilder1.append(charsequence.subSequence(i, i + 1));
                }
            }

        }

        return new PhonemeBuilder(treeset);
    }

    private static CharSequence cacheSubSequence(CharSequence charsequence)
    {
        return new CharSequence(charsequence, (CharSequence[][])Array.newInstance(java/lang/CharSequence, new int[] {
            charsequence.length(), charsequence.length()
        })) {

            final CharSequence val$cache[][];
            final CharSequence val$cached;

            public char charAt(int i)
            {
                return cached.charAt(i);
            }

            public int length()
            {
                return cached.length();
            }

            public CharSequence subSequence(int i, int j)
            {
                Object obj;
                if (i == j)
                {
                    obj = "";
                } else
                {
                    CharSequence charsequence2 = cache[i][j - 1];
                    obj = charsequence2;
                    if (charsequence2 == null)
                    {
                        CharSequence charsequence1 = cached.subSequence(i, j);
                        cache[i][j - 1] = charsequence1;
                        return charsequence1;
                    }
                }
                return ((CharSequence) (obj));
            }

            
            {
                cached = charsequence;
                cache = acharsequence;
                super();
            }
        };
    }

    private static String join(Iterable iterable, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        iterable = iterable.iterator();
        if (iterable.hasNext())
        {
            stringbuilder.append((String)iterable.next());
        }
        for (; iterable.hasNext(); stringbuilder.append(s).append((String)iterable.next())) { }
        return stringbuilder.toString();
    }

    public String encode(String s)
    {
        return encode(s, lang.guessLanguages(s));
    }

    public String encode(String s, Languages.LanguageSet languageset)
    {
        List list1;
        List list2;
        Object obj;
        List list;
label0:
        {
            list = Rule.getInstance(nameType, RuleType.RULES, languageset);
            list1 = Rule.getInstance(nameType, ruleType, "common");
            list2 = Rule.getInstance(nameType, ruleType, languageset);
            obj = s.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
            if (nameType != NameType.GENERIC)
            {
                break label0;
            }
            if (((String) (obj)).length() >= 2 && ((String) (obj)).substring(0, 2).equals("d'"))
            {
                s = ((String) (obj)).substring(2);
                languageset = (new StringBuilder()).append("d").append(s).toString();
                return (new StringBuilder()).append("(").append(encode(s)).append(")-(").append(encode(((String) (languageset)))).append(")").toString();
            }
            Iterator iterator = ((Set)NAME_PREFIXES.get(nameType)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s = (String)iterator.next();
            } while (!((String) (obj)).startsWith((new StringBuilder()).append(s).append(" ").toString()));
            languageset = ((String) (obj)).substring(s.length() + 1);
            s = (new StringBuilder()).append(s).append(languageset).toString();
            return (new StringBuilder()).append("(").append(encode(((String) (languageset)))).append(")-(").append(encode(s)).append(")").toString();
        }
        obj = Arrays.asList(((String) (obj)).split("\\s+"));
        s = new ArrayList();
        static class _cls2
        {

            static final int $SwitchMap$org$apache$commons$codec$language$bm$NameType[];

            static 
            {
                $SwitchMap$org$apache$commons$codec$language$bm$NameType = new int[NameType.values().length];
                try
                {
                    $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.SEPHARDIC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.ASHKENAZI.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.GENERIC.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int i;
        switch (_cls2..SwitchMap.org.apache.commons.codec.language.bm.NameType[nameType.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unreachable case: ").append(nameType).toString());

        case 1: // '\001'
            String as[];
            for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext(); s.add(as[as.length - 1]))
            {
                as = ((String)iterator1.next()).split("'");
            }

            s.removeAll((Collection)NAME_PREFIXES.get(nameType));
            break;

        case 2: // '\002'
            s.addAll(((Collection) (obj)));
            s.removeAll((Collection)NAME_PREFIXES.get(nameType));
            continue;

        case 3: // '\003'
            s.addAll(((Collection) (obj)));
            continue;
        }
        break;
        do
        {
            if (concat)
            {
                s = join(s, " ");
            } else
            if (s.size() == 1)
            {
                s = (String)((List) (obj)).iterator().next();
            } else
            {
                languageset = new StringBuilder();
                String s1;
                for (s = s.iterator(); s.hasNext(); languageset.append("-").append(encode(s1)))
                {
                    s1 = (String)s.next();
                }

                return languageset.substring(1);
            }
            languageset = PhonemeBuilder.empty(languageset);
            obj = cacheSubSequence(s);
            i = 0;
            for (s = languageset; i < ((CharSequence) (obj)).length(); s = s.getPhonemeBuilder())
            {
                s = (new RulesApplication(list, ((CharSequence) (obj)), s, i, maxPhonemes)).invoke();
                i = s.getI();
            }

            return applyFinalRules(applyFinalRules(s, list1), list2).makeString();
        } while (true);
    }

    public Lang getLang()
    {
        return lang;
    }

    public int getMaxPhonemes()
    {
        return maxPhonemes;
    }

    public NameType getNameType()
    {
        return nameType;
    }

    public RuleType getRuleType()
    {
        return ruleType;
    }

    public boolean isConcat()
    {
        return concat;
    }

    static 
    {
        NAME_PREFIXES = new EnumMap(org/apache/commons/codec/language/bm/NameType);
        NAME_PREFIXES.put(NameType.ASHKENAZI, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
            "bar", "ben", "da", "de", "van", "von"
        }))));
        NAME_PREFIXES.put(NameType.SEPHARDIC, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
            "al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", 
            "di", "do", "dos", "du", "van", "von"
        }))));
        NAME_PREFIXES.put(NameType.GENERIC, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
            "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", 
            "dos", "du", "van", "von"
        }))));
    }
}
