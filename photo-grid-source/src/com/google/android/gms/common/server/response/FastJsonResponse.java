// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wd;
import com.google.android.gms.internal.wl;
import com.google.android.gms.internal.wm;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class FastJsonResponse
{

    public FastJsonResponse()
    {
    }

    protected static Object a(Field field, Object obj)
    {
        Object obj1 = obj;
        if (Field.a(field) != null)
        {
            obj1 = field.a(obj);
        }
        return obj1;
    }

    private static void a(StringBuilder stringbuilder, Field field, Object obj)
    {
        if (field.b() == 11)
        {
            stringbuilder.append(((FastJsonResponse)field.h().cast(obj)).toString());
            return;
        }
        if (field.b() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(wl.a((String)obj));
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

    protected boolean a(Field field)
    {
        if (field.d() == 11)
        {
            if (field.e())
            {
                field.f();
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            } else
            {
                field.f();
                throw new UnsupportedOperationException("Concrete types not supported");
            }
        } else
        {
            field.f();
            return c();
        }
    }

    protected abstract Object b();

    protected Object b(Field field)
    {
        String s = field.f();
        if (field.h() != null)
        {
            field.f();
            b();
            bl.a(true, "Concrete field shouldn't be value object: %s", new Object[] {
                field.f()
            });
            field.e();
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
            field.f();
            return b();
        }
    }

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
                if (a(field))
                {
                    Object obj = a(field, b(field));
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
                        switch (field.d())
                        {
                        default:
                            if (field.c())
                            {
                                a(stringbuilder, field, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, field, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(wd.a((byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(wd.b((byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            wm.a(stringbuilder, (HashMap)obj);
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

    private class Field
        implements SafeParcelable
    {

        public static final b CREATOR = new b();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int i;
        private FieldMappingDictionary j;
        private a k;

        public static Field a(String s)
        {
            return new Field(7, true, 7, true, s, 3, null, null);
        }

        public static Field a(String s, int i1)
        {
            return new Field(0, false, 0, false, s, i1, null, null);
        }

        public static Field a(String s, int i1, a a1)
        {
            return new Field(7, false, 0, false, s, i1, null, a1);
        }

        public static Field a(String s, int i1, Class class1)
        {
            return new Field(11, false, 11, false, s, i1, class1, null);
        }

        static a a(Field field)
        {
            return field.k;
        }

        public static Field b(String s, int i1)
        {
            return new Field(4, false, 4, false, s, i1, null, null);
        }

        public static Field b(String s, int i1, Class class1)
        {
            return new Field(11, true, 11, true, s, i1, class1, null);
        }

        public static Field c(String s, int i1)
        {
            return new Field(6, false, 6, false, s, i1, null, null);
        }

        public static Field d(String s, int i1)
        {
            return new Field(7, false, 7, false, s, i1, null, null);
        }

        public final int a()
        {
            return i;
        }

        public final Object a(Object obj)
        {
            return k.a(obj);
        }

        public final void a(FieldMappingDictionary fieldmappingdictionary)
        {
            j = fieldmappingdictionary;
        }

        public final int b()
        {
            return a;
        }

        public final boolean c()
        {
            return b;
        }

        public final int d()
        {
            return c;
        }

        public int describeContents()
        {
            return 0;
        }

        public final boolean e()
        {
            return d;
        }

        public final String f()
        {
            return e;
        }

        public final int g()
        {
            return f;
        }

        public final Class h()
        {
            return g;
        }

        final String i()
        {
            if (h == null)
            {
                return null;
            } else
            {
                return h;
            }
        }

        public final boolean j()
        {
            return k != null;
        }

        final ConverterWrapper k()
        {
            if (k == null)
            {
                return null;
            } else
            {
                return ConverterWrapper.a(k);
            }
        }

        public final Map l()
        {
            bl.a(h);
            bl.a(j);
            return j.a(h);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(i).append('\n');
            stringbuilder.append("                 typeIn=").append(a).append('\n');
            stringbuilder.append("            typeInArray=").append(b).append('\n');
            stringbuilder.append("                typeOut=").append(c).append('\n');
            stringbuilder.append("           typeOutArray=").append(d).append('\n');
            stringbuilder.append("        outputFieldName=").append(e).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(f).append('\n');
            stringbuilder.append("       concreteTypeName=").append(i()).append('\n');
            if (g != null)
            {
                stringbuilder.append("     concreteType.class=").append(g.getCanonicalName()).append('\n');
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

        public void writeToParcel(Parcel parcel, int i1)
        {
            com.google.android.gms.common.server.response.b.a(this, parcel, i1);
        }


        Field(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
                String s1, ConverterWrapper converterwrapper)
        {
            i = i1;
            a = j1;
            b = flag;
            c = k1;
            d = flag1;
            e = s;
            f = l1;
            if (s1 == null)
            {
                g = null;
                h = null;
            } else
            {
                g = com/google/android/gms/common/server/response/SafeParcelResponse;
                h = s1;
            }
            if (converterwrapper == null)
            {
                k = null;
                return;
            } else
            {
                k = converterwrapper.c();
                return;
            }
        }

        private Field(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
                a a1)
        {
            i = 1;
            a = i1;
            b = flag;
            c = j1;
            d = flag1;
            e = s;
            f = k1;
            g = class1;
            if (class1 == null)
            {
                h = null;
            } else
            {
                h = class1.getCanonicalName();
            }
            k = a1;
        }
    }

}
