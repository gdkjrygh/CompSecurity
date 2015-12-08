// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrMatcher, StrLookup, StrBuilder

public class StrSubstitutor
{

    public static final char DEFAULT_ESCAPE = 36;
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher("}");
    private boolean enableSubstitutionInVariables;
    private char escapeChar;
    private StrMatcher prefixMatcher;
    private StrMatcher suffixMatcher;
    private StrLookup variableResolver;

    public StrSubstitutor()
    {
        this((StrLookup)null, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor(Map map)
    {
        this(StrLookup.mapLookup(map), DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor(Map map, String s, String s1)
    {
        this(StrLookup.mapLookup(map), s, s1, '$');
    }

    public StrSubstitutor(Map map, String s, String s1, char c)
    {
        this(StrLookup.mapLookup(map), s, s1, c);
    }

    public StrSubstitutor(StrLookup strlookup)
    {
        this(strlookup, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor(StrLookup strlookup, String s, String s1, char c)
    {
        setVariableResolver(strlookup);
        setVariablePrefix(s);
        setVariableSuffix(s1);
        setEscapeChar(c);
    }

    public StrSubstitutor(StrLookup strlookup, StrMatcher strmatcher, StrMatcher strmatcher1, char c)
    {
        setVariableResolver(strlookup);
        setVariablePrefixMatcher(strmatcher);
        setVariableSuffixMatcher(strmatcher1);
        setEscapeChar(c);
    }

    private void checkCyclicSubstitution(String s, List list)
    {
        if (!list.contains(s))
        {
            return;
        } else
        {
            s = new StrBuilder(256);
            s.append("Infinite loop in property interpolation of ");
            s.append((String)list.remove(0));
            s.append(": ");
            s.appendWithSeparators(list, "->");
            throw new IllegalStateException(s.toString());
        }
    }

    public static String replace(Object obj, Map map)
    {
        return (new StrSubstitutor(map)).replace(obj);
    }

    public static String replace(Object obj, Map map, String s, String s1)
    {
        return (new StrSubstitutor(map, s, s1)).replace(obj);
    }

    public static String replace(Object obj, Properties properties)
    {
        if (properties == null)
        {
            return obj.toString();
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Enumeration enumeration = properties.propertyNames(); enumeration.hasMoreElements(); hashmap.put(s, properties.getProperty(s)))
        {
            s = (String)enumeration.nextElement();
        }

        return replace(obj, ((Map) (hashmap)));
    }

    public static String replaceSystemProperties(Object obj)
    {
        return (new StrSubstitutor(StrLookup.systemPropertiesLookup())).replace(obj);
    }

    private int substitute(StrBuilder strbuilder, int i, int j, List list)
    {
        StrMatcher strmatcher = getVariablePrefixMatcher();
        StrMatcher strmatcher1 = getVariableSuffixMatcher();
        char c = getEscapeChar();
        Object obj;
        char ac[];
        int l;
        int i1;
        int j1;
        boolean flag;
        boolean flag1;
        if (list == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = false;
        j1 = 0;
        ac = strbuilder.buffer;
        i1 = i + j;
        l = i;
        obj = list;
        list = ac;
label0:
        do
        {
            int l1 = l;
            if (l1 < i1)
            {
                int i2 = strmatcher.isMatch(list, l1, i, i1);
                if (i2 == 0)
                {
                    l = l1 + 1;
                    continue;
                }
                if (l1 > i && list[l1 - 1] == c)
                {
                    strbuilder.deleteCharAt(l1 - 1);
                    list = strbuilder.buffer;
                    j1--;
                    flag = true;
                    i1--;
                    l = l1;
                    continue;
                }
                int k = l1 + i2;
                int k1 = 0;
                do
                {
                    l = k;
                    if (k >= i1)
                    {
                        continue label0;
                    }
                    if (isEnableSubstitutionInVariables())
                    {
                        l = strmatcher.isMatch(list, k, i, i1);
                        if (l != 0)
                        {
                            k1++;
                            k += l;
                            continue;
                        }
                    }
                    l = strmatcher1.isMatch(list, k, i, i1);
                    if (l == 0)
                    {
                        k++;
                    } else
                    {
                        if (k1 == 0)
                        {
                            Object obj1 = new String(list, l1 + i2, k - l1 - i2);
                            String s = ((String) (obj1));
                            if (isEnableSubstitutionInVariables())
                            {
                                obj1 = new StrBuilder(((String) (obj1)));
                                substitute(((StrBuilder) (obj1)), 0, ((StrBuilder) (obj1)).length());
                                s = ((StrBuilder) (obj1)).toString();
                            }
                            i2 = k + l;
                            obj1 = obj;
                            if (obj == null)
                            {
                                obj1 = new ArrayList();
                                ((List) (obj1)).add(new String(list, i, j));
                            }
                            checkCyclicSubstitution(s, ((List) (obj1)));
                            ((List) (obj1)).add(s);
                            obj = resolveVariable(s, strbuilder, l1, i2);
                            k1 = i1;
                            k = j1;
                            l = i2;
                            if (obj != null)
                            {
                                k = ((String) (obj)).length();
                                strbuilder.replace(l1, i2, ((String) (obj)));
                                flag = true;
                                k = (substitute(strbuilder, l1, k, ((List) (obj1))) + k) - (i2 - l1);
                                l = i2 + k;
                                k1 = i1 + k;
                                k = j1 + k;
                                list = strbuilder.buffer;
                            }
                            ((List) (obj1)).remove(((List) (obj1)).size() - 1);
                            i1 = k1;
                            j1 = k;
                            obj = obj1;
                            continue label0;
                        }
                        k1--;
                        k += l;
                    }
                } while (true);
            }
            if (flag1)
            {
                return !flag ? 0 : 1;
            }
            return j1;
        } while (true);
    }

    public char getEscapeChar()
    {
        return escapeChar;
    }

    public StrMatcher getVariablePrefixMatcher()
    {
        return prefixMatcher;
    }

    public StrLookup getVariableResolver()
    {
        return variableResolver;
    }

    public StrMatcher getVariableSuffixMatcher()
    {
        return suffixMatcher;
    }

    public boolean isEnableSubstitutionInVariables()
    {
        return enableSubstitutionInVariables;
    }

    public String replace(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            obj = (new StrBuilder()).append(obj);
            substitute(((StrBuilder) (obj)), 0, ((StrBuilder) (obj)).length());
            return ((StrBuilder) (obj)).toString();
        }
    }

    public String replace(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            StrBuilder strbuilder = new StrBuilder(s);
            s1 = s;
            if (substitute(strbuilder, 0, s.length()))
            {
                return strbuilder.toString();
            }
        }
        return s1;
    }

    public String replace(String s, int i, int j)
    {
        if (s == null)
        {
            return null;
        }
        StrBuilder strbuilder = (new StrBuilder(j)).append(s, i, j);
        if (!substitute(strbuilder, 0, j))
        {
            return s.substring(i, i + j);
        } else
        {
            return strbuilder.toString();
        }
    }

    public String replace(StringBuffer stringbuffer)
    {
        if (stringbuffer == null)
        {
            return null;
        } else
        {
            stringbuffer = (new StrBuilder(stringbuffer.length())).append(stringbuffer);
            substitute(stringbuffer, 0, stringbuffer.length());
            return stringbuffer.toString();
        }
    }

    public String replace(StringBuffer stringbuffer, int i, int j)
    {
        if (stringbuffer == null)
        {
            return null;
        } else
        {
            stringbuffer = (new StrBuilder(j)).append(stringbuffer, i, j);
            substitute(stringbuffer, 0, j);
            return stringbuffer.toString();
        }
    }

    public String replace(StrBuilder strbuilder)
    {
        if (strbuilder == null)
        {
            return null;
        } else
        {
            strbuilder = (new StrBuilder(strbuilder.length())).append(strbuilder);
            substitute(strbuilder, 0, strbuilder.length());
            return strbuilder.toString();
        }
    }

    public String replace(StrBuilder strbuilder, int i, int j)
    {
        if (strbuilder == null)
        {
            return null;
        } else
        {
            strbuilder = (new StrBuilder(j)).append(strbuilder, i, j);
            substitute(strbuilder, 0, j);
            return strbuilder.toString();
        }
    }

    public String replace(char ac[])
    {
        if (ac == null)
        {
            return null;
        } else
        {
            StrBuilder strbuilder = (new StrBuilder(ac.length)).append(ac);
            substitute(strbuilder, 0, ac.length);
            return strbuilder.toString();
        }
    }

    public String replace(char ac[], int i, int j)
    {
        if (ac == null)
        {
            return null;
        } else
        {
            ac = (new StrBuilder(j)).append(ac, i, j);
            substitute(ac, 0, j);
            return ac.toString();
        }
    }

    public boolean replaceIn(StringBuffer stringbuffer)
    {
        if (stringbuffer == null)
        {
            return false;
        } else
        {
            return replaceIn(stringbuffer, 0, stringbuffer.length());
        }
    }

    public boolean replaceIn(StringBuffer stringbuffer, int i, int j)
    {
        StrBuilder strbuilder;
        if (stringbuffer != null)
        {
            if (substitute(strbuilder = (new StrBuilder(j)).append(stringbuffer, i, j), 0, j))
            {
                stringbuffer.replace(i, i + j, strbuilder.toString());
                return true;
            }
        }
        return false;
    }

    public boolean replaceIn(StrBuilder strbuilder)
    {
        if (strbuilder == null)
        {
            return false;
        } else
        {
            return substitute(strbuilder, 0, strbuilder.length());
        }
    }

    public boolean replaceIn(StrBuilder strbuilder, int i, int j)
    {
        if (strbuilder == null)
        {
            return false;
        } else
        {
            return substitute(strbuilder, i, j);
        }
    }

    protected String resolveVariable(String s, StrBuilder strbuilder, int i, int j)
    {
        strbuilder = getVariableResolver();
        if (strbuilder == null)
        {
            return null;
        } else
        {
            return strbuilder.lookup(s);
        }
    }

    public void setEnableSubstitutionInVariables(boolean flag)
    {
        enableSubstitutionInVariables = flag;
    }

    public void setEscapeChar(char c)
    {
        escapeChar = c;
    }

    public StrSubstitutor setVariablePrefix(char c)
    {
        return setVariablePrefixMatcher(StrMatcher.charMatcher(c));
    }

    public StrSubstitutor setVariablePrefix(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Variable prefix must not be null!");
        } else
        {
            return setVariablePrefixMatcher(StrMatcher.stringMatcher(s));
        }
    }

    public StrSubstitutor setVariablePrefixMatcher(StrMatcher strmatcher)
    {
        if (strmatcher == null)
        {
            throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        } else
        {
            prefixMatcher = strmatcher;
            return this;
        }
    }

    public void setVariableResolver(StrLookup strlookup)
    {
        variableResolver = strlookup;
    }

    public StrSubstitutor setVariableSuffix(char c)
    {
        return setVariableSuffixMatcher(StrMatcher.charMatcher(c));
    }

    public StrSubstitutor setVariableSuffix(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Variable suffix must not be null!");
        } else
        {
            return setVariableSuffixMatcher(StrMatcher.stringMatcher(s));
        }
    }

    public StrSubstitutor setVariableSuffixMatcher(StrMatcher strmatcher)
    {
        if (strmatcher == null)
        {
            throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        } else
        {
            suffixMatcher = strmatcher;
            return this;
        }
    }

    protected boolean substitute(StrBuilder strbuilder, int i, int j)
    {
        return substitute(strbuilder, i, j, null) > 0;
    }

}
