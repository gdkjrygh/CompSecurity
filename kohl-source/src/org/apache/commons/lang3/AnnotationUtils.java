// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// Referenced classes of package org.apache.commons.lang3:
//            Validate, ClassUtils

public class AnnotationUtils
{

    private static final ToStringStyle TO_STRING_STYLE = new ToStringStyle() {

        private static final long serialVersionUID = 1L;

        protected void appendDetail(StringBuffer stringbuffer, String s, Object obj)
        {
            Object obj1 = obj;
            if (obj instanceof Annotation)
            {
                obj1 = AnnotationUtils.toString((Annotation)obj);
            }
            super.appendDetail(stringbuffer, s, obj1);
        }

        protected String getShortClassName(Class class1)
        {
            Object obj = null;
            Iterator iterator = ClassUtils.getAllInterfaces(class1).iterator();
            do
            {
                class1 = obj;
                if (!iterator.hasNext())
                {
                    break;
                }
                class1 = (Class)iterator.next();
            } while (!java/lang/annotation/Annotation.isAssignableFrom(class1));
            if (class1 == null)
            {
                class1 = "";
            } else
            {
                class1 = class1.getName();
            }
            return (new StringBuilder(class1)).insert(0, '@').toString();
        }

            
            {
                setDefaultFullDetail(true);
                setArrayContentDetail(true);
                setUseClassName(true);
                setUseShortClassName(true);
                setUseIdentityHashCode(false);
                setContentStart("(");
                setContentEnd(")");
                setFieldSeparator(", ");
                setArrayStart("[");
                setArrayEnd("]");
            }
    };

    public AnnotationUtils()
    {
    }

