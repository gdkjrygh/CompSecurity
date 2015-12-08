// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            iq, im, ir

public abstract class zzld
{

    public zzld()
    {
    }

    private Object a(zza zza1)
    {
        String s = zza1.f();
        if (zza1.h() != null)
        {
            zza1.f();
            String s1;
            boolean flag;
            if (b() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = zza1.f();
            if (!flag)
            {
                throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", new Object[] {
                    s1
                }));
            }
            zza1.e();
            try
            {
                zza1 = (new StringBuilder("get")).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                zza1 = ((zza) (getClass().getMethod(zza1, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (zza zza1)
            {
                throw new RuntimeException(zza1);
            }
            return zza1;
        } else
        {
            zza1.f();
            return b();
        }
    }

    protected static Object a(zza zza1, Object obj)
    {
        Object obj1 = obj;
        if (zza.a(zza1) != null)
        {
            obj1 = zza1.a(obj);
        }
        return obj1;
    }

    private static void a(StringBuilder stringbuilder, zza zza1, Object obj)
    {
        if (zza1.b() == 11)
        {
            stringbuilder.append(((zzld)zza1.h().cast(obj)).toString());
            return;
        }
        if (zza1.b() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(iq.a((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, zza zza1, ArrayList arraylist)
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
                a(stringbuilder, zza1, obj);
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
                zza zza1 = (zza)map.get(s);
                if (zza1.d() == 11)
                {
                    if (zza1.e())
                    {
                        zza1.f();
                        throw new UnsupportedOperationException("Concrete type arrays not supported");
                    } else
                    {
                        zza1.f();
                        throw new UnsupportedOperationException("Concrete types not supported");
                    }
                }
                zza1.f();
                if (c())
                {
                    Object obj = a(zza1, a(zza1));
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
                        switch (zza1.d())
                        {
                        default:
                            if (zza1.c())
                            {
                                a(stringbuilder, zza1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, zza1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(im.a((byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(im.b((byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ir.a(stringbuilder, (HashMap)obj);
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

    private class zza
        implements SafeParcelable
    {

        public static final ia CREATOR = new ia();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int i;
        private zzlh j;
        private hz k;

        static hz a(zza zza1)
        {
            return zza1.k;
        }

        public final int a()
        {
            return i;
        }

        public final Object a(Object obj)
        {
            return k.a(obj);
        }

        public final void a(zzlh zzlh1)
        {
            j = zzlh1;
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

        final zzky k()
        {
            if (k == null)
            {
                return null;
            } else
            {
                return zzky.a(k);
            }
        }

        public final Map l()
        {
            ap.a(h);
            ap.a(j);
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
            ia.a(this, parcel, i1);
        }


        zza(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
                String s1, zzky zzky1)
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
                g = com/google/android/gms/internal/zzlk;
                h = s1;
            }
            if (zzky1 == null)
            {
                k = null;
                return;
            } else
            {
                k = zzky1.c();
                return;
            }
        }
    }

}
