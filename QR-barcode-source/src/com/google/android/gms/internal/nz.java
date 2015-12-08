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
//            jj, oa, jf, ob, 
//            oc, od, oe, of, 
//            og, oh, oi, oj

public final class nz extends jj
    implements Person
{
    public static final class a extends jj
        implements com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final ob CREATOR = new ob();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        int ant;
        int anu;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return Integer.valueOf(ant);

            case 3: // '\003'
                return Integer.valueOf(anu);
            }
        }

        public int describeContents()
        {
            ob ob1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nv();
        }

        public int getMax()
        {
            return ant;
        }

        public int getMin()
        {
            return anu;
        }

        public boolean hasMax()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a nv()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ob ob1 = CREATOR;
            ob.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("max", ji.a.i("max", 2));
            amb.put("min", ji.a.i("min", 3));
        }

        public a()
        {
            BR = 1;
            amc = new HashSet();
        }

        a(Set set, int j, int k, int l)
        {
            amc = set;
            BR = j;
            ant = k;
            anu = l;
        }
    }

    public static final class b extends jj
        implements com.google.android.gms.plus.model.people.Person.Cover
    {

        public static final oc CREATOR = new oc();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        a anv;
        b anw;
        int anx;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return anv;

            case 3: // '\003'
                return anw;

            case 4: // '\004'
                return Integer.valueOf(anx);
            }
        }

        public int describeContents()
        {
            oc oc1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nw();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return anv;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
        {
            return anw;
        }

        public int getLayout()
        {
            return anx;
        }

        public boolean hasCoverInfo()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasCoverPhoto()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public boolean hasLayout()
        {
            return amc.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b nw()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            oc oc1 = CREATOR;
            oc.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("coverInfo", ji.a.a("coverInfo", 2, com/google/android/gms/internal/nz$b$a));
            amb.put("coverPhoto", ji.a.a("coverPhoto", 3, com/google/android/gms/internal/nz$b$b));
            amb.put("layout", ji.a.a("layout", 4, (new jf()).h("banner", 0), false));
        }

        public b()
        {
            BR = 1;
            amc = new HashSet();
        }

        b(Set set, int j, a a1, b b1, int k)
        {
            amc = set;
            BR = j;
            anv = a1;
            anw = b1;
            anx = k;
        }
    }

    public static final class b.a extends jj
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final od CREATOR = new od();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        int any;
        int anz;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return Integer.valueOf(any);

            case 3: // '\003'
                return Integer.valueOf(anz);
            }
        }

        public int describeContents()
        {
            od od1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nx();
        }

        public int getLeftImageOffset()
        {
            return any;
        }

        public int getTopImageOffset()
        {
            return anz;
        }

        public boolean hasLeftImageOffset()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.a nx()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            od od1 = CREATOR;
            od.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("leftImageOffset", ji.a.i("leftImageOffset", 2));
            amb.put("topImageOffset", ji.a.i("topImageOffset", 3));
        }

        public b.a()
        {
            BR = 1;
            amc = new HashSet();
        }

        b.a(Set set, int j, int k, int l)
        {
            amc = set;
            BR = j;
            any = k;
            anz = l;
        }
    }

    public static final class b.b extends jj
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final oe CREATOR = new oe();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        int lf;
        int lg;
        String uR;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return Integer.valueOf(lg);

            case 3: // '\003'
                return uR;

            case 4: // '\004'
                return Integer.valueOf(lf);
            }
        }

        public int describeContents()
        {
            oe oe1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return ny();
        }

        public int getHeight()
        {
            return lg;
        }

        public String getUrl()
        {
            return uR;
        }

        public int getWidth()
        {
            return lf;
        }

        public boolean hasHeight()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return amc.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.b ny()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            oe oe1 = CREATOR;
            oe.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("height", ji.a.i("height", 2));
            amb.put("url", ji.a.l("url", 3));
            amb.put("width", ji.a.i("width", 4));
        }

        public b.b()
        {
            BR = 1;
            amc = new HashSet();
        }

        b.b(Set set, int j, int k, String s, int l)
        {
            amc = set;
            BR = j;
            lg = k;
            uR = s;
            lf = l;
        }
    }

    public static final class c extends jj
        implements com.google.android.gms.plus.model.people.Person.Image
    {

        public static final of CREATOR = new of();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        String uR;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return uR;
            }
        }

        public int describeContents()
        {
            of of1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nz();
        }

        public String getUrl()
        {
            return uR;
        }

        public boolean hasUrl()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public c nz()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            of of1 = CREATOR;
            of.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("url", ji.a.l("url", 2));
        }

        public c()
        {
            BR = 1;
            amc = new HashSet();
        }

        public c(String s)
        {
            amc = new HashSet();
            BR = 1;
            uR = s;
            amc.add(Integer.valueOf(2));
        }

        c(Set set, int j, String s)
        {
            amc = set;
            BR = j;
            uR = s;
        }
    }

    public static final class d extends jj
        implements com.google.android.gms.plus.model.people.Person.Name
    {

        public static final og CREATOR = new og();
        private static final HashMap amb;
        final int BR;
        String amA;
        String amD;
        final Set amc;
        String anA;
        String anB;
        String anC;
        String anD;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return amA;

            case 3: // '\003'
                return anA;

            case 4: // '\004'
                return amD;

            case 5: // '\005'
                return anB;

            case 6: // '\006'
                return anC;

            case 7: // '\007'
                return anD;
            }
        }

        public int describeContents()
        {
            og og1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nA();
        }

        public String getFamilyName()
        {
            return amA;
        }

        public String getFormatted()
        {
            return anA;
        }

        public String getGivenName()
        {
            return amD;
        }

        public String getHonorificPrefix()
        {
            return anB;
        }

        public String getHonorificSuffix()
        {
            return anC;
        }

        public String getMiddleName()
        {
            return anD;
        }

        public boolean hasFamilyName()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return amc.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return amc.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return amc.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return amc.contains(Integer.valueOf(7));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public d nA()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            og og1 = CREATOR;
            og.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("familyName", ji.a.l("familyName", 2));
            amb.put("formatted", ji.a.l("formatted", 3));
            amb.put("givenName", ji.a.l("givenName", 4));
            amb.put("honorificPrefix", ji.a.l("honorificPrefix", 5));
            amb.put("honorificSuffix", ji.a.l("honorificSuffix", 6));
            amb.put("middleName", ji.a.l("middleName", 7));
        }

        public d()
        {
            BR = 1;
            amc = new HashSet();
        }

        d(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            amc = set;
            BR = j;
            amA = s;
            anA = s1;
            amD = s2;
            anB = s3;
            anC = s4;
            anD = s5;
        }
    }

    public static class e
    {

        public static int ci(String s)
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

    public static final class f extends jj
        implements com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final oh CREATOR = new oh();
        private static final HashMap amb;
        final int BR;
        int FD;
        String Nw;
        String Tr;
        String amP;
        final Set amc;
        String amz;
        String anE;
        String anF;
        boolean anG;
        String mName;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return anE;

            case 3: // '\003'
                return Tr;

            case 4: // '\004'
                return amz;

            case 5: // '\005'
                return anF;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(anG);

            case 8: // '\b'
                return amP;

            case 9: // '\t'
                return Nw;

            case 10: // '\n'
                return Integer.valueOf(FD);
            }
        }

        public int describeContents()
        {
            oh oh1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nB();
        }

        public String getDepartment()
        {
            return anE;
        }

        public String getDescription()
        {
            return Tr;
        }

        public String getEndDate()
        {
            return amz;
        }

        public String getLocation()
        {
            return anF;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return amP;
        }

        public String getTitle()
        {
            return Nw;
        }

        public int getType()
        {
            return FD;
        }

        public boolean hasDepartment()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return amc.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return amc.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return amc.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return amc.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return amc.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return amc.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return amc.contains(Integer.valueOf(10));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return anG;
        }

        public f nB()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            oh oh1 = CREATOR;
            oh.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("department", ji.a.l("department", 2));
            amb.put("description", ji.a.l("description", 3));
            amb.put("endDate", ji.a.l("endDate", 4));
            amb.put("location", ji.a.l("location", 5));
            amb.put("name", ji.a.l("name", 6));
            amb.put("primary", ji.a.k("primary", 7));
            amb.put("startDate", ji.a.l("startDate", 8));
            amb.put("title", ji.a.l("title", 9));
            amb.put("type", ji.a.a("type", 10, (new jf()).h("work", 0).h("school", 1), false));
        }

        public f()
        {
            BR = 1;
            amc = new HashSet();
        }

        f(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int k)
        {
            amc = set;
            BR = j;
            anE = s;
            Tr = s1;
            amz = s2;
            anF = s3;
            mName = s4;
            anG = flag;
            amP = s5;
            Nw = s6;
            FD = k;
        }
    }

    public static final class g extends jj
        implements com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final oi CREATOR = new oi();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        boolean anG;
        String mValue;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return Boolean.valueOf(anG);

            case 3: // '\003'
                return mValue;
            }
        }

        public int describeContents()
        {
            oi oi1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nC();
        }

        public String getValue()
        {
            return mValue;
        }

        public boolean hasPrimary()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return anG;
        }

        public g nC()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            oi oi1 = CREATOR;
            oi.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("primary", ji.a.k("primary", 2));
            amb.put("value", ji.a.l("value", 3));
        }

        public g()
        {
            BR = 1;
            amc = new HashSet();
        }

        g(Set set, int j, boolean flag, String s)
        {
            amc = set;
            BR = j;
            anG = flag;
            mValue = s;
        }
    }

    public static final class h extends jj
        implements com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final oj CREATOR = new oj();
        private static final HashMap amb;
        final int BR;
        int FD;
        final Set amc;
        String anH;
        private final int anI;
        String mValue;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 5: // '\005'
                return anH;

            case 6: // '\006'
                return Integer.valueOf(FD);

            case 4: // '\004'
                return mValue;
            }
        }

        public int describeContents()
        {
            oj oj1 = CREATOR;
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
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
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
            return nE();
        }

        public String getLabel()
        {
            return anH;
        }

        public int getType()
        {
            return FD;
        }

        public String getValue()
        {
            return mValue;
        }

        public boolean hasLabel()
        {
            return amc.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return amc.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
        {
            return amc.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.hm();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public int nD()
        {
            return 4;
        }

        public h nE()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            oj oj1 = CREATOR;
            oj.a(this, parcel, j);
        }

        static 
        {
            amb = new HashMap();
            amb.put("label", ji.a.l("label", 5));
            amb.put("type", ji.a.a("type", 6, (new jf()).h("home", 0).h("work", 1).h("blog", 2).h("profile", 3).h("other", 4).h("otherProfile", 5).h("contributor", 6).h("website", 7), false));
            amb.put("value", ji.a.l("value", 4));
        }

        public h()
        {
            anI = 4;
            BR = 1;
            amc = new HashSet();
        }

        h(Set set, int j, String s, int k, String s1, int l)
        {
            anI = 4;
            amc = set;
            BR = j;
            anH = s;
            FD = k;
            mValue = s1;
        }
    }


    public static final oa CREATOR = new oa();
    private static final HashMap amb;
    String BL;
    final int BR;
    String Fc;
    String NH;
    final Set amc;
    String ana;
    a anb;
    String anc;
    String and;
    int ane;
    b anf;
    String ang;
    c anh;
    boolean ani;
    d anj;
    String ank;
    int anl;
    List anm;
    List ann;
    int ano;
    int anp;
    String anq;
    List anr;
    boolean ans;
    int om;
    String uR;

    public nz()
    {
        BR = 1;
        amc = new HashSet();
    }

    public nz(String s, String s1, c c1, int j, String s2)
    {
        BR = 1;
        amc = new HashSet();
        NH = s;
        amc.add(Integer.valueOf(9));
        BL = s1;
        amc.add(Integer.valueOf(14));
        anh = c1;
        amc.add(Integer.valueOf(15));
        anl = j;
        amc.add(Integer.valueOf(21));
        uR = s2;
        amc.add(Integer.valueOf(27));
    }

    nz(Set set, int j, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c1, boolean flag, 
            String s6, d d1, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        amc = set;
        BR = j;
        ana = s;
        anb = a1;
        anc = s1;
        and = s2;
        ane = k;
        anf = b1;
        ang = s3;
        NH = s4;
        om = l;
        BL = s5;
        anh = c1;
        ani = flag;
        Fc = s6;
        anj = d1;
        ank = s7;
        anl = i1;
        anm = list;
        ann = list1;
        ano = j1;
        anp = k1;
        anq = s8;
        uR = s9;
        anr = list2;
        ans = flag1;
    }

    public static nz i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.dd(parcel);
        parcel.recycle();
        return abyte0;
    }

    protected boolean a(ji.a a1)
    {
        return amc.contains(Integer.valueOf(a1.hm()));
    }

    protected Object b(ji.a a1)
    {
        switch (a1.hm())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

        case 2: // '\002'
            return ana;

        case 3: // '\003'
            return anb;

        case 4: // '\004'
            return anc;

        case 5: // '\005'
            return and;

        case 6: // '\006'
            return Integer.valueOf(ane);

        case 7: // '\007'
            return anf;

        case 8: // '\b'
            return ang;

        case 9: // '\t'
            return NH;

        case 12: // '\f'
            return Integer.valueOf(om);

        case 14: // '\016'
            return BL;

        case 15: // '\017'
            return anh;

        case 16: // '\020'
            return Boolean.valueOf(ani);

        case 18: // '\022'
            return Fc;

        case 19: // '\023'
            return anj;

        case 20: // '\024'
            return ank;

        case 21: // '\025'
            return Integer.valueOf(anl);

        case 22: // '\026'
            return anm;

        case 23: // '\027'
            return ann;

        case 24: // '\030'
            return Integer.valueOf(ano);

        case 25: // '\031'
            return Integer.valueOf(anp);

        case 26: // '\032'
            return anq;

        case 27: // '\033'
            return uR;

        case 28: // '\034'
            return anr;

        case 29: // '\035'
            return Boolean.valueOf(ans);
        }
    }

    public int describeContents()
    {
        oa oa1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof nz))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (nz)obj;
            ji.a a1;
