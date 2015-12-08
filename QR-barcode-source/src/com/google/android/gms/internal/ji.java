// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jz, js, ka, jk, 
//            jp, jd, jm

public abstract class ji
{
    public static class a
        implements SafeParcelable
    {

        public static final jk CREATOR = new jk();
        private final int BR;
        protected final int MA;
        protected final boolean MB;
        protected final String MC;
        protected final int MD;
        protected final Class ME;
        protected final String MF;
        private jm MG;
        private b MH;
        protected final int My;
        protected final boolean Mz;

        public static a a(String s, int i1, b b1, boolean flag)
        {
            return new a(b1.hd(), flag, b1.he(), false, s, i1, null, b1);
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
            return a1.MH;
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

        public void a(jm jm1)
        {
            MG = jm1;
        }

        public Object convertBack(Object obj)
        {
            return MH.convertBack(obj);
        }

        public int describeContents()
        {
            jk jk1 = CREATOR;
            return 0;
        }

        public int getVersionCode()
        {
            return BR;
        }

        public int hd()
        {
            return My;
        }

        public int he()
        {
            return MA;
        }

        public a hi()
        {
            return new a(BR, My, Mz, MA, MB, MC, MD, MF, hq());
        }

        public boolean hj()
        {
            return Mz;
        }

        public boolean hk()
        {
            return MB;
        }

        public String hl()
        {
            return MC;
        }

        public int hm()
        {
            return MD;
        }

        public Class hn()
        {
            return ME;
        }

        String ho()
        {
            if (MF == null)
            {
                return null;
            } else
            {
                return MF;
            }
        }

        public boolean hp()
        {
            return MH != null;
        }

        jd hq()
        {
            if (MH == null)
            {
                return null;
            } else
            {
                return jd.a(MH);
            }
        }

        public HashMap hr()
        {
            o.i(MF);
            o.i(MG);
            return MG.be(MF);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(BR).append('\n');
            stringbuilder.append("                 typeIn=").append(My).append('\n');
            stringbuilder.append("            typeInArray=").append(Mz).append('\n');
            stringbuilder.append("                typeOut=").append(MA).append('\n');
            stringbuilder.append("           typeOutArray=").append(MB).append('\n');
            stringbuilder.append("        outputFieldName=").append(MC).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(MD).append('\n');
            stringbuilder.append("       concreteTypeName=").append(ho()).append('\n');
            if (hn() != null)
            {
                stringbuilder.append("     concreteType.class=").append(hn().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (MH == null)
            {
                s = "null";
            } else
            {
                s = MH.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            jk jk1 = CREATOR;
            jk.a(this, parcel, i1);
        }


        a(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
                String s1, jd jd1)
        {
            BR = i1;
            My = j1;
            Mz = flag;
            MA = k1;
            MB = flag1;
            MC = s;
            MD = l1;
            if (s1 == null)
            {
                ME = null;
                MF = null;
            } else
            {
                ME = com/google/android/gms/internal/jp;
                MF = s1;
            }
            if (jd1 == null)
            {
                MH = null;
                return;
            } else
            {
                MH = jd1.hb();
                return;
            }
        }

        protected a(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
                b b1)
        {
            BR = 1;
            My = i1;
            Mz = flag;
            MA = j1;
            MB = flag1;
            MC = s;
            MD = k1;
            ME = class1;
            if (class1 == null)
            {
                MF = null;
            } else
            {
                MF = class1.getCanonicalName();
            }
            MH = b1;
        }
    }

    public static interface b
    {

        public abstract Object convertBack(Object obj);

        public abstract int hd();

        public abstract int he();
    }


    public ji()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.hd() == 11)
        {
            stringbuilder.append(((ji)a1.hn().cast(obj)).toString());
            return;
        }
        if (a1.hd() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(jz.bf((String)obj));
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
        if (a1.he() == 11)
        {
            if (a1.hk())
            {
                return bd(a1.hl());
            } else
            {
                return bc(a1.hl());
            }
        } else
        {
            return bb(a1.hl());
        }
    }

    protected Object b(a a1)
    {
        String s = a1.hl();
        if (a1.hn() != null)
        {
            boolean flag;
            if (ba(a1.hl()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                a1.hl()
            });
            if (a1.hk())
            {
                a1 = hh();
            } else
            {
                a1 = hg();
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
            return ba(a1.hl());
        }
    }

    protected abstract Object ba(String s);

    protected abstract boolean bb(String s);

    protected boolean bc(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean bd(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public abstract HashMap hf();

    public HashMap hg()
    {
        return null;
    }

    public HashMap hh()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = hf();
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
                        switch (a1.he())
                        {
                        default:
                            if (a1.hj())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(js.d((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(js.e((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ka.a(stringbuilder, (HashMap)obj);
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
