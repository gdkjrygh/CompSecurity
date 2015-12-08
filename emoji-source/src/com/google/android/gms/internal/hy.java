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
//            in, hm, ih, io, 
//            hz, ie, ht, ib

public abstract class hy
{
    public static class a
        implements SafeParcelable
    {

        public static final hz CREATOR = new hz();
        protected final int Hb;
        protected final boolean Hc;
        protected final int Hd;
        protected final boolean He;
        protected final String Hf;
        protected final int Hg;
        protected final Class Hh;
        protected final String Hi;
        private ib Hj;
        private b Hk;
        private final int xM;

        public static a a(String s, int l, b b1, boolean flag)
        {
            return new a(b1.fE(), flag, b1.fF(), false, s, l, null, b1);
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
            return a1.Hk;
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

        public void a(ib ib1)
        {
            Hj = ib1;
        }

        public int describeContents()
        {
            hz hz1 = CREATOR;
            return 0;
        }

        public int fE()
        {
            return Hb;
        }

        public int fF()
        {
            return Hd;
        }

        public a fJ()
        {
            return new a(xM, Hb, Hc, Hd, He, Hf, Hg, Hi, fR());
        }

        public boolean fK()
        {
            return Hc;
        }

        public boolean fL()
        {
            return He;
        }

        public String fM()
        {
            return Hf;
        }

        public int fN()
        {
            return Hg;
        }

        public Class fO()
        {
            return Hh;
        }

        String fP()
        {
            if (Hi == null)
            {
                return null;
            } else
            {
                return Hi;
            }
        }

        public boolean fQ()
        {
            return Hk != null;
        }

        ht fR()
        {
            if (Hk == null)
            {
                return null;
            } else
            {
                return ht.a(Hk);
            }
        }

        public HashMap fS()
        {
            hm.f(Hi);
            hm.f(Hj);
            return Hj.aJ(Hi);
        }

        public Object g(Object obj)
        {
            return Hk.g(obj);
        }

        public int getVersionCode()
        {
            return xM;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(xM).append('\n');
            stringbuilder.append("                 typeIn=").append(Hb).append('\n');
            stringbuilder.append("            typeInArray=").append(Hc).append('\n');
            stringbuilder.append("                typeOut=").append(Hd).append('\n');
            stringbuilder.append("           typeOutArray=").append(He).append('\n');
            stringbuilder.append("        outputFieldName=").append(Hf).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(Hg).append('\n');
            stringbuilder.append("       concreteTypeName=").append(fP()).append('\n');
            if (fO() != null)
            {
                stringbuilder.append("     concreteType.class=").append(fO().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (Hk == null)
            {
                s = "null";
            } else
            {
                s = Hk.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            hz hz1 = CREATOR;
            hz.a(this, parcel, l);
        }


        a(int l, int i1, boolean flag, int j1, boolean flag1, String s, int k1, 
                String s1, ht ht1)
        {
            xM = l;
            Hb = i1;
            Hc = flag;
            Hd = j1;
            He = flag1;
            Hf = s;
            Hg = k1;
            if (s1 == null)
            {
                Hh = null;
                Hi = null;
            } else
            {
                Hh = com/google/android/gms/internal/ie;
                Hi = s1;
            }
            if (ht1 == null)
            {
                Hk = null;
                return;
            } else
            {
                Hk = ht1.fC();
                return;
            }
        }

        protected a(int l, boolean flag, int i1, boolean flag1, String s, int j1, Class class1, 
                b b1)
        {
            xM = 1;
            Hb = l;
            Hc = flag;
            Hd = i1;
            He = flag1;
            Hf = s;
            Hg = j1;
            Hh = class1;
            if (class1 == null)
            {
                Hi = null;
            } else
            {
                Hi = class1.getCanonicalName();
            }
            Hk = b1;
        }
    }

    public static interface b
    {

        public abstract int fE();

        public abstract int fF();

        public abstract Object g(Object obj);
    }


    public hy()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.fE() == 11)
        {
            stringbuilder.append(((hy)a1.fO().cast(obj)).toString());
            return;
        }
        if (a1.fE() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(in.aK((String)obj));
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
        if (a1.fF() == 11)
        {
            if (a1.fL())
            {
                return aI(a1.fM());
            } else
            {
                return aH(a1.fM());
            }
        } else
        {
            return aG(a1.fM());
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
        String s = a1.fM();
        if (a1.fO() != null)
        {
            boolean flag;
            if (aF(a1.fM()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hm.a(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                a1.fM()
            });
            if (a1.fL())
            {
                a1 = fI();
            } else
            {
                a1 = fH();
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
            return aF(a1.fM());
        }
    }

    public abstract HashMap fG();

    public HashMap fH()
    {
        return null;
    }

    public HashMap fI()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = fG();
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
                        switch (a1.fF())
                        {
                        default:
                            if (a1.fK())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(ih.d((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(ih.e((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            io.a(stringbuilder, (HashMap)obj);
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