    private static boolean annotationArrayMemberEquals(Annotation aannotation[], Annotation aannotation1[])
    {
        if (aannotation.length == aannotation1.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= aannotation.length)
                {
                    break label1;
                }
                if (!equals(aannotation[i], aannotation1[i]))
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

    private static boolean arrayMemberEquals(Class class1, Object obj, Object obj1)
    {
        if (class1.isAnnotation())
        {
            return annotationArrayMemberEquals((Annotation[])(Annotation[])obj, (Annotation[])(Annotation[])obj1);
        }
        if (class1.equals(Byte.TYPE))
        {
            return Arrays.equals((byte[])(byte[])obj, (byte[])(byte[])obj1);
        }
        if (class1.equals(Short.TYPE))
        {
            return Arrays.equals((short[])(short[])obj, (short[])(short[])obj1);
        }
        if (class1.equals(Integer.TYPE))
        {
            return Arrays.equals((int[])(int[])obj, (int[])(int[])obj1);
        }
        if (class1.equals(Character.TYPE))
        {
            return Arrays.equals((char[])(char[])obj, (char[])(char[])obj1);
        }
        if (class1.equals(Long.TYPE))
        {
            return Arrays.equals((long[])(long[])obj, (long[])(long[])obj1);
        }
        if (class1.equals(Float.TYPE))
        {
            return Arrays.equals((float[])(float[])obj, (float[])(float[])obj1);
        }
        if (class1.equals(Double.TYPE))
        {
            return Arrays.equals((double[])(double[])obj, (double[])(double[])obj1);
        }
        if (class1.equals(Boolean.TYPE))
        {
            return Arrays.equals((boolean[])(boolean[])obj, (boolean[])(boolean[])obj1);
        } else
        {
            return Arrays.equals((Object[])(Object[])obj, (Object[])(Object[])obj1);
        }
    }

    private static int arrayMemberHash(Class class1, Object obj)
    {
        if (class1.equals(Byte.TYPE))
        {
            return Arrays.hashCode((byte[])(byte[])obj);
        }
        if (class1.equals(Short.TYPE))
        {
            return Arrays.hashCode((short[])(short[])obj);
        }
        if (class1.equals(Integer.TYPE))
        {
            return Arrays.hashCode((int[])(int[])obj);
        }
        if (class1.equals(Character.TYPE))
        {
            return Arrays.hashCode((char[])(char[])obj);
        }
        if (class1.equals(Long.TYPE))
        {
            return Arrays.hashCode((long[])(long[])obj);
        }
        if (class1.equals(Float.TYPE))
        {
            return Arrays.hashCode((float[])(float[])obj);
        }
        if (class1.equals(Double.TYPE))
        {
            return Arrays.hashCode((double[])(double[])obj);
        }
        if (class1.equals(Boolean.TYPE))
        {
            return Arrays.hashCode((boolean[])(boolean[])obj);
        } else
        {
            return Arrays.hashCode((Object[])(Object[])obj);
        }
    }

    public static boolean equals(Annotation annotation, Annotation annotation1)
    {
        if (annotation != annotation1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (annotation == null || annotation1 == null)
        {
            return false;
        }
        Class class1 = annotation.annotationType();
        Object obj = annotation1.annotationType();
        Validate.notNull(class1, "Annotation %s with null annotationType()", new Object[] {
            annotation
        });
        Validate.notNull(obj, "Annotation %s with null annotationType()", new Object[] {
            annotation1
        });
        if (!class1.equals(obj))
        {
            return false;
        }
        Method amethod[];
        Object obj1;
        Object obj2;
        int i;
        int j;
        boolean flag;
        try
        {
            amethod = class1.getDeclaredMethods();
            j = amethod.length;
        }
        // Misplaced declaration of an exception variable
        catch (Annotation annotation)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Annotation annotation)
        {
            return false;
        }
        i = 0;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = amethod[i];
        if (((Method) (obj)).getParameterTypes().length != 0 || !isValidAnnotationMemberType(((Method) (obj)).getReturnType()))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj1 = ((Method) (obj)).invoke(annotation, new Object[0]);
        obj2 = ((Method) (obj)).invoke(annotation1, new Object[0]);
        flag = memberEquals(((Method) (obj)).getReturnType(), obj1, obj2);
        if (!flag)
        {
            return false;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_160;
_L4:
        break MISSING_BLOCK_LABEL_83;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static int hashCode(Annotation annotation)
    {
        Method amethod[];
        int i;
        int j;
        int k;
        j = 0;
        amethod = annotation.annotationType().getDeclaredMethods();
        k = amethod.length;
        i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        Method method = amethod[i];
        Object obj;
        int l;
        try
        {
            obj = method.invoke(annotation, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Annotation annotation)
        {
            throw annotation;
        }
        // Misplaced declaration of an exception variable
        catch (Annotation annotation)
        {
            throw new RuntimeException(annotation);
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        throw new IllegalStateException(String.format("Annotation method %s returned null", new Object[] {
            method
        }));
        l = hashMember(method.getName(), obj);
        j += l;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return j;
    }

    private static int hashMember(String s, Object obj)
    {
        int i = s.hashCode() * 127;
        if (obj.getClass().isArray())
        {
            return arrayMemberHash(obj.getClass().getComponentType(), obj) ^ i;
        }
        if (obj instanceof Annotation)
        {
            return hashCode((Annotation)obj) ^ i;
        } else
        {
            return obj.hashCode() ^ i;
        }
    }

    public static boolean isValidAnnotationMemberType(Class class1)
    {
        if (class1 != null)
        {
            Class class2 = class1;
            if (class1.isArray())
            {
                class2 = class1.getComponentType();
            }
            if (class2.isPrimitive() || class2.isEnum() || class2.isAnnotation() || java/lang/String.equals(class2) || java/lang/Class.equals(class2))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean memberEquals(Class class1, Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        }
        if (class1.isArray())
        {
            return arrayMemberEquals(class1.getComponentType(), obj, obj1);
        }
        if (class1.isAnnotation())
        {
            return equals((Annotation)obj, (Annotation)obj1);
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static String toString(Annotation annotation)
    {
        ToStringBuilder tostringbuilder = new ToStringBuilder(annotation, TO_STRING_STYLE);
        Method amethod[] = annotation.annotationType().getDeclaredMethods();
        int j = amethod.length;
        int i = 0;
        while (i < j) 
        {
            Method method = amethod[i];
            if (method.getParameterTypes().length <= 0)
            {
                try
                {
                    tostringbuilder.append(method.getName(), method.invoke(annotation, new Object[0]));
                }
                // Misplaced declaration of an exception variable
                catch (Annotation annotation)
                {
                    throw annotation;
                }
                // Misplaced declaration of an exception variable
                catch (Annotation annotation)
                {
                    throw new RuntimeException(annotation);
                }
            }
            i++;
        }
        return tostringbuilder.build();
    }

}
