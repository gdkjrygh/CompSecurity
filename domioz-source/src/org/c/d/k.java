// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class k
{

    public k()
    {
    }

    public static Object[] addObjectToArray(Object aobj[], Object obj)
    {
        Object obj1;
        int i;
        if (aobj != null)
        {
            obj1 = ((Object) (aobj)).getClass().getComponentType();
        } else
        if (obj != null)
        {
            obj1 = obj.getClass();
        } else
        {
            obj1 = java/lang/Object;
        }
        if (aobj != null)
        {
            i = aobj.length + 1;
        } else
        {
            i = 1;
        }
        obj1 = ((Object) ((Object[])Array.newInstance(((Class) (obj1)), i)));
        if (aobj != null)
        {
            System.arraycopy(((Object) (aobj)), 0, obj1, 0, aobj.length);
        }
        obj1[obj1.length - 1] = obj;
        return ((Object []) (obj1));
    }

    public static Enum caseInsensitiveValueOf(Enum aenum[], String s)
    {
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            if (enum.toString().equalsIgnoreCase(s))
            {
                return enum;
            }
        }

        throw new IllegalArgumentException(String.format("constant [%s] does not exist in enum type %s", new Object[] {
            s, aenum.getClass().getComponentType().getName()
        }));
    }

    public static boolean containsConstant(Enum aenum[], String s)
    {
        return containsConstant(aenum, s, false);
    }

    public static boolean containsConstant(Enum aenum[], String s, boolean flag)
    {
        boolean flag2 = false;
        int j = aenum.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag1 = flag2;
                if (i < j)
                {
                    Enum enum = aenum[i];
                    if (flag ? enum.toString().equals(s) : enum.toString().equalsIgnoreCase(s))
                    {
                        flag1 = true;
                    } else
                    {
                        break label0;
                    }
                }
                return flag1;
            }
            i++;
        } while (true);
    }

    public static boolean containsElement(Object aobj[], Object obj)
    {
        if (aobj != null)
        {
            int j = aobj.length;
            int i = 0;
            while (i < j) 
            {
                if (nullSafeEquals(aobj[i], obj))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static String getDisplayString(Object obj)
    {
        if (obj == null)
        {
            return "";
        } else
        {
            return nullSafeToString(obj);
        }
    }

    public static String getIdentityHexString(Object obj)
    {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int hashCode(double d)
    {
        return hashCode(Double.doubleToLongBits(d));
    }

    public static int hashCode(float f)
    {
        return Float.floatToIntBits(f);
    }

    public static int hashCode(long l)
    {
        return (int)(l >>> 32 ^ l);
    }

    public static int hashCode(boolean flag)
    {
        return !flag ? 1237 : 1231;
    }

    public static String identityToString(Object obj)
    {
        if (obj == null)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append(obj.getClass().getName()).append("@").append(getIdentityHexString(obj)).toString();
        }
    }

    public static boolean isArray(Object obj)
    {
        return obj != null && obj.getClass().isArray();
    }

    public static boolean isCheckedException(Throwable throwable)
    {
        return !(throwable instanceof RuntimeException) && !(throwable instanceof Error);
    }

    public static boolean isCompatibleWithThrowsClause(Throwable throwable, Class aclass[])
    {
        boolean flag1 = false;
        if (isCheckedException(throwable)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (aclass == null)
        {
            continue;
        }
        int i = 0;
        do
        {
            flag = flag1;
            if (i >= aclass.length)
            {
                continue;
            }
            if (aclass[i].isAssignableFrom(throwable.getClass()))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean isEmpty(Object aobj[])
    {
        return aobj == null || aobj.length == 0;
    }

    public static String nullSafeClassName(Object obj)
    {
        if (obj != null)
        {
            return obj.getClass().getName();
        } else
        {
            return "null";
        }
    }

    public static boolean nullSafeEquals(Object obj, Object obj1)
    {
        if (obj != obj1)
        {
            if (obj == null || obj1 == null)
            {
                return false;
            }
            if (!obj.equals(obj1))
            {
                if (obj.getClass().isArray() && obj1.getClass().isArray())
                {
                    if ((obj instanceof Object[]) && (obj1 instanceof Object[]))
                    {
                        return Arrays.equals((Object[])obj, (Object[])obj1);
                    }
                    if ((obj instanceof boolean[]) && (obj1 instanceof boolean[]))
                    {
                        return Arrays.equals((boolean[])obj, (boolean[])obj1);
                    }
                    if ((obj instanceof byte[]) && (obj1 instanceof byte[]))
                    {
                        return Arrays.equals((byte[])obj, (byte[])obj1);
                    }
                    if ((obj instanceof char[]) && (obj1 instanceof char[]))
                    {
                        return Arrays.equals((char[])obj, (char[])obj1);
                    }
                    if ((obj instanceof double[]) && (obj1 instanceof double[]))
                    {
                        return Arrays.equals((double[])obj, (double[])obj1);
                    }
                    if ((obj instanceof float[]) && (obj1 instanceof float[]))
                    {
                        return Arrays.equals((float[])obj, (float[])obj1);
                    }
                    if ((obj instanceof int[]) && (obj1 instanceof int[]))
                    {
                        return Arrays.equals((int[])obj, (int[])obj1);
                    }
                    if ((obj instanceof long[]) && (obj1 instanceof long[]))
                    {
                        return Arrays.equals((long[])obj, (long[])obj1);
                    }
                    if ((obj instanceof short[]) && (obj1 instanceof short[]))
                    {
                        return Arrays.equals((short[])obj, (short[])obj1);
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static int nullSafeHashCode(Object obj)
    {
        if (obj == null)
        {
            return 0;
        }
        if (obj.getClass().isArray())
        {
            if (obj instanceof Object[])
            {
                return nullSafeHashCode((Object[])obj);
            }
            if (obj instanceof boolean[])
            {
                return nullSafeHashCode((boolean[])obj);
            }
            if (obj instanceof byte[])
            {
                return nullSafeHashCode((byte[])obj);
            }
            if (obj instanceof char[])
            {
                return nullSafeHashCode((char[])obj);
            }
            if (obj instanceof double[])
            {
                return nullSafeHashCode((double[])obj);
            }
            if (obj instanceof float[])
            {
                return nullSafeHashCode((float[])obj);
            }
            if (obj instanceof int[])
            {
                return nullSafeHashCode((int[])obj);
            }
            if (obj instanceof long[])
            {
                return nullSafeHashCode((long[])obj);
            }
            if (obj instanceof short[])
            {
                return nullSafeHashCode((short[])obj);
            }
        }
        return obj.hashCode();
    }

    public static int nullSafeHashCode(byte abyte0[])
    {
        int l = 0;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = abyte0.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = abyte0[j];
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(char ac[])
    {
        int l = 0;
        if (ac != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = ac.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = ac[j];
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(double ad[])
    {
        int l = 0;
        if (ad != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = ad.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = hashCode(ad[j]);
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(float af[])
    {
        int l = 0;
        if (af != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = af.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = hashCode(af[j]);
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(int ai[])
    {
        int l = 0;
        if (ai != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = ai.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = ai[j];
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(long al[])
    {
        int l = 0;
        if (al != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = al.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = hashCode(al[j]);
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(Object aobj[])
    {
        int l = 0;
        if (aobj != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = aobj.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = nullSafeHashCode(aobj[j]);
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(short aword0[])
    {
        int l = 0;
        if (aword0 != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = aword0.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = aword0[j];
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int nullSafeHashCode(boolean aflag[])
    {
        int l = 0;
        if (aflag != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i1 = aflag.length;
        int i = 7;
        int j = 0;
        do
        {
            l = i;
            if (j >= i1)
            {
                continue;
            }
            l = hashCode(aflag[j]);
            j++;
            i = l + i * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String nullSafeToString(Object obj)
    {
        if (obj == null)
        {
            obj = "null";
        } else
        {
            if (obj instanceof String)
            {
                return (String)obj;
            }
            if (obj instanceof Object[])
            {
                return nullSafeToString((Object[])obj);
            }
            if (obj instanceof boolean[])
            {
                return nullSafeToString((boolean[])obj);
            }
            if (obj instanceof byte[])
            {
                return nullSafeToString((byte[])obj);
            }
            if (obj instanceof char[])
            {
                return nullSafeToString((char[])obj);
            }
            if (obj instanceof double[])
            {
                return nullSafeToString((double[])obj);
            }
            if (obj instanceof float[])
            {
                return nullSafeToString((float[])obj);
            }
            if (obj instanceof int[])
            {
                return nullSafeToString((int[])obj);
            }
            if (obj instanceof long[])
            {
                return nullSafeToString((long[])obj);
            }
            if (obj instanceof short[])
            {
                return nullSafeToString((short[])obj);
            }
            String s = obj.toString();
            obj = s;
            if (s == null)
            {
                return "";
            }
        }
        return ((String) (obj));
    }

    public static String nullSafeToString(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "null";
        }
        int j = abyte0.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(abyte0[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(char ac[])
    {
        if (ac == null)
        {
            return "null";
        }
        int j = ac.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("'").append(ac[i]).append("'");
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(double ad[])
    {
        if (ad == null)
        {
            return "null";
        }
        int j = ad.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(ad[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(float af[])
    {
        if (af == null)
        {
            return "null";
        }
        int j = af.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(af[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(int ai[])
    {
        if (ai == null)
        {
            return "null";
        }
        int j = ai.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(ai[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(long al[])
    {
        if (al == null)
        {
            return "null";
        }
        int j = al.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(al[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(Object aobj[])
    {
        if (aobj == null)
        {
            return "null";
        }
        int j = aobj.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(String.valueOf(aobj[i]));
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(short aword0[])
    {
        if (aword0 == null)
        {
            return "null";
        }
        int j = aword0.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(aword0[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static String nullSafeToString(boolean aflag[])
    {
        if (aflag == null)
        {
            return "null";
        }
        int j = aflag.length;
        if (j == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < j) 
        {
            if (i == 0)
            {
                stringbuilder.append("{");
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(aflag[i]);
            i++;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public static Object[] toObjectArray(Object obj)
    {
        int i = 0;
        if (obj instanceof Object[])
        {
            return (Object[])obj;
        }
        if (obj == null)
        {
            return new Object[0];
        }
        if (!obj.getClass().isArray())
        {
            throw new IllegalArgumentException((new StringBuilder("Source is not an array: ")).append(obj).toString());
        }
        int j = Array.getLength(obj);
        if (j == 0)
        {
            return new Object[0];
        }
        Object aobj[] = (Object[])Array.newInstance(Array.get(obj, 0).getClass(), j);
        for (; i < j; i++)
        {
            aobj[i] = Array.get(obj, i);
        }

        return aobj;
    }
}
