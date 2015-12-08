// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.annotations;

import android.util.Log;
import com.leanplum.Var;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.leanplum.annotations:
//            Variable, File, b, a

public class Parser
{

    public Parser()
    {
    }

    private static void a(Object obj, Class class1)
    {
        Field afield[] = class1.getFields();
        int j = afield.length;
        int i = 0;
        do
        {
label0:
            {
                Object obj1;
                String s;
                Field field;
                boolean flag;
label1:
                {
                    if (i >= j)
                    {
                        return;
                    }
                    field = afield[i];
                    if (field.isAnnotationPresent(com/leanplum/annotations/Variable))
                    {
                        class1 = (Variable)field.getAnnotation(com/leanplum/annotations/Variable);
                        s = class1.group();
                        class1 = class1.name();
                        flag = false;
                    } else
                    {
                        if (!field.isAnnotationPresent(com/leanplum/annotations/File))
                        {
                            break label0;
                        }
                        class1 = (File)field.getAnnotation(com/leanplum/annotations/File);
                        s = class1.group();
                        class1 = class1.name();
                        flag = true;
                    }
                    if (class1 != null)
                    {
                        obj1 = class1;
                        if (class1.length() != 0)
                        {
                            break label1;
                        }
                    }
                    obj1 = field.getName();
                }
                class1 = ((Class) (obj1));
                if (s.length() > 0)
                {
                    class1 = (new StringBuilder(String.valueOf(s))).append(".").append(((String) (obj1))).toString();
                }
                obj1 = field.getType();
                s = ((Class) (obj1)).toString();
                if (s.equals("int"))
                {
                    a(obj, ((String) (class1)), Integer.valueOf(field.getInt(obj)), "integer", field);
                } else
                if (s.equals("byte"))
                {
                    a(obj, ((String) (class1)), Byte.valueOf(field.getByte(obj)), "integer", field);
                } else
                if (s.equals("short"))
                {
                    a(obj, ((String) (class1)), Short.valueOf(field.getShort(obj)), "integer", field);
                } else
                if (s.equals("long"))
                {
                    a(obj, ((String) (class1)), Long.valueOf(field.getLong(obj)), "integer", field);
                } else
                if (s.equals("char"))
                {
                    a(obj, ((String) (class1)), Character.valueOf(field.getChar(obj)), "integer", field);
                } else
                if (s.equals("float"))
                {
                    a(obj, ((String) (class1)), Float.valueOf(field.getFloat(obj)), "float", field);
                } else
                if (s.equals("double"))
                {
                    a(obj, ((String) (class1)), Double.valueOf(field.getDouble(obj)), "float", field);
                } else
                if (s.equals("boolean"))
                {
                    a(obj, ((String) (class1)), Boolean.valueOf(field.getBoolean(obj)), "bool", field);
                } else
                if (((Class) (obj1)).isPrimitive())
                {
                    Log.e("Leanplum", (new StringBuilder("Variable ")).append(class1).append(" is an unsupported primitive type").toString());
                } else
                if (((Class) (obj1)).isArray())
                {
                    Log.e("Leanplum", (new StringBuilder("Variable ")).append(class1).append(" should be a List instead of an Array").toString());
                } else
                if (((Class) (obj1)).isAssignableFrom(java/util/List))
                {
                    a(obj, ((String) (class1)), field.get(obj), "list", field);
                } else
                if (((Class) (obj1)).isAssignableFrom(java/util/Map))
                {
                    a(obj, ((String) (class1)), field.get(obj), "group", field);
                } else
                {
                    Object obj2 = field.get(obj);
                    if (obj2 == null)
                    {
                        obj2 = null;
                    } else
                    {
                        obj2 = obj2.toString();
                    }
                    if (flag)
                    {
                        class1 = Var.defineFile(class1, ((String) (obj2)));
                        boolean flag1;
                        if (obj != null)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        class1.addFileReadyHandler(new b(new WeakReference(obj), flag1, field, class1));
                    } else
                    {
                        a(obj, ((String) (class1)), obj2, "string", field);
                    }
                }
            }
            i++;
        } while (true);
    }

    private static void a(Object obj, String s, Object obj1, String s1, Field field)
    {
        s = Var.define(s, obj1, s1);
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.addValueChangedHandler(new a(new WeakReference(obj), flag, field, s));
    }

    public static transient void parseVariables(Object aobj[])
    {
        int i;
        int j;
        Object obj;
        try
        {
            j = aobj.length;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            Log.e("Leanplum", "Error parsing variables", ((Throwable) (aobj)));
            return;
        }
        i = 0;
          goto _L1
_L3:
        obj = aobj[i];
        a(obj, obj.getClass());
        i++;
_L1:
        if (i < j) goto _L3; else goto _L2
_L2:
    }

    public static transient void parseVariablesForClasses(Class aclass[])
    {
        int i;
        int j;
        try
        {
            j = aclass.length;
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.e("Leanplum", "Error parsing variables", aclass);
            return;
        }
        i = 0;
          goto _L1
_L3:
        a(null, aclass[i]);
        i++;
_L1:
        if (i < j) goto _L3; else goto _L2
_L2:
    }
}
