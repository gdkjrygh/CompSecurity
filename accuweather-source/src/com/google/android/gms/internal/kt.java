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
//            hz, ku, hw, kv, 
//            kw, kx, ky, kz, 
//            la, lb, lc, ld

public final class kt extends hz
    implements SafeParcelable, Person
{
    public static final class a extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final kv CREATOR = new kv();
        private static final HashMap aco;
        private final Set acp;
        private int adG;
        private int adH;
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
                return Integer.valueOf(adG);

            case 3: // '\003'
                return Integer.valueOf(adH);
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
            return kI();
        }

        public int getMax()
        {
            return adG;
        }

        public int getMin()
        {
            return adH;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasMax()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
        {
            return acp.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a kI()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kv kv1 = CREATOR;
            kv.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("max", hz.a.g("max", 2));
            aco.put("min", hz.a.g("min", 3));
        }

        public a()
        {
            xJ = 1;
            acp = new HashSet();
        }

        a(Set set, int j, int k, int l)
        {
            acp = set;
            xJ = j;
            adG = k;
            adH = l;
        }
    }

    public static final class b extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover
    {

        public static final kw CREATOR = new kw();
        private static final HashMap aco;
        private final Set acp;
        private a adI;
        private b adJ;
        private int adK;
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
            return kL();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return adI;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
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

        public b kL()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kw kw1 = CREATOR;
            kw.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("coverInfo", hz.a.a("coverInfo", 2, com/google/android/gms/internal/kt$b$a));
            aco.put("coverPhoto", hz.a.a("coverPhoto", 3, com/google/android/gms/internal/kt$b$b));
            aco.put("layout", hz.a.a("layout", 4, (new hw()).f("banner", 0), false));
        }

        public b()
        {
            xJ = 1;
            acp = new HashSet();
        }

        b(Set set, int j, a a1, b b1, int k)
        {
            acp = set;
            xJ = j;
            adI = a1;
            adJ = b1;
            adK = k;
        }
    }

    public static final class b.a extends hz
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
                if (!(obj instanceof b.a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.a)obj;
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.a kM()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kx kx1 = CREATOR;
            kx.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("leftImageOffset", hz.a.g("leftImageOffset", 2));
            aco.put("topImageOffset", hz.a.g("topImageOffset", 3));
        }

        public b.a()
        {
            xJ = 1;
            acp = new HashSet();
        }

        b.a(Set set, int j, int k, int l)
        {
            acp = set;
            xJ = j;
            adL = k;
            adM = l;
        }
    }

    public static final class b.b extends hz
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
                if (!(obj instanceof b.b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.b)obj;
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.b kN()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ky ky1 = CREATOR;
            ky.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("height", hz.a.g("height", 2));
            aco.put("url", hz.a.j("url", 3));
            aco.put("width", hz.a.g("width", 4));
        }

        public b.b()
        {
            xJ = 1;
            acp = new HashSet();
        }

        b.b(Set set, int j, int k, String s, int l)
        {
            acp = set;
            xJ = j;
            kt = k;
            qV = s;
            ks = l;
        }
    }

    public static final class c extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Image
    {

        public static final kz CREATOR = new kz();
        private static final HashMap aco;
        private final Set acp;
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
                return qV;
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
                if (!(obj instanceof c))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (c)obj;
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kO();
        }

        public String getUrl()
        {
            return qV;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasUrl()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public c kO()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            kz kz1 = CREATOR;
            kz.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("url", hz.a.j("url", 2));
        }

        public c()
        {
            xJ = 1;
            acp = new HashSet();
        }

        public c(String s)
        {
            acp = new HashSet();
            xJ = 1;
            qV = s;
            acp.add(Integer.valueOf(2));
        }

        c(Set set, int j, String s)
        {
            acp = set;
            xJ = j;
            qV = s;
        }
    }

    public static final class d extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Name
    {

        public static final la CREATOR = new la();
        private static final HashMap aco;
        private String acN;
        private String acQ;
        private final Set acp;
        private String adN;
        private String adO;
        private String adP;
        private String adQ;
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
                return acN;

            case 3: // '\003'
                return adN;

            case 4: // '\004'
                return acQ;

            case 5: // '\005'
                return adO;

            case 6: // '\006'
                return adP;

            case 7: // '\007'
                return adQ;
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
                if (!(obj instanceof d))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (d)obj;
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kP();
        }

        public String getFamilyName()
        {
            return acN;
        }

        public String getFormatted()
        {
            return adN;
        }

        public String getGivenName()
        {
            return acQ;
        }

        public String getHonorificPrefix()
        {
            return adO;
        }

        public String getHonorificSuffix()
        {
            return adP;
        }

        public String getMiddleName()
        {
            return adQ;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasFamilyName()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return acp.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return acp.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return acp.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return acp.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return acp.contains(Integer.valueOf(7));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public d kP()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            la la1 = CREATOR;
            la.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("familyName", hz.a.j("familyName", 2));
            aco.put("formatted", hz.a.j("formatted", 3));
            aco.put("givenName", hz.a.j("givenName", 4));
            aco.put("honorificPrefix", hz.a.j("honorificPrefix", 5));
            aco.put("honorificSuffix", hz.a.j("honorificSuffix", 6));
            aco.put("middleName", hz.a.j("middleName", 7));
        }

        public d()
        {
            xJ = 1;
            acp = new HashSet();
        }

        d(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            acp = set;
            xJ = j;
            acN = s;
            adN = s1;
            acQ = s2;
            adO = s3;
            adP = s4;
            adQ = s5;
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

    public static final class f extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final lb CREATOR = new lb();
        private static final HashMap aco;
        private int AQ;
        private String HV;
        private String Mm;
        private String acM;
        private final Set acp;
        private String adR;
        private String adS;
        private boolean adT;
        private String adc;
        private String mName;
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
                return adR;

            case 3: // '\003'
                return Mm;

            case 4: // '\004'
                return acM;

            case 5: // '\005'
                return adS;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(adT);

            case 8: // '\b'
                return adc;

            case 9: // '\t'
                return HV;

            case 10: // '\n'
                return Integer.valueOf(AQ);
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
                if (!(obj instanceof f))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (f)obj;
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kQ();
        }

        public String getDepartment()
        {
            return adR;
        }

        public String getDescription()
        {
            return Mm;
        }

        public String getEndDate()
        {
            return acM;
        }

        public String getLocation()
        {
            return adS;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return adc;
        }

        public String getTitle()
        {
            return HV;
        }

        public int getType()
        {
            return AQ;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasDepartment()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return acp.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return acp.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return acp.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return acp.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return acp.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return acp.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return acp.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return acp.contains(Integer.valueOf(10));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
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
            return adT;
        }

        public f kQ()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            lb lb1 = CREATOR;
            lb.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("department", hz.a.j("department", 2));
            aco.put("description", hz.a.j("description", 3));
            aco.put("endDate", hz.a.j("endDate", 4));
            aco.put("location", hz.a.j("location", 5));
            aco.put("name", hz.a.j("name", 6));
            aco.put("primary", hz.a.i("primary", 7));
            aco.put("startDate", hz.a.j("startDate", 8));
            aco.put("title", hz.a.j("title", 9));
            aco.put("type", hz.a.a("type", 10, (new hw()).f("work", 0).f("school", 1), false));
        }

        public f()
        {
            xJ = 1;
            acp = new HashSet();
        }

        f(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int k)
        {
            acp = set;
            xJ = j;
            adR = s;
            Mm = s1;
            acM = s2;
            adS = s3;
            mName = s4;
            adT = flag;
            adc = s5;
            HV = s6;
            AQ = k;
        }
    }

    public static final class g extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final lc CREATOR = new lc();
        private static final HashMap aco;
        private final Set acp;
        private boolean adT;
        private String mValue;
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
                return Boolean.valueOf(adT);

            case 3: // '\003'
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
                if (!(obj instanceof g))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (g)obj;
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kR();
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasPrimary()
        {
            return acp.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
        {
            return acp.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
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
            return adT;
        }

        public g kR()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            lc lc1 = CREATOR;
            lc.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("primary", hz.a.i("primary", 2));
            aco.put("value", hz.a.j("value", 3));
        }

        public g()
        {
            xJ = 1;
            acp = new HashSet();
        }

        g(Set set, int j, boolean flag, String s)
        {
            acp = set;
            xJ = j;
            adT = flag;
            mValue = s;
        }
    }

    public static final class h extends hz
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final ld CREATOR = new ld();
        private static final HashMap aco;
        private int AQ;
        private final Set acp;
        private String adU;
        private final int adV;
        private String mValue;
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

            case 5: // '\005'
                return adU;

            case 6: // '\006'
                return Integer.valueOf(AQ);

            case 4: // '\004'
                return mValue;
            }
        }

        public int describeContents()
        {
            ld ld1 = CREATOR;
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

        public HashMap fB()
        {
            return aco;
        }

        public Object freeze()
        {
            return kT();
        }

        public String getLabel()
        {
            return adU;
        }

        public int getType()
        {
            return AQ;
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return xJ;
        }

        public boolean hasLabel()
        {
            return acp.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return acp.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
        {
            return acp.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = aco.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hz.a a1 = (hz.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.fI();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public int kS()
        {
            return 4;
        }

        public h kT()
        {
            return this;
        }

        Set kf()
        {
            return acp;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ld ld1 = CREATOR;
            ld.a(this, parcel, j);
        }

        static 
        {
            aco = new HashMap();
            aco.put("label", hz.a.j("label", 5));
            aco.put("type", hz.a.a("type", 6, (new hw()).f("home", 0).f("work", 1).f("blog", 2).f("profile", 3).f("other", 4).f("otherProfile", 5).f("contributor", 6).f("website", 7), false));
            aco.put("value", hz.a.j("value", 4));
        }

        public h()
        {
            adV = 4;
            xJ = 2;
            acp = new HashSet();
        }

        h(Set set, int j, String s, int k, String s1, int l)
        {
            adV = 4;
            acp = set;
            xJ = j;
            adU = s;
            AQ = k;
            mValue = s1;
        }
    }


    public static final ku CREATOR = new ku();
    private static final HashMap aco;
    private String Ao;
    private String Lk;
    private final Set acp;
    private List adA;
    private int adB;
    private int adC;
    private String adD;
    private List adE;
    private boolean adF;
    private String adn;
    private a ado;
    private String adp;
    private String adq;
    private int adr;
    private b ads;
    private String adt;
    private c adu;
    private boolean adv;
    private d adw;
    private String adx;
    private int ady;
    private List adz;
    private int mj;
    private String qV;
    private String xD;
    private final int xJ;

    public kt()
    {
        xJ = 2;
        acp = new HashSet();
    }

    public kt(String s, String s1, c c1, int j, String s2)
    {
        xJ = 2;
        acp = new HashSet();
        Lk = s;
        acp.add(Integer.valueOf(9));
        xD = s1;
        acp.add(Integer.valueOf(14));
        adu = c1;
        acp.add(Integer.valueOf(15));
        ady = j;
        acp.add(Integer.valueOf(21));
        qV = s2;
        acp.add(Integer.valueOf(27));
    }

    kt(Set set, int j, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c1, boolean flag, 
            String s6, d d1, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        acp = set;
        xJ = j;
        adn = s;
        ado = a1;
        adp = s1;
        adq = s2;
        adr = k;
        ads = b1;
        adt = s3;
        Lk = s4;
        mj = l;
        xD = s5;
        adu = c1;
        adv = flag;
        Ao = s6;
        adw = d1;
        adx = s7;
        ady = i1;
        adz = list;
        adA = list1;
        adB = j1;
        adC = k1;
        adD = s8;
        qV = s9;
        adE = list2;
        adF = flag1;
    }

    public static kt i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.bG(parcel);
        parcel.recycle();
        return abyte0;
    }

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
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fI()).toString());

        case 2: // '\002'
            return adn;

        case 3: // '\003'
            return ado;

        case 4: // '\004'
            return adp;

        case 5: // '\005'
            return adq;

        case 6: // '\006'
            return Integer.valueOf(adr);

        case 7: // '\007'
            return ads;

        case 8: // '\b'
            return adt;

        case 9: // '\t'
            return Lk;

        case 12: // '\f'
            return Integer.valueOf(mj);

        case 14: // '\016'
            return xD;

        case 15: // '\017'
            return adu;

        case 16: // '\020'
            return Boolean.valueOf(adv);

        case 18: // '\022'
            return Ao;

        case 19: // '\023'
            return adw;

        case 20: // '\024'
            return adx;

        case 21: // '\025'
            return Integer.valueOf(ady);

        case 22: // '\026'
            return adz;

        case 23: // '\027'
            return adA;

        case 24: // '\030'
            return Integer.valueOf(adB);

        case 25: // '\031'
            return Integer.valueOf(adC);

        case 26: // '\032'
            return adD;

        case 27: // '\033'
            return qV;

        case 28: // '\034'
            return adE;

        case 29: // '\035'
            return Boolean.valueOf(adF);
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
            if (!(obj instanceof kt))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kt)obj;
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
                    if (((kt) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kt) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kt) (obj)).a(a1));
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
        return kH();
    }

    public String getAboutMe()
    {
        return adn;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return ado;
    }

    public String getBirthday()
    {
        return adp;
    }

    public String getBraggingRights()
    {
        return adq;
    }

    public int getCircledByCount()
    {
        return adr;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return ads;
    }

    public String getCurrentLocation()
    {
        return adt;
    }

    public String getDisplayName()
    {
        return Lk;
    }

    public int getGender()
    {
        return mj;
    }

    public String getId()
    {
        return xD;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return adu;
    }

    public String getLanguage()
    {
        return Ao;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return adw;
    }

    public String getNickname()
    {
        return adx;
    }

    public int getObjectType()
    {
        return ady;
    }

    public List getOrganizations()
    {
        return (ArrayList)adz;
    }

    public List getPlacesLived()
    {
        return (ArrayList)adA;
    }

    public int getPlusOneCount()
    {
        return adB;
    }

    public int getRelationshipStatus()
    {
        return adC;
    }

    public String getTagline()
    {
        return adD;
    }

    public String getUrl()
    {
        return qV;
    }

    public List getUrls()
    {
        return (ArrayList)adE;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public boolean hasAboutMe()
    {
        return acp.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return acp.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return acp.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return acp.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return acp.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return acp.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return acp.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return acp.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return acp.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return acp.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return acp.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return acp.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return acp.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return acp.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return acp.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return acp.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return acp.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return acp.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return acp.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return acp.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return acp.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return acp.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return acp.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return acp.contains(Integer.valueOf(29));
    }

    public int hashCode()
    {
        Iterator iterator = aco.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hz.a a1 = (hz.a)iterator.next();
            if (a(a1))
            {
                int k = a1.fI();
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
        return adv;
    }

    public boolean isVerified()
    {
        return adF;
    }

    a kA()
    {
        return ado;
    }

    b kB()
    {
        return ads;
    }

    c kC()
    {
        return adu;
    }

    d kD()
    {
        return adw;
    }

    List kE()
    {
        return adz;
    }

    List kF()
    {
        return adA;
    }

    List kG()
    {
        return adE;
    }

    public kt kH()
    {
        return this;
    }

    Set kf()
    {
        return acp;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ku ku1 = CREATOR;
        ku.a(this, parcel, j);
    }

    static 
    {
        aco = new HashMap();
        aco.put("aboutMe", hz.a.j("aboutMe", 2));
        aco.put("ageRange", hz.a.a("ageRange", 3, com/google/android/gms/internal/kt$a));
        aco.put("birthday", hz.a.j("birthday", 4));
        aco.put("braggingRights", hz.a.j("braggingRights", 5));
        aco.put("circledByCount", hz.a.g("circledByCount", 6));
        aco.put("cover", hz.a.a("cover", 7, com/google/android/gms/internal/kt$b));
        aco.put("currentLocation", hz.a.j("currentLocation", 8));
        aco.put("displayName", hz.a.j("displayName", 9));
        aco.put("gender", hz.a.a("gender", 12, (new hw()).f("male", 0).f("female", 1).f("other", 2), false));
        aco.put("id", hz.a.j("id", 14));
        aco.put("image", hz.a.a("image", 15, com/google/android/gms/internal/kt$c));
        aco.put("isPlusUser", hz.a.i("isPlusUser", 16));
        aco.put("language", hz.a.j("language", 18));
        aco.put("name", hz.a.a("name", 19, com/google/android/gms/internal/kt$d));
        aco.put("nickname", hz.a.j("nickname", 20));
        aco.put("objectType", hz.a.a("objectType", 21, (new hw()).f("person", 0).f("page", 1), false));
        aco.put("organizations", hz.a.b("organizations", 22, com/google/android/gms/internal/kt$f));
        aco.put("placesLived", hz.a.b("placesLived", 23, com/google/android/gms/internal/kt$g));
        aco.put("plusOneCount", hz.a.g("plusOneCount", 24));
        aco.put("relationshipStatus", hz.a.a("relationshipStatus", 25, (new hw()).f("single", 0).f("in_a_relationship", 1).f("engaged", 2).f("married", 3).f("its_complicated", 4).f("open_relationship", 5).f("widowed", 6).f("in_domestic_partnership", 7).f("in_civil_union", 8), false));
        aco.put("tagline", hz.a.j("tagline", 26));
        aco.put("url", hz.a.j("url", 27));
        aco.put("urls", hz.a.b("urls", 28, com/google/android/gms/internal/kt$h));
        aco.put("verified", hz.a.i("verified", 29));
    }
}
