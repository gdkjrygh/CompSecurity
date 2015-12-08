// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ks, pj, ko, pk, 
//            pl, pm, pn, po, 
//            pp, pq, pr, ps

public final class pi extends ks
    implements Person
{
    public static final class a extends ks
        implements com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final pk CREATOR = new pk();
        private static final HashMap aom;
        final int CK;
        final Set aon;
        int apE;
        int apF;

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
                return Integer.valueOf(apE);

            case 3: // '\003'
                return Integer.valueOf(apF);
            }
        }

        public int describeContents()
        {
            pk pk1 = CREATOR;
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
            return oM();
        }

        public int getMax()
        {
            return apE;
        }

        public int getMin()
        {
            return apF;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasMax()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
        {
            return aon.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a oM()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pk pk1 = CREATOR;
            pk.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("max", kr.a.i("max", 2));
            aom.put("min", kr.a.i("min", 3));
        }

        public a()
        {
            CK = 1;
            aon = new HashSet();
        }

        a(Set set, int j, int k, int l)
        {
            aon = set;
            CK = j;
            apE = k;
            apF = l;
        }
    }

    public static final class b extends ks
        implements com.google.android.gms.plus.model.people.Person.Cover
    {

        public static final pl CREATOR = new pl();
        private static final HashMap aom;
        final int CK;
        final Set aon;
        a apG;
        b apH;
        int apI;

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
            return oN();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return apG;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b oN()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pl pl1 = CREATOR;
            pl.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("coverInfo", kr.a.a("coverInfo", 2, com/google/android/gms/internal/pi$b$a));
            aom.put("coverPhoto", kr.a.a("coverPhoto", 3, com/google/android/gms/internal/pi$b$b));
            aom.put("layout", kr.a.a("layout", 4, (new ko()).h("banner", 0), false));
        }

        public b()
        {
            CK = 1;
            aon = new HashSet();
        }

        b(Set set, int j, a a1, b b1, int k)
        {
            aon = set;
            CK = j;
            apG = a1;
            apH = b1;
            apI = k;
        }
    }

    public static final class b.a extends ks
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
                if (!(obj instanceof b.a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.a)obj;
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.a oO()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pm pm1 = CREATOR;
            pm.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("leftImageOffset", kr.a.i("leftImageOffset", 2));
            aom.put("topImageOffset", kr.a.i("topImageOffset", 3));
        }

        public b.a()
        {
            CK = 1;
            aon = new HashSet();
        }

        b.a(Set set, int j, int k, int l)
        {
            aon = set;
            CK = j;
            apJ = k;
            apK = l;
        }
    }

    public static final class b.b extends ks
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
                if (!(obj instanceof b.b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.b)obj;
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.b oP()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pn pn1 = CREATOR;
            pn.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("height", kr.a.i("height", 2));
            aom.put("url", kr.a.l("url", 3));
            aom.put("width", kr.a.i("width", 4));
        }

        public b.b()
        {
            CK = 1;
            aon = new HashSet();
        }

        b.b(Set set, int j, int k, String s, int l)
        {
            aon = set;
            CK = j;
            lj = k;
            vf = s;
            li = l;
        }
    }

    public static final class c extends ks
        implements com.google.android.gms.plus.model.people.Person.Image
    {

        public static final po CREATOR = new po();
        private static final HashMap aom;
        final int CK;
        final Set aon;
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
                return vf;
            }
        }

        public int describeContents()
        {
            po po1 = CREATOR;
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

        public Object freeze()
        {
            return oQ();
        }

        public String getUrl()
        {
            return vf;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasUrl()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public c oQ()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            po po1 = CREATOR;
            po.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("url", kr.a.l("url", 2));
        }

        public c()
        {
            CK = 1;
            aon = new HashSet();
        }

        public c(String s)
        {
            aon = new HashSet();
            CK = 1;
            vf = s;
            aon.add(Integer.valueOf(2));
        }

        c(Set set, int j, String s)
        {
            aon = set;
            CK = j;
            vf = s;
        }
    }

    public static final class d extends ks
        implements com.google.android.gms.plus.model.people.Person.Name
    {

        public static final pp CREATOR = new pp();
        private static final HashMap aom;
        final int CK;
        String aoL;
        String aoO;
        final Set aon;
        String apL;
        String apM;
        String apN;
        String apO;

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
                return aoL;

            case 3: // '\003'
                return apL;

            case 4: // '\004'
                return aoO;

            case 5: // '\005'
                return apM;

            case 6: // '\006'
                return apN;

            case 7: // '\007'
                return apO;
            }
        }

        public int describeContents()
        {
            pp pp1 = CREATOR;
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

        public Object freeze()
        {
            return oR();
        }

        public String getFamilyName()
        {
            return aoL;
        }

        public String getFormatted()
        {
            return apL;
        }

        public String getGivenName()
        {
            return aoO;
        }

        public String getHonorificPrefix()
        {
            return apM;
        }

        public String getHonorificSuffix()
        {
            return apN;
        }

        public String getMiddleName()
        {
            return apO;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasFamilyName()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return aon.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return aon.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return aon.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return aon.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return aon.contains(Integer.valueOf(7));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public d oR()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pp pp1 = CREATOR;
            pp.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("familyName", kr.a.l("familyName", 2));
            aom.put("formatted", kr.a.l("formatted", 3));
            aom.put("givenName", kr.a.l("givenName", 4));
            aom.put("honorificPrefix", kr.a.l("honorificPrefix", 5));
            aom.put("honorificSuffix", kr.a.l("honorificSuffix", 6));
            aom.put("middleName", kr.a.l("middleName", 7));
        }

        public d()
        {
            CK = 1;
            aon = new HashSet();
        }

        d(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            aon = set;
            CK = j;
            aoL = s;
            apL = s1;
            aoO = s2;
            apM = s3;
            apN = s4;
            apO = s5;
        }
    }

    public static class e
    {

        public static int ck(String s)
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

    public static final class f extends ks
        implements com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final pq CREATOR = new pq();
        private static final HashMap aom;
        final int CK;
        int Gt;
        String OH;
        String UO;
        String aoK;
        final Set aon;
        String apP;
        String apQ;
        boolean apR;
        String apa;
        String mName;

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
                return apP;

            case 3: // '\003'
                return UO;

            case 4: // '\004'
                return aoK;

            case 5: // '\005'
                return apQ;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(apR);

            case 8: // '\b'
                return apa;

            case 9: // '\t'
                return OH;

            case 10: // '\n'
                return Integer.valueOf(Gt);
            }
        }

        public int describeContents()
        {
            pq pq1 = CREATOR;
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

        public Object freeze()
        {
            return oS();
        }

        public String getDepartment()
        {
            return apP;
        }

        public String getDescription()
        {
            return UO;
        }

        public String getEndDate()
        {
            return aoK;
        }

        public String getLocation()
        {
            return apQ;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return apa;
        }

        public String getTitle()
        {
            return OH;
        }

        public int getType()
        {
            return Gt;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasDepartment()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return aon.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return aon.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return aon.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return aon.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return aon.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return aon.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return aon.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return aon.contains(Integer.valueOf(10));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
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
            return apR;
        }

        public f oS()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pq pq1 = CREATOR;
            pq.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("department", kr.a.l("department", 2));
            aom.put("description", kr.a.l("description", 3));
            aom.put("endDate", kr.a.l("endDate", 4));
            aom.put("location", kr.a.l("location", 5));
            aom.put("name", kr.a.l("name", 6));
            aom.put("primary", kr.a.k("primary", 7));
            aom.put("startDate", kr.a.l("startDate", 8));
            aom.put("title", kr.a.l("title", 9));
            aom.put("type", kr.a.a("type", 10, (new ko()).h("work", 0).h("school", 1), false));
        }

        public f()
        {
            CK = 1;
            aon = new HashSet();
        }

        f(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int k)
        {
            aon = set;
            CK = j;
            apP = s;
            UO = s1;
            aoK = s2;
            apQ = s3;
            mName = s4;
            apR = flag;
            apa = s5;
            OH = s6;
            Gt = k;
        }
    }

    public static final class g extends ks
        implements com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final pr CREATOR = new pr();
        private static final HashMap aom;
        final int CK;
        final Set aon;
        boolean apR;
        String mValue;

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
                return Boolean.valueOf(apR);

            case 3: // '\003'
                return mValue;
            }
        }

        public int describeContents()
        {
            pr pr1 = CREATOR;
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

        public Object freeze()
        {
            return oT();
        }

        public String getValue()
        {
            return mValue;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasPrimary()
        {
            return aon.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
        {
            return aon.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
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
            return apR;
        }

        public g oT()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            pr pr1 = CREATOR;
            pr.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("primary", kr.a.k("primary", 2));
            aom.put("value", kr.a.l("value", 3));
        }

        public g()
        {
            CK = 1;
            aon = new HashSet();
        }

        g(Set set, int j, boolean flag, String s)
        {
            aon = set;
            CK = j;
            apR = flag;
            mValue = s;
        }
    }

    public static final class h extends ks
        implements com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final ps CREATOR = new ps();
        private static final HashMap aom;
        final int CK;
        int Gt;
        String XL;
        final Set aon;
        private final int apS;
        String mValue;

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

            case 5: // '\005'
                return XL;

            case 6: // '\006'
                return Integer.valueOf(Gt);

            case 4: // '\004'
                return mValue;
            }
        }

        public int describeContents()
        {
            ps ps1 = CREATOR;
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

        public Object freeze()
        {
            return oV();
        }

        public String getLabel()
        {
            return XL;
        }

        public int getType()
        {
            return Gt;
        }

        public String getValue()
        {
            return mValue;
        }

        public HashMap hK()
        {
            return aom;
        }

        public boolean hasLabel()
        {
            return aon.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return aon.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
        {
            return aon.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = aom.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kr.a a1 = (kr.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hR();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public int oU()
        {
            return 4;
        }

        public h oV()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ps ps1 = CREATOR;
            ps.a(this, parcel, j);
        }

        static 
        {
            aom = new HashMap();
            aom.put("label", kr.a.l("label", 5));
            aom.put("type", kr.a.a("type", 6, (new ko()).h("home", 0).h("work", 1).h("blog", 2).h("profile", 3).h("other", 4).h("otherProfile", 5).h("contributor", 6).h("website", 7), false));
            aom.put("value", kr.a.l("value", 4));
        }

        public h()
        {
            apS = 4;
            CK = 1;
            aon = new HashSet();
        }

        h(Set set, int j, String s, int k, String s1, int l)
        {
            apS = 4;
            aon = set;
            CK = j;
            XL = s;
            Gt = k;
            mValue = s1;
        }
    }


    public static final pj CREATOR = new pj();
    private static final HashMap aom;
    String CE;
    final int CK;
    String FR;
    String OS;
    final Set aon;
    int apA;
    String apB;
    List apC;
    boolean apD;
    String apl;
    a apm;
    String apn;
    String apo;
    int app;
    b apq;
    String apr;
    c aps;
    boolean apt;
    d apu;
    String apv;
    int apw;
    List apx;
    List apy;
    int apz;
    int ow;
    String vf;

    public pi()
    {
        CK = 1;
        aon = new HashSet();
    }

    public pi(String s, String s1, c c1, int j, String s2)
    {
        CK = 1;
        aon = new HashSet();
        OS = s;
        aon.add(Integer.valueOf(9));
        CE = s1;
        aon.add(Integer.valueOf(14));
        aps = c1;
        aon.add(Integer.valueOf(15));
        apw = j;
        aon.add(Integer.valueOf(21));
        vf = s2;
        aon.add(Integer.valueOf(27));
    }

    pi(Set set, int j, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c1, boolean flag, 
            String s6, d d1, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        aon = set;
        CK = j;
        apl = s;
        apm = a1;
        apn = s1;
        apo = s2;
        app = k;
        apq = b1;
        apr = s3;
        OS = s4;
        ow = l;
        CE = s5;
        aps = c1;
        apt = flag;
        FR = s6;
        apu = d1;
        apv = s7;
        apw = i1;
        apx = list;
        apy = list1;
        apz = j1;
        apA = k1;
        apB = s8;
        vf = s9;
        apC = list2;
        apD = flag1;
    }

    public static pi i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.dz(parcel);
        parcel.recycle();
        return abyte0;
    }

    protected boolean a(kr.a a1)
    {
        return aon.contains(Integer.valueOf(a1.hR()));
    }

    protected Object b(kr.a a1)
    {
        switch (a1.hR())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hR()).toString());

        case 2: // '\002'
            return apl;

        case 3: // '\003'
            return apm;

        case 4: // '\004'
            return apn;

        case 5: // '\005'
            return apo;

        case 6: // '\006'
            return Integer.valueOf(app);

        case 7: // '\007'
            return apq;

        case 8: // '\b'
            return apr;

        case 9: // '\t'
            return OS;

        case 12: // '\f'
            return Integer.valueOf(ow);

        case 14: // '\016'
            return CE;

        case 15: // '\017'
            return aps;

        case 16: // '\020'
            return Boolean.valueOf(apt);

        case 18: // '\022'
            return FR;

        case 19: // '\023'
            return apu;

        case 20: // '\024'
            return apv;

        case 21: // '\025'
            return Integer.valueOf(apw);

        case 22: // '\026'
            return apx;

        case 23: // '\027'
            return apy;

        case 24: // '\030'
            return Integer.valueOf(apz);

        case 25: // '\031'
            return Integer.valueOf(apA);

        case 26: // '\032'
            return apB;

        case 27: // '\033'
            return vf;

        case 28: // '\034'
            return apC;

        case 29: // '\035'
            return Boolean.valueOf(apD);
        }
    }

    public int describeContents()
    {
        pj pj1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof pi))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (pi)obj;
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
                    if (((pi) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((pi) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((pi) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return oL();
    }

    public String getAboutMe()
    {
        return apl;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return apm;
    }

    public String getBirthday()
    {
        return apn;
    }

    public String getBraggingRights()
    {
        return apo;
    }

    public int getCircledByCount()
    {
        return app;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return apq;
    }

    public String getCurrentLocation()
    {
        return apr;
    }

    public String getDisplayName()
    {
        return OS;
    }

    public int getGender()
    {
        return ow;
    }

    public String getId()
    {
        return CE;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return aps;
    }

    public String getLanguage()
    {
        return FR;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return apu;
    }

    public String getNickname()
    {
        return apv;
    }

    public int getObjectType()
    {
        return apw;
    }

    public List getOrganizations()
    {
        return (ArrayList)apx;
    }

    public List getPlacesLived()
    {
        return (ArrayList)apy;
    }

    public int getPlusOneCount()
    {
        return apz;
    }

    public int getRelationshipStatus()
    {
        return apA;
    }

    public String getTagline()
    {
        return apB;
    }

    public String getUrl()
    {
        return vf;
    }

    public List getUrls()
    {
        return (ArrayList)apC;
    }

    public HashMap hK()
    {
        return aom;
    }

    public boolean hasAboutMe()
    {
        return aon.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return aon.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return aon.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return aon.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return aon.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return aon.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return aon.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return aon.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return aon.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return aon.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return aon.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return aon.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return aon.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return aon.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return aon.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return aon.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return aon.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return aon.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return aon.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return aon.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return aon.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return aon.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return aon.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return aon.contains(Integer.valueOf(29));
    }

    public int hashCode()
    {
        Iterator iterator = aom.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kr.a a1 = (kr.a)iterator.next();
            if (a(a1))
            {
                int k = a1.hR();
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
        return apt;
    }

    public boolean isVerified()
    {
        return apD;
    }

    public pi oL()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        pj pj1 = CREATOR;
        pj.a(this, parcel, j);
    }

    static 
    {
        aom = new HashMap();
        aom.put("aboutMe", kr.a.l("aboutMe", 2));
        aom.put("ageRange", kr.a.a("ageRange", 3, com/google/android/gms/internal/pi$a));
        aom.put("birthday", kr.a.l("birthday", 4));
        aom.put("braggingRights", kr.a.l("braggingRights", 5));
        aom.put("circledByCount", kr.a.i("circledByCount", 6));
        aom.put("cover", kr.a.a("cover", 7, com/google/android/gms/internal/pi$b));
        aom.put("currentLocation", kr.a.l("currentLocation", 8));
        aom.put("displayName", kr.a.l("displayName", 9));
        aom.put("gender", kr.a.a("gender", 12, (new ko()).h("male", 0).h("female", 1).h("other", 2), false));
        aom.put("id", kr.a.l("id", 14));
        aom.put("image", kr.a.a("image", 15, com/google/android/gms/internal/pi$c));
        aom.put("isPlusUser", kr.a.k("isPlusUser", 16));
        aom.put("language", kr.a.l("language", 18));
        aom.put("name", kr.a.a("name", 19, com/google/android/gms/internal/pi$d));
        aom.put("nickname", kr.a.l("nickname", 20));
        aom.put("objectType", kr.a.a("objectType", 21, (new ko()).h("person", 0).h("page", 1), false));
        aom.put("organizations", kr.a.b("organizations", 22, com/google/android/gms/internal/pi$f));
        aom.put("placesLived", kr.a.b("placesLived", 23, com/google/android/gms/internal/pi$g));
        aom.put("plusOneCount", kr.a.i("plusOneCount", 24));
        aom.put("relationshipStatus", kr.a.a("relationshipStatus", 25, (new ko()).h("single", 0).h("in_a_relationship", 1).h("engaged", 2).h("married", 3).h("its_complicated", 4).h("open_relationship", 5).h("widowed", 6).h("in_domestic_partnership", 7).h("in_civil_union", 8), false));
        aom.put("tagline", kr.a.l("tagline", 26));
        aom.put("url", kr.a.l("url", 27));
        aom.put("urls", kr.a.b("urls", 28, com/google/android/gms/internal/pi$h));
        aom.put("verified", kr.a.k("verified", 29));
    }
}
