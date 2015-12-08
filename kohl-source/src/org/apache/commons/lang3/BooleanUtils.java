// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import org.apache.commons.lang3.math.NumberUtils;

// Referenced classes of package org.apache.commons.lang3:
//            ArrayUtils

public class BooleanUtils
{

    public BooleanUtils()
    {
    }

    public static transient Boolean and(Boolean aboolean[])
    {
        if (aboolean == null)
        {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (aboolean.length == 0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        try
        {
            if (and(ArrayUtils.toPrimitive(aboolean)))
            {
                return Boolean.TRUE;
            }
            aboolean = Boolean.FALSE;
        }
        // Misplaced declaration of an exception variable
        catch (Boolean aboolean[])
        {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
        return aboolean;
    }

    public static transient boolean and(boolean aflag[])
    {
        if (aflag == null)
        {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (aflag.length == 0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            if (!aflag[i])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isFalse(Boolean boolean1)
    {
        return Boolean.FALSE.equals(boolean1);
    }

    public static boolean isNotFalse(Boolean boolean1)
    {
        return !isFalse(boolean1);
    }

    public static boolean isNotTrue(Boolean boolean1)
    {
        return !isTrue(boolean1);
    }

    public static boolean isTrue(Boolean boolean1)
    {
        return Boolean.TRUE.equals(boolean1);
    }

    public static Boolean negate(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return null;
        }
        if (boolean1.booleanValue())
        {
            return Boolean.FALSE;
        } else
        {
            return Boolean.TRUE;
        }
    }

    public static transient Boolean or(Boolean aboolean[])
    {
        if (aboolean == null)
        {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (aboolean.length == 0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        try
        {
            if (or(ArrayUtils.toPrimitive(aboolean)))
            {
                return Boolean.TRUE;
            }
            aboolean = Boolean.FALSE;
        }
        // Misplaced declaration of an exception variable
        catch (Boolean aboolean[])
        {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
        return aboolean;
    }

    public static transient boolean or(boolean aflag[])
    {
        if (aflag == null)
        {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (aflag.length == 0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            if (aflag[i])
            {
                return true;
            }
        }

        return false;
    }

    public static boolean toBoolean(int i)
    {
        return i != 0;
    }

    public static boolean toBoolean(int i, int j, int k)
    {
        if (i == j)
        {
            return true;
        }
        if (i == k)
        {
            return false;
        } else
        {
            throw new IllegalArgumentException("The Integer did not match either specified value");
        }
    }

    public static boolean toBoolean(Boolean boolean1)
    {
        return boolean1 != null && boolean1.booleanValue();
    }

    public static boolean toBoolean(Integer integer, Integer integer1, Integer integer2)
    {
        if (integer != null) goto _L2; else goto _L1
_L1:
        if (integer1 != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (integer2 == null)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (integer.equals(integer1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (integer.equals(integer2))
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L5
_L5:
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean toBoolean(String s)
    {
        return toBooleanObject(s) == Boolean.TRUE;
    }

    public static boolean toBoolean(String s, String s1, String s2)
    {
        if (s != s1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (s == s2)
        {
            return false;
        }
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.equals(s2))
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new IllegalArgumentException("The String did not match either specified value");
    }

    public static boolean toBooleanDefaultIfNull(Boolean boolean1, boolean flag)
    {
        if (boolean1 == null)
        {
            return flag;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public static Boolean toBooleanObject(int i)
    {
        if (i == 0)
        {
            return Boolean.FALSE;
        } else
        {
            return Boolean.TRUE;
        }
    }

    public static Boolean toBooleanObject(int i, int j, int k, int l)
    {
        if (i == j)
        {
            return Boolean.TRUE;
        }
        if (i == k)
        {
            return Boolean.FALSE;
        }
        if (i == l)
        {
            return null;
        } else
        {
            throw new IllegalArgumentException("The Integer did not match any specified value");
        }
    }

    public static Boolean toBooleanObject(Integer integer)
    {
        if (integer == null)
        {
            return null;
        }
        if (integer.intValue() == 0)
        {
            return Boolean.FALSE;
        } else
        {
            return Boolean.TRUE;
        }
    }

    public static Boolean toBooleanObject(Integer integer, Integer integer1, Integer integer2, Integer integer3)
    {
        Object obj = null;
        if (integer != null) goto _L2; else goto _L1
_L1:
        if (integer1 != null) goto _L4; else goto _L3
_L3:
        integer = Boolean.TRUE;
_L6:
        return integer;
_L4:
        if (integer2 == null)
        {
            return Boolean.FALSE;
        }
        integer = obj;
        if (integer3 == null) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException("The Integer did not match any specified value");
_L2:
        if (integer.equals(integer1))
        {
            return Boolean.TRUE;
        }
        if (integer.equals(integer2))
        {
            return Boolean.FALSE;
        }
        if (integer.equals(integer3))
        {
            return null;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static Boolean toBooleanObject(String s)
    {
        if (s == "true")
        {
            return Boolean.TRUE;
        }
        if (s == null)
        {
            return null;
        }
        s.length();
        JVM INSTR tableswitch 1 5: default 56
    //                   1 58
    //                   2 120
    //                   3 188
    //                   4 286
    //                   5 365;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return null;
_L2:
        char c = s.charAt(0);
        if (c == 'y' || c == 'Y' || c == 't' || c == 'T')
        {
            return Boolean.TRUE;
        }
        if (c == 'n' || c == 'N' || c == 'f' || c == 'F')
        {
            return Boolean.FALSE;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        char c1 = s.charAt(0);
        char c5 = s.charAt(1);
        if ((c1 == 'o' || c1 == 'O') && (c5 == 'n' || c5 == 'N'))
        {
            return Boolean.TRUE;
        }
        if ((c1 == 'n' || c1 == 'N') && (c5 == 'o' || c5 == 'O'))
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L4
_L4:
        char c2 = s.charAt(0);
        char c6 = s.charAt(1);
        char c9 = s.charAt(2);
        if ((c2 == 'y' || c2 == 'Y') && (c6 == 'e' || c6 == 'E') && (c9 == 's' || c9 == 'S'))
        {
            return Boolean.TRUE;
        }
        if ((c2 == 'o' || c2 == 'O') && (c6 == 'f' || c6 == 'F') && (c9 == 'f' || c9 == 'F'))
        {
            return Boolean.FALSE;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        char c3 = s.charAt(0);
        char c7 = s.charAt(1);
        char c10 = s.charAt(2);
        char c12 = s.charAt(3);
        if ((c3 == 't' || c3 == 'T') && (c7 == 'r' || c7 == 'R') && (c10 == 'u' || c10 == 'U') && (c12 == 'e' || c12 == 'E'))
        {
            return Boolean.TRUE;
        }
        if (true) goto _L1; else goto _L6
_L6:
        char c4 = s.charAt(0);
        char c8 = s.charAt(1);
        char c11 = s.charAt(2);
        char c13 = s.charAt(3);
        char c14 = s.charAt(4);
        if ((c4 == 'f' || c4 == 'F') && (c8 == 'a' || c8 == 'A') && (c11 == 'l' || c11 == 'L') && (c13 == 's' || c13 == 'S') && (c14 == 'e' || c14 == 'E'))
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static Boolean toBooleanObject(String s, String s1, String s2, String s3)
    {
        Object obj = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        if (s1 != null) goto _L4; else goto _L3
_L3:
        s = Boolean.TRUE;
_L6:
        return s;
_L4:
        if (s2 == null)
        {
            return Boolean.FALSE;
        }
        s = obj;
        if (s3 == null) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException("The String did not match any specified value");
_L2:
        if (s.equals(s1))
        {
            return Boolean.TRUE;
        }
        if (s.equals(s2))
        {
            return Boolean.FALSE;
        }
        if (s.equals(s3))
        {
            return null;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static int toInteger(Boolean boolean1, int i, int j, int k)
    {
        if (boolean1 == null)
        {
            return k;
        }
        if (!boolean1.booleanValue())
        {
            i = j;
        }
        return i;
    }

    public static int toInteger(boolean flag)
    {
        return !flag ? 0 : 1;
    }

    public static int toInteger(boolean flag, int i, int j)
    {
        if (flag)
        {
            return i;
        } else
        {
            return j;
        }
    }

    public static Integer toIntegerObject(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return null;
        }
        if (boolean1.booleanValue())
        {
            return NumberUtils.INTEGER_ONE;
        } else
        {
            return NumberUtils.INTEGER_ZERO;
        }
    }

    public static Integer toIntegerObject(Boolean boolean1, Integer integer, Integer integer1, Integer integer2)
    {
        if (boolean1 == null)
        {
            return integer2;
        }
        if (!boolean1.booleanValue())
        {
            integer = integer1;
        }
        return integer;
    }

    public static Integer toIntegerObject(boolean flag)
    {
        if (flag)
        {
            return NumberUtils.INTEGER_ONE;
        } else
        {
            return NumberUtils.INTEGER_ZERO;
        }
    }

    public static Integer toIntegerObject(boolean flag, Integer integer, Integer integer1)
    {
        if (flag)
        {
            return integer;
        } else
        {
            return integer1;
        }
    }

    public static String toString(Boolean boolean1, String s, String s1, String s2)
    {
        if (boolean1 == null)
        {
            return s2;
        }
        if (!boolean1.booleanValue())
        {
            s = s1;
        }
        return s;
    }

    public static String toString(boolean flag, String s, String s1)
    {
        if (flag)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public static String toStringOnOff(Boolean boolean1)
    {
        return toString(boolean1, "on", "off", null);
    }

    public static String toStringOnOff(boolean flag)
    {
        return toString(flag, "on", "off");
    }

    public static String toStringTrueFalse(Boolean boolean1)
    {
        return toString(boolean1, "true", "false", null);
    }

    public static String toStringTrueFalse(boolean flag)
    {
        return toString(flag, "true", "false");
    }

    public static String toStringYesNo(Boolean boolean1)
    {
        return toString(boolean1, "yes", "no", null);
    }

    public static String toStringYesNo(boolean flag)
    {
        return toString(flag, "yes", "no");
    }

    public static transient Boolean xor(Boolean aboolean[])
    {
        if (aboolean == null)
        {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (aboolean.length == 0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        try
        {
            if (xor(ArrayUtils.toPrimitive(aboolean)))
            {
                return Boolean.TRUE;
            }
            aboolean = Boolean.FALSE;
        }
        // Misplaced declaration of an exception variable
        catch (Boolean aboolean[])
        {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
        return aboolean;
    }

    public static transient boolean xor(boolean aflag[])
    {
label0:
        {
            boolean flag1 = false;
            boolean flag2 = true;
            if (aflag == null)
            {
                throw new IllegalArgumentException("The Array must not be null");
            }
            if (aflag.length == 0)
            {
                throw new IllegalArgumentException("Array is empty");
            }
            int j = 0;
            int l = aflag.length;
            boolean flag;
            for (int i = 0; i < l;)
            {
                int k = j;
                if (aflag[i])
                {
                    flag = flag1;
                    if (j >= 1)
                    {
                        break label0;
                    }
                    k = j + 1;
                }
                i++;
                j = k;
            }

            if (j == 1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
        }
        return flag;
    }
}
