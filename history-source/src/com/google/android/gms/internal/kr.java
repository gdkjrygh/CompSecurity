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
//            li, jx, lb, lj, 
//            kt, ky, km, kv

public abstract class kr
{
    public static class a
        implements SafeParcelable
    {

        public static final kt CREATOR = new kt();
        private final int CK;
        protected final int NL;
        protected final boolean NM;
        protected final int NN;
        protected final boolean NO;
        protected final String NP;
        protected final int NQ;
        protected final Class NR;
        protected final String NS;
        private kv NT;
        private b NU;

        public static a a(String s, int i1, b b1, boolean flag)
        {
            return new a(b1.hI(), flag, b1.hJ(), false, s, i1, null, b1);
        }

        public static a a(String s, int i1, Class class1)
        {
            return new a(11, false, 11, false, s, i1, class1, null);
        }

        public static a b(String s, int i1, Class class1)
        {
            return new a(11, true, 11, true, s, i1, class1, null);
        }

        static b c(a a1)
        {
            return a1.NU;
        }

        public static a i(String s, int i1)
        {
            return new a(0, false, 0, false, s, i1, null, null);
        }

        public static a j(String s, int i1)
        {
            return new a(4, false, 4, false, s, i1, null, null);
        }

        public static a k(String s, int i1)
        {
            return new a(6, false, 6, false, s, i1, null, null);
        }

        public static a l(String s, int i1)
        {
            return new a(7, false, 7, false, s, i1, null, null);
        }

        public static a m(String s, int i1)
        {
            return new a(7, true, 7, true, s, i1, null, null);
        }

        public void a(kv kv1)
        {
            NT = kv1;
        }

        public Object convertBack(Object obj)
        {
            return NU.convertBack(obj);
        }

        public int describeContents()
        {
            kt kt1 = CREATOR;
            return 0;
        }

        public int getVersionCode()
        {
            return CK;
        }

        public int hI()
        {
            return NL;
        }

        public int hJ()
        {
            return NN;
        }

        public a hN()
        {
            return new a(CK, NL, NM, NN, NO, NP, NQ, NS, hV());
        }

        public boolean hO()
        {
            return NM;
        }

        public boolean hP()
        {
            return NO;
        }

        public String hQ()
        {
            return NP;
        }

        public int hR()
        {
            return NQ;
        }

        public Class hS()
        {
            return NR;
        }

        String hT()
        {
            if (NS == null)
            {
                return null;
            } else
            {
                return NS;
            }
        }

        public boolean hU()
        {
            return NU != null;
        }

        km hV()
        {
            if (NU == null)
            {
                return null;
            } else
            {
                return km.a(NU);
            }
        }

        public HashMap hW()
        {
            jx.i(NS);
            jx.i(NT);
            return NT.bg(NS);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(CK).append('\n');
            stringbuilder.append("                 typeIn=").append(NL).append('\n');
            stringbuilder.append("            typeInArray=").append(NM).append('\n');
            stringbuilder.append("                typeOut=").append(NN).append('\n');
            stringbuilder.append("           typeOutArray=").append(NO).append('\n');
            stringbuilder.append("        outputFieldName=").append(NP).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(NQ).append('\n');
            stringbuilder.append("       concreteTypeName=").append(hT()).append('\n');
            if (hS() != null)
            {
                stringbuilder.append("     concreteType.class=").append(hS().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (NU == null)
            {
                s = "null";
            } else
            {
                s = NU.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            kt kt1 = CREATOR;
            kt.a(this, parcel, i1);
        }


        a(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
                String s1, km km1)
        {
            CK = i1;
            NL = j1;
            NM = flag;
            NN = k1;
            NO = flag1;
            NP = s;
            NQ = l1;
            if (s1 == null)
            {
                NR = null;
                NS = null;
            } else
            {
                NR = com/google/android/gms/internal/ky;
                NS = s1;
            }
            if (km1 == null)
            {
                NU = null;
                return;
            } else
            {
                NU = km1.hG();
                return;
            }
        }

        protected a(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
                b b1)
        {
            CK = 1;
            NL = i1;
            NM = flag;
            NN = j1;
            NO = flag1;
            NP = s;
            NQ = k1;
            NR = class1;
            if (class1 == null)
            {
                NS = null;
            } else
            {
                NS = class1.getCanonicalName();
            }
            NU = b1;
        }
    }

    public static interface b
    {

        public abstract Object convertBack(Object obj);

        public abstract int hI();

        public abstract int hJ();
    }


    public kr()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.hI() == 11)
        {
            stringbuilder.append(((kr)a1.hS().cast(obj)).toString());
            return;
        }
        if (a1.hI() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(li.bh((String)obj));
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
            obj1 = a1.convertBack(obj);
        }
        return obj1;
    }

    protected boolean a(a a1)
    {
        if (a1.hJ() == 11)
        {
            if (a1.hP())
            {
                return bf(a1.hQ());
            } else
            {
                return be(a1.hQ());
            }
        } else
        {
            return bd(a1.hQ());
        }
    }

    protected Object b(a a1)
    {
        String s = a1.hQ();
        if (a1.hS() != null)
        {
            boolean flag;
            if (bc(a1.hQ()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                a1.hQ()
            });
            if (a1.hP())
            {
                a1 = hM();
            } else
            {
                a1 = hL();
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
            return bc(a1.hQ());
        }
    }

    protected abstract Object bc(String s);

    protected abstract boolean bd(String s);

    protected boolean be(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean bf(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public abstract HashMap hK();

    public HashMap hL()
    {
        return null;
    }

    public HashMap hM()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = hK();
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
                        switch (a1.hJ())
                        {
                        default:
                            if (a1.hO())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(lb.d((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(lb.e((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            lj.a(stringbuilder, (HashMap)obj);
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
