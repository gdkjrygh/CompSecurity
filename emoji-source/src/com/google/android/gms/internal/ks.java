// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hy, kt, hv, ku, 
//            kv, kw, kx, ky, 
//            kz, la, lb, lc

public final class ks extends hy
    implements SafeParcelable, Person
{
    public static final class a extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final ku CREATOR = new ku();
        private static final HashMap acr;
        private final Set acs;
        private int adJ;
        private int adK;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return Integer.valueOf(adJ);

            case 3: // '\003'
                return Integer.valueOf(adK);
            }
        }

        public int describeContents()
        {
            ku ku1 = CREATOR;
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
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
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

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kN();
        }

        public int getMax()
        {
            return adJ;
        }

        public int getMin()
        {
            return adK;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasMax()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a kN()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ku ku1 = CREATOR;
            ku.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("max", hy.a.g("max", 2));
            acr.put("min", hy.a.g("min", 3));
        }

        public a()
        {
            xM = 1;
            acs = new HashSet();
        }

        a(Set set, int j, int k, int l)
        {
            acs = set;
            xM = j;
            adJ = k;
            adK = l;
        }
    }

    public static final class b extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover
    {

        public static final kv CREATOR = new kv();
        private static final HashMap acr;
        private final Set acs;
        private a adL;
        private b adM;
        private int adN;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return adL;

            case 3: // '\003'
                return adM;

            case 4: // '\004'
                return Integer.valueOf(adN);
            }
        }

        public int describeContents()
        {
            kv kv1 = CREATOR;
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
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
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

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kQ();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return adL;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
        {
            return adM;
        }

        public int getLayout()
        {
            return adN;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasCoverInfo()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasCoverPhoto()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public boolean hasLayout()
        {
            return acs.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        a kO()
        {
            return adL;
        }

        b kP()
        {
            return adM;
        }

        public b kQ()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kv kv1 = CREATOR;
            kv.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("coverInfo", hy.a.a("coverInfo", 2, com/google/android/gms/internal/ks$b$a));
            acr.put("coverPhoto", hy.a.a("coverPhoto", 3, com/google/android/gms/internal/ks$b$b));
            acr.put("layout", hy.a.a("layout", 4, (new hv()).f("banner", 0), false));
        }

        public b()
        {
            xM = 1;
            acs = new HashSet();
        }

        b(Set set, int j, a a1, b b1, int k)
        {
            acs = set;
            xM = j;
            adL = a1;
            adM = b1;
            adN = k;
        }
    }

    public static final class b.a extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final kw CREATOR = new kw();
        private static final HashMap acr;
        private final Set acs;
        private int adO;
        private int adP;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return Integer.valueOf(adO);

            case 3: // '\003'
                return Integer.valueOf(adP);
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
                if (!(obj instanceof b.a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.a)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((b.a) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((b.a) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((b.a) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kR();
        }

        public int getLeftImageOffset()
        {
            return adO;
        }

        public int getTopImageOffset()
        {
            return adP;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasLeftImageOffset()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.a kR()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kw kw1 = CREATOR;
            kw.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("leftImageOffset", hy.a.g("leftImageOffset", 2));
            acr.put("topImageOffset", hy.a.g("topImageOffset", 3));
        }

        public b.a()
        {
            xM = 1;
            acs = new HashSet();
        }

        b.a(Set set, int j, int k, int l)
        {
            acs = set;
            xM = j;
            adO = k;
            adP = l;
        }
    }

    public static final class b.b extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final kx CREATOR = new kx();
        private static final HashMap acr;
        private final Set acs;
        private int ku;
        private int kv;
        private String qY;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return Integer.valueOf(kv);

            case 3: // '\003'
                return qY;

            case 4: // '\004'
                return Integer.valueOf(ku);
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
                if (!(obj instanceof b.b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.b)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((b.b) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((b.b) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((b.b) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kS();
        }

        public int getHeight()
        {
            return kv;
        }

        public String getUrl()
        {
            return qY;
        }

        int getVersionCode()
        {
            return xM;
        }

        public int getWidth()
        {
            return ku;
        }

        public boolean hasHeight()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return acs.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.b kS()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kx kx1 = CREATOR;
            kx.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("height", hy.a.g("height", 2));
            acr.put("url", hy.a.j("url", 3));
            acr.put("width", hy.a.g("width", 4));
        }

        public b.b()
        {
            xM = 1;
            acs = new HashSet();
        }

        b.b(Set set, int j, int k, String s, int l)
        {
            acs = set;
            xM = j;
            kv = k;
            qY = s;
            ku = l;
        }
    }

    public static final class c extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Image
    {

        public static final ky CREATOR = new ky();
        private static final HashMap acr;
        private final Set acs;
        private String qY;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return qY;
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
                if (!(obj instanceof c))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (c)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((c) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((c) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((c) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kT();
        }

        public String getUrl()
        {
            return qY;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasUrl()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public c kT()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ky ky1 = CREATOR;
            ky.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("url", hy.a.j("url", 2));
        }

        public c()
        {
            xM = 1;
            acs = new HashSet();
        }

        public c(String s)
        {
            acs = new HashSet();
            xM = 1;
            qY = s;
            acs.add(Integer.valueOf(2));
        }

        c(Set set, int j, String s)
        {
            acs = set;
            xM = j;
            qY = s;
        }
    }

    public static final class d extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Name
    {

        public static final kz CREATOR = new kz();
        private static final HashMap acr;
        private String acQ;
        private String acT;
        private final Set acs;
        private String adQ;
        private String adR;
        private String adS;
        private String adT;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return acQ;

            case 3: // '\003'
                return adQ;

            case 4: // '\004'
                return acT;

            case 5: // '\005'
                return adR;

            case 6: // '\006'
                return adS;

            case 7: // '\007'
                return adT;
            }
        }

        public int describeContents()
        {
            kz kz1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof d))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (d)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((d) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((d) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((d) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kU();
        }

        public String getFamilyName()
        {
            return acQ;
        }

        public String getFormatted()
        {
            return adQ;
        }

        public String getGivenName()
        {
            return acT;
        }

        public String getHonorificPrefix()
        {
            return adR;
        }

        public String getHonorificSuffix()
        {
            return adS;
        }

        public String getMiddleName()
        {
            return adT;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasFamilyName()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return acs.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return acs.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return acs.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return acs.contains(Integer.valueOf(7));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public d kU()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kz kz1 = CREATOR;
            kz.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("familyName", hy.a.j("familyName", 2));
            acr.put("formatted", hy.a.j("formatted", 3));
            acr.put("givenName", hy.a.j("givenName", 4));
            acr.put("honorificPrefix", hy.a.j("honorificPrefix", 5));
            acr.put("honorificSuffix", hy.a.j("honorificSuffix", 6));
            acr.put("middleName", hy.a.j("middleName", 7));
        }

        public d()
        {
            xM = 1;
            acs = new HashSet();
        }

        d(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            acs = set;
            xM = j;
            acQ = s;
            adQ = s1;
            acT = s2;
            adR = s3;
            adS = s4;
            adT = s5;
        }
    }

    public static class e
    {

        public static int bA(String s)
        {
            if (s.equals("person"))
            {
                return 0;
            }
            if (s.equals("page"))
            {
                return 1;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown objectType string: ").append(s).toString());
            }
        }
    }

    public static final class f extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final la CREATOR = new la();
        private static final HashMap acr;
        private int AT;
        private String HY;
        private String Mp;
        private String acP;
        private final Set acs;
        private String adU;
        private String adV;
        private boolean adW;
        private String adf;
        private String mName;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return adU;

            case 3: // '\003'
                return Mp;

            case 4: // '\004'
                return acP;

            case 5: // '\005'
                return adV;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(adW);

            case 8: // '\b'
                return adf;

            case 9: // '\t'
                return HY;

            case 10: // '\n'
                return Integer.valueOf(AT);
            }
        }

        public int describeContents()
        {
            la la1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof f))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (f)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((f) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((f) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((f) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kV();
        }

        public String getDepartment()
        {
            return adU;
        }

        public String getDescription()
        {
            return Mp;
        }

        public String getEndDate()
        {
            return acP;
        }

        public String getLocation()
        {
            return adV;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return adf;
        }

        public String getTitle()
        {
            return HY;
        }

        public int getType()
        {
            return AT;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasDepartment()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return acs.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return acs.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return acs.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return acs.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return acs.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return acs.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return acs.contains(Integer.valueOf(10));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return adW;
        }

        public f kV()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            la la1 = CREATOR;
            la.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("department", hy.a.j("department", 2));
            acr.put("description", hy.a.j("description", 3));
            acr.put("endDate", hy.a.j("endDate", 4));
            acr.put("location", hy.a.j("location", 5));
            acr.put("name", hy.a.j("name", 6));
            acr.put("primary", hy.a.i("primary", 7));
            acr.put("startDate", hy.a.j("startDate", 8));
            acr.put("title", hy.a.j("title", 9));
            acr.put("type", hy.a.a("type", 10, (new hv()).f("work", 0).f("school", 1), false));
        }

        public f()
        {
            xM = 1;
            acs = new HashSet();
        }

        f(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int k)
        {
            acs = set;
            xM = j;
            adU = s;
            Mp = s1;
            acP = s2;
            adV = s3;
            mName = s4;
            adW = flag;
            adf = s5;
            HY = s6;
            AT = k;
        }
    }

    public static final class g extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final lb CREATOR = new lb();
        private static final HashMap acr;
        private final Set acs;
        private boolean adW;
        private String mValue;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 2: // '\002'
                return Boolean.valueOf(adW);

            case 3: // '\003'
                return mValue;
            }
        }

        public int describeContents()
        {
            lb lb1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof g))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (g)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((g) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((g) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((g) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kW();
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasPrimary()
        {
            return acs.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
        {
            return acs.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return adW;
        }

        public g kW()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            lb lb1 = CREATOR;
            lb.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("primary", hy.a.i("primary", 2));
            acr.put("value", hy.a.j("value", 3));
        }

        public g()
        {
            xM = 1;
            acs = new HashSet();
        }

        g(Set set, int j, boolean flag, String s)
        {
            acs = set;
            xM = j;
            adW = flag;
            mValue = s;
        }
    }

    public static final class h extends hy
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final lc CREATOR = new lc();
        private static final HashMap acr;
        private int AT;
        private final Set acs;
        private String adX;
        private final int adY;
        private String mValue;
        private final int xM;

        protected boolean a(hy.a a1)
        {
            return acs.contains(Integer.valueOf(a1.fN()));
        }

        protected Object aF(String s)
        {
            return null;
        }

        protected boolean aG(String s)
        {
            return false;
        }

        protected Object b(hy.a a1)
        {
            switch (a1.fN())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

            case 5: // '\005'
                return adX;

            case 6: // '\006'
                return Integer.valueOf(AT);

            case 4: // '\004'
                return mValue;
            }
        }

        public int describeContents()
        {
            lc lc1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof h))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (h)obj;
                hy.a a1;
