// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ii, gt, if, ij

public abstract class fb
{

    public fb()
    {
    }

    protected static Object a(a a1, Object obj)
    {
        Object obj1 = obj;
        if (a.a(a1) != null)
        {
            obj1 = a1.a(obj);
        }
        return obj1;
    }

    private static void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.b() == 11)
        {
            stringbuilder.append(((fb)a1.h().cast(obj)).toString());
            return;
        }
        if (a1.b() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(ii.a((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, a a1, ArrayList arraylist)
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
                a(stringbuilder, a1, obj);
            }
        }

        stringbuilder.append("]");
    }

    protected boolean a(a a1)
    {
        if (a1.d() == 11)
        {
            if (a1.e())
            {
                a1.f();
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            } else
            {
                a1.f();
                throw new UnsupportedOperationException("Concrete types not supported");
            }
        } else
        {
            a1.f();
            return d();
        }
    }

    protected Object b(a a1)
    {
        String s = a1.f();
        if (a1.h() != null)
        {
            a1.f();
            c();
            gt.a(true, (new StringBuilder("Concrete field shouldn't be value object: ")).append(a1.f()).toString());
            a1.e();
            try
            {
                a1 = (new StringBuilder("get")).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                a1 = ((a) (getClass().getMethod(a1, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                throw new RuntimeException(a1);
            }
            return a1;
        } else
        {
            a1.f();
            return c();
        }
    }

    public abstract HashMap b();

    protected abstract Object c();

    protected abstract boolean d();

    public String toString()
    {
        HashMap hashmap = b();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = hashmap.keySet().iterator();
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
                a a1 = (a)hashmap.get(s);
                if (a(a1))
                {
                    Object obj = a(a1, b(a1));
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
                        switch (a1.d())
                        {
                        default:
                            if (a1.c())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(com.google.android.gms.internal.if.a((byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(com.google.android.gms.internal.if.b((byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ij.a(stringbuilder, (HashMap)obj);
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

    private class a
        implements SafeParcelable
    {

        public static final hw i = new hw();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int j;
        private fe k;
        private hv l;

        public static a a(String s)
        {
            return new a(7, true, 7, true, s, 3, null, null);
        }

        public static a a(String s, int i1)
        {
            return new a(0, false, 0, false, s, i1, null, null);
        }

        public static a a(String s, int i1, hv hv1)
        {
            return new a(7, false, 0, false, s, i1, null, hv1);
        }

        public static a a(String s, int i1, Class class1)
        {
            return new a(11, false, 11, false, s, i1, class1, null);
        }

        static hv a(a a1)
        {
            return a1.l;
        }

        public static a b(String s, int i1)
        {
            return new a(4, false, 4, false, s, i1, null, null);
        }

        public static a b(String s, int i1, Class class1)
        {
            return new a(11, true, 11, true, s, i1, class1, null);
        }

        public static a c(String s, int i1)
        {
            return new a(6, false, 6, false, s, i1, null, null);
        }

        public static a d(String s, int i1)
        {
            return new a(7, false, 7, false, s, i1, null, null);
        }

        public final int a()
        {
            return j;
        }

        public final Object a(Object obj)
        {
            return l.a(obj);
        }

        public final void a(fe fe1)
        {
            k = fe1;
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
            hw hw1 = i;
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
            return l != null;
        }

        final ew k()
        {
            if (l == null)
            {
                return null;
            } else
            {
                return ew.a(l);
            }
        }

        public final HashMap l()
        {
            gt.a(h);
            gt.a(k);
            return k.a(h);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(j).append('\n');
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
            if (l == null)
            {
                s = "null";
            } else
            {
                s = l.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            hw hw1 = i;
            hw.a(this, parcel, i1);
        }


        a(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
                String s1, ew ew1)
        {
            j = i1;
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
                g = com/google/android/gms/internal/fh;
                h = s1;
            }
            if (ew1 == null)
            {
                l = null;
                return;
            } else
            {
                l = ew1.c();
                return;
            }
        }

        private a(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
                hv hv1)
        {
            j = 1;
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
            l = hv1;
        }
    }

}