label1:
            do
            {
                for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ji.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((nz) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((nz) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((nz) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return nu();
    }

    public String getAboutMe()
    {
        return ana;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return anb;
    }

    public String getBirthday()
    {
        return anc;
    }

    public String getBraggingRights()
    {
        return and;
    }

    public int getCircledByCount()
    {
        return ane;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return anf;
    }

    public String getCurrentLocation()
    {
        return ang;
    }

    public String getDisplayName()
    {
        return NH;
    }

    public int getGender()
    {
        return om;
    }

    public String getId()
    {
        return BL;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return anh;
    }

    public String getLanguage()
    {
        return Fc;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return anj;
    }

    public String getNickname()
    {
        return ank;
    }

    public int getObjectType()
    {
        return anl;
    }

    public List getOrganizations()
    {
        return (ArrayList)anm;
    }

    public List getPlacesLived()
    {
        return (ArrayList)ann;
    }

    public int getPlusOneCount()
    {
        return ano;
    }

    public int getRelationshipStatus()
    {
        return anp;
    }

    public String getTagline()
    {
        return anq;
    }

    public String getUrl()
    {
        return uR;
    }

    public List getUrls()
    {
        return (ArrayList)anr;
    }

    public boolean hasAboutMe()
    {
        return amc.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return amc.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return amc.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return amc.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return amc.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return amc.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return amc.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return amc.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return amc.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return amc.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return amc.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return amc.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return amc.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return amc.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return amc.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return amc.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return amc.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return amc.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return amc.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return amc.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return amc.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return amc.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return amc.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return amc.contains(Integer.valueOf(29));
    }

    public int hashCode()
    {
        Iterator iterator = amb.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ji.a a1 = (ji.a)iterator.next();
            if (a(a1))
            {
                int k = a1.hm();
                j = b(a1).hashCode() + (j + k);
            }
        } while (true);
        return j;
    }

    public HashMap hf()
    {
        return amb;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isPlusUser()
    {
        return ani;
    }

    public boolean isVerified()
    {
        return ans;
    }

    public nz nu()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        oa oa1 = CREATOR;
        oa.a(this, parcel, j);
    }

    static 
    {
        amb = new HashMap();
        amb.put("aboutMe", ji.a.l("aboutMe", 2));
        amb.put("ageRange", ji.a.a("ageRange", 3, com/google/android/gms/internal/nz$a));
        amb.put("birthday", ji.a.l("birthday", 4));
        amb.put("braggingRights", ji.a.l("braggingRights", 5));
        amb.put("circledByCount", ji.a.i("circledByCount", 6));
        amb.put("cover", ji.a.a("cover", 7, com/google/android/gms/internal/nz$b));
        amb.put("currentLocation", ji.a.l("currentLocation", 8));
        amb.put("displayName", ji.a.l("displayName", 9));
        amb.put("gender", ji.a.a("gender", 12, (new jf()).h("male", 0).h("female", 1).h("other", 2), false));
        amb.put("id", ji.a.l("id", 14));
        amb.put("image", ji.a.a("image", 15, com/google/android/gms/internal/nz$c));
        amb.put("isPlusUser", ji.a.k("isPlusUser", 16));
        amb.put("language", ji.a.l("language", 18));
        amb.put("name", ji.a.a("name", 19, com/google/android/gms/internal/nz$d));
        amb.put("nickname", ji.a.l("nickname", 20));
        amb.put("objectType", ji.a.a("objectType", 21, (new jf()).h("person", 0).h("page", 1), false));
        amb.put("organizations", ji.a.b("organizations", 22, com/google/android/gms/internal/nz$f));
        amb.put("placesLived", ji.a.b("placesLived", 23, com/google/android/gms/internal/nz$g));
        amb.put("plusOneCount", ji.a.i("plusOneCount", 24));
        amb.put("relationshipStatus", ji.a.a("relationshipStatus", 25, (new jf()).h("single", 0).h("in_a_relationship", 1).h("engaged", 2).h("married", 3).h("its_complicated", 4).h("open_relationship", 5).h("widowed", 6).h("in_domestic_partnership", 7).h("in_civil_union", 8), false));
        amb.put("tagline", ji.a.l("tagline", 26));
        amb.put("url", ji.a.l("url", 27));
        amb.put("urls", ji.a.b("urls", 28, com/google/android/gms/internal/nz$h));
        amb.put("verified", ji.a.k("verified", 29));
    }
}
