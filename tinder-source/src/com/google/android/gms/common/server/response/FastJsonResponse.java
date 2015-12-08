// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.ek;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            a, SafeParcelResponse, FieldMappingDictionary

public abstract class FastJsonResponse
{
    public static class Field
        implements SafeParcelable
    {

        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();
        final int a;
        protected final int b;
        protected final boolean c;
        protected final int d;
        protected final boolean e;
        protected final String f;
        protected final int g;
        protected final Class h;
        protected final String i;
        FieldMappingDictionary j;
        a k;

        static a a(Field field)
        {
            return field.k;
        }

        public final int a()
        {
            return b;
        }

        public final boolean b()
        {
            return c;
        }

        public final int c()
        {
            return d;
        }

        public final boolean d()
        {
            return e;
        }

        public int describeContents()
        {
            return 0;
        }

        public final String e()
        {
            return f;
        }

        public final int f()
        {
            return g;
        }

        public final Class g()
        {
            return h;
        }

        final String h()
        {
            if (i == null)
            {
                return null;
            } else
            {
                return i;
            }
        }

        public final Map i()
        {
            u.a(i);
            u.a(j);
            return j.a(i);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(a).append('\n');
            stringbuilder.append("                 typeIn=").append(b).append('\n');
            stringbuilder.append("            typeInArray=").append(c).append('\n');
            stringbuilder.append("                typeOut=").append(d).append('\n');
            stringbuilder.append("           typeOutArray=").append(e).append('\n');
            stringbuilder.append("        outputFieldName=").append(f).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(g).append('\n');
            stringbuilder.append("       concreteTypeName=").append(h()).append('\n');
            if (h != null)
            {
                stringbuilder.append("     concreteType.class=").append(h.getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (k == null)
            {
                s = "null";
            } else
            {
                s = k.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            com.google.android.gms.common.server.response.a.a(this, parcel, l);
        }


        Field(int l, int i1, boolean flag, int j1, boolean flag1, String s, int k1, 
                String s1, ConverterWrapper converterwrapper)
        {
            Object obj = null;
            super();
            a = l;
            b = i1;
            c = flag;
            d = j1;
            e = flag1;
            f = s;
            g = k1;
            if (s1 == null)
            {
                h = null;
                i = null;
            } else
            {
                h = com/google/android/gms/common/server/response/SafeParcelResponse;
                i = s1;
            }
            if (converterwrapper == null)
            {
                s = obj;
            } else
            if (converterwrapper.b != null)
            {
                s = converterwrapper.b;
            } else
            {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            k = s;
        }
    }

    public static interface a
    {

        public abstract Object a(Object obj);
    }


    public FastJsonResponse()
    {
    }

    private Object a(Field field)
    {
        String s = field.e();
        if (field.g() != null)
        {
            field.e();
            String s1;
            boolean flag;
            if (b() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = field.e();
            if (!flag)
            {
                throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", new Object[] {
                    s1
                }));
            }
            field.d();
            try
            {
                field = (new StringBuilder("get")).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                field = ((Field) (getClass().getMethod(field, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Field field)
            {
                throw new RuntimeException(field);
            }
            return field;
        } else
        {
            field.e();
            return b();
        }
    }

    protected static Object a(Field field, Object obj)
    {
        Object obj1 = obj;
        if (Field.a(field) != null)
        {
            obj1 = field.k.a(obj);
        }
        return obj1;
    }

    private static void a(StringBuilder stringbuilder, Field field, Object obj)
    {
        if (field.a() == 11)
        {
            stringbuilder.append(((FastJsonResponse)field.g().cast(obj)).toString());
            return;
        }
        if (field.a() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(ej.a((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            Object obj = arraylist.get(i);
            if (obj != null)
            {
                a(stringbuilder, field, obj);
            }
        }

        stringbuilder.append("]");
    }

    public abstract Map a();

    protected abstract Object b();

    protected abstract boolean c();

    public String toString()
    {
        Map map = a();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = map.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Field field = (Field)map.get(s);
                if (field.c() == 11)
                {
                    if (field.d())
                    {
                        field.e();
                        throw new UnsupportedOperationException("Concrete type arrays not supported");
                    } else
                    {
                        field.e();
                        throw new UnsupportedOperationException("Concrete types not supported");
                    }
                }
                field.e();
                if (c())
                {
                    Object obj = a(field, a(field));
                    if (stringbuilder.length() == 0)
                    {
                        stringbuilder.append("{");
                    } else
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append("\"").append(s).append("\":");
                    if (obj == null)
                    {
                        stringbuilder.append("null");
                    } else
                    {
                        switch (field.c())
                        {
                        default:
                            if (field.b())
                            {
                                a(stringbuilder, field, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, field, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(ec.a((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(ec.b((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ek.a(stringbuilder, (HashMap)obj);
                            break;
                        }
                        continue label0;
                    }
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("}");
            } else
            {
                stringbuilder.append("{}");
            }
            return stringbuilder.toString();
        } while (true);
    }
}
