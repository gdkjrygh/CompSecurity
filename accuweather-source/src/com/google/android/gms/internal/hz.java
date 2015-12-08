// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            io, hn, ii, ip, 
//            ia, if, hu, ic

public abstract class hz
{
    public static class a
        implements SafeParcelable
    {

        public static final ia CREATOR = new ia();
        protected final int GY;
        protected final boolean GZ;
        protected final int Ha;
        protected final boolean Hb;
        protected final String Hc;
        protected final int Hd;
        protected final Class He;
        protected final String Hf;
        private ic Hg;
        private b Hh;
        private final int xJ;

        public static a a(String s, int l, b b1, boolean flag)
        {
            return new a(b1.fz(), flag, b1.fA(), false, s, l, null, b1);
        }

        public static a a(String s, int l, Class class1)
        {
            return new a(11, false, 11, false, s, l, class1, null);
        }

        public static a b(String s, int l, Class class1)
        {
            return new a(11, true, 11, true, s, l, class1, null);
        }

        static b c(a a1)
        {
            return a1.Hh;
        }

        public static a g(String s, int l)
        {
            return new a(0, false, 0, false, s, l, null, null);
        }

        public static a h(String s, int l)
        {
            return new a(4, false, 4, false, s, l, null, null);
        }

        public static a i(String s, int l)
        {
            return new a(6, false, 6, false, s, l, null, null);
        }

        public static a j(String s, int l)
        {
            return new a(7, false, 7, false, s, l, null, null);
        }

        public static a k(String s, int l)
        {
            return new a(7, true, 7, true, s, l, null, null);
        }

        public void a(ic ic1)
        {
            Hg = ic1;
        }

        public int describeContents()
        {
            ia ia1 = CREATOR;
            return 0;
        }

        public int fA()
        {
            return Ha;
        }

        public a fE()
        {
            return new a(xJ, GY, GZ, Ha, Hb, Hc, Hd, Hf, fM());
        }

        public boolean fF()
        {
            return GZ;
        }

        public boolean fG()
        {
            return Hb;
        }

        public String fH()
        {
            return Hc;
        }

        public int fI()
        {
            return Hd;
        }

        public Class fJ()
        {
            return He;
        }

        String fK()
        {
            if (Hf == null)
            {
                return null;
            } else
            {
                return Hf;
            }
        }

        public boolean fL()
        {
            return Hh != null;
        }

        hu fM()
        {
            if (Hh == null)
            {
                return null;
            } else
            {
                return hu.a(Hh);
            }
        }

        public HashMap fN()
        {
            hn.f(Hf);
            hn.f(Hg);
            return Hg.aJ(Hf);
        }

        public int fz()
        {
            return GY;
        }

        public Object g(Object obj)
        {
            return Hh.g(obj);
        }

        public int getVersionCode()
        {
            return xJ;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(xJ).append('\n');
            stringbuilder.append("                 typeIn=").append(GY).append('\n');
            stringbuilder.append("            typeInArray=").append(GZ).append('\n');
            stringbuilder.append("                typeOut=").append(Ha).append('\n');
            stringbuilder.append("           typeOutArray=").append(Hb).append('\n');
            stringbuilder.append("        outputFieldName=").append(Hc).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(Hd).append('\n');
            stringbuilder.append("       concreteTypeName=").append(fK()).append('\n');
            if (fJ() != null)
            {
                stringbuilder.append("     concreteType.class=").append(fJ().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (Hh == null)
            {
                s = "null";
            } else
            {
                s = Hh.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            ia ia1 = CREATOR;
            ia.a(this, parcel, l);
        }


        a(int l, int i1, boolean flag, int j1, boolean flag1, String s, int k1, 
                String s1, hu hu1)
        {
            xJ = l;
            GY = i1;
            GZ = flag;
            Ha = j1;
            Hb = flag1;
            Hc = s;
            Hd = k1;
            if (s1 == null)
            {
                He = null;
                Hf = null;
            } else
            {
                He = com/google/android/gms/internal/if;
                Hf = s1;
            }
            if (hu1 == null)
            {
                Hh = null;
                return;
            } else
            {
                Hh = hu1.fx();
                return;
            }
        }

        protected a(int l, boolean flag, int i1, boolean flag1, String s, int j1, Class class1, 
                b b1)
        {
            xJ = 1;
            GY = l;
            GZ = flag;
            Ha = i1;
            Hb = flag1;
            Hc = s;
            Hd = j1;
            He = class1;
            if (class1 == null)
            {
                Hf = null;
            } else
            {
                Hf = class1.getCanonicalName();
            }
            Hh = b1;
        }
    }

    public static interface b
    {

        public abstract int fA();

        public abstract int fz();

        public abstract Object g(Object obj);
    }


    public hz()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.fz() == 11)
        {
            stringbuilder.append(((hz)a1.fJ().cast(obj)).toString());
            return;
        }
        if (a1.fz() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(io.aK((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, a a1, ArrayList arraylist)
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

    protected Object a(a a1, Object obj)
    {
        Object obj1 = obj;
        if (a.c(a1) != null)
        {
            obj1 = a1.g(obj);
        }
        return obj1;
    }

    protected boolean a(a a1)
    {
        if (a1.fA() == 11)
        {
            if (a1.fG())
            {
                return aI(a1.fH());
            } else
            {
                return aH(a1.fH());
            }
        } else
        {
            return aG(a1.fH());
        }
    }

    protected abstract Object aF(String s);

    protected abstract boolean aG(String s);

    protected boolean aH(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean aI(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    protected Object b(a a1)
    {
        String s = a1.fH();
        if (a1.fJ() != null)
        {
            boolean flag;
            if (aF(a1.fH()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                a1.fH()
            });
            if (a1.fG())
            {
                a1 = fD();
            } else
            {
                a1 = fC();
            }
            if (a1 != null)
            {
                return a1.get(s);
            }
            try
            {
                a1 = (new StringBuilder()).append("get").append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
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
            return aF(a1.fH());
        }
    }

    public abstract HashMap fB();

    public HashMap fC()
    {
        return null;
    }

    public HashMap fD()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = fB();
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
                        switch (a1.fA())
                        {
                        default:
                            if (a1.fF())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(ii.d((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(ii.e((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ip.a(stringbuilder, (HashMap)obj);
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
