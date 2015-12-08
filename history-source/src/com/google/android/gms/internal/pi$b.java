// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ks, pi, pl, ko, 
//            pm, pn

public static final class apI extends ks
    implements com.google.android.gms.plus.model.people.n.Cover
{
    public static final class a extends ks
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final pm CREATOR = new pm();
        private static final HashMap aom;
        final int CK;
        final Set aon;
        int apJ;
        int apK;

        protected boolean a(kr.a a1)
        {
            return aon.contains(Integer.valueOf(a1.hR()));
        }

        protected Object b(kr.a a1)
        {
            switch (a1.hR())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hR()).toString());

            case 2: // '\002'
                return Integer.valueOf(apJ);

            case 3: // '\003'
                return Integer.valueOf(apK);
            }
        }

        public int describeContents()
        {
            pm pm1 = CREATOR;
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
                kr.a a1;
label1:
                do
                {
                    for (Iterator iterator = aom.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (kr.a)iterator.next();
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
            return oO();
        }

        public int getLeftImageOffset()
        {
            return apJ;
        }

        public int getTopImageOffset()
        {
            return apK;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasLeftImageOffset()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return aon.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.hR();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a oO()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            pm pm1 = CREATOR;
            pm.a(this, parcel, i);
        }

        static 
        {
            aom = new HashMap();
            aom.put("leftImageOffset", kr.a.i("leftImageOffset", 2));
            aom.put("topImageOffset", kr.a.i("topImageOffset", 3));
        }

        public a()
        {
            CK = 1;
            aon = new HashSet();
        }

        a(Set set, int i, int j, int k)
        {
            aon = set;
            CK = i;
            apJ = j;
            apK = k;
        }
    }

    public static final class b extends ks
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final pn CREATOR = new pn();
        private static final HashMap aom;
        final int CK;
        final Set aon;
        int li;
        int lj;
        String vf;

        protected boolean a(kr.a a1)
        {
            return aon.contains(Integer.valueOf(a1.hR()));
        }

        protected Object b(kr.a a1)
        {
            switch (a1.hR())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hR()).toString());

            case 2: // '\002'
                return Integer.valueOf(lj);

            case 3: // '\003'
                return vf;

            case 4: // '\004'
                return Integer.valueOf(li);
            }
        }

        public int describeContents()
        {
            pn pn1 = CREATOR;
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
                kr.a a1;
label1:
                do
                {
                    for (Iterator iterator = aom.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (kr.a)iterator.next();
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
            return oP();
        }

        public int getHeight()
        {
            return lj;
        }

        public String getUrl()
        {
            return vf;
        }

        public int getWidth()
        {
            return li;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasHeight()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return aon.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return aon.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.hR();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b oP()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            pn pn1 = CREATOR;
            pn.a(this, parcel, i);
        }

        static 
        {
            aom = new HashMap();
            aom.put("height", kr.a.i("height", 2));
            aom.put("url", kr.a.l("url", 3));
            aom.put("width", kr.a.i("width", 4));
        }

        public b()
        {
            CK = 1;
            aon = new HashSet();
        }

        b(Set set, int i, int j, String s, int k)
        {
            aon = set;
            CK = i;
            lj = j;
            vf = s;
            li = k;
        }
    }


    public static final pl CREATOR = new pl();
    private static final HashMap aom;
    final int CK;
    final Set aon;
    a apG;
    b apH;
    int apI;

    protected boolean a(nit> nit>)
    {
        return aon.contains(Integer.valueOf(nit>.hR()));
    }

    protected Object b(hR hr)
    {
        switch (hr.hR())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(hr.hR()).toString());

        case 2: // '\002'
            return apG;

        case 3: // '\003'
            return apH;

        case 4: // '\004'
            return Integer.valueOf(apI);
        }
    }

    public int describeContents()
    {
        pl pl1 = CREATOR;
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
                for (Iterator iterator = aom.values().iterator(); iterator.hasNext();)
                {
                    creator = (aom)iterator.next();
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

    public Object freeze()
    {
        return oN();
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverInfo getCoverInfo()
    {
        return apG;
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverPhoto getCoverPhoto()
    {
        return apH;
    }

    public int getLayout()
    {
        return apI;
    }

    public HashMap hK()
    {
        return aom;
    }

    public boolean hasCoverInfo()
    {
        return aon.contains(Integer.valueOf(2));
    }

    public boolean hasCoverPhoto()
    {
        return aon.contains(Integer.valueOf(3));
    }

    public boolean hasLayout()
    {
        return aon.contains(Integer.valueOf(4));
    }

    public int hashCode()
    {
        Iterator iterator = aom.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            aon aon1 = (aom)iterator.next();
            if (a(aon1))
            {
                int j = aon1.hR();
                i = b(aon1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public b oN()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pl pl1 = CREATOR;
        pl.a(this, parcel, i);
    }

    static 
    {
        aom = new HashMap();
        aom.put("coverInfo", a("coverInfo", 2, com/google/android/gms/internal/pi$b$a));
        aom.put("coverPhoto", a("coverPhoto", 3, com/google/android/gms/internal/pi$b$b));
        aom.put("layout", a("layout", 4, (new ko()).h("banner", 0), false));
    }

    public b()
    {
        CK = 1;
        aon = new HashSet();
    }

    b(Set set, int i, a a1, b b1, int j)
    {
        aon = set;
        CK = i;
        apG = a1;
        apH = b1;
        apI = j;
    }
}
