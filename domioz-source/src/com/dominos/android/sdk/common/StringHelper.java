// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringHelper
{

    private static final String ARRAY_STRING_EMPTY[] = new String[0];
    private static final int STRING_BUILDER_BUFFER_SIZE_DEFAULT = 16;
    private static final int STRING_BUILDER_BUFFER_SIZE_LARGE = 256;
    public static final String STRING_EMPTY_SPACE = "";
    private static final int STRING_INDEX_NOT_FOUND = -1;
    private static final int STRING_NULL_LENGTH = 0;
    public static final String STRING_SPACE = " ";

    public StringHelper()
    {
    }

    public static String arrayToDelimitedString(Object aobj[], String s)
    {
        return join(aobj, s);
    }

    public static boolean contains(String s, String s1)
    {
        return s != null && s1 != null && s.contains(s1);
    }

    public static boolean containsIgnoreCase(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            return s.toLowerCase().contains(s1.toLowerCase());
        } else
        {
            return false;
        }
    }

    public static String defaultIfBlank(String s, String s1)
    {
        if (isBlank(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public static String defaultIfEmpty(String s, String s1)
    {
        if (isEmpty(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public static String defaultString(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public static boolean endsWithIgnoreCase(String s, String s1)
    {
        boolean flag1 = false;
        boolean flag;
        if (s == null || s1 == null)
        {
            flag = flag1;
            if (s == null)
            {
                flag = flag1;
                if (s1 == null)
                {
                    flag = true;
                }
            }
        } else
        {
            flag = flag1;
            if (s1.length() <= s.length())
            {
                return s.regionMatches(true, s.length() - s1.length(), s1, 0, s1.length());
            }
        }
        return flag;
    }

    public static boolean equals(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            return s.equals(s1);
        }
        return s == null && s1 == null;
    }

    public static boolean equalsIgnoreCase(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            return s.equalsIgnoreCase(s1);
        }
        return s == null && s1 == null;
    }

    public static String formatWithISOStandard(String s)
    {
        String s1;
        try
        {
            s1 = new String(s.getBytes("ISO-8859-1"), "utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return s;
        }
        return s1;
    }

    public static boolean isBlank(String s)
    {
        return s == null || s.trim().equals("");
    }

    public static boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isNotBlank(String s)
    {
        return !isBlank(s);
    }

    public static boolean isNotEmpty(String s)
    {
        return !isEmpty(s);
    }

    public static String join(Collection collection, char c)
    {
        if (collection == null)
        {
            return null;
        } else
        {
            collection = ((Collection) (collection.toArray()));
            return join(((Object []) (collection)), String.valueOf(c), 0, collection.length);
        }
    }

    public static String join(Collection collection, String s)
    {
        if (collection == null)
        {
            return null;
        } else
        {
            return join(collection.iterator(), s);
        }
    }

    private static String join(Iterator iterator, String s)
    {
        if (iterator == null)
        {
            return null;
        }
        if (!iterator.hasNext())
        {
            return "";
        }
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj.toString();
        }
        s = defaultString(s);
        StringBuilder stringbuilder = new StringBuilder(256);
        if (obj != null)
        {
            stringbuilder.append(obj);
        }
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stringbuilder.append(s);
            Object obj1 = iterator.next();
            if (obj1 != null)
            {
                stringbuilder.append(obj1);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String join(Object aobj[], String s)
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return join(aobj, s, 0, aobj.length);
        }
    }

    private static String join(Object aobj[], String s, int i, int j)
    {
        if (aobj == null)
        {
            return null;
        }
        int l = j - i;
        if (l <= 0)
        {
            return "";
        }
        s = defaultString(s);
        StringBuilder stringbuilder;
        int k;
        if (aobj[i] == null)
        {
            k = 16;
        } else
        {
            k = aobj[i].toString().length();
        }
        stringbuilder = new StringBuilder((k + 1) * l);
        for (k = i; k < j; k++)
        {
            if (k > i)
            {
                stringbuilder.append(s);
            }
            if (aobj[k] != null)
            {
                stringbuilder.append(aobj[k]);
            }
        }

        return stringbuilder.toString();
    }

    public static int length(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.length();
        }
    }

    public static String replace(String s, String s1, String s2)
    {
        if (s != null)
        {
            String s3 = s;
            if (isNotEmpty(s1))
            {
                s3 = s;
                if (s2 != null)
                {
                    s3 = s.replace(s1, s2);
                }
            }
            return s3;
        } else
        {
            return null;
        }
    }

    public static String[] split(String s, String s1)
    {
        return splitWorker(s, s1, -1, false);
    }

    private static String[] splitWorker(String s, String s1, int i, boolean flag)
    {
        ArrayList arraylist;
        int i1;
        if (s == null)
        {
            return null;
        }
        i1 = s.length();
        if (i1 == 0)
        {
            return ARRAY_STRING_EMPTY;
        }
        arraylist = new ArrayList();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        int l;
        int j1;
        int l2;
        k = 0;
        l = 0;
        j1 = 0;
        j = 0;
        l2 = 1;
_L5:
        int l1;
        int i2;
        int j2;
        int k2;
        k2 = j;
        i2 = k;
        l1 = l;
        j2 = j1;
        if (j >= i1) goto _L4; else goto _L3
_L3:
        if (Character.isWhitespace(s.charAt(j)))
        {
            if (l != 0 || flag)
            {
                if (l2 == i)
                {
                    j = 0;
                    k = i1;
                } else
                {
                    k = j;
                    j = 1;
                }
                arraylist.add(s.substring(j1, k));
                l2++;
                j1 = 0;
                l = k;
                k = j1;
            } else
            {
                int k1 = j;
                j = k;
                k = l;
                l = k1;
            }
            j1 = l + 1;
            l = k;
            k = j;
            j = j1;
        } else
        {
            j++;
            k = 0;
            l = 1;
        }
        if (true) goto _L5; else goto _L4
_L2:
        if (s1.length() != 1) goto _L7; else goto _L6
_L6:
        i2 = s1.charAt(0);
        k = 0;
        l = 0;
        j1 = 0;
        j = 0;
        l1 = 1;
        while (j < i1) 
        {
            if (s.charAt(j) == i2)
            {
                if (l != 0 || flag)
                {
                    if (l1 == i)
                    {
                        j = 0;
                        k = i1;
                    } else
                    {
                        k = j;
                        j = 1;
                    }
                    arraylist.add(s.substring(j1, k));
                    l1++;
                    j1 = 0;
                    l = k;
                    k = j1;
                } else
                {
                    j1 = j;
                    j = k;
                    k = l;
                    l = j1;
                }
                j1 = l + 1;
                l = k;
                k = j;
                j = j1;
            } else
            {
                j++;
                k = 0;
                l = 1;
            }
        }
_L10:
        if (l != 0 || flag && k != 0)
        {
            arraylist.add(s.substring(j1, j));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
_L9:
        k2 = j;
        i2 = k;
        l1 = l;
        j2 = j1;
        if (j >= i1) goto _L4; else goto _L8
_L8:
        if (s1.indexOf(s.charAt(j)) >= 0)
        {
            if (l != 0 || flag)
            {
                if (l2 == i)
                {
                    j = 0;
                    k = i1;
                } else
                {
                    k = j;
                    j = 1;
                }
                arraylist.add(s.substring(j1, k));
                l2++;
                j1 = 0;
                l = k;
                k = j1;
            } else
            {
                j1 = j;
                j = k;
                k = l;
                l = j1;
            }
            j1 = l + 1;
            l = k;
            k = j;
            j = j1;
        } else
        {
            j++;
            k = 0;
            l = 1;
        }
          goto _L9
_L4:
        j = k2;
        j1 = j2;
        k = i2;
        l = l1;
          goto _L10
_L7:
        k = 0;
        l = 0;
        j1 = 0;
        j = 0;
        l2 = 1;
          goto _L9
    }

    public static boolean startsWith(String s, String s1)
    {
        return startsWith(s, s1, false);
    }

    private static boolean startsWith(String s, String s1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (s == null || s1 == null)
        {
            flag1 = flag2;
            if (s == null)
            {
                flag1 = flag2;
                if (s1 == null)
                {
                    flag1 = true;
                }
            }
        } else
        {
            flag1 = flag2;
            if (s1.length() <= s.length())
            {
                flag1 = flag2;
                if (s.regionMatches(flag, 0, s1, 0, s1.length()))
                {
                    return true;
                }
            }
        }
        return flag1;
    }

    public static boolean startsWithIgnoreCase(String s, String s1)
    {
        return startsWith(s, s1, true);
    }

    public static String substringBefore(String s, String s1)
    {
        if (!isEmpty(s) && s1 != null)
        {
            if (s1.length() == 0)
            {
                return "";
            }
            int i = s.indexOf(s1);
            if (i != -1)
            {
                return s.substring(0, i);
            }
        }
        return s;
    }

    public static CharSequence substringBeforeLast(String s, String s1)
    {
        int i;
        if (!isEmpty(s) && !isEmpty(s1))
        {
            if ((i = s.lastIndexOf(s1)) != -1)
            {
                return s.substring(0, i);
            }
        }
        return s;
    }

    public static String trim(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.trim();
        }
    }

}
