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
//            hz, kt, kw, hw, 
//            kx, ky

public static final class adK extends hz
    implements SafeParcelable, com.google.android.gms.plus.model.people.n.Cover
{
    public static final class a extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final kx CREATOR = new kx();
        private static final HashMap aco;
        private final Set acp;
        private int adL;
        private int adM;
        private final int xJ;

        protected boolean a(hz.a a1)
        {
            return acp.contains(Integer.valueOf(a1.fI()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hz.a a1)
        {
            switch (a1.fI())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fI()).toString());

            case 2: // '\002'
                return Integer.valueOf(adL);

            case 3: // '\003'
                return Integer.valueOf(adM);
            }
        }

        public int describeContents()
        {
            kx kx1 = CREATOR;
            return 0;
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
                hz.a a1;
label1:
                do
                {
                    for (Iterator iterator = aco.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hz.a)iterator.next();
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kM();
        }

        public int getLeftImageOffset()
        {
            return adL;
        }

        public int getTopImageOffset()
        {
            return adM;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasLeftImageOffset()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return acp.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.fI();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a kM()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            kx kx1 = CREATOR;
            kx.a(this, parcel, i);
        }

        static 
        {
            aco = new HashMap();
            aco.put("leftImageOffset", hz.a.g("leftImageOffset", 2));
            aco.put("topImageOffset", hz.a.g("topImageOffset", 3));
        }

        public a()
        {
            xJ = 1;
            acp = new HashSet();
        }

        a(Set set, int i, int j, int k)
        {
            acp = set;
            xJ = i;
            adL = j;
            adM = k;
        }
    }

    public static final class b extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final ky CREATOR = new ky();
        private static final HashMap aco;
        private final Set acp;
        private int ks;
        private int kt;
        private String qV;
        private final int xJ;

        protected boolean a(hz.a a1)
        {
            return acp.contains(Integer.valueOf(a1.fI()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hz.a a1)
        {
            switch (a1.fI())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fI()).toString());

            case 2: // '\002'
                return Integer.valueOf(kt);

            case 3: // '\003'
                return qV;

            case 4: // '\004'
                return Integer.valueOf(ks);
            }
        }

        public int describeContents()
        {
            ky ky1 = CREATOR;
            return 0;
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
                hz.a a1;
label1:
                do
                {
                    for (Iterator iterator = aco.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hz.a)iterator.next();
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kN();
        }

        public int getHeight()
        {
            return kt;
        }

        public String getUrl()
        {
            return qV;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public int getWidth()
        {
            return ks;
        }

        public boolean hasHeight()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return acp.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return acp.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.fI();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b kN()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ky ky1 = CREATOR;
            ky.a(this, parcel, i);
        }

        static 
        {
            aco = new HashMap();
            aco.put("height", hz.a.g("height", 2));
            aco.put("url", hz.a.j("url", 3));
            aco.put("width", hz.a.g("width", 4));
        }

        public b()
        {
            xJ = 1;
            acp = new HashSet();
        }

        b(Set set, int i, int j, String s, int k)
        {
            acp = set;
            xJ = i;
            kt = j;
            qV = s;
            ks = k;
        }
    }


    public static final kw CREATOR = new kw();
    private static final HashMap aco;
    private final Set acp;
    private a adI;
    private b adJ;
    private int adK;
    private final int xJ;

    protected boolean a(nit> nit>)
    {
        return acp.contains(Integer.valueOf(nit>.fI()));
    }

    protected Object aF(String s)
    {
        return null;
    }

    protected boolean aG(String s)
    {
        return false;
    }

    protected Object b(fI fi)
    {
        switch (fi.fI())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(fi.fI()).toString());

        case 2: // '\002'
            return adI;

        case 3: // '\003'
            return adJ;

        case 4: // '\004'
            return Integer.valueOf(adK);
        }
    }

    public int describeContents()
    {
        kw kw1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof CREATOR))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (CREATOR)obj;
            CREATOR creator;
label1:
            do
            {
                for (Iterator iterator = aco.values().iterator(); iterator.hasNext();)
                {
                    creator = (aco)iterator.next();
                    if (!a(creator))
                    {
                        continue label1;
                    }
                    if (((a) (obj)).a(creator))
                    {
                        if (!b(creator).equals(((b) (obj)).b(creator)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((b) (obj)).a(creator));
            return false;
        }
        return true;
    }

    public HashMap fB()
    {
        return aco;
    }

    public Object freeze()
    {
        return kL();
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverInfo getCoverInfo()
    {
        return adI;
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverPhoto getCoverPhoto()
    {
        return adJ;
    }

    public int getLayout()
    {
        return adK;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public boolean hasCoverInfo()
    {
        return acp.contains(Integer.valueOf(2));
    }

    public boolean hasCoverPhoto()
    {
        return acp.contains(Integer.valueOf(3));
    }

    public boolean hasLayout()
    {
        return acp.contains(Integer.valueOf(4));
    }

    public int hashCode()
    {
        Iterator iterator = aco.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            acp acp1 = (aco)iterator.next();
            if (a(acp1))
            {
                int j = acp1.fI();
                i = b(acp1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    a kJ()
    {
        return adI;
    }

    b kK()
    {
        return adJ;
    }

    public adJ kL()
    {
        return this;
    }

    Set kf()
    {
        return acp;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kw kw1 = CREATOR;
        kw.a(this, parcel, i);
    }

    static 
    {
        aco = new HashMap();
        aco.put("coverInfo", a("coverInfo", 2, com/google/android/gms/internal/kt$b$a));
        aco.put("coverPhoto", a("coverPhoto", 3, com/google/android/gms/internal/kt$b$b));
        aco.put("layout", a("layout", 4, (new hw()).f("banner", 0), false));
    }

    public b()
    {
        xJ = 1;
        acp = new HashSet();
    }

    b(Set set, int i, a a1, b b1, int j)
    {
        acp = set;
        xJ = i;
        adI = a1;
        adJ = b1;
        adK = j;
    }
}
