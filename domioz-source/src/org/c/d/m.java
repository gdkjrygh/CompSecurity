// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

// Referenced classes of package org.c.d:
//            k, d

public abstract class m
{

    public m()
    {
    }

    private static String a(String s, boolean flag)
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(s.length());
        if (flag)
        {
            stringbuilder.append(Character.toUpperCase(s.charAt(0)));
        } else
        {
            stringbuilder.append(Character.toLowerCase(s.charAt(0)));
        }
        stringbuilder.append(s.substring(1));
        return stringbuilder.toString();
    }

    private static void a(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c != '_' && c != ' ' && !Character.isLetterOrDigit(c))
            {
                throw new IllegalArgumentException((new StringBuilder("Locale part \"")).append(s).append("\" contains invalid characters").toString());
            }
        }

    }

    public static String[] addStringToArray(String as[], String s)
    {
        if (k.isEmpty(as))
        {
            return (new String[] {
                s
            });
        } else
        {
            String as1[] = new String[as.length + 1];
            System.arraycopy(as, 0, as1, 0, as.length);
            as1[as.length] = s;
            return as1;
        }
    }

    public static String applyRelativePath(String s, String s1)
    {
        int i = s.lastIndexOf("/");
        String s2 = s1;
        if (i != -1)
        {
            s2 = s.substring(0, i);
            s = s2;
            if (!s1.startsWith("/"))
            {
                s = (new StringBuilder()).append(s2).append("/").toString();
            }
            s2 = (new StringBuilder()).append(s).append(s1).toString();
        }
        return s2;
    }

    public static String arrayToCommaDelimitedString(Object aobj[])
    {
        return arrayToDelimitedString(aobj, ",");
    }

    public static String arrayToDelimitedString(Object aobj[], String s)
    {
        int i = 0;
        if (k.isEmpty(aobj))
        {
            return "";
        }
        if (aobj.length == 1)
        {
            return k.nullSafeToString(aobj[0]);
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (; i < aobj.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            stringbuilder.append(aobj[i]);
        }

        return stringbuilder.toString();
    }

    public static String capitalize(String s)
    {
        return a(s, true);
    }

    public static String cleanPath(String s)
    {
        if (s == null)
        {
            return null;
        }
        String s1 = replace(s, "\\", "/");
        int i = s1.indexOf(":");
        Object obj = "";
        s = s1;
        if (i != -1)
        {
            obj = s1.substring(0, i + 1);
            s = s1.substring(i + 1);
        }
        s1 = ((String) (obj));
        String s2 = s;
        if (s.startsWith("/"))
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("/").toString();
            s2 = s.substring(1);
        }
        s = delimitedListToStringArray(s2, "/");
        obj = new LinkedList();
        int j1 = s.length - 1;
        int i1 = 0;
        while (j1 >= 0) 
        {
            Object obj1 = s[j1];
            int j = i1;
            if (!".".equals(obj1))
            {
                if ("..".equals(obj1))
                {
                    j = i1 + 1;
                } else
                if (i1 > 0)
                {
                    j = i1 - 1;
                } else
                {
                    ((List) (obj)).add(0, obj1);
                    j = i1;
                }
            }
            j1--;
            i1 = j;
        }
        for (int l = 0; l < i1; l++)
        {
            ((List) (obj)).add(0, "..");
        }

        return (new StringBuilder()).append(s1).append(collectionToDelimitedString(((Collection) (obj)), "/")).toString();
    }

    public static String collectionToCommaDelimitedString(Collection collection)
    {
        return collectionToDelimitedString(collection, ",");
    }

    public static String collectionToDelimitedString(Collection collection, String s)
    {
        return collectionToDelimitedString(collection, s, "", "");
    }

    public static String collectionToDelimitedString(Collection collection, String s, String s1, String s2)
    {
        if (d.isEmpty(collection))
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            stringbuilder.append(s1).append(collection.next()).append(s2);
            if (collection.hasNext())
            {
                stringbuilder.append(s);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static Set commaDelimitedListToSet(String s)
    {
        TreeSet treeset = new TreeSet();
        s = commaDelimitedListToStringArray(s);
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            treeset.add(s[i]);
        }

        return treeset;
    }

    public static String[] commaDelimitedListToStringArray(String s)
    {
        return delimitedListToStringArray(s, ",");
    }

    public static String[] concatenateStringArrays(String as[], String as1[])
    {
        if (k.isEmpty(as))
        {
            return as1;
        }
        if (k.isEmpty(as1))
        {
            return as;
        } else
        {
            String as2[] = new String[as.length + as1.length];
            System.arraycopy(as, 0, as2, 0, as.length);
            System.arraycopy(as1, 0, as2, as.length, as1.length);
            return as2;
        }
    }

    public static boolean containsWhitespace(CharSequence charsequence)
    {
        if (hasLength(charsequence))
        {
            int j = charsequence.length();
            int i = 0;
            while (i < j) 
            {
                if (Character.isWhitespace(charsequence.charAt(i)))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean containsWhitespace(String s)
    {
        return containsWhitespace(((CharSequence) (s)));
    }

    public static int countOccurrencesOf(String s, String s1)
    {
        int j = 0;
        if (s != null && s1 != null && s.length() != 0 && s1.length() != 0) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        return j;
_L2:
        int i = 0;
        do
        {
            int l = s.indexOf(s1, j);
            j = i;
            if (l == -1)
            {
                continue;
            }
            i++;
            j = l + s1.length();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String delete(String s, String s1)
    {
        return replace(s, s1, "");
    }

    public static String deleteAny(String s, String s1)
    {
        if (!hasLength(s) || !hasLength(s1))
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (s1.indexOf(c) == -1)
            {
                stringbuilder.append(c);
            }
        }

        return stringbuilder.toString();
    }

    public static String[] delimitedListToStringArray(String s, String s1)
    {
        return delimitedListToStringArray(s, s1, null);
    }

    public static String[] delimitedListToStringArray(String s, String s1, String s2)
    {
        int i = 0;
        boolean flag = false;
        if (s == null)
        {
            return new String[0];
        }
        if (s1 == null)
        {
            return (new String[] {
                s
            });
        }
        ArrayList arraylist = new ArrayList();
        if ("".equals(s1))
        {
            for (i = ((flag) ? 1 : 0); i < s.length(); i++)
            {
                arraylist.add(deleteAny(s.substring(i, i + 1), s2));
            }

        } else
        {
            do
            {
                int j = s.indexOf(s1, i);
                if (j == -1)
                {
                    break;
                }
                arraylist.add(deleteAny(s.substring(i, j), s2));
                i = s1.length() + j;
            } while (true);
            if (s.length() > 0 && i <= s.length())
            {
                arraylist.add(deleteAny(s.substring(i), s2));
            }
        }
        return toStringArray(arraylist);
    }

    public static boolean endsWithIgnoreCase(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            if (s.endsWith(s1))
            {
                return true;
            }
            if (s.length() >= s1.length())
            {
                return s.substring(s.length() - s1.length()).toLowerCase().equals(s1.toLowerCase());
            }
        }
        return false;
    }

    public static String getFilename(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int i = s.lastIndexOf("/");
            s1 = s;
            if (i != -1)
            {
                return s.substring(i + 1);
            }
        }
        return s1;
    }

    public static String getFilenameExtension(String s)
    {
        int i;
        if (s != null)
        {
            if ((i = s.lastIndexOf('.')) != -1 && s.lastIndexOf("/") <= i)
            {
                return s.substring(i + 1);
            }
        }
        return null;
    }

    public static boolean hasLength(CharSequence charsequence)
    {
        return charsequence != null && charsequence.length() > 0;
    }

    public static boolean hasLength(String s)
    {
        return hasLength(((CharSequence) (s)));
    }

    public static boolean hasText(CharSequence charsequence)
    {
        if (hasLength(charsequence))
        {
            int j = charsequence.length();
            int i = 0;
            while (i < j) 
            {
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean hasText(String s)
    {
        return hasText(((CharSequence) (s)));
    }

    public static String[] mergeStringArrays(String as[], String as1[])
    {
        if (k.isEmpty(as))
        {
            return as1;
        }
        if (k.isEmpty(as1))
        {
            return as;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(as));
        int j = as1.length;
        for (int i = 0; i < j; i++)
        {
            as = as1[i];
            if (!arraylist.contains(as))
            {
                arraylist.add(as);
            }
        }

        return toStringArray(arraylist);
    }

    public static Locale parseLocaleString(String s)
    {
        String as[] = tokenizeToStringArray(s, "_ ", false, false);
        String s1;
        String s2;
        String s3;
        if (as.length > 0)
        {
            s2 = as[0];
        } else
        {
            s2 = "";
        }
        if (as.length > 1)
        {
            s3 = as[1];
        } else
        {
            s3 = "";
        }
        a(s2);
        a(s3);
        s1 = "";
        if (as.length >= 2)
        {
            s = trimLeadingWhitespace(s.substring(s.indexOf(s3) + s3.length()));
            s1 = s;
            if (s.startsWith("_"))
            {
                s1 = trimLeadingCharacter(s, '_');
            }
        }
        if (s2.length() > 0)
        {
            return new Locale(s2, s3, s1);
        } else
        {
            return null;
        }
    }

    public static boolean pathEquals(String s, String s1)
    {
        return cleanPath(s).equals(cleanPath(s1));
    }

    public static String quote(String s)
    {
        if (s != null)
        {
            return (new StringBuilder("'")).append(s).append("'").toString();
        } else
        {
            return null;
        }
    }

    public static Object quoteIfString(Object obj)
    {
        Object obj1 = obj;
        if (obj instanceof String)
        {
            obj1 = quote((String)obj);
        }
        return obj1;
    }

    public static String[] removeDuplicateStrings(String as[])
    {
        if (k.isEmpty(as))
        {
            return as;
        }
        TreeSet treeset = new TreeSet();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            treeset.add(as[i]);
        }

        return toStringArray(treeset);
    }

    public static String replace(String s, String s1, String s2)
    {
        if (!hasLength(s) || !hasLength(s1) || s2 == null)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j = 0;
        int i = s.indexOf(s1);
        int l = s1.length();
        for (; i >= 0; i = s.indexOf(s1, j))
        {
            stringbuilder.append(s.substring(j, i));
            stringbuilder.append(s2);
            j = i + l;
        }

        stringbuilder.append(s.substring(j));
        return stringbuilder.toString();
    }

    public static String[] sortStringArray(String as[])
    {
        if (k.isEmpty(as))
        {
            return new String[0];
        } else
        {
            Arrays.sort(as);
            return as;
        }
    }

    public static String[] split(String s, String s1)
    {
        int i;
        if (hasLength(s) && hasLength(s1))
        {
            if ((i = s.indexOf(s1)) >= 0)
            {
                return (new String[] {
                    s.substring(0, i), s.substring(s1.length() + i)
                });
            }
        }
        return null;
    }

    public static Properties splitArrayElementsIntoProperties(String as[], String s)
    {
        return splitArrayElementsIntoProperties(as, s, null);
    }

    public static Properties splitArrayElementsIntoProperties(String as[], String s, String s1)
    {
        if (k.isEmpty(as))
        {
            return null;
        }
        Properties properties = new Properties();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s3 = as[i];
            String s2 = s3;
            if (s1 != null)
            {
                s2 = deleteAny(s3, s1);
            }
            String as1[] = split(s2, s);
            if (as1 != null)
            {
                properties.setProperty(as1[0].trim(), as1[1].trim());
            }
        }

        return properties;
    }

    public static boolean startsWithIgnoreCase(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            if (s.startsWith(s1))
            {
                return true;
            }
            if (s.length() >= s1.length())
            {
                return s.substring(0, s1.length()).toLowerCase().equals(s1.toLowerCase());
            }
        }
        return false;
    }

    public static String stripFilenameExtension(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int i = s.lastIndexOf('.');
            s1 = s;
            if (i != -1)
            {
                s1 = s;
                if (s.lastIndexOf("/") <= i)
                {
                    return s.substring(0, i);
                }
            }
        }
        return s1;
    }

    public static boolean substringMatch(CharSequence charsequence, int i, CharSequence charsequence1)
    {
        for (int j = 0; j < charsequence1.length(); j++)
        {
            int l = i + j;
            if (l >= charsequence.length() || charsequence.charAt(l) != charsequence1.charAt(j))
            {
                return false;
            }
        }

        return true;
    }

    public static String toLanguageTag(Locale locale)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(locale.getLanguage());
        if (hasText(locale.getCountry()))
        {
            locale = (new StringBuilder("-")).append(locale.getCountry()).toString();
        } else
        {
            locale = "";
        }
        return stringbuilder.append(locale).toString();
    }

    public static String[] toStringArray(Collection collection)
    {
        if (collection == null)
        {
            return null;
        } else
        {
            return (String[])collection.toArray(new String[collection.size()]);
        }
    }

    public static String[] toStringArray(Enumeration enumeration)
    {
        if (enumeration == null)
        {
            return null;
        } else
        {
            enumeration = Collections.list(enumeration);
            return (String[])enumeration.toArray(new String[enumeration.size()]);
        }
    }

    public static String[] tokenizeToStringArray(String s, String s1)
    {
        return tokenizeToStringArray(s, s1, true, true);
    }

    public static String[] tokenizeToStringArray(String s, String s1, boolean flag, boolean flag1)
    {
        if (s == null)
        {
            return null;
        }
        StringTokenizer stringtokenizer = new StringTokenizer(s, s1);
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!stringtokenizer.hasMoreTokens())
            {
                break;
            }
            s1 = stringtokenizer.nextToken();
            s = s1;
            if (flag)
            {
                s = s1.trim();
            }
            if (!flag1 || s.length() > 0)
            {
                arraylist.add(s);
            }
        } while (true);
        return toStringArray(arraylist);
    }

    public static String trimAllWhitespace(String s)
    {
        if (!hasLength(s))
        {
            return s;
        }
        s = new StringBuilder(s);
        for (int i = 0; s.length() > i;)
        {
            if (Character.isWhitespace(s.charAt(i)))
            {
                s.deleteCharAt(i);
            } else
            {
                i++;
            }
        }

        return s.toString();
    }

    public static String[] trimArrayElements(String as[])
    {
        int i = 0;
        if (k.isEmpty(as))
        {
            return new String[0];
        }
        String as1[] = new String[as.length];
        while (i < as.length) 
        {
            String s = as[i];
            if (s != null)
            {
                s = s.trim();
            } else
            {
                s = null;
            }
            as1[i] = s;
            i++;
        }
        return as1;
    }

    public static String trimLeadingCharacter(String s, char c)
    {
        if (!hasLength(s))
        {
            return s;
        }
        for (s = new StringBuilder(s); s.length() > 0 && s.charAt(0) == c; s.deleteCharAt(0)) { }
        return s.toString();
    }

    public static String trimLeadingWhitespace(String s)
    {
        if (!hasLength(s))
        {
            return s;
        }
        for (s = new StringBuilder(s); s.length() > 0 && Character.isWhitespace(s.charAt(0)); s.deleteCharAt(0)) { }
        return s.toString();
    }

    public static String trimTrailingCharacter(String s, char c)
    {
        if (!hasLength(s))
        {
            return s;
        }
        for (s = new StringBuilder(s); s.length() > 0 && s.charAt(s.length() - 1) == c; s.deleteCharAt(s.length() - 1)) { }
        return s.toString();
    }

    public static String trimTrailingWhitespace(String s)
    {
        if (!hasLength(s))
        {
            return s;
        }
        for (s = new StringBuilder(s); s.length() > 0 && Character.isWhitespace(s.charAt(s.length() - 1)); s.deleteCharAt(s.length() - 1)) { }
        return s.toString();
    }

    public static String trimWhitespace(String s)
    {
        if (!hasLength(s))
        {
            return s;
        }
        for (s = new StringBuilder(s); s.length() > 0 && Character.isWhitespace(s.charAt(0)); s.deleteCharAt(0)) { }
        for (; s.length() > 0 && Character.isWhitespace(s.charAt(s.length() - 1)); s.deleteCharAt(s.length() - 1)) { }
        return s.toString();
    }

    public static String uncapitalize(String s)
    {
        return a(s, false);
    }

    public static String unqualify(String s)
    {
        return unqualify(s, '.');
    }

    public static String unqualify(String s, char c)
    {
        return s.substring(s.lastIndexOf(c) + 1);
    }
}
