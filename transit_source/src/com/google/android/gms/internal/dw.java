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
//            ei, dm, ef, ej, 
//            dx, ec, dr, dz

public abstract class dw
{
    public static class a
        implements SafeParcelable
    {

        public static final dx CREATOR = new dx();
        private final int iM;
        protected final boolean lA;
        protected final int lB;
        protected final boolean lC;
        protected final String lD;
        protected final int lE;
        protected final Class lF;
        protected final String lG;
        private dz lH;
        private b lI;
        protected final int lz;

        public static a a(String s, int i, b b1, boolean flag)
        {
            return new a(b1.bn(), flag, b1.bo(), false, s, i, null, b1);
        }

        public static a a(String s, int i, Class class1)
        {
            return new a(11, false, 11, false, s, i, class1, null);
        }

        public static a b(String s, int i, Class class1)
        {
            return new a(11, true, 11, true, s, i, class1, null);
        }

        static b c(a a1)
        {
            return a1.lI;
        }

        public static a d(String s, int i)
        {
            return new a(0, false, 0, false, s, i, null, null);
        }

        public static a e(String s, int i)
        {
            return new a(4, false, 4, false, s, i, null, null);
        }

        public static a f(String s, int i)
        {
            return new a(6, false, 6, false, s, i, null, null);
        }

        public static a g(String s, int i)
        {
            return new a(7, false, 7, false, s, i, null, null);
        }

        public static a h(String s, int i)
        {
            return new a(7, true, 7, true, s, i, null, null);
        }

        public void a(dz dz1)
        {
            lH = dz1;
        }

        dr bA()
        {
            if (lI == null)
            {
                return null;
            } else
            {
                return dr.a(lI);
            }
        }

        public HashMap bB()
        {
            dm.e(lG);
            dm.e(lH);
            return lH.H(lG);
        }

        public int bn()
        {
            return lz;
        }

        public int bo()
        {
            return lB;
        }

        public a bs()
        {
            return new a(iM, lz, lA, lB, lC, lD, lE, lG, bA());
        }

        public boolean bt()
        {
            return lA;
        }

        public boolean bu()
        {
            return lC;
        }

        public String bv()
        {
            return lD;
        }

        public int bw()
        {
            return lE;
        }

        public Class bx()
        {
            return lF;
        }

        String by()
        {
            if (lG == null)
            {
                return null;
            } else
            {
                return lG;
            }
        }

        public boolean bz()
        {
            return lI != null;
        }

        public int describeContents()
        {
            dx dx1 = CREATOR;
            return 0;
        }

        public Object f(Object obj)
        {
            return lI.f(obj);
        }

        public int getVersionCode()
        {
            return iM;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(iM).append('\n');
            stringbuilder.append("                 typeIn=").append(lz).append('\n');
            stringbuilder.append("            typeInArray=").append(lA).append('\n');
            stringbuilder.append("                typeOut=").append(lB).append('\n');
            stringbuilder.append("           typeOutArray=").append(lC).append('\n');
            stringbuilder.append("        outputFieldName=").append(lD).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(lE).append('\n');
            stringbuilder.append("       concreteTypeName=").append(by()).append('\n');
            if (bx() != null)
            {
                stringbuilder.append("     concreteType.class=").append(bx().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (lI == null)
            {
                s = "null";
            } else
            {
                s = lI.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            dx dx1 = CREATOR;
            dx.a(this, parcel, i);
        }


        a(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
                String s1, dr dr1)
        {
            iM = i;
            lz = j;
            lA = flag;
            lB = k;
            lC = flag1;
            lD = s;
            lE = l;
            if (s1 == null)
            {
                lF = null;
                lG = null;
            } else
            {
                lF = com/google/android/gms/internal/ec;
                lG = s1;
            }
            if (dr1 == null)
            {
                lI = null;
                return;
            } else
            {
                lI = dr1.bl();
                return;
            }
        }

        protected a(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
                b b1)
        {
            iM = 1;
            lz = i;
            lA = flag;
            lB = j;
            lC = flag1;
            lD = s;
            lE = k;
            lF = class1;
            if (class1 == null)
            {
                lG = null;
            } else
            {
                lG = class1.getCanonicalName();
            }
            lI = b1;
        }
    }

    public static interface b
    {

        public abstract int bn();

        public abstract int bo();

        public abstract Object f(Object obj);
    }


    public dw()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.bn() == 11)
        {
            stringbuilder.append(((dw)a1.bx().cast(obj)).toString());
            return;
        }
        if (a1.bn() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(ei.I((String)obj));
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

    protected abstract Object D(String s);

    protected abstract boolean E(String s);

    protected boolean F(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean G(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    protected Object a(a a1, Object obj)
    {
        Object obj1 = obj;
        if (a.c(a1) != null)
        {
            obj1 = a1.f(obj);
        }
        return obj1;
    }

    protected boolean a(a a1)
    {
        if (a1.bo() == 11)
        {
            if (a1.bu())
            {
                return G(a1.bv());
            } else
            {
                return F(a1.bv());
            }
        } else
        {
            return E(a1.bv());
        }
    }

    protected Object b(a a1)
    {
        boolean flag = true;
        String s = a1.bv();
        if (a1.bx() != null)
        {
            if (D(a1.bv()) != null)
            {
                flag = false;
            }
            dm.a(flag, (new StringBuilder()).append("Concrete field shouldn't be value object: ").append(a1.bv()).toString());
            if (a1.bu())
            {
                a1 = br();
            } else
            {
                a1 = bq();
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
            return D(a1.bv());
        }
    }

    public abstract HashMap bp();

    public HashMap bq()
    {
        return null;
    }

    public HashMap br()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = bp();
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
                        switch (a1.bo())
                        {
                        default:
                            if (a1.bt())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(ef.b((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(ef.c((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ej.a(stringbuilder, (HashMap)obj);
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
