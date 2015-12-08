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
//            gp, fq, gj, gq, 
//            gb, gg, fv, gd

public abstract class ga
{
    public static class a
        implements SafeParcelable
    {

        public static final gb CREATOR = new gb();
        protected final int DY;
        protected final boolean DZ;
        protected final int Ea;
        protected final boolean Eb;
        protected final String Ec;
        protected final int Ed;
        protected final Class Ee;
        protected final String Ef;
        private gd Eg;
        private b Eh;
        private final int xH;

        public static a a(String s, int l, b b1, boolean flag)
        {
            return new a(b1.eW(), flag, b1.eX(), false, s, l, null, b1);
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
            return a1.Eh;
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

        public void a(gd gd1)
        {
            Eg = gd1;
        }

        public int describeContents()
        {
            gb gb1 = CREATOR;
            return 0;
        }

        public int eW()
        {
            return DY;
        }

        public int eX()
        {
            return Ea;
        }

        public a fb()
        {
            return new a(xH, DY, DZ, Ea, Eb, Ec, Ed, Ef, fj());
        }

        public boolean fc()
        {
            return DZ;
        }

        public boolean fd()
        {
            return Eb;
        }

        public String fe()
        {
            return Ec;
        }

        public int ff()
        {
            return Ed;
        }

        public Class fg()
        {
            return Ee;
        }

        String fh()
        {
            if (Ef == null)
            {
                return null;
            } else
            {
                return Ef;
            }
        }

        public boolean fi()
        {
            return Eh != null;
        }

        fv fj()
        {
            if (Eh == null)
            {
                return null;
            } else
            {
                return fv.a(Eh);
            }
        }

        public HashMap fk()
        {
            fq.f(Ef);
            fq.f(Eg);
            return Eg.au(Ef);
        }

        public Object g(Object obj)
        {
            return Eh.g(obj);
        }

        public int getVersionCode()
        {
            return xH;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(xH).append('\n');
            stringbuilder.append("                 typeIn=").append(DY).append('\n');
            stringbuilder.append("            typeInArray=").append(DZ).append('\n');
            stringbuilder.append("                typeOut=").append(Ea).append('\n');
            stringbuilder.append("           typeOutArray=").append(Eb).append('\n');
            stringbuilder.append("        outputFieldName=").append(Ec).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(Ed).append('\n');
            stringbuilder.append("       concreteTypeName=").append(fh()).append('\n');
            if (fg() != null)
            {
                stringbuilder.append("     concreteType.class=").append(fg().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (Eh == null)
            {
                s = "null";
            } else
            {
                s = Eh.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            gb gb1 = CREATOR;
            gb.a(this, parcel, l);
        }


        a(int l, int i1, boolean flag, int j1, boolean flag1, String s, int k1, 
                String s1, fv fv1)
        {
            xH = l;
            DY = i1;
            DZ = flag;
            Ea = j1;
            Eb = flag1;
            Ec = s;
            Ed = k1;
            if (s1 == null)
            {
                Ee = null;
                Ef = null;
            } else
            {
                Ee = com/google/android/gms/internal/gg;
                Ef = s1;
            }
            if (fv1 == null)
            {
                Eh = null;
                return;
            } else
            {
                Eh = fv1.eU();
                return;
            }
        }

        protected a(int l, boolean flag, int i1, boolean flag1, String s, int j1, Class class1, 
                b b1)
        {
            xH = 1;
            DY = l;
            DZ = flag;
            Ea = i1;
            Eb = flag1;
            Ec = s;
            Ed = j1;
            Ee = class1;
            if (class1 == null)
            {
                Ef = null;
            } else
            {
                Ef = class1.getCanonicalName();
            }
            Eh = b1;
        }
    }

    public static interface b
    {

        public abstract int eW();

        public abstract int eX();

        public abstract Object g(Object obj);
    }


    public ga()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.eW() == 11)
        {
            stringbuilder.append(((ga)a1.fg().cast(obj)).toString());
            return;
        }
        if (a1.eW() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(gp.av((String)obj));
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
        if (a1.eX() == 11)
        {
            if (a1.fd())
            {
                return at(a1.fe());
            } else
            {
                return as(a1.fe());
            }
        } else
        {
            return ar(a1.fe());
        }
    }

    protected abstract Object aq(String s);

    protected abstract boolean ar(String s);

    protected boolean as(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean at(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    protected Object b(a a1)
    {
        boolean flag = true;
        String s = a1.fe();
        if (a1.fg() != null)
        {
            if (aq(a1.fe()) != null)
            {
                flag = false;
            }
            fq.a(flag, (new StringBuilder()).append("Concrete field shouldn't be value object: ").append(a1.fe()).toString());
            if (a1.fd())
            {
                a1 = fa();
            } else
            {
                a1 = eZ();
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
            return aq(a1.fe());
        }
    }

    public abstract HashMap eY();

    public HashMap eZ()
    {
        return null;
    }

    public HashMap fa()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = eY();
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
                        switch (a1.eX())
                        {
                        default:
                            if (a1.fc())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(gj.d((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(gj.e((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            gq.a(stringbuilder, (HashMap)obj);
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
