// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dw, fv, fy, dt, 
//            fz, ga

public static final class th extends dw
    implements SafeParcelable, com.google.android.gms.plus.model.people.n.Cover
{
    public static final class a extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final fz CREATOR = new fz();
        private static final HashMap rH;
        private final int iM;
        private final Set rI;
        private int ti;
        private int tj;

        protected Object D(String s)
        {
            return null;
        }

        protected boolean E(String s)
        {
            return false;
        }

        protected boolean a(dw.a a1)
        {
            return rI.contains(Integer.valueOf(a1.bw()));
        }

        protected Object b(dw.a a1)
        {
            switch (a1.bw())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.bw()).toString());

            case 2: // '\002'
                return Integer.valueOf(ti);

            case 3: // '\003'
                return Integer.valueOf(tj);
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public a dP()
        {
            return this;
        }

        public int describeContents()
        {
            fz fz1 = CREATOR;
            return 0;
        }

        Set di()
        {
            return rI;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (a)obj;
                dw.a a1;
label1:
                do
                {
                    for (Iterator iterator = rH.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (dw.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((a) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((a) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((a) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return dP();
        }

        public int getLeftImageOffset()
        {
            return ti;
        }

        public int getTopImageOffset()
        {
            return tj;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasLeftImageOffset()
        {
            return rI.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return rI.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = rH.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                dw.a a1 = (dw.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.bw();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            fz fz1 = CREATOR;
            fz.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("leftImageOffset", dw.a.d("leftImageOffset", 2));
            rH.put("topImageOffset", dw.a.d("topImageOffset", 3));
        }

        public a()
        {
            iM = 1;
            rI = new HashSet();
        }

        a(Set set, int i, int j, int k)
        {
            rI = set;
            iM = i;
            ti = j;
            tj = k;
        }
    }

    public static final class b extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final ga CREATOR = new ga();
        private static final HashMap rH;
        private int dP;
        private int dQ;
        private String hN;
        private final int iM;
        private final Set rI;

        protected Object D(String s)
        {
            return null;
        }

        protected boolean E(String s)
        {
            return false;
        }

        protected boolean a(dw.a a1)
        {
            return rI.contains(Integer.valueOf(a1.bw()));
        }

        protected Object b(dw.a a1)
        {
            switch (a1.bw())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.bw()).toString());

            case 2: // '\002'
                return Integer.valueOf(dQ);

            case 3: // '\003'
                return hN;

            case 4: // '\004'
                return Integer.valueOf(dP);
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public b dQ()
        {
            return this;
        }

        public int describeContents()
        {
            ga ga1 = CREATOR;
            return 0;
        }

        Set di()
        {
            return rI;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b)obj;
                dw.a a1;
label1:
                do
                {
                    for (Iterator iterator = rH.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (dw.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((b) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((b) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((b) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return dQ();
        }

        public int getHeight()
        {
            return dQ;
        }

        public String getUrl()
        {
            return hN;
        }

        int getVersionCode()
        {
            return iM;
        }

        public int getWidth()
        {
            return dP;
        }

        public boolean hasHeight()
        {
            return rI.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return rI.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return rI.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = rH.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                dw.a a1 = (dw.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.bw();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ga ga1 = CREATOR;
            ga.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("height", dw.a.d("height", 2));
            rH.put("url", dw.a.g("url", 3));
            rH.put("width", dw.a.d("width", 4));
        }

        public b()
        {
            iM = 1;
            rI = new HashSet();
        }

        b(Set set, int i, int j, String s, int k)
        {
            rI = set;
            iM = i;
            dQ = j;
            hN = s;
            dP = k;
        }
    }


    public static final fy CREATOR = new fy();
    private static final HashMap rH;
    private final int iM;
    private final Set rI;
    private a tf;
    private b tg;
    private int th;

    protected Object D(String s)
    {
        return null;
    }

    protected boolean E(String s)
    {
        return false;
    }

    protected boolean a(nit> nit>)
    {
        return rI.contains(Integer.valueOf(nit>.bw()));
    }

    protected Object b(bw bw)
    {
        switch (bw.bw())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(bw.bw()).toString());

        case 2: // '\002'
            return tf;

        case 3: // '\003'
            return tg;

        case 4: // '\004'
            return Integer.valueOf(th);
        }
    }

    public HashMap bp()
    {
        return rH;
    }

    a dM()
    {
        return tf;
    }

    b dN()
    {
        return tg;
    }

    public tg dO()
    {
        return this;
    }

    public int describeContents()
    {
        fy fy1 = CREATOR;
        return 0;
    }

    Set di()
    {
        return rI;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof rI))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (rI)obj;
            rI ri;
label1:
            do
            {
                for (Iterator iterator = rH.values().iterator(); iterator.hasNext();)
                {
                    ri = (rH)iterator.next();
                    if (!a(ri))
                    {
                        continue label1;
                    }
                    if (((a) (obj)).a(ri))
                    {
                        if (!b(ri).equals(((b) (obj)).b(ri)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((b) (obj)).a(ri));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return dO();
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverInfo getCoverInfo()
    {
        return tf;
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverPhoto getCoverPhoto()
    {
        return tg;
    }

    public int getLayout()
    {
        return th;
    }

    int getVersionCode()
    {
        return iM;
    }

    public boolean hasCoverInfo()
    {
        return rI.contains(Integer.valueOf(2));
    }

    public boolean hasCoverPhoto()
    {
        return rI.contains(Integer.valueOf(3));
    }

    public boolean hasLayout()
    {
        return rI.contains(Integer.valueOf(4));
    }

    public int hashCode()
    {
        Iterator iterator = rH.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            rI ri = (rH)iterator.next();
            if (a(ri))
            {
                int j = ri.bw();
                i = b(ri).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fy fy1 = CREATOR;
        fy.a(this, parcel, i);
    }

    static 
    {
        rH = new HashMap();
        rH.put("coverInfo", a("coverInfo", 2, com/google/android/gms/internal/fv$b$a));
        rH.put("coverPhoto", a("coverPhoto", 3, com/google/android/gms/internal/fv$b$b));
        rH.put("layout", a("layout", 4, (new dt()).c("banner", 0), false));
    }

    public b()
    {
        iM = 1;
        rI = new HashSet();
    }

    b(Set set, int i, a a1, b b1, int j)
    {
        rI = set;
        iM = i;
        tf = a1;
        tg = b1;
        th = j;
    }
}
