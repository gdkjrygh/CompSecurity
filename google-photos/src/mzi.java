// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.ArrayList;

public final class mzi
{

    static final String a[] = {
        "TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE"
    };
    public final String b;
    final mzj c[];
    final boolean d;

    public mzi(Class class1)
    {
        boolean flag = false;
        super();
        mzj amzj[] = a(class1);
        class1 = (mzh)class1.getAnnotation(mzh);
        if (class1 == null)
        {
            class1 = null;
        } else
        {
            class1 = class1.a();
        }
        b = class1;
        c = amzj;
        class1 = new String[amzj.length];
        for (int i = 0; i != amzj.length; i++)
        {
            mzj mzj1 = amzj[i];
            class1[i] = mzj1.a;
            if (mzj1.d)
            {
                flag = true;
            }
        }

        d = flag;
    }

    private static void a(Class class1, ArrayList arraylist)
    {
        class1 = class1.getDeclaredFields();
        int j = 0;
        do
        {
            while (j != class1.length) 
            {
                Field field = class1[j];
                mzg mzg1 = (mzg)field.getAnnotation(mzg);
                if (mzg1 != null)
                {
                    Class class2 = field.getType();
                    int i;
                    int k;
                    if (class2 == java/lang/String)
                    {
                        i = 0;
                    } else
                    if (class2 == Boolean.TYPE)
                    {
                        i = 1;
                    } else
                    if (class2 == Short.TYPE)
                    {
                        i = 2;
                    } else
                    if (class2 == Integer.TYPE)
                    {
                        i = 3;
                    } else
                    if (class2 == Long.TYPE)
                    {
                        i = 4;
                    } else
                    if (class2 == Float.TYPE)
                    {
                        i = 5;
                    } else
                    if (class2 == Double.TYPE)
                    {
                        i = 6;
                    } else
                    if (class2 == [B)
                    {
                        i = 7;
                    } else
                    {
                        class1 = String.valueOf(class2.getName());
                        if (class1.length() != 0)
                        {
                            class1 = "Unsupported field type for column: ".concat(class1);
                        } else
                        {
                            class1 = new String("Unsupported field type for column: ");
                        }
                        throw new IllegalArgumentException(class1);
                    }
                    k = arraylist.size();
                    arraylist.add(new mzj(mzg1.a(), i, mzg1.b(), mzg1.c(), mzg1.d(), mzg1.e(), field, k));
                }
                j++;
            }
            return;
        } while (true);
    }

    private mzj[] a(Class class1)
    {
        ArrayList arraylist = new ArrayList();
        for (; class1 != null; class1 = class1.getSuperclass())
        {
            a(class1, arraylist);
        }

        class1 = new mzj[arraylist.size()];
        arraylist.toArray(class1);
        return class1;
    }

}
