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
//            dw, fw, dt, fx, 
//            fy, fz, ga, gb, 
//            gc, gd, ge, gf

public final class fv extends dw
    implements SafeParcelable, Person
{
    public static final class a extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final fx CREATOR = new fx();
        private static final HashMap rH;
        private final int iM;
        private final Set rI;
        private int td;
        private int te;

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
                return Integer.valueOf(td);

            case 3: // '\003'
                return Integer.valueOf(te);
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public a dL()
        {
            return this;
        }

        public int describeContents()
        {
            fx fx1 = CREATOR;
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
            return dL();
        }

        public int getMax()
        {
            return td;
        }

        public int getMin()
        {
            return te;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasMax()
        {
            return rI.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
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
            fx fx1 = CREATOR;
            fx.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("max", dw.a.d("max", 2));
            rH.put("min", dw.a.d("min", 3));
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
            td = j;
            te = k;
        }
    }

    public static final class b extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover
    {

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

        public b dO()
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
            return dO();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return tf;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
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
            fy fy1 = CREATOR;
            fy.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("coverInfo", dw.a.a("coverInfo", 2, com/google/android/gms/internal/fv$b$a));
            rH.put("coverPhoto", dw.a.a("coverPhoto", 3, com/google/android/gms/internal/fv$b$b));
            rH.put("layout", dw.a.a("layout", 4, (new dt()).c("banner", 0), false));
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

    public static final class b.a extends dw
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

        public b.a dP()
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
                if (!(obj instanceof b.a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.a)obj;
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

        public b.a()
        {
            iM = 1;
            rI = new HashSet();
        }

        b.a(Set set, int i, int j, int k)
        {
            rI = set;
            iM = i;
            ti = j;
            tj = k;
        }
    }

    public static final class b.b extends dw
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

        public b.b dQ()
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
                if (!(obj instanceof b.b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.b)obj;
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

        public b.b()
        {
            iM = 1;
            rI = new HashSet();
        }

        b.b(Set set, int i, int j, String s, int k)
        {
            rI = set;
            iM = i;
            dQ = j;
            hN = s;
            dP = k;
        }
    }

    public static final class c extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Image
    {

        public static final gb CREATOR = new gb();
        private static final HashMap rH;
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
                return hN;
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public c dR()
        {
            return this;
        }

        public int describeContents()
        {
            gb gb1 = CREATOR;
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
                if (!(obj instanceof c))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (c)obj;
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
            return dR();
        }

        public String getUrl()
        {
            return hN;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasUrl()
        {
            return rI.contains(Integer.valueOf(2));
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
            gb gb1 = CREATOR;
            gb.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("url", dw.a.g("url", 2));
        }

        public c()
        {
            iM = 1;
            rI = new HashSet();
        }

        public c(String s)
        {
            rI = new HashSet();
            iM = 1;
            hN = s;
            rI.add(Integer.valueOf(2));
        }

        c(Set set, int i, String s)
        {
            rI = set;
            iM = i;
            hN = s;
        }
    }

    public static final class d extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Name
    {

        public static final gc CREATOR = new gc();
        private static final HashMap rH;
        private final int iM;
        private final Set rI;
        private String sh;
        private String sk;
        private String tk;
        private String tl;
        private String tm;
        private String tn;

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
                return sh;

            case 3: // '\003'
                return tk;

            case 4: // '\004'
                return sk;

            case 5: // '\005'
                return tl;

            case 6: // '\006'
                return tm;

            case 7: // '\007'
                return tn;
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public d dS()
        {
            return this;
        }

        public int describeContents()
        {
            gc gc1 = CREATOR;
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
                if (!(obj instanceof d))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (d)obj;
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
            return dS();
        }

        public String getFamilyName()
        {
            return sh;
        }

        public String getFormatted()
        {
            return tk;
        }

        public String getGivenName()
        {
            return sk;
        }

        public String getHonorificPrefix()
        {
            return tl;
        }

        public String getHonorificSuffix()
        {
            return tm;
        }

        public String getMiddleName()
        {
            return tn;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasFamilyName()
        {
            return rI.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return rI.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return rI.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return rI.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return rI.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return rI.contains(Integer.valueOf(7));
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
            gc gc1 = CREATOR;
            gc.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("familyName", dw.a.g("familyName", 2));
            rH.put("formatted", dw.a.g("formatted", 3));
            rH.put("givenName", dw.a.g("givenName", 4));
            rH.put("honorificPrefix", dw.a.g("honorificPrefix", 5));
            rH.put("honorificSuffix", dw.a.g("honorificSuffix", 6));
            rH.put("middleName", dw.a.g("middleName", 7));
        }

        public d()
        {
            iM = 1;
            rI = new HashSet();
        }

        d(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            rI = set;
            iM = i;
            sh = s;
            tk = s1;
            sk = s2;
            tl = s3;
            tm = s4;
            tn = s5;
        }
    }

    public static class e
    {

        public static int aa(String s)
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

    public static final class f extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final gd CREATOR = new gd();
        private static final HashMap rH;
        private final int iM;
        private int jV;
        private String mName;
        private String mo;
        private String qB;
        private final Set rI;
        private String sg;
        private String sx;
        private String to;
        private String tp;
        private boolean tq;

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
                return to;

            case 3: // '\003'
                return mo;

            case 4: // '\004'
                return sg;

            case 5: // '\005'
                return tp;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(tq);

            case 8: // '\b'
                return sx;

            case 9: // '\t'
                return qB;

            case 10: // '\n'
                return Integer.valueOf(jV);
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public f dT()
        {
            return this;
        }

        public int describeContents()
        {
            gd gd1 = CREATOR;
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
                if (!(obj instanceof f))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (f)obj;
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
            return dT();
        }

        public String getDepartment()
        {
            return to;
        }

        public String getDescription()
        {
            return mo;
        }

        public String getEndDate()
        {
            return sg;
        }

        public String getLocation()
        {
            return tp;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return sx;
        }

        public String getTitle()
        {
            return qB;
        }

        public int getType()
        {
            return jV;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasDepartment()
        {
            return rI.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return rI.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return rI.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return rI.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return rI.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return rI.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return rI.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return rI.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return rI.contains(Integer.valueOf(10));
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

        public boolean isPrimary()
        {
            return tq;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            gd gd1 = CREATOR;
            gd.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("department", dw.a.g("department", 2));
            rH.put("description", dw.a.g("description", 3));
            rH.put("endDate", dw.a.g("endDate", 4));
            rH.put("location", dw.a.g("location", 5));
            rH.put("name", dw.a.g("name", 6));
            rH.put("primary", dw.a.f("primary", 7));
            rH.put("startDate", dw.a.g("startDate", 8));
            rH.put("title", dw.a.g("title", 9));
            rH.put("type", dw.a.a("type", 10, (new dt()).c("work", 0).c("school", 1), false));
        }

        public f()
        {
            iM = 1;
            rI = new HashSet();
        }

        f(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int j)
        {
            rI = set;
            iM = i;
            to = s;
            mo = s1;
            sg = s2;
            tp = s3;
            mName = s4;
            tq = flag;
            sx = s5;
            qB = s6;
            jV = j;
        }
    }

    public static final class g extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final ge CREATOR = new ge();
        private static final HashMap rH;
        private final int iM;
        private String mValue;
        private final Set rI;
        private boolean tq;

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
                return Boolean.valueOf(tq);

            case 3: // '\003'
                return mValue;
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public g dU()
        {
            return this;
        }

        public int describeContents()
        {
            ge ge1 = CREATOR;
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
                if (!(obj instanceof g))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (g)obj;
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
            return dU();
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasPrimary()
        {
            return rI.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
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

        public boolean isPrimary()
        {
            return tq;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ge ge1 = CREATOR;
            ge.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("primary", dw.a.f("primary", 2));
            rH.put("value", dw.a.g("value", 3));
        }

        public g()
        {
            iM = 1;
            rI = new HashSet();
        }

        g(Set set, int i, boolean flag, String s)
        {
            rI = set;
            iM = i;
            tq = flag;
            mValue = s;
        }
    }

    public static final class h extends dw
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final gf CREATOR = new gf();
        private static final HashMap rH;
        private final int iM;
        private int jV;
        private String mValue;
        private final Set rI;
        private String tr;
        private final int ts;

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

            case 5: // '\005'
                return tr;

            case 6: // '\006'
                return Integer.valueOf(jV);

            case 4: // '\004'
                return mValue;
            }
        }

        public HashMap bp()
        {
            return rH;
        }

        public int dV()
        {
            return 4;
        }

        public h dW()
        {
            return this;
        }

        public int describeContents()
        {
            gf gf1 = CREATOR;
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
                if (!(obj instanceof h))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (h)obj;
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
            return dW();
        }

        public String getLabel()
        {
            return tr;
        }

        public int getType()
        {
            return jV;
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return iM;
        }

        public boolean hasLabel()
        {
            return rI.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return rI.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
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
            gf gf1 = CREATOR;
            gf.a(this, parcel, i);
        }

        static 
        {
            rH = new HashMap();
            rH.put("label", dw.a.g("label", 5));
            rH.put("type", dw.a.a("type", 6, (new dt()).c("home", 0).c("work", 1).c("blog", 2).c("profile", 3).c("other", 4).c("otherProfile", 5).c("contributor", 6).c("website", 7), false));
            rH.put("value", dw.a.g("value", 4));
        }

        public h()
        {
            ts = 4;
            iM = 2;
            rI = new HashSet();
        }

        h(Set set, int i, String s, int j, String s1, int k)
        {
            ts = 4;
            rI = set;
            iM = i;
            tr = s;
            jV = j;
            mValue = s1;
        }
    }


    public static final fw CREATOR = new fw();
    private static final HashMap rH;
    private int dI;
    private String hN;
    private final int iM;
    private String ml;
    private final Set rI;
    private String sJ;
    private a sK;
    private String sL;
    private String sM;
    private int sN;
    private b sO;
    private String sP;
    private c sQ;
    private boolean sR;
    private String sS;
    private d sT;
    private String sU;
    private int sV;
    private List sW;
    private List sX;
    private int sY;
    private int sZ;
    private String sm;
    private String ta;
    private List tb;
    private boolean tc;

    public fv()
    {
        iM = 2;
        rI = new HashSet();
    }

    public fv(String s, String s1, c c1, int i, String s2)
    {
        iM = 2;
        rI = new HashSet();
        ml = s;
        rI.add(Integer.valueOf(9));
        sm = s1;
        rI.add(Integer.valueOf(14));
        sQ = c1;
        rI.add(Integer.valueOf(15));
        sV = i;
        rI.add(Integer.valueOf(21));
        hN = s2;
        rI.add(Integer.valueOf(27));
    }

    fv(Set set, int i, String s, a a1, String s1, String s2, int j, 
            b b1, String s3, String s4, int k, String s5, c c1, boolean flag, 
            String s6, d d1, String s7, int l, List list, List list1, int i1, 
            int j1, String s8, String s9, List list2, boolean flag1)
    {
        rI = set;
        iM = i;
        sJ = s;
        sK = a1;
        sL = s1;
        sM = s2;
        sN = j;
        sO = b1;
        sP = s3;
        ml = s4;
        dI = k;
        sm = s5;
        sQ = c1;
        sR = flag;
        sS = s6;
        sT = d1;
        sU = s7;
        sV = l;
        sW = list;
        sX = list1;
        sY = i1;
        sZ = j1;
        ta = s8;
        hN = s9;
        tb = list2;
        tc = flag1;
    }

    public static fv e(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.D(parcel);
        parcel.recycle();
        return abyte0;
    }

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
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.bw()).toString());

        case 2: // '\002'
            return sJ;

        case 3: // '\003'
            return sK;

        case 4: // '\004'
            return sL;

        case 5: // '\005'
            return sM;

        case 6: // '\006'
            return Integer.valueOf(sN);

        case 7: // '\007'
            return sO;

        case 8: // '\b'
            return sP;

        case 9: // '\t'
            return ml;

        case 12: // '\f'
            return Integer.valueOf(dI);

        case 14: // '\016'
            return sm;

        case 15: // '\017'
            return sQ;

        case 16: // '\020'
            return Boolean.valueOf(sR);

        case 18: // '\022'
            return sS;

        case 19: // '\023'
            return sT;

        case 20: // '\024'
            return sU;

        case 21: // '\025'
            return Integer.valueOf(sV);

        case 22: // '\026'
            return sW;

        case 23: // '\027'
            return sX;

        case 24: // '\030'
            return Integer.valueOf(sY);

        case 25: // '\031'
            return Integer.valueOf(sZ);

        case 26: // '\032'
            return ta;

        case 27: // '\033'
            return hN;

        case 28: // '\034'
            return tb;

        case 29: // '\035'
            return Boolean.valueOf(tc);
        }
    }

    public HashMap bp()
    {
        return rH;
    }

    a dD()
    {
        return sK;
    }

    b dE()
    {
        return sO;
    }

    c dF()
    {
        return sQ;
    }

    d dG()
    {
        return sT;
    }

    List dH()
    {
        return sW;
    }

    List dI()
    {
        return sX;
    }

    List dJ()
    {
        return tb;
    }

    public fv dK()
    {
        return this;
    }

    public int describeContents()
    {
        fw fw1 = CREATOR;
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
            if (!(obj instanceof fv))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (fv)obj;
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
                    if (((fv) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((fv) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((fv) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return dK();
    }

    public String getAboutMe()
    {
        return sJ;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return sK;
    }

    public String getBirthday()
    {
        return sL;
    }

    public String getBraggingRights()
    {
        return sM;
    }

    public int getCircledByCount()
    {
        return sN;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return sO;
    }

    public String getCurrentLocation()
    {
        return sP;
    }

    public String getDisplayName()
    {
        return ml;
    }

    public int getGender()
    {
        return dI;
    }

    public String getId()
    {
        return sm;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return sQ;
    }

    public String getLanguage()
    {
        return sS;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return sT;
    }

    public String getNickname()
    {
        return sU;
    }

    public int getObjectType()
    {
        return sV;
    }

    public List getOrganizations()
    {
        return (ArrayList)sW;
    }

    public List getPlacesLived()
    {
        return (ArrayList)sX;
    }

    public int getPlusOneCount()
    {
        return sY;
    }

    public int getRelationshipStatus()
    {
        return sZ;
    }

    public String getTagline()
    {
        return ta;
    }

    public String getUrl()
    {
        return hN;
    }

    public List getUrls()
    {
        return (ArrayList)tb;
    }

    int getVersionCode()
    {
        return iM;
    }

    public boolean hasAboutMe()
    {
        return rI.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return rI.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return rI.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return rI.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return rI.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return rI.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return rI.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return rI.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return rI.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return rI.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return rI.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return rI.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return rI.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return rI.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return rI.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return rI.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return rI.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return rI.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return rI.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return rI.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return rI.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return rI.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return rI.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return rI.contains(Integer.valueOf(29));
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

    public boolean isPlusUser()
    {
        return sR;
    }

    public boolean isVerified()
    {
        return tc;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fw fw1 = CREATOR;
        fw.a(this, parcel, i);
    }

    static 
    {
        rH = new HashMap();
        rH.put("aboutMe", dw.a.g("aboutMe", 2));
        rH.put("ageRange", dw.a.a("ageRange", 3, com/google/android/gms/internal/fv$a));
        rH.put("birthday", dw.a.g("birthday", 4));
        rH.put("braggingRights", dw.a.g("braggingRights", 5));
        rH.put("circledByCount", dw.a.d("circledByCount", 6));
        rH.put("cover", dw.a.a("cover", 7, com/google/android/gms/internal/fv$b));
        rH.put("currentLocation", dw.a.g("currentLocation", 8));
        rH.put("displayName", dw.a.g("displayName", 9));
        rH.put("gender", dw.a.a("gender", 12, (new dt()).c("male", 0).c("female", 1).c("other", 2), false));
        rH.put("id", dw.a.g("id", 14));
        rH.put("image", dw.a.a("image", 15, com/google/android/gms/internal/fv$c));
        rH.put("isPlusUser", dw.a.f("isPlusUser", 16));
        rH.put("language", dw.a.g("language", 18));
        rH.put("name", dw.a.a("name", 19, com/google/android/gms/internal/fv$d));
        rH.put("nickname", dw.a.g("nickname", 20));
        rH.put("objectType", dw.a.a("objectType", 21, (new dt()).c("person", 0).c("page", 1), false));
        rH.put("organizations", dw.a.b("organizations", 22, com/google/android/gms/internal/fv$f));
        rH.put("placesLived", dw.a.b("placesLived", 23, com/google/android/gms/internal/fv$g));
        rH.put("plusOneCount", dw.a.d("plusOneCount", 24));
        rH.put("relationshipStatus", dw.a.a("relationshipStatus", 25, (new dt()).c("single", 0).c("in_a_relationship", 1).c("engaged", 2).c("married", 3).c("its_complicated", 4).c("open_relationship", 5).c("widowed", 6).c("in_domestic_partnership", 7).c("in_civil_union", 8), false));
        rH.put("tagline", dw.a.g("tagline", 26));
        rH.put("url", dw.a.g("url", 27));
        rH.put("urls", dw.a.b("urls", 28, com/google/android/gms/internal/fv$h));
        rH.put("verified", dw.a.f("verified", 29));
    }
}