label1:
                do
                {
                    for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (hy.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((h) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((h) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((h) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public HashMap fG()
        {
            return acr;
        }

        public Object freeze()
        {
            return kY();
        }

        public String getLabel()
        {
            return adX;
        }

        public int getType()
        {
            return AT;
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return xM;
        }

        public boolean hasLabel()
        {
            return acs.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return acs.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
        {
            return acs.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = acr.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hy.a a1 = (hy.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fN();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public int kX()
        {
            return 4;
        }

        public h kY()
        {
            return this;
        }

        Set kk()
        {
            return acs;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            lc lc1 = CREATOR;
            lc.a(this, parcel, j);
        }

        static 
        {
            acr = new HashMap();
            acr.put("label", hy.a.j("label", 5));
            acr.put("type", hy.a.a("type", 6, (new hv()).f("home", 0).f("work", 1).f("blog", 2).f("profile", 3).f("other", 4).f("otherProfile", 5).f("contributor", 6).f("website", 7), false));
            acr.put("value", hy.a.j("value", 4));
        }

        public h()
        {
            adY = 4;
            xM = 2;
            acs = new HashSet();
        }

        h(Set set, int j, String s, int k, String s1, int l)
        {
            adY = 4;
            acs = set;
            xM = j;
            adX = s;
            AT = k;
            mValue = s1;
        }
    }


    public static final kt CREATOR = new kt();
    private static final HashMap acr;
    private String Ar;
    private String Ln;
    private final Set acs;
    private String adA;
    private int adB;
    private List adC;
    private List adD;
    private int adE;
    private int adF;
    private String adG;
    private List adH;
    private boolean adI;
    private String adq;
    private a adr;
    private String ads;
    private String adt;
    private int adu;
    private b adv;
    private String adw;
    private c adx;
    private boolean ady;
    private d adz;
    private int ml;
    private String qY;
    private String xG;
    private final int xM;

    public ks()
    {
        xM = 2;
        acs = new HashSet();
    }

    public ks(String s, String s1, c c1, int j, String s2)
    {
        xM = 2;
        acs = new HashSet();
        Ln = s;
        acs.add(Integer.valueOf(9));
        xG = s1;
        acs.add(Integer.valueOf(14));
        adx = c1;
        acs.add(Integer.valueOf(15));
        adB = j;
        acs.add(Integer.valueOf(21));
        qY = s2;
        acs.add(Integer.valueOf(27));
    }

    ks(Set set, int j, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c1, boolean flag, 
            String s6, d d1, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        acs = set;
        xM = j;
        adq = s;
        adr = a1;
        ads = s1;
        adt = s2;
        adu = k;
        adv = b1;
        adw = s3;
        Ln = s4;
        ml = l;
        xG = s5;
        adx = c1;
        ady = flag;
        Ar = s6;
        adz = d1;
        adA = s7;
        adB = i1;
        adC = list;
        adD = list1;
        adE = j1;
        adF = k1;
        adG = s8;
        qY = s9;
        adH = list2;
        adI = flag1;
    }

    public static ks i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.bG(parcel);
        parcel.recycle();
        return abyte0;
    }

    protected boolean a(hy.a a1)
    {
        return acs.contains(Integer.valueOf(a1.fN()));
    }

    protected Object aF(String s)
    {
        return null;
    }

    protected boolean aG(String s)
    {
        return false;
    }

    protected Object b(hy.a a1)
    {
        switch (a1.fN())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

        case 2: // '\002'
            return adq;

        case 3: // '\003'
            return adr;

        case 4: // '\004'
            return ads;

        case 5: // '\005'
            return adt;

        case 6: // '\006'
            return Integer.valueOf(adu);

        case 7: // '\007'
            return adv;

        case 8: // '\b'
            return adw;

        case 9: // '\t'
            return Ln;

        case 12: // '\f'
            return Integer.valueOf(ml);

        case 14: // '\016'
            return xG;

        case 15: // '\017'
            return adx;

        case 16: // '\020'
            return Boolean.valueOf(ady);

        case 18: // '\022'
            return Ar;

        case 19: // '\023'
            return adz;

        case 20: // '\024'
            return adA;

        case 21: // '\025'
            return Integer.valueOf(adB);

        case 22: // '\026'
            return adC;

        case 23: // '\027'
            return adD;

        case 24: // '\030'
            return Integer.valueOf(adE);

        case 25: // '\031'
            return Integer.valueOf(adF);

        case 26: // '\032'
            return adG;

        case 27: // '\033'
            return qY;

        case 28: // '\034'
            return adH;

        case 29: // '\035'
            return Boolean.valueOf(adI);
        }
    }

    public int describeContents()
    {
        kt kt1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof ks))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ks)obj;
            hy.a a1;
label1:
            do
            {
                for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                {
                    a1 = (hy.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((ks) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((ks) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ks) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public HashMap fG()
    {
        return acr;
    }

    public Object freeze()
    {
        return kM();
    }

    public String getAboutMe()
    {
        return adq;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return adr;
    }

    public String getBirthday()
    {
        return ads;
    }

    public String getBraggingRights()
    {
        return adt;
    }

    public int getCircledByCount()
    {
        return adu;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return adv;
    }

    public String getCurrentLocation()
    {
        return adw;
    }

    public String getDisplayName()
    {
        return Ln;
    }

    public int getGender()
    {
        return ml;
    }

    public String getId()
    {
        return xG;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return adx;
    }

    public String getLanguage()
    {
        return Ar;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return adz;
    }

    public String getNickname()
    {
        return adA;
    }

    public int getObjectType()
    {
        return adB;
    }

    public List getOrganizations()
    {
        return (ArrayList)adC;
    }

    public List getPlacesLived()
    {
        return (ArrayList)adD;
    }

    public int getPlusOneCount()
    {
        return adE;
    }

    public int getRelationshipStatus()
    {
        return adF;
    }

    public String getTagline()
    {
        return adG;
    }

    public String getUrl()
    {
        return qY;
    }

    public List getUrls()
    {
        return (ArrayList)adH;
    }

    int getVersionCode()
    {
        return xM;
    }

    public boolean hasAboutMe()
    {
        return acs.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return acs.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return acs.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return acs.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return acs.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return acs.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return acs.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return acs.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return acs.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return acs.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return acs.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return acs.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return acs.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return acs.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return acs.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return acs.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return acs.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return acs.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return acs.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return acs.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return acs.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return acs.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return acs.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return acs.contains(Integer.valueOf(29));
    }

    public int hashCode()
    {
        Iterator iterator = acr.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hy.a a1 = (hy.a)iterator.next();
            if (a(a1))
            {
                int k = a1.fN();
                j = b(a1).hashCode() + (j + k);
            }
        } while (true);
        return j;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isPlusUser()
    {
        return ady;
    }

    public boolean isVerified()
    {
        return adI;
    }

    a kF()
    {
        return adr;
    }

    b kG()
    {
        return adv;
    }

    c kH()
    {
        return adx;
    }

    d kI()
    {
        return adz;
    }

    List kJ()
    {
        return adC;
    }

    List kK()
    {
        return adD;
    }

    List kL()
    {
        return adH;
    }

    public ks kM()
    {
        return this;
    }

    Set kk()
    {
        return acs;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        kt kt1 = CREATOR;
        kt.a(this, parcel, j);
    }

    static 
    {
        acr = new HashMap();
        acr.put("aboutMe", hy.a.j("aboutMe", 2));
        acr.put("ageRange", hy.a.a("ageRange", 3, com/google/android/gms/internal/ks$a));
        acr.put("birthday", hy.a.j("birthday", 4));
        acr.put("braggingRights", hy.a.j("braggingRights", 5));
        acr.put("circledByCount", hy.a.g("circledByCount", 6));
        acr.put("cover", hy.a.a("cover", 7, com/google/android/gms/internal/ks$b));
        acr.put("currentLocation", hy.a.j("currentLocation", 8));
        acr.put("displayName", hy.a.j("displayName", 9));
        acr.put("gender", hy.a.a("gender", 12, (new hv()).f("male", 0).f("female", 1).f("other", 2), false));
        acr.put("id", hy.a.j("id", 14));
        acr.put("image", hy.a.a("image", 15, com/google/android/gms/internal/ks$c));
        acr.put("isPlusUser", hy.a.i("isPlusUser", 16));
        acr.put("language", hy.a.j("language", 18));
        acr.put("name", hy.a.a("name", 19, com/google/android/gms/internal/ks$d));
        acr.put("nickname", hy.a.j("nickname", 20));
        acr.put("objectType", hy.a.a("objectType", 21, (new hv()).f("person", 0).f("page", 1), false));
        acr.put("organizations", hy.a.b("organizations", 22, com/google/android/gms/internal/ks$f));
        acr.put("placesLived", hy.a.b("placesLived", 23, com/google/android/gms/internal/ks$g));
        acr.put("plusOneCount", hy.a.g("plusOneCount", 24));
        acr.put("relationshipStatus", hy.a.a("relationshipStatus", 25, (new hv()).f("single", 0).f("in_a_relationship", 1).f("engaged", 2).f("married", 3).f("its_complicated", 4).f("open_relationship", 5).f("widowed", 6).f("in_domestic_partnership", 7).f("in_civil_union", 8), false));
        acr.put("tagline", hy.a.j("tagline", 26));
        acr.put("url", hy.a.j("url", 27));
        acr.put("urls", hy.a.b("urls", 28, com/google/android/gms/internal/ks$h));
        acr.put("verified", hy.a.i("verified", 29));
    }
}
