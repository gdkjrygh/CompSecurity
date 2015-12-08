// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.apache.commons.lang3:
//            StringUtils, ArrayUtils, JavaVersion, SystemUtils

public class ClassUtils
{

    public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');
    public static final char INNER_CLASS_SEPARATOR_CHAR = 36;
    public static final String PACKAGE_SEPARATOR = String.valueOf('.');
    public static final char PACKAGE_SEPARATOR_CHAR = 46;
    private static final Map abbreviationMap = new HashMap();
    private static final Map primitiveWrapperMap;
    private static final Map reverseAbbreviationMap = new HashMap();
    private static final Map wrapperPrimitiveMap;

    public ClassUtils()
    {
    }

    private static void addAbbreviation(String s, String s1)
    {
        abbreviationMap.put(s, s1);
        reverseAbbreviationMap.put(s1, s);
    }

    public static List convertClassNamesToClasses(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        ArrayList arraylist = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        do
        {
            list = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (String)iterator.next();
            try
            {
                arraylist.add(Class.forName(list));
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                arraylist.add(null);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List convertClassesToClassNames(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        ArrayList arraylist = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        do
        {
            list = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (Class)iterator.next();
            if (list == null)
            {
                arraylist.add(null);
            } else
            {
                arraylist.add(list.getName());
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List getAllInterfaces(Class class1)
    {
        if (class1 == null)
        {
            return null;
        } else
        {
            LinkedHashSet linkedhashset = new LinkedHashSet();
            getAllInterfaces(class1, ((HashSet) (linkedhashset)));
            return new ArrayList(linkedhashset);
        }
    }

    private static void getAllInterfaces(Class class1, HashSet hashset)
    {
        for (; class1 != null; class1 = class1.getSuperclass())
        {
            Class aclass[] = class1.getInterfaces();
            int j = aclass.length;
            for (int i = 0; i < j; i++)
            {
                Class class2 = aclass[i];
                if (hashset.add(class2))
                {
                    getAllInterfaces(class2, hashset);
                }
            }

        }

    }

    public static List getAllSuperclasses(Class class1)
    {
        if (class1 != null) goto _L2; else goto _L1
_L1:
        class1 = null;
_L4:
        return class1;
_L2:
        ArrayList arraylist = new ArrayList();
        Class class2 = class1.getSuperclass();
        do
        {
            class1 = arraylist;
            if (class2 == null)
            {
                continue;
            }
            arraylist.add(class2);
            class2 = class2.getSuperclass();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String getCanonicalName(String s)
    {
        s = StringUtils.deleteWhitespace(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        int i;
        i = 0;
        for (; s.startsWith("["); s = s.substring(1))
        {
            i++;
        }

        s1 = s;
        if (i < 1) goto _L4; else goto _L3
_L3:
        if (!s.startsWith("L")) goto _L6; else goto _L5
_L5:
        int j;
        if (s.endsWith(";"))
        {
            j = s.length() - 1;
        } else
        {
            j = s.length();
        }
        s1 = s.substring(1, j);
_L8:
        s = new StringBuilder(s1);
        for (j = 0; j < i; j++)
        {
            s.append("[]");
        }

        break; /* Loop/switch isn't completed */
_L6:
        s1 = s;
        if (s.length() > 0)
        {
            s1 = (String)reverseAbbreviationMap.get(s.substring(0, 1));
        }
        if (true) goto _L8; else goto _L7
_L7:
        return s.toString();
    }

    public static Class getClass(ClassLoader classloader, String s)
        throws ClassNotFoundException
    {
        return getClass(classloader, s, true);
    }

    public static Class getClass(ClassLoader classloader, String s, boolean flag)
        throws ClassNotFoundException
    {
        Class class1;
        if (abbreviationMap.containsKey(s))
        {
            return Class.forName((new StringBuilder()).append("[").append((String)abbreviationMap.get(s)).toString(), flag, classloader).getComponentType();
        }
        class1 = Class.forName(toCanonicalName(s), flag, classloader);
        return class1;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        int i;
        i = s.lastIndexOf('.');
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        classloader = getClass(classloader, (new StringBuilder()).append(s.substring(0, i)).append('$').append(s.substring(i + 1)).toString(), flag);
        return classloader;
        classloader;
        throw classnotfoundexception;
    }

    public static Class getClass(String s)
        throws ClassNotFoundException
    {
        return getClass(s, true);
    }

    public static Class getClass(String s, boolean flag)
        throws ClassNotFoundException
    {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        if (classloader == null)
        {
            classloader = org/apache/commons/lang3/ClassUtils.getClassLoader();
        }
        return getClass(classloader, s, flag);
    }

    public static String getPackageCanonicalName(Class class1)
    {
        if (class1 == null)
        {
            return "";
        } else
        {
            return getPackageCanonicalName(class1.getName());
        }
    }

    public static String getPackageCanonicalName(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return getPackageCanonicalName(obj.getClass().getName());
        }
    }

    public static String getPackageCanonicalName(String s)
    {
        return getPackageName(getCanonicalName(s));
    }

    public static String getPackageName(Class class1)
    {
        if (class1 == null)
        {
            return "";
        } else
        {
            return getPackageName(class1.getName());
        }
    }

    public static String getPackageName(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return getPackageName(obj.getClass());
        }
    }

    public static String getPackageName(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            return "";
        }
        for (; s1.charAt(0) == '['; s1 = s1.substring(1)) { }
        s = s1;
        if (s1.charAt(0) == 'L')
        {
            s = s1;
            if (s1.charAt(s1.length() - 1) == ';')
            {
                s = s1.substring(1);
            }
        }
        int i = s.lastIndexOf('.');
        if (i == -1)
        {
            return "";
        } else
        {
            return s.substring(0, i);
        }
    }

    public static transient Method getPublicMethod(Class class1, String s, Class aclass[])
        throws SecurityException, NoSuchMethodException
    {
        Object obj = class1.getMethod(s, aclass);
        if (Modifier.isPublic(((Method) (obj)).getDeclaringClass().getModifiers()))
        {
            return ((Method) (obj));
        }
        obj = new ArrayList();
        ((List) (obj)).addAll(getAllInterfaces(class1));
        ((List) (obj)).addAll(getAllSuperclasses(class1));
        class1 = ((List) (obj)).iterator();
_L2:
        Object obj1;
        if (!class1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (Class)class1.next();
        if (!Modifier.isPublic(((Class) (obj1)).getModifiers()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((Class) (obj1)).getMethod(s, aclass);
        if (Modifier.isPublic(((Method) (obj1)).getDeclaringClass().getModifiers()))
        {
            return ((Method) (obj1));
        }
        continue; /* Loop/switch isn't completed */
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        if (true) goto _L2; else goto _L1
_L1:
        throw new NoSuchMethodException((new StringBuilder()).append("Can't find a public method for ").append(s).append(" ").append(ArrayUtils.toString(aclass)).toString());
    }

    public static String getShortCanonicalName(Class class1)
    {
        if (class1 == null)
        {
            return "";
        } else
        {
            return getShortCanonicalName(class1.getName());
        }
    }

    public static String getShortCanonicalName(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return getShortCanonicalName(obj.getClass().getName());
        }
    }

    public static String getShortCanonicalName(String s)
    {
        return getShortClassName(getCanonicalName(s));
    }

    public static String getShortClassName(Class class1)
    {
        if (class1 == null)
        {
            return "";
        } else
        {
            return getShortClassName(class1.getName());
        }
    }

    public static String getShortClassName(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return getShortClassName(obj.getClass());
        }
    }

    public static String getShortClassName(String s)
    {
        int i = 0;
        if (s == null)
        {
            return "";
        }
        if (s.length() == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = s;
        if (s.startsWith("["))
        {
            for (; s.charAt(0) == '['; stringbuilder.append("[]"))
            {
                s = s.substring(1);
            }

            s1 = s;
            if (s.charAt(0) == 'L')
            {
                s1 = s;
                if (s.charAt(s.length() - 1) == ';')
                {
                    s1 = s.substring(1, s.length() - 1);
                }
            }
        }
        s = s1;
        if (reverseAbbreviationMap.containsKey(s1))
        {
            s = (String)reverseAbbreviationMap.get(s1);
        }
        int j = s.lastIndexOf('.');
        if (j != -1)
        {
            i = j + 1;
        }
        i = s.indexOf('$', i);
        s1 = s.substring(j + 1);
        s = s1;
        if (i != -1)
        {
            s = s1.replace('$', '.');
        }
        return (new StringBuilder()).append(s).append(stringbuilder).toString();
    }

    public static String getSimpleName(Class class1)
    {
        if (class1 == null)
        {
            return "";
        } else
        {
            return class1.getSimpleName();
        }
    }

    public static String getSimpleName(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return getSimpleName(obj.getClass());
        }
    }

    public static boolean isAssignable(Class class1, Class class2)
    {
        return isAssignable(class1, class2, SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }

    public static boolean isAssignable(Class class1, Class class2, boolean flag)
    {
        boolean flag1 = true;
        if (class2 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Class class3;
        Class class4;
        if (class1 == null)
        {
            if (!class2.isPrimitive())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            return flag;
        }
        class4 = class1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        class3 = class1;
        if (!class1.isPrimitive())
        {
            break; /* Loop/switch isn't completed */
        }
        class3 = class1;
        if (class2.isPrimitive())
        {
            break; /* Loop/switch isn't completed */
        }
        class3 = primitiveToWrapper(class1);
        if (class3 == null) goto _L1; else goto _L3
_L3:
        class4 = class3;
        if (!class2.isPrimitive())
        {
            break; /* Loop/switch isn't completed */
        }
        class4 = class3;
        if (class3.isPrimitive())
        {
            break; /* Loop/switch isn't completed */
        }
        class4 = wrapperToPrimitive(class3);
        if (class4 == null) goto _L1; else goto _L4
_L4:
        if (class4.equals(class2))
        {
            return true;
        }
        if (!class4.isPrimitive())
        {
            break MISSING_BLOCK_LABEL_407;
        }
        if (class2.isPrimitive())
        {
            if (Integer.TYPE.equals(class4))
            {
                if (Long.TYPE.equals(class2) || Float.TYPE.equals(class2) || Double.TYPE.equals(class2))
                {
                    return true;
                }
            } else
            {
                if (!Long.TYPE.equals(class4))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (Float.TYPE.equals(class2) || Double.TYPE.equals(class2))
                {
                    return true;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (Boolean.TYPE.equals(class4) || Double.TYPE.equals(class4)) goto _L1; else goto _L5
_L5:
        if (Float.TYPE.equals(class4))
        {
            return Double.TYPE.equals(class2);
        }
        if (!Character.TYPE.equals(class4))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Integer.TYPE.equals(class2) || Long.TYPE.equals(class2) || Float.TYPE.equals(class2) || Double.TYPE.equals(class2))
        {
            return true;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (!Short.TYPE.equals(class4))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!Integer.TYPE.equals(class2) && !Long.TYPE.equals(class2) && !Float.TYPE.equals(class2) && !Double.TYPE.equals(class2)) goto _L1; else goto _L7
_L7:
        return true;
        if (!Byte.TYPE.equals(class4) || !Short.TYPE.equals(class2) && !Integer.TYPE.equals(class2) && !Long.TYPE.equals(class2) && !Float.TYPE.equals(class2) && !Double.TYPE.equals(class2)) goto _L1; else goto _L8
_L8:
        return true;
        return class2.isAssignableFrom(class4);
    }

    public static transient boolean isAssignable(Class aclass[], Class aclass1[])
    {
        return isAssignable(aclass, aclass1, SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }

    public static boolean isAssignable(Class aclass[], Class aclass1[], boolean flag)
    {
        if (ArrayUtils.isSameLength(aclass, aclass1)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Class aclass2[] = aclass;
        if (aclass == null)
        {
            aclass2 = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        aclass = aclass1;
        if (aclass1 == null)
        {
            aclass = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= aclass2.length)
                {
                    break label1;
                }
                if (!isAssignable(aclass2[i], aclass[i], flag))
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

    public static boolean isInnerClass(Class class1)
    {
        return class1 != null && class1.getEnclosingClass() != null;
    }

    public static boolean isPrimitiveOrWrapper(Class class1)
    {
        while (class1 == null || !class1.isPrimitive() && !isPrimitiveWrapper(class1)) 
        {
            return false;
        }
        return true;
    }

    public static boolean isPrimitiveWrapper(Class class1)
    {
        return wrapperPrimitiveMap.containsKey(class1);
    }

    public static Class primitiveToWrapper(Class class1)
    {
        Class class2 = class1;
        Class class3 = class2;
        if (class1 != null)
        {
            class3 = class2;
            if (class1.isPrimitive())
            {
                class3 = (Class)primitiveWrapperMap.get(class1);
            }
        }
        return class3;
    }

    public static transient Class[] primitivesToWrappers(Class aclass[])
    {
        Class aclass1[];
        if (aclass == null)
        {
            aclass1 = null;
        } else
        {
            aclass1 = aclass;
            if (aclass.length != 0)
            {
                Class aclass2[] = new Class[aclass.length];
                for (int i = 0; i < aclass.length; i++)
                {
                    aclass2[i] = primitiveToWrapper(aclass[i]);
                }

                return aclass2;
            }
        }
        return aclass1;
    }

    private static String toCanonicalName(String s)
    {
        s = StringUtils.deleteWhitespace(s);
        if (s == null)
        {
            throw new NullPointerException("className must not be null.");
        }
        Object obj = s;
        if (s.endsWith("[]"))
        {
            obj = new StringBuilder();
            for (; s.endsWith("[]"); ((StringBuilder) (obj)).append("["))
            {
                s = s.substring(0, s.length() - 2);
            }

            String s1 = (String)abbreviationMap.get(s);
            if (s1 != null)
            {
                ((StringBuilder) (obj)).append(s1);
            } else
            {
                ((StringBuilder) (obj)).append("L").append(s).append(";");
            }
            obj = ((StringBuilder) (obj)).toString();
        }
        return ((String) (obj));
    }

    public static transient Class[] toClass(Object aobj[])
    {
        if (aobj == null)
        {
            return null;
        }
        if (aobj.length == 0)
        {
            return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        Class aclass[] = new Class[aobj.length];
        int i = 0;
        while (i < aobj.length) 
        {
            Class class1;
            if (aobj[i] == null)
            {
                class1 = null;
            } else
            {
                class1 = aobj[i].getClass();
            }
            aclass[i] = class1;
            i++;
        }
        return aclass;
    }

    public static Class wrapperToPrimitive(Class class1)
    {
        return (Class)wrapperPrimitiveMap.get(class1);
    }

    public static transient Class[] wrappersToPrimitives(Class aclass[])
    {
        Class aclass1[];
        if (aclass == null)
        {
            aclass1 = null;
        } else
        {
            aclass1 = aclass;
            if (aclass.length != 0)
            {
                Class aclass2[] = new Class[aclass.length];
                for (int i = 0; i < aclass.length; i++)
                {
                    aclass2[i] = wrapperToPrimitive(aclass[i]);
                }

                return aclass2;
            }
        }
        return aclass1;
    }

    static 
    {
        primitiveWrapperMap = new HashMap();
        primitiveWrapperMap.put(Boolean.TYPE, java/lang/Boolean);
        primitiveWrapperMap.put(Byte.TYPE, java/lang/Byte);
        primitiveWrapperMap.put(Character.TYPE, java/lang/Character);
        primitiveWrapperMap.put(Short.TYPE, java/lang/Short);
        primitiveWrapperMap.put(Integer.TYPE, java/lang/Integer);
        primitiveWrapperMap.put(Long.TYPE, java/lang/Long);
        primitiveWrapperMap.put(Double.TYPE, java/lang/Double);
        primitiveWrapperMap.put(Float.TYPE, java/lang/Float);
        primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
        wrapperPrimitiveMap = new HashMap();
        Iterator iterator = primitiveWrapperMap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Class class1 = (Class)iterator.next();
            Class class2 = (Class)primitiveWrapperMap.get(class1);
            if (!class1.equals(class2))
            {
                wrapperPrimitiveMap.put(class2, class1);
            }
        } while (true);
        addAbbreviation("int", "I");
        addAbbreviation("boolean", "Z");
        addAbbreviation("float", "F");
        addAbbreviation("long", "J");
        addAbbreviation("short", "S");
        addAbbreviation("byte", "B");
        addAbbreviation("double", "D");
        addAbbreviation("char", "C");
    }
}
